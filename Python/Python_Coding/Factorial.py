N=int(input('Enter a number'))
x=N
m=1

for a in range(1,N):
    m=m*x
    x=x-1

print(m)
x=N
l=1
for i in range(N,0,-1):       #loop in reverse
    l = l*i

print(l)
