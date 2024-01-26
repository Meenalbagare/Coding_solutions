def rotateArray(arr: list, k: int) -> list:
    # Write your code here.
    n=len(arr)
    k=k%n
    return arr[k:n]+arr[:k]
    pass