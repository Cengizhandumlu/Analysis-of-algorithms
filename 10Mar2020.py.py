#!/usr/bin/env python
# coding: utf-8

# In[1]:


def check_prime(n):
    s=0
    if n!=1:
        for factor in range(2,n):
            s=s+1
            if n%factor==0:
                return False,s
    else:
        return False,s
    return True,s


# In[3]:


print(check_prime(10))
print(check_prime(13))
print(check_prime(23))
print(check_prime(319))


# In[4]:


numbers=[10,13,23,310]


# In[5]:


for num_ in numbers:
    print(check_prime(num_))


# In[6]:


def my_search(numbers,x):
    s=0
    for i in numbers:
        s=s+1
        if i==x:
            return True,s
    return False,s

numbers=[10,13,23,310,49]

x=1

print(my_search(numbers,x))


# In[7]:


import random


# In[8]:


def get_my_list(s):
    list_1=[]
    for i in range(s):
        t=random.randint(-100,100)
        list_1.append(t)
    return list_1


# In[9]:


def get_my_number():
    return random.randint(-100,100)


# In[30]:


my_list=get_my_list(1000)


# In[31]:


print(my_list)


# In[32]:


my_number=get_my_number


# In[33]:


print(my_search(my_list,my_number)[1])


# In[34]:


print('liste boyutu : ', len(my_list))


# In[35]:


my_search_numbers=[2,45,78,-34,55]


# In[36]:


t=0
for x in my_search_numbers:
    t_1=my_search(my_list,x)[1]
    t=t+t_1
a,b=t,t/len(my_search_numbers)


# In[37]:


print('ortalama değer : ',b)


# In[47]:


def my_search_complexity(numOfitem=10, numOfTrials=5):
    
    size=numOfitem
    my_list=get_my_list(100)
    my_search_numbers=get_my_list(100)
    
    print('Liste Boyutu : ',len(my_list))
    t=0
    for x in my_search_numbers:
        t_1=my_search(my_list,x)[1]
        t=t+t_1
    a,b=t,t/len(my_search_numbers)
    print('ortalama değer : ',b)       


# In[51]:


my_search_complexity(10,5)
my_search_complexity(50,250)
my_search_complexity(100,50)
my_search_complexity(1000,500)
my_search_complexity(1000,800)
my_search_complexity(1000,900)


# In[52]:


my_list,my_search_numbers


# In[ ]:




