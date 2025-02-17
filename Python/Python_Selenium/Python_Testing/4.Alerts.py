import time

from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/AutomationPractice/")
print(driver.title)
driver.maximize_window()


#driver.find_element(By.ID,"//div/fieldset/input[@id='name']").click()
driver.find_element(By.XPATH,"//body/div/div/fieldset/input[@id='name']").send_keys('Harsh')
#driver.find_element(By.CSS_SELECTOR,'#name').send_keys('acb')
driver.find_element(By.ID,'alertbtn').click()
alert = driver.switch_to.alert                           #switching to javascript popup
alertText = alert.text                                   #capturing text on popup window
print(alertText)
assert 'Harsh' in alertText
alert.accept()                                            #clicking on  "OK"

#Case2: Clicking on "Cnacel" button
driver.find_element(By.ID,'confirmbtn').click()           #clicking on coinfirm button
alert.dismiss()                                            #clicking on "Cnacel" button



