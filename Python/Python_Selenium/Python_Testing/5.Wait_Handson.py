import time

from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.expected_conditions import presence_of_element_located
service_obj = Service("C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe")

driver = webdriver.Chrome(service=service_obj)

driver.get("https://rahulshettyacademy.com/seleniumPractise/#/")
print(driver.title)
driver.maximize_window()

driver.implicitly_wait(5)                              #global timeout, max 5 sec wait.
driver.find_element(By.XPATH,'//input[@type="search"]').send_keys('ap')

Fruits_List=[]
#fruits names list creation
time.sleep(2)
Fruits= driver.find_elements(By.XPATH,'//div/h4')     #used sleep so that all elements are loaded and list contains all elements not empty

for fruit in Fruits:
    Fruits_List.append(fruit.text)

print(Fruits_List)
#adding fruits to cart
add_to_cart = driver.find_elements(By.XPATH,"//div/button[text()='ADD TO CART']")
print(len(add_to_cart))
assert len(add_to_cart) >0
for item in add_to_cart:
    item.click()                                  #here we can also use chaining of web elements

driver.find_element(By.XPATH,'//div/a/img[@alt="Cart"]').click()
driver.find_element(By.XPATH,'//button[text()="PROCEED TO CHECKOUT"]').click()
#summing the prices of fruits in the cart
prices = driver.find_elements(By.XPATH,'//tbody/tr/td[5]/p[@class="amount"]')
sum = 0
for price in prices:
    sum = sum + int(price.text)            #convert text into int

print(sum)
Total = int(driver.find_element(By.CSS_SELECTOR,'.totAmt').text)
assert int(sum) == Total

#adding promocode
driver.find_element(By.XPATH,'//input[@class="promoCode"]').send_keys('rahulshettyacademy')
driver.find_element(By.CSS_SELECTOR,'.promoBtn').click()
wait = WebDriverWait(driver,10)                           #explicit wait
# explicit wait until condition
wait.until(expected_conditions.presence_of_element_located((By.CSS_SELECTOR,'.promoInfo')))  # two (()) for presence of element located
print(driver.find_element(By.CSS_SELECTOR,'.promoInfo').text)
discount_amount = float(driver.find_element(By.XPATH,'//span[@class="discountAmt"]').text)       #text is decimal value so used float

assert discount_amount <= sum
a='Place Order'     #using variable in xpath
driver.find_element(By.XPATH,'//*[text()="'+a+'"]').click()



