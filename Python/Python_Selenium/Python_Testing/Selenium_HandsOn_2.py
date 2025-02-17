from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/locatorspractice/")
print(driver.title)

driver.find_element(By.XPATH,'//form/div/span[2]/input').click()
driver.find_element(By.XPATH,'(//form/input[1])[2]').send_keys('Thug')
driver.find_element(By.XPATH,'(//form/input[2])[2]').send_keys('Harsh')
driver.find_element(By.XPATH,'//form/div/span/input').click()
driver.find_element(By.XPATH,"//*[text()='Sign In']").click()

#driver.find_element(By.LINK_TEXT,'Forgot your password?').click()