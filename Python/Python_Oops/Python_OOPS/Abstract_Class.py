#An abstract class can be considered a blueprint for other classes.
# It allows you to create a set of methods that must be created within any child classes built from the abstract class.

from abc import ABC,abstractmethod

class a(ABC):     #if two methods are defined in parent abstract class, both methods must be defined in child class.
    def __init__(self,value):
        self.value = value
    @abstractmethod
    def add(self):
        #empty
        pass
    @abstractmethod
    def sub(self):
        #empty
        pass

class b(a):                          #inhereting the abstract class
    def add(self):
        print(self.value+10)

    def sub(self):
        print(self.value-10)


class c(a):                         # inhereting the abstract class
    def add(self):
        print(self.value + 100)

    def sub(self):
        print(self.value - 100)


obj1=b(100)
obj1.add()
obj1.sub()

obj2=c(100)
obj2.add()
obj2.sub()




