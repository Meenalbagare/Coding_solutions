from collections import defaultdict
# Read the variable from STDIN
a = input().split(',')
a.sort()
d=defaultdict(int)
for i in a:
    if i not in d:
        d[i]=1
    else:
        d[i]+=1
for i,j in d.items():
    if(j==1):
        print(i)