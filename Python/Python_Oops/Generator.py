#generator is normal function but instead of returning all values and exiting the function, it can yield multile times using yield.
#yield pauses the function and resumes from the same state next time.

def gen():
    n=1
    yield n
    n=n+1
    yield n
    n=n+1
    yield n
obj=gen()
#print using next
print(next(obj))   #using directly next(gen())  will restart the gen() fresh each time.
print(next(obj))
print(next(obj))
#print using loop
for i in gen():
    print(i)

#print using list
print(list(gen()))

#fixture with yield is a generator function.
#generator function uses much less memory than for loop function.

#generator expression
#(expression for item in iteration if condition)

#we cant directly provide argument to generator expression function
n=10

gen= (x*x for x in range(0,n) if x%2==0)   #x*x is returned in each iteration, gen is object here.
print(list(gen))

gen = (x.upper() for x in ["apple","banana","cherry"] if len(x)>5)
print(list(gen))

#providing argument to generator expression using lambda

lam= lambda n:(x*2 for x in range(n) if x %2==0)

print(list(lam(15)))

#providing argument directly to generator function
def gen_arr(n):
    for i in range(n):
        yield i

print(list(gen_arr(5)))




