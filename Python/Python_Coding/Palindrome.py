a=[]
b=[]
N1=input('Enter a word : ')
x=""
k=""
#reversing string method 1
for i in N1:
    k = i + k
print(k)
#reversing string method 2

l=len(N1)

for i in range (l):
    b.append(N1[i])

print(b)

for i in range (l):
    a.append(b[l-1-i])

print(a)

if a==b:
    print('String is Palindrome')

else:
    print('String is not Palindrome')

x=x.join(a)
print(x)

#list to string
l = ["a", "b", "c", "d"]
s = ""
for i in l:
    s = s + i

print(s)
k=[]
#string to list

l ="abcd"

for i in range(0,len(l)):
    k.append(l[i])
print(k)
