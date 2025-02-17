a=(1,3,"hi","e")
print(a.index("hi"))     #prints index of a element
b=[]
b=list(a)           #convert tuple to list
b.reverse()

print(b)
dic ={"hi":2,3:"hie",5:78}
print(dic[3])
b=list(dic)        #list of keys
print(b)
b=list(dic.values())   #list of values
print(b)

#convert list to dictionary
def convert(lst):
    res_dict = {}
    for i in range(0, len(lst), 2):
        res_dict[lst[i]] = lst[i + 1]
    return res_dict
lst = ['a', 1, 'b', 2, 'c', 3]
print(convert(lst))     #calling function


#merging to list into dictionary
d={}
l1=["a","b","c"]
l2=["k","l","o"]
for i in range (0,len(l1)):
    d[l1[i]]=l2[i]
print(d)

m=d.keys()
print(m)
for key in m:
    print(key)
    for value in d[key]:          #this steps works only for string "value".
        print(value)
# list to dictionary method 2
a=[1,"a",2,"b",3,"c"]
d={}
k = len(a)
for i in range (0,k,2):
    d[a[i]]=a[i+1]

print(d)



