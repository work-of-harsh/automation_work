import pytest
from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
driver = None                                                               #done for screenshot code '@pytest.mark.hookwrapper' below


@pytest.fixture(params=["chrome","firefox"], autouse= True)                             #using scope to use fixture only once after method execution
def setup(request):                                       # request is an instance that comes by default when we use fixture.
    global driver                                                           #done for screenshot code '@pytest.mark.hookwrapper' below
    if request.param == "chrome":

        service_obj = Service()           #we can provide browser driver location inside Service("location")

        driver = webdriver.Chrome(service=service_obj)                  #this driver is local driver of fixture
    elif request.param == "firefox":
        service_obj = Service()                 #we can provide browser driver location inside Service("location")
        driver = webdriver.Firefox(service=service_obj)

    driver.get("https://rahulshettyacademy.com/angularpractice/")
    print(driver.title)
    driver.current_url
    driver.maximize_window()                        #lecture 89,77 to run in multiple browser

    request.cls.driver = driver                         #lecture89         # we cant directly use return as "yield" and "return" will not work together, so we assign (connect) local driver of fixture "driver" to class "driver"  (which ever class uses "driver" vaiable under "@pytest.mark.usefixtures("setup")") using "cls.driver". "cls.driver" converts local "driver" of fixture to a class variable "driver" in main test case under the class.
    yield
    driver.close()


    @pytest.mark.hookwrapper
    def pytest_runtest_makereport(item):
        """
            Extends the PyTest Plugin to take and embed screenshot in html report, whenever test fails.
            :param item:
            """
        pytest_html = item.config.pluginmanager.getplugin('html')
        outcome = yield
        report = outcome.get_result()
        extra = getattr(report, 'extra', [])

        if report.when == 'call' or report.when == "setup":
            xfail = hasattr(report, 'wasxfail')
            if (report.skipped and xfail) or (report.failed and not xfail):
                file_name = report.nodeid.replace("::", "_") + ".png"
                _capture_screenshot(file_name)
                if file_name:
                    html = '<div><img src="%s" alt="screenshot" style="width:304px;height:228px;" ' \
                           'onclick="window.open(this.src)" align="right"/></div>' % file_name
                    extra.append(pytest_html.extras.html(html))
            report.extra = extra

    def _capture_screenshot(name):
        driver.get_screenshot_as_file(name)


