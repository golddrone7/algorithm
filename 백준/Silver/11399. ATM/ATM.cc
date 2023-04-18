#include <iostream>
#include <algorithm>
using namespace std;
int N;
const int MAX = 1000;

int main(){

    cin >> N;

    int people[MAX];

    for(int i=0; i<N; i++){

        cin >> people[i];

    }
    sort(people, people+N);
    int time = 0;

    for(int i=0; i<N; i++){

        for(int j=0; j<=i; j++)

            time += people[j];        

    }
    cout << time << endl;
}