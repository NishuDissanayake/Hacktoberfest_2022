/*
Unique elements of array
Input: 7 6 3 4 7 3 2 4
Output: 7 6 4 3 2
*/

#include <bits/stdc++.h>  
using namespace std;
int main ()  
{  
    int num;
    cin>>num;
    int arr[num];   

    for (int i = 0; i < num; i++)  
    {    
        cin >> arr[i];  
    }  

    unordered_map<int,int>m;
    for(int i=0; i<num; i++){
        m[arr[i]]++;
    }
    for(auto &it: m){
        cout<<it.first<<" ";
    }
    return 0;  
} 