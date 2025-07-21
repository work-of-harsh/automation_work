


class parent:
    num=6
    def s_met(self):
        print("Parent method")


class child(parent):
    def s_met(self):
        print("Child method")

        return super().s_met(),print(super().num)   #accessing parent method and variables

obj = child()
obj.s_met()

