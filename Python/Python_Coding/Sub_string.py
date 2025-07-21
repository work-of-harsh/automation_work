
#all possible substring
s="ababacdceh"

sub_strigs = list((s[i:j] for i in range(len(s)) for j in range(i+1,len(s)+1)))

print(sub_strigs)



