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

driver.get("https://rahulshettyacademy.com/loginpagePractise/")
print(driver.title)
driver.maximize_window()
driver.implicitly_wait(5)


driver.find_element(By.LINK_TEXT,'Free Access to InterviewQues/ResumeAssistance/Material').click()
windowsOpened = driver.window_handles                 #creating windowsOpened (list) which has list of all opened tabs
driver.switch_to.window(windowsOpened[1])             #switching to new browser tab
email = driver.find_element(By.XPATH,'//div/p[2]/strong/a').text    #verifying if the email xpath is present on the new tab
assert email
driver.switch_to.window(windowsOpened[0])               #switching back to main browser tab
driver.find_element(By.ID,'username').send_keys(email)
driver.find_element(By.ID,'password').send_keys('asdfghjk')
driver.find_element(By.ID,'signInBtn').click()

print(driver.find_element(By.XPATH,'//form/div/strong').text)


