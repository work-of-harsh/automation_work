
class cm1:
    def __init__(self,a,b):
        self.a =a
        self.b=b

    def b1(self):
        print(self.a*self.b)

class b2(cm1):
    def c1(self):
        print(self.a+self.b)


B= b2(2,5)
B.c1()


