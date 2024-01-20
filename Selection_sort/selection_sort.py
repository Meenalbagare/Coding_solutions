from typing import List

def selectionSort(arr: List[int]) -> None: 
    # Write your code here
    for i in range(len(arr)-1):
        mini=i
        for j in range(i+1,len(arr)):
            if(arr[mini]>arr[j]):
                mini=j
        temp=arr[i]
        arr[i]=arr[mini]
        arr[mini]=temp
    pass