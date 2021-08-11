#include<iostream>
#include"1.两数之和.cpp"
#include<vector> 
using namespace std;
int main(){
    vector<int> a = {2,7,11,15};
    vector<int> b= Solution().twoSum(a,9);
    cout<<b[0]<<b[1]<<endl;
}
