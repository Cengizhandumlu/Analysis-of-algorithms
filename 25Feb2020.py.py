#!/usr/bin/env python
# coding: utf-8

# In[14]:


def my_f_1(list_1=[4,-3,5,-2,-1,2,6,-2]):
    n=len(list_1)
    maxSum=0
    for i in range(n):
        for j in range(i,n):
            t=0
            for k in range(i,j):
                t=t+list_1[k]
            if t>maxSum:
                maxSum=t
    return maxSum


# In[15]:


def my_f_2(list_1=[4,-3,5,-2,-1,2,-6,-2,4,-3,5,-2,-1,2,6,-2]):
    s=0
    n=len(list_1)
    maxSum=0
    for i in range(n):
        t=0
        for j in range(i,n):
            t=t+list_1[j]
            s=s+1
        if t>maxSum:
            i_1,i_2=i,j
            maxSum=t
    return maxSum,s


# In[16]:


my_f_2()


# In[17]:


my_f_1(),my_f_2()


# In[18]:





# In[19]:


def max_of_two(a,b):
    if a>b:
        return a
    else:
        return b


# In[20]:


def max_of_three(a,b,c):
    return (max_of_two(a,max_of_two(b,c)))

max_of_three(1,4,6)


# In[29]:


def m_f_3(list_1=[4,-3,5,-2,-1,2,-6,-2]):
    n=len(list_1)
    
    if n==1:
        return list_1[0]
    else:
        left_list=list_1[0:n//2]
        right_list=list_1[(n//2):n]
        
        left_sum=m_f_3(left_list)
        right_sum=m_f_3(right_list)
        
        center_sum=0
        temp_sum=0
        for i in range(n//2,-1,-1):
            t=t+list_1[i]
            if t>temp_sum:
                temp_sum=t
                
        for i in range(n//2,n):
            t=t+list_1[i]
            if t>temp_sum:
                temp_sum=t
        center_sum=temp_sum_left+temp_sum_right
        return max_of_three(left_sum,right_sum,center_sum)


# In[ ]:




