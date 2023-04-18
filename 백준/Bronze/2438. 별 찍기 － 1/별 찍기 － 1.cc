#include <iostream>
#include <string>
using namespace std;

int main(){
    int n;
    string byul;
    cin >> n;
    for(int i=0; i<n; i++){
        byul += "*";
        cout << byul << endl;
    }
    
    return 0;
}