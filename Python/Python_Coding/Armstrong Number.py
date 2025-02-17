N=input('Enter a number:')
m=int(N)
p =int(N)
a=[]
j=0
rev=0
sum=0
u=len(a)-1
#number to list
while p!=0:
    q=p%10       #q= last digit of p
    a.insert(u,q)    #inserting from -1 index
    u-=1
    p=p//10         #here when p becomes 0, j still increases in next step but after going up and checking while condition loops is exited.
    j += 1


print(a)
length=len(a)
for i in range(0,length):
    sum=a[i]**length+sum    #"**" to raise to the power

if sum==int(N):
    print('Numbar is armstrong')
    

print(sum)

#reverse the number
for i in range(0,length):
    rev=rev+a[i]*10**i

print(rev)


b=["a","b","d","e"]           #converting list of string as string
length = len(b)
s=""
for i in range(0,length):
    s=s+b[i]
print(s)
#reverse a number
a= 1234
p=a
num =a
lit = []
while num != 0:
    p = num%10
    lit.append(p)
    num = int(num /10)
print(lit)

m= len(lit)
l=m
sum = 0
for i in range (0,m):
    sum = sum + lit[i]*10**(l-1-i)

print(sum)


a=123   #reverse a number
b = str(a)
n=" "
for i in b:
    n = i + n
print(int(n)+1)

print("{0},hi,{1} is prime".format(2,1))  #example of format



    
    
    
    
