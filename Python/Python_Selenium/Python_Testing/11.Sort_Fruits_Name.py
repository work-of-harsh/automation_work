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

driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers")
print(driver.title)
driver.maximize_window()
driver.implicitly_wait(5)


a=[]
b=[]

def Unsort_List():
    for fruitname in fruit_names:
        z=fruitname.text
        a.append(z)

def sort_List():
    for fruitname in fruit_names_Sorted:
        z = fruitname.text
        b.append(z)




#capturing fruits name page wise
fruit_names = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
Unsort_List()                                                     #calling function
driver.find_element(By.XPATH,'(//li/a)[4]').click()

fruit_names = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
Unsort_List()
driver.find_element(By.XPATH,'(//li/a)[5]').click()

fruit_names = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
Unsort_List()
driver.find_element(By.XPATH,'(//li/a)[6]').click()

fruit_names = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
Unsort_List()



driver.refresh()
driver.find_element(By.XPATH,'//th').click()        #clicking to sort fruitnames on page

fruit_names_Sorted = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
sort_List()
driver.find_element(By.XPATH,'(//li/a)[4]').click()

fruit_names_Sorted = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
sort_List()
driver.find_element(By.XPATH,'(//li/a)[5]').click()

fruit_names_Sorted = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
sort_List()
driver.find_element(By.XPATH,'(//li/a)[6]').click()

fruit_names_Sorted = driver.find_elements(By.XPATH,'//tbody/tr/td[1]')
sort_List()


print(a)
print(b)
a.sort()
print(a)
assert a == b



