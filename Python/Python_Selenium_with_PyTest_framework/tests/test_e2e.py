from selenium import webdriver

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
import pytest
import Test_Data.test_data
from Utilities.BaseClass import BaseClass
from pageObjects.CheckoutPage import CheckOutPage
from pageObjects.HomePage import HomePage

from Test_Data.test_data import testData

#@pytest.mark.usefixtures("setup")                           #no need to use as we are using base class which has fixture, which can be used by all class methods.

class TestOne(BaseClass):                                   #inheriting baseclass (parent class to child class). #this step invokes browser, as BaseClass invokes fixture.

    def test_e2e(self,getData):                                    #we loaded "getData" fixture (used for params) in "test_e2e" method, getData loads all data required before test execution.  #to define anything underclass should have self parameter
        log = self.getLogger()                                 #Logger has capital "L", #logfile is generated in tests folder itself.
        homePage= HomePage(self.driver)                            # we are sending "self.driver" as argument.
        self.driver.implicitly_wait(5)                                #we use "self.driver" because we have assigned driver of fixture as class variable of main test case class using "cls.driver".

        checkoutPage = homePage.shopItems()                                            # used a part of href value in Xpath    #self not required in shopItems() as we are calling it from object 'homePage' name not class name 'HomePage'.  #we skipped creating object fromclass in out test
        log.info("getting all the card titles")          #log can be used as print
        #checkOutPage = CheckOutPage(self.driver)
        checkoutPage.select_mobile(getData['mobileName'])             #'mobileName' is a dictionary key #"getData" is name of function

        checkoutPage.checkout_button()

        confirm_page = checkoutPage.checkout_button()
        log.info("Entering country name")                   #log.info prints in log file. We can also use log.warning.
        confirm_page.enter_country(getData['entered_country_name'])  #we can also provide multiple arguments if required.
        self.verifylinkpresence(getData['country_presence'])                 #to use any baseclass method use "self"
        confirm_page.select_country()
        confirm_page.final_purchase()
        log.info("Shopping Success")


    def test_e2e_two(self,getData):  # "BaseClass.py" will load again for "test_e2e_two" method.
        log = self.getLogger()
        homePage = HomePage(self.driver)
        self.driver.implicitly_wait(5)
        checkoutPage = homePage.shopItems()
        log.info("Shopping Page Opened")



    @pytest.fixture(params = testData.jsondata("Test_Case2"))   #this fixture is not in conftest file beacuse this fixture is usable only for this particular test case.
    def getData(self,request):                                         # as we are writing inside a class self parameter is also required.
        return request.param
    # we can use in fixture testData.page_data if we directly want to use data from dictionary.
