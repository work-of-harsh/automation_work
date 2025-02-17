import time

from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys


service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/AutomationPractice/")
print(driver.title)
driver.maximize_window()
driver.implicitly_wait(5)


action = ActionChains(driver)                           #creating object for mouse action
action.move_to_element(driver.find_element(By.ID,'mousehover')).perform()          #hover mouse curser   #use .perform() with action. Also used as scroll function.
action.click(driver.find_element(By.LINK_TEXT,"Reload")).perform()
#action.context_click()          #right click
#action.drag_and_drop(source,destination)

#action.context_click(driver.find_element(By.ID,'mousehover')).perform() #right_click
#code to press TAB on the page
body= driver.find_element(By.XPATH,'//body')  #to press key board keys
body.send_keys(Keys.TAB)


#action.move_to_element(driver.find_element(By.LINK_TEXT,'Reload')).click().perform()  #clickreload again



