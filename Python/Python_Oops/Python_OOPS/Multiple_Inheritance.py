class cal:
    def __init__(self,a1,a2):
        self.a1=a1
        self.a2=a2
        print("I am const")

    def sum(self,a3):      #Providing argumrnt to method.
        s= self.a1+self.a2+a3
        print(s)

    def mul(self):
        m=self.a1*self.a2
        print(m)


a=cal(5,3)
a.sum(3)   #method sum needs argument
a.mul()

class inh(cal):
    def b(self):
        nm=5
        print(nm)


a = inh(1,1)
a.b()

class hjk(inh):     #multiple inheritance
    def jk(self):
        print("hi")

k=hjk(1,1)
k.b()
k.mul()
k.sum(1)
k.jk()