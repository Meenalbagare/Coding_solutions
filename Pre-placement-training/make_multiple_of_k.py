#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'solve' function below.
# 
# The function is expected to return an LONG INTEGER.
# The function accepts following parameters:
# 1. INTEGER ARRAY a
# 2. INTEGER k
#

def solve(a, k):
	# Write your code here
	s=0
	for i in range(len(a)):
		if(a[i]%k!=0):
			add=a[i]//k
			num=add+1
			s+=(((num)*k)-a[i])
			a[i]=(num)*k
		
	return s
	

if __name__ == '__main__':
	a_count = int(input().strip())

	a = []

	for _ in range(a_count):
		a_item = int(input().strip())
		a.append(a_item)

	k = int(input().strip())

	result = solve(a, k)

	print(str(result))
