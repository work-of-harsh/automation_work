from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/angularpractice/")
print(driver.title)
driver.current_url
driver.maximize_window()
driver.implicitly_wait(5)

#lecture 65 at Rahul Shetty


driver.find_element(By.XPATH,"//a[contains(@href,'shop')]").click()  #used a part of href value
Mobile_Items = driver.find_elements(By.XPATH,'//app-card/div')                       #we will do chaining of web element
for Mobile_Item in Mobile_Items:                                                     #from here on we will use Mobile_Item.abc not driver .abc
    Mobile_Name = Mobile_Item.find_element(By.XPATH,'div/h4/a').text                 #not used the entire XPATH only 'div/h4/a' as chaining of web element. //div is used when we search on entile page.
    if Mobile_Name == 'Samsung Note 8':
        Mobile_Item.find_element(By.XPATH,'div[2]/button').click()                   #clicking button through chaining

driver.find_element(By.XPATH,' //li/a[contains(@class,"btn-primary")] ').click()
driver.find_element(By.XPATH,'(//td/button)[3]').click()
driver.find_element(By.CSS_SELECTOR,'#country').send_keys('ind')
driver.find_element(By.LINK_TEXT,'India').click()
driver.find_element(By.XPATH,'//label[@for="checkbox2"]').click()
driver.find_element(By.XPATH,'//input[@value="Purchase"]').click()



