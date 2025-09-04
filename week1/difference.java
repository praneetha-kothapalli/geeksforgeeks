class Hello{
public double getAngle(String s) {
  String[] time=s.split(":");
  int hour-Integer.parseInt(time[0]);
  int minute Integer.parseInt(time[1]);
  if (hour==0){
    hour=12;
  }
  else if (hour>12){
    hour-=12;
  }
  double minuteAngle=minute*6;
  double hourAngle=(hour*30)+(minute*0.5);
  double angleDifference=Math.abs(hourAngle-minuteAngle);
  return Math.min(angleDifference, 360-angleDifference);
}
}
//find the smallest difference between the hour and minute clock.
