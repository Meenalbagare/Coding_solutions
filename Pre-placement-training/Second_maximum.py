#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'second_largest' function below.
# 
# The function is expected to return an INTEGER.
# The function accepts INTEGER ARRAY nums as parameter.
#

def second_largest(nums):
	#Write your code here
	f=s=-1
	for i in range(len(nums)):
		if(nums[i]>f):
			s=f
			f=nums[i]
		elif (nums[i]>s and nums[i]!=f):
			s=nums[i]
	return s
		
	
	

if __name__ == '__main__':
	nums_count = int(input().strip())

	nums = []

	for _ in range(nums_count):
		nums_item = int(input().strip())
		nums.append(nums_item)

	result = second_largest(nums)

	print(str(result))