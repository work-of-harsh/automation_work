s= "aasarhdwwfvca"
a=""

for i in s:
    if i not in a:
        a=a+i
print(a)

#convert list to string
u=["t" ,"h","u","g"]
output="".join(u)
print(output)


#number of characters counts in a string  Method1
s="aaaabbbcccaaawwwvvvbbb"
d={}
for i in s:
    if i in d.keys():
        d[i]=d[i] +1
    else:
        d[i] =1      #entering character first time
print(d)
print(d["w"])


#Method2
#number of characters counts in a string
s="aaaabbbcccaaawwwvvvbbb"
d={}
for i in s:
    s.count(i)
    d[i]=s.count(i)
print(d)




#removing consecutive repetetion
a = 'Vosllllyaas'
v= ''
k=""
for i in a:
     if i!=k:
         v=v + i
         k=i

print(v)