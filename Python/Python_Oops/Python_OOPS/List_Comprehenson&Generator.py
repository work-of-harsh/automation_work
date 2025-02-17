#list_comprehension



newlist = [x for x in range(10)]

print(newlist)

lst= [1,2,3,4,5,6]

lst2= [x for x in lst if x!=4]
print(lst2)         #4 not present

lst3= [x for x in lst if x==4]
print(lst3)

#Python Generator functions return a generator object that is iterable, i.e., can be used as an Iterator.
# Generator objects are used either by calling the next method of the generator object or using the generator object in a “for in” loop.
#Generator function doesnt store any list of values but returns list of values whenever called.

# A generator function
def simpleGeneratorFun():
    yield 1
    yield 2
    yield 3


# x is a generator object
x = simpleGeneratorFun()

# Iterating over the generator object using next

# In Python 3, __next__()
print(next(x))
print(next(x))
print(next(x))
y= simpleGeneratorFun()
for i in y:
    print(i)