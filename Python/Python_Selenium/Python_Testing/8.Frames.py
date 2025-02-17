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

driver.get("https://the-internet.herokuapp.com/iframe")
print(driver.title)
driver.maximize_window()
driver.implicitly_wait(5)

#switch to frame Frame:HTML embedded inside the page      Tag on inspect element <iframe
driver.switch_to.frame('mce_0_ifr')            #'mce_0_ifr' is frame ID, we can also provide frame name
driver.find_element(By.ID,'tinymce').clear()
driver.find_element(By.ID,'tinymce').send_keys('Harsh=ThugLife')
print(driver.find_element(By.TAG_NAME,'h3').text)           #text present  in the  frame
#switch out of frame

driver.switch_to.default_content()
print(driver.find_element(By.TAG_NAME,'h3').text)           #text present out of frame


