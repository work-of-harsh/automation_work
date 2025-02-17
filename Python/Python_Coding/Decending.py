a=[]
b=[]
N1=input('Enter length of array : ')
k=int(N1)

u=[]
for i in range(k):
    N2=input('Enter all numbers: ')
    a.append(N2)
print(a)

for i in range(k):
    for j in range(i+1,k):
        if int(a[i])<=int(a[j]):
            p=a[i]
            a[i]=a[j]
            a[j]=p

print(a)
print(a[0])
for i in range(1,1):     #this loop will never execute
    print("hi")

