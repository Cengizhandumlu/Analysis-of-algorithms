#!/usr/bin/env python
# coding: utf-8

# In[8]:


def my_insertion_sort(arr=[2,1,6,-2,4,9,-5]):
    n=len(arr)
    loop_counter=0
    for i in range(1,n):
        key=arr[i]
        j=i-1
        while j>=0 and key<arr[j]:
            arr[j+1]=arr[j]
            j=j-1
            loop_counterp_counter=loop_counter+1
        arr[j+1]=key
    return arr,loop_counter


# In[9]:


arr=[2,1,6,-2,4,9,-5]


# In[10]:


print(arr)


# In[11]:


arr,l_c=my_insertion_sort()


# In[12]:


print(arr,l_c)


# In[13]:


arr=[2,11,22,33,44,55,66,77,88,99]
print(arr)
arr,l_c=my_insertion_sort()
print(arr,l_c)


# In[ ]:




