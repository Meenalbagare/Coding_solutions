#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'solve' function below.
# 
# The function is expected to return an INTEGER ARRAY.
# The function accepts INTEGER ARRAY a as parameter.
#

def solve(a):
	# Write your code here
	maxi=0
	mini=0
	res=[]
	for i in range(len(a)):
		if i==0:
			profit=max(a[i:len(a)])-a[i]
			
		elif i==len(a)-1:
			profit=a[i]-min(a[0:len(a)])
		else:
			profit=max(a[i:len(a)])-min(a[0:i+1])
		# print("profit",i,profit)
		res.append(a[i]+profit)
	return res
	
	

if __name__ == '__main__':
	a_count = int(input().strip())

	a = []

	for _ in range(a_count):
		a_item = int(input().strip())
		a.append(a_item)

	result = solve(a)

	print('\n'.join(map(str, result)))