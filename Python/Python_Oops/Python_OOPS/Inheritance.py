
class cm1:
    def __init__(self,a,b):
        self.a =a
        self.b=b
    c=1
    global d
    d=5
    def b1(self):
        print(self.a*self.b)

class b2(cm1):
    def c1(self):
        print(self.a+self.b+self.c+d+ cm1.c)


B= b2(2,5)
B.c1()


