a=[]
b=[]
N1=input('Enter a number')
N2=input('Enter another number')
k=int(N1)
j=int(N2)
u=[]


for i in range(1,int(k/2+1)):
    if k%i==0:
        a.append(i)

for i in range(1,int(j/2+1)):
    if j%i==0:
        b.append(i)

a.append(k)   #inserting original numbers too
b.append(j)     #inserting original numbers too

print('Factors of N1 are {}'.format(a))

print('Factors of N2 are {}'.format(b))

m=len(b)
for i in range(0,m):
    if b[i] in a:
        u.append(b[i])

print('Common Factors are {}'.format(u))
y=len(u)


print('HCF is {}'.format(u[y-1]))
sor=[1,87,34,9,105]
sor.sort()      #sorts in ascending order
print(sor)
