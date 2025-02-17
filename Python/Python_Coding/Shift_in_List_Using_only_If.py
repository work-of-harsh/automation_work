a=[1,2,3,4,5,6]
b1=a
for i in range(0,3):
    b=a[len(a)-1]
    for i in range(len(a)-1,-1,-1):
         if(i!=0):
            a[i] = a[i-1]
         elif(i==0):                   #if we use else if we have to define condition in python or java.
            a[0] = b

print(a)