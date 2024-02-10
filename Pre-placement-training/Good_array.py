#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'solve' function below.
# 
# The function is expected to return an STRING.
# The function accepts INTEGER ARRAY a as parameter.
#

def solve(a):
	# Write your code here
	c=0
	a.sort()
	for i in range(len(a)):
		j=i+1
		if(j<len(a) and a[j]>a[i] and a[j]%a[i]==0):
			c+=1
		# print(i,c)
	if c==len(a)-1:
		return "Yes"
	return "No"

	

if __name__ == '__main__':
	a_count = int(input().strip())

	a = []

	for _ in range(a_count):
		a_item = int(input().strip())
		a.append(a_item)

	result = solve(a)

	print(result)
