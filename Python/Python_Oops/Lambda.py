#A lambda function is a small anonymous function.

#A lambda function can take any number of arguments, but can only have one expression.

#lambda argument:expression
x= lambda a: a+10   #expression value is returned by lambda function.
print(x(5))

x= lambda a,b: a+b
print(x(5,2))

x= lambda a,b,c: a*b*c
print(x(5,2,10))

str1 = 'GeeksforGeeks'

upper = lambda string: string.upper()
print(upper(str1))

a=5
try:
    assert(a==1)
    print("hi")
except:              #except only runs when try fails.
    print("error")
else:                    #runs when try dosent fail
    print("else")

finally:
    print("done")



