#Polymorphism :What is Polymorphism: The word polymorphism means having many forms. In programming, polymorphism means the same
# function name (but different signatures) being used for different types. The key difference is the data types and number of
# arguments used in function.
#Polymorphism achieved by overriding and overloading.
#overriing variables

class a:
    var1="him"
class b(a):
    var1="you"

obj1=b()
print(obj1.var1)        #prints "you" overriding "him". If var1="you" is removed, "him" is printed.

#overriing method.

class icici:
    def rate_of_interest(self):
        return 0

class hdfc(icici):
    def rate_of_interest(self):
        return 10.5
obj2=hdfc()
print(obj2.rate_of_interest())          #overriding method "rate_of_interest"  in class hdfc.
obj3=icici()
print(obj3.rate_of_interest())

#Overloading methods

class Human:
    def sayHello(self,name=None):            #same method behaving differently as per the argument
        if name is not None:
            print("Hello "+name)
        else:
            print("Hello "+"Stranger")
obj4= Human()
obj4.sayHello("Harsh")    #argument in function not class , so no constructor needed.
obj4.sayHello()


class Human:
    def sayHello(self,name='Thug'):            #same method behaving differently as per the argument
            print("Hello "+name)

obj=Human()
obj.sayHello()      #prints "Hello Thug"
obj.sayHello('Harsh')       #prints "Hello Harsh"