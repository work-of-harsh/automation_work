N=input('Enter a number:')
m=int(N)
b =1
a=0
j=0

sum=0

print('1', end=" ")    #end=" " prints in same line
for i in range(1,m):
    
    sum=a+b
    print(sum, end=" ")
    a=b
    b=sum


