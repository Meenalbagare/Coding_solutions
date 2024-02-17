
# Read the variable from STDIN
a = int(input())
def trailing(n):
    if(n<1):
        return -1
    c=0
    while(n>=5):
        n//=5
        c+=n
    return c
print(trailing(a))
