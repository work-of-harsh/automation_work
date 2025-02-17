from selenium.webdriver.common.by import By

class ConfirmPage:
    def __init__(self,driver):
        self.driver = driver
    enter_country_name = (By.CSS_SELECTOR, '#country')
    click_country = (By.XPATH,'(//div[@class="suggestions"]/ul/li/a)[1]')
    checkbox = (By.XPATH, '//label[@for="checkbox2"]')
    purchase = (By.XPATH, '//input[@value="Purchase"]')

    def enter_country(self,country):
        return self.driver.find_element(*ConfirmPage.enter_country_name).send_keys(country)

    def select_country(self):
        return self.driver.find_element(*ConfirmPage.click_country).click()        #works even without using return

    def final_purchase(self):
        self.driver.find_element(*ConfirmPage.checkbox).click()
        self.driver.find_element(*ConfirmPage.purchase).click()