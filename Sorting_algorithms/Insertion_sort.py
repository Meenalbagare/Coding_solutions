
import os
import sys
from copy import deepcopy
input = lambda: sys.stdin.readline().rstrip("\r\n")
sys.setrecursionlimit(10 ** 7)
def insertionSort(arr):
    # write your code here !!!
    for i in range(len(arr)):
        j=i
        while(j>0 and arr[j-1]>arr[j]):
            temp=arr[j-1]
            arr[j-1]=arr[j]
            arr[j]=temp
            j-=1





    
        
class Runner:
    def __init__(self):
        self.n = 0
        self.arr =[]

    def takeInput(self):
        self.n = int(input())
        self.arr= list(map(int, input().split()))

    def execute(self):

        ans = insertionSort(self.arr)

    def executeAndPrintOutput(self):
        ans = insertionSort(self.arr)
        print(*self.arr)

runner = Runner()
runner.takeInput()
runner.executeAndPrintOutput()