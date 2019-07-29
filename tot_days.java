#include <stdio.h>
#include <stdlib.h>

int main()
{
    int feb,yr,t_days,t_hr,t_min,tsec,tot_days=0,month;
    printf("Enter the date:\n");
    scanf("%d",&t_days);
    printf("Enter the month\n");
    scanf("%d",&month);
    printf("Enter the year:\n");
    scanf("%d",&yr);
    if(yr%4==0){
        tot_days++;}
    else{
        tot_days=0;}//Made by 594
    int jan=31,mar=31,may=31,jul=31,aug=31,oct=31,dec=31;
    int apr=30,jun=30,sep=30,nov=30;
    if(tot_days=1){
        feb=29;
    }
    else{
        feb=28;
    }
    if(month==1){
        tot_days=t_days;
    }else if(month==2){
        tot_days=t_days+jan;
    }else if(month==3){
        tot_days+=t_days+jan+feb;
    }else if(month==4){
        tot_days+=t_days+jan+mar+feb;
    }else if(month==5){
        tot_days+=t_days+jan+mar+feb+apr;
    }else if(month==6){
        tot_days+=t_days+jan+mar+feb+apr+may;
    }else if(month==7){
        tot_days+=t_days+jan+mar+feb+apr+may+jun;
    }else if(month==8){
        tot_days+=t_days+jan+mar+feb+apr+may+jun+jul;
    }else if(month==9){
        tot_days+=t_days+jan+mar+feb+apr+may+jun+jul+aug;
    }else if(month==10){
        tot_days+=t_days+jan+mar+feb+apr+may+jun+jul+aug+sep;
    }else if(month==11){
        tot_days+=t_days+jan+mar+feb+apr+may+jun+jul+aug+sep+oct;
    }else if(month==12){
        tot_days+=t_days+jan+mar+feb+apr+may+jun+jul+aug+sep+oct+nov;
    }
    printf("The total days will be %d",(tot_days-1));
    return 0;//Made by 594
}