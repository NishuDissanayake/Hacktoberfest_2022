/*
Reverse the elements of array

Input: 67 87 98 45 73 61

Output: 61 73 45 98 87 67
*/

#include <bits/stdc++.h>  
using namespace std;  
  
int main ()  
{  
    int num;
    cin>>num;
    int arr[num], num, temp, i, j;   
         
    for (i = 0; i < num; i++)  
    {    
        cin >> arr[i];  
    }  
      
    for ( i = 0, j = num - 1; i < num/2; i++, j--)  
    {     
        temp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = temp;  
    }  

    for ( i = 0; i < num; i++)  
    {  
        cout << arr[i] << " ";  
    }  
    return 0;  
}  