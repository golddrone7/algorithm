#include <cstdio>
#include <algorithm>

using namespace std;

int main(){
    
    int N, i;
    long long ans;
    scanf("%d", &N);
    long long arr[N];
    
   for (i = 0; i < N; i++) scanf("%lld", &arr[i]);
    sort(arr, arr+N);

    printf("%lld\n", arr[0] * arr[N-1]);
    return 0;
    
}