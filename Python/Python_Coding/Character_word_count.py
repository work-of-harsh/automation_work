import re

s = "   Hi my name is john'd cen!a12    "
w = "   HI hi what is a a is what! is, a123   "
clean_s= re.sub(""," ",s).strip().lower()  #seperates each chaacter by space.
print(clean_s)
clean_s= re.sub("[^a-zA-Z0-9 ]","",s).strip().lower()   # means keeps only these characters [^a-zA-Z0-9 ], also space is included after 9.
print(clean_s)

d_s={}

for i in clean_s:
    d_s[i]=clean_s.count(i)
print(d_s)
#count the characterts and print min 3
print("Method1")
for i in range(3):
    if len(d_s)!=0:
        get_key= min(d_s,key=d_s.get)
        print(f"Min frequency keys are {get_key} : {d_s[get_key]}")
        del d_s[get_key]
#method2
d_s={}

for i in clean_s:
    d_s[i]=clean_s.count(i)
print(d_s)
key=list(d_s.keys())
val=list(d_s.values())
print("Method2")
for i in range(3):
    min_val=min(val)
    print(f"Min frequency keys are {key[val.index(min_val)]} : {min_val}")  #val.index(min_val) gives index of element min_val in list val.
    del key[val.index(min_val)]
    del val[val.index(min_val)]

clean_w = re.sub("[^a-zA-Z ]","",w).strip().lower().split(" ")
print(clean_w)
for i in clean_w:
    print(f"word {i} : {clean_w.count(i)}")




