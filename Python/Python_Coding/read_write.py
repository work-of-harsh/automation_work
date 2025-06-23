file_location="C://Users//Lenovo//Desktop//Python//Git_repos//Codes//automation_work//Python//Python_Coding//read_write.txt"
with open(file_location,"w") as file:    #"w" create new instance every time and overrides the file. Use "a" to append every time.
    file.write("Hello! Harsh")


with open(file_location,"r") as file:
    print(file.read()[0:10])



