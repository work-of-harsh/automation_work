
def deco (fun):
    print("Before")
    fun()
    print("After")

@deco
def fun():
    print("Hi")



#decorator can take class a input too.
def b(a):
    print("Is a King")
    return a


@b
class a:
    def name(self):
        print("Harsh")

o=a()
o.name()




