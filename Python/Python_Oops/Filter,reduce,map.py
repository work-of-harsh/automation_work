#Filter

#Here, lambda x: (x % 2 == 0) returns True or False if x is not even.
# Since filter() only keeps elements where it produces True,
# thus it removes all odd numbers that generated False.

lst1=[1,2,3,4,5,6,7,8,9,10]

final_lst1= list(filter(lambda x: (x%2==0),lst1))
print(final_lst1)

ages = [13, 90, 17, 59, 21, 60, 5]
adults = list(filter(lambda age: age > 18, ages))

print(adults)

#map
#The map() function in Python takes in a function and a list as an argument.
# The function is called with a lambda function and a list and a new list is returned which
# contains all the lambda-modified items returned by that function for each item
lst1=[1,2,3,4,5,6,7,8,9,10]

final_lst2=list(map(lambda n: n*2,lst1))

print(final_lst2)


#reduce
#This performs a repetitive operation over the pairs of the iterable.
#The reduce() function belongs to the functools module.

from functools import reduce
lst=[1,2,3,4,5,6,7,8,9,10]
final_lst3=reduce(lambda a,b : a+b,lst)
print(final_lst3)



