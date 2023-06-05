#include <bits/stdc++.h>
using namespace std;

int main(){
    int n=1,k,pos1,pos2,ite;
    vector<int> v;
    string line,num;
    set<int> cache;


    while(n!=0)
    {
        cache.clear();
        v.clear();
        pos1=0;pos2=0;
        getline(cin, num);
        getline(cin, line);
        n=stoi(num);
        istringstream iss(line);
        while (iss >> k)
        {
            v.push_back(k);
        }
        sort(v.begin(), v.end(),greater<int>());
        while(!v.empty())
        {
            pos1=v.back();v.pop_back();
            if (!v.empty()){pos2=v.back();v.pop_back(); cache.insert(pos2-pos1);}

            for(int j:v)
            {
                cache.insert(j-pos1);
                cache.insert(j-pos2);
            }

        }
        for(auto j=cache.begin(); j!=cache.end(); ++j){
            cout << *j; if (j!=prev(cache.end()))cout <<' ';
        }
        if(n!=0){
            cout<<'\n';
        }
    }
    return 0;
}
