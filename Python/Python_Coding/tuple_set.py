list=[1,2,3,4,4]     #Ordered,Mutable (can be changed),Allows duplicates,Indexed (can access by position)
tuple =(1,2,3,4,4)   #Ordered,Immutable (cannot be changed after creation),Allows duplicates,Indexed (can access by position)
set={1,2,3,4,4}      #Unordered,Mutable (can add/remove items),No duplicates allowed,Not indexed
print(set)


set.add(4)
set.remove(4)

for i in set:
    print(i)
