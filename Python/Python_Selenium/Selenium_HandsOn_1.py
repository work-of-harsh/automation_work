from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/angularpractice/")
print(driver.title)
driver.current_url
if driver.current_url== "https://rahulshettyacademy.com/angularpractice/":
    print('Correct Url')
driver.maximize_window()
driver.find_element(By.NAME,'name' ).send_keys('Thug')
driver.find_element(By.NAME,'email').send_keys('thug@champ.com')
driver.find_element(By.ID,'exampleInputPassword1').send_keys('abcderty')
driver.find_element(By.ID,'exampleCheck1').click()
driver.find_element(By.XPATH,'//input[@value="Submit"]').click()
driver.find_element(By.CSS_SELECTOR,'input[value="option1"]').click()
Message=driver.find_element(By.CLASS_NAME,'alert-success').text
print(Message)
Message2 = driver.find_element(By.XPATH,'//div[@class="alert alert-success alert-dismissible"]').text
print(Message2)
assert 'Success' in Message
driver.find_element(By.XPATH,'(//input[@type="text"])[3]').send_keys(' Hello Harsh')
driver.find_element(By.XPATH,'(//input[@type="text"])[3]').clear()
driver.close()