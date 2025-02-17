#Encapsulation is one of the fundamental concepts in object-oriented programming (OOP).
# It describes the idea of wrapping data and the methods that work on data within one unit.
# This puts restrictions on accessing variables and methods directly and can prevent the accidental modification of data.
# To prevent accidental change,
# an object’s variable can only be changed by an object’s method. Those types of variables are known as private variables.

#private variable can only be accessed by its class methods.
class a:
    __var1=45
    var2 = 909

    def mrt1(self):
        self.__var1=99           #changing private variable
        print(self.__var1)        # use self to call class variable
print(a.var2)
obj1=a()
#obj1.__var1             #obj1 is outside the class, so cant access __var1.
obj1.mrt1()           #only through method we can access var1.
#print(a.__var1)       #access denied as var1 is private

#private methods can only be accessed by its class methods.
class b:
    def __met1(self):
        print("Thug")

    def met2(self):
        print("hello")
        self.__met1()             #use self to access class methods just like class variables.

obj2=b()
obj2.met2()          #way of accessing private method.
#obj2.__met1()     will fail as object is outside class

class c:
    def __met1(self):
        __v2=5
        print("Thug")

    def met2(self):
        print("hello")
        self.__met1()

k=c()
k.met2()