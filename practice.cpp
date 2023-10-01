#include<bits/stdc++.h>
using namespace std;

int  pairs(vector<string>v){
    int pair=0;
    for(int i=0;i<v.size()-1;i++){
        for(int j=i+1;j<v.size();j++){
            set<char>set1;
            string s1=v[i];
            for(int k=0;k<s1.size();k++){
                set1.insert(s1[k]);
            }
            set<char>set2;
            string s2=v[j];
            for(int k=0;k<s2.size();k++){
                set2.insert(s2[k]);
            }
            
            int m=0,n=0;
            bool flag=true;
            if(set1!=set2){
                flag=false;
            }
            if(flag==true){
                pair++;
            }
            m++;
            n++;
        }
    }
    return pair;
}

int main(){
    vector<string>v({"oiohfooooo","asfoo","wwewrwfo"});
    cout<<pairs(v)<<endl;
    return 0;
}