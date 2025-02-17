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

driver = webdriver.Chrome(service=service_obj)

driver.get("https://the-internet.herokuapp.com/windows")
print(driver.title)
driver.maximize_window()
driver.implicitly_wait(5)



driver.find_element(By.LINK_TEXT,'Click Here').click()

windowsOpened = driver.window_handles
driver.switch_to.window(windowsOpened[1])
print(driver.find_element(By.TAG_NAME,'h3').text)
driver.close()
driver.switch_to.window(windowsOpened[0])
print(driver.find_element(By.TAG_NAME,'h3').text)
assert driver.find_element(By.TAG_NAME,'h3').text == 'Opening a new window'
