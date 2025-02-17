import time

from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/dropdownsPractise/")
print(driver.title)
driver.maximize_window()

driver.find_element(By.ID,'autosuggest').send_keys('an')
time.sleep(3)

countries = driver.find_elements(By.XPATH,'//li[@class="ui-menu-item"]/a')                   #used find element's' to get list  #linked text
print(len(countries))
for country in countries:
    if country.text == 'Northern Mariana Islands':
        country.click()
        break


print(driver.find_element(By.ID,'autosuggest').get_attribute('value'))                       #"get_attribute('value'))" is a java script to get text entered in the input box. We cant use ".text" to get the text coz the text was not already present when we loaded the page.
assert driver.find_element(By.ID,'autosuggest').get_attribute('value') == 'Northern Mariana Islands'