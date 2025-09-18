class Parent():
    def __init__(self):   #__name__ are system defined access modifires names in python
        self.__private = "Parent private"
        self._protected = "Parent protected"

    def show(self):
        print(f"{self.__private}  {self._protected}")

    def show2(self):
        self.__privte="Over ride private example"   #private can be overridden within same class.
        print(self.__privte)


class Child(Parent):
    def __init__(self):
        super().__init__()  #super().__init__() is used to access the parent class’s constructor data in case of overriding.
        self.__private = "Child private"  # ❌ Does NOT override parent's private
        self._protected = "Child protected"   # ✅ Overrides

obj = Child()
obj.show()   #only protected gets overridden
obj.show2()







