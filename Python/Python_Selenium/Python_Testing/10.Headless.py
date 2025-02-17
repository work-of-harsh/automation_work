import time

from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.expected_conditions import presence_of_element_located
from selenium.webdriver.common.keys import Keys
from selenium.webdriver import ActionChains
service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")
chrome_options= webdriver.ChromeOptions()
chrome_options.add_argument('headless')
chrome_options.add_argument('--ignore-certificate-errors') #ignores click to proceed to advance page
driver = webdriver.Chrome(service=service_obj, options=chrome_options)

driver.get("https://rahulshettyacademy.com/AutomationPractice/")
print(driver.title)
driver.maximize_window()
driver.implicitly_wait(5)



driver.execute_script('window.scrollBy(0,400)')
driver.execute_script('window.scrollBy(0,document.body.scrollHeight)')  #goes to bottom of the page
driver.get_screenshot_as_file('Screenshot_Headless.png')



