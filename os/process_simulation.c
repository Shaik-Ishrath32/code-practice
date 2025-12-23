#include <stdio.h>

int main(){
    //Array of process names
    char *processes[] = {*process1","process2","process3"};
    int n = 3;  //Number of processes
    //print the process names simulating running processes
    printf("Simulated processes running:\n");
    for(int i=0;i<n;i++){
        printf("%s\n",processes[i]);
    }
    return 0;
}
