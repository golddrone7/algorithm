#include <iostream>
using namespace std;

int main(){
    int T, N;
    cin >> T;
    int num;
    int result = 0;
    for (int i=0; i<T; i++){
        cin >> N;
        for(int j=0; j<N; j++){
         cin >> num;
            result += num;
        }
        cout << result << endl;
        result = 0;
    }
    return 0;
}