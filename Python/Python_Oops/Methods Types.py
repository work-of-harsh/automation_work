class car:
    model = "BMW"

    def __init__(self,wheel):
        self.wheel = wheel   #instance variable
        self.model= "cadelac"   #instance variable
        car.year =2025



    def met0(self):
        print("Hello I am met0")
    #self argument in a method inside a class refers to the instance of the class that is calling the method.
    #It allows access to instance variables and methods within the class.
    #Instance Method (uses self)
    def met1(self):            #self refers to the object of class "car" here.
        print(f"Model for met1 self. is {self.model}")   #prints the overidden value.
        print(f"Model for met1 car. is {car.model}")    #prints the original value.
        self.met0()
        self.met2()
        car.met0(obj)   #Instance methods require self; calling them on the class requires passing an instance.
        car.met2()


    @classmethod    #cant directly access instance variables.
    def met2(cls):                       #cls refers to the class "car" here.
        print(f"Model for met2 car. is {car.model}")
        print(f"Model for met2 cls. is {cls.model}")
        print(f"Model for met2 cls. is {cls.year}")


    @classmethod    #cant directly access instance variables.
    def met2a(cls, instance):
        print(f"Model for met2a car. is {car.model}")
        print(f"Model for met2a cls. is {cls.model}")
        print(f"Model for met2a instance. is {instance.model}")

    @staticmethod
    def met3():
        print(f"Model for met3 car. is {car.model}")    #Cannot access instance or class data directly.


obj= car(4)
obj.met1()      #python translates it as car.met1(obj), that is why passing obj as parameter is not required. self in class methods refers to obj.

#Python looks for the attribute in this order if the variable name is same here "model" variable:

#1.Instance (self)

#2.Class (Car)

#3.Parent classes (if any)


#accessing instance variable from class method.
obj1=car(6)
obj1.met2a(obj1)   #obj1 is passed as argument as "class method" met2a is using instance.
