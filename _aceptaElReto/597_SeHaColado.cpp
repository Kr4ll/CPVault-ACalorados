#include <bits/stdc++.h>
using namespace std;

int main(){
    long long int cases,num,pos=-1,realPos=0,removed=0;
    bool find=false;
    vector<int> array;
    cin >> cases;
    while (cases--)
    {
        cin >> num;
        while(num--)
        {
            cin>>realPos;
            if (pos>realPos) {
                removed++;
                if (!array.empty()) {
                    array.pop_back();

                    while (!find) {
                        if (!array.empty())
                        {if(array.back() > realPos){
                                array.pop_back();
                                removed++;
                            }else find=true;
                        } else find = true;
                    }
                }
            }
            array.push_back(realPos);
            pos=realPos;
            find=false;
        }
        cout << removed<<'\n';
        array.clear();


        removed=0;

        pos=0;

    }
}
