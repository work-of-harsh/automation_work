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

#checkboxes click
checkboxes = driver.find_elements(By.XPATH,'//label/input[@type="checkbox"]')
print(len(checkboxes))
for checkbox in checkboxes:

    if checkbox.get_attribute('value') == "option2":      #in ".get_attribute()" we can also use name,ID,Class as per convinience.
        #print(checkbox.text)                             #text "Option2" is not included in the Xpath,thats why we used ".get_attribute('value')"
        checkbox.click()
        assert checkbox.is_selected()                     # "is_selected()" is a boolian method returning TRUE or FALSE
        break

#Radio button click

radiobuttons = driver.find_elements(By.XPATH,'//fieldset/label/input[@name="radioButton"]')
print(len(radiobuttons))
for radiobutton in  radiobuttons:
    if radiobutton.get_attribute('value') == "radio2":
        radiobutton.click()
        assert radiobutton.is_selected()
        break


time.sleep(3)

radiobuttons[2].click()                 #directly shifting from radio button 2 to 3, index for list starts from 0
#text validation
assert driver.find_element(By.ID,'displayed-text').is_displayed()
driver.find_element(By.ID,'hide-textbox').click()
assert not driver.find_element(By.ID,'displayed-text').is_displayed()                #"assert not" used




