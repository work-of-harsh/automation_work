a=[]
b=[]
N1=input('Enter a number')
N2=input('Enter another number')
k=int(N1)
j=int(N2)
u=[]
i=1
n=k*i
while n%j!=0:
    n=k*i
    i+=1

print('LCM IS {0}.'.format(n))
