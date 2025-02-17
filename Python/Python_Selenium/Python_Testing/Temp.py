import time

from selenium import webdriver
from selenium.webdriver import ActionChains

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait

service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/angularpractice/")
print(driver.title)
driver.current_url
driver.maximize_window()

driver.get("https://rahulshettyacademy.com/documents-request")
driver.maximize_window()
driver.implicitly_wait(15)


driver.execute_script('window.scrollBy(0,900)')

time.sleep(3)

driver.close()
