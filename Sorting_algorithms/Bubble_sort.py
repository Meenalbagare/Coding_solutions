from typing import List

def bubbleSort(arr: List[int], n: int):
    # Your code goes here.
    for i in range(n-1,-1,-1):
        for j in range(i):
            if(arr[j]>arr[j+1]):
                temp=arr[j+1]
                arr[j+1]=arr[j]
                arr[j]=temp
    pass