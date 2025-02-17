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
wait = WebDriverWait(driver,10)
def Unsort_List():
    for fruitname in fruit_names:
        z=fruitname.text

        a.append(z)

def sort_List():
    for fruitname in fruit_names_Sorted:
        z = fruitname.text
        b.append(z)


m = 0
k = 3
while(driver.find_element(By.XPATH, '//div/div/div/div/ul/li[7]/a[@aria-disabled="false"]').is_enabled()) :
#while expected_conditions.presence_of_element_located((By.XPATH, '//div/div/div/div/ul/li[7]/a[@aria-disabled="false"]')):

    fruit_names = driver.find_elements(By.XPATH, '//tbody/tr/td[1]')
    Unsort_List()
    print(a)
    if(driver.find_element(By.XPATH, '//div/div/div/div/ul/li[7]/a[@aria-disabled="true"]').is_enabled()):
        continue
    driver.find_element(By.XPATH, '(//li/a)[{}]'.format(k)).click()
    k += 1

    #if expected_conditions.presence_of_element_located((By.XPATH, '(//ul/li[@class="disabled"])')) == True:




    #if expected_conditions.presence_of_element_located((By.XPATH, '(//ul/li/a[@aria-disabled="true"])[1]')):

        #m = 1


driver.refresh()
driver.find_element(By.XPATH, '//th').click()
m = 0
k = 4
while expected_conditions.presence_of_element_located((By.XPATH, '//div/div/div/div/ul/li[7]/a[@aria-disabled="false"]')):
    fruit_names_Sorted= driver.find_elements(By.XPATH, '//tbody/tr/td[1]')
    sort_List()
    #if expected_conditions.presence_of_element_located((By.XPATH, '(//ul/li/a[@aria-disabled="true"])[1]')):
        #break
    driver.find_element(By.XPATH, '(//li/a)[{}]'.format(k)).click()
    k += 1

        #m = 1


print(a)
print(b)
a.sort()
print(a)
assert a == b

