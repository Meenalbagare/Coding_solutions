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
# The function accepts following parameters:
# 1. INTEGER ARRAY a
# 2. INTEGER ARRAY b
#

def solve(a, b):
	# Write your code here
	
	maxi=0
	index=-1
	n=len(a)
	# res=[0,0]
	for i in range(n):
		s=0
		s+=a[i]+b[i]
		if s>maxi:
			maxi=s
			index=i
	res=[index,maxi]
	return res



	

if __name__ == '__main__':
	a_count = int(input().strip())

	a = []

	for _ in range(a_count):
		a_item = int(input().strip())
		a.append(a_item)

	b_count = int(input().strip())

	b = []

	for _ in range(b_count):
		b_item = int(input().strip())
		b.append(b_item)

	result = solve(a, b)

	print('\n'.join(map(str, result)))
