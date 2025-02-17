

from selenium.webdriver.common.by import By

from pageObjects.CheckoutPage import CheckOutPage


class HomePage:
    def __init__(self,driver):                                       #lecture 91  #creating constructor. "self.driver" comes as argument from main test case and is assigned to "driver" of constructor.
        self.driver = driver                         #"self.driver" is assined to "driver" of constructor and "driver" of constructor is assigned to instance variable "self.driver" to be used in the method.
    shop=(By.XPATH, "//a[contains(@href,'shop')]")                             #shop is tuple which is  also a class variable

    def shopItems(self):                                                           #name should start with lower case

       self.driver.find_element(*HomePage.shop).click()       #self.driver is instance variable        #we use '*' to treat shop as tuple and deserialise the tuple. We use "HomePage.shop" because shop is a class variable
       checkOutPage = CheckOutPage(self.driver)                                     #integrating checkout page by creating checkOutPage method
       return checkOutPage
       #self.driver.find_element(By.XPATH, "//a[contains(@href,'shop')]").click()

