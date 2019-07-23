public class Date{
	public int hour;
	public int minute;
	public int second;
	public Date(int hour,int minute,int second){
		if(hour>=24||hour<0){
			System.err.println("钟点数不对");
			return;
		}
		if(minute<0||minute>=60){
			System.err.println("时分数不对");
			return;
		}
		if(second<0||second>=60){
			System.err.println("秒数不对");
			return;
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public Date after(int seconds){
		Date other=new Date(hour,minute,second);
		other.second+=seconds;
		while(other.second>=60){
			other.second-=60;
			other.minute++;
		if(other.minute>=60){
			other.minute-=60;
			other.hour++;
		}
		}
		if(hour>=24){
			other.hour=0;
		}
		return other;
	}
	public Date before(int seconds){
		Date other=new Date(hour,minute,second);
		other.second-=seconds;
		while(other.second<0){
			other.second+=60;
			other.minute--;
		if(other.minute<0){
			other.minute+=60;
			other.hour--;
		}
		if(other.hour<0){
			other.hour=23;
		}}
		return other;
	}*/
	public int diff(Date a,Date b){
		int at=a.hour*60*60+a.minute*60+a.minute;
		int bt=b.hour*60*60+b.minute*60+b.minute;
		if(at>bt){
			return (at-bt);
		}
		else return (bt-at);
	}
	public String toString(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
	} 
	public static void main(String[] args){
		Date now=new Date(20,0,0);
		Date h=new Date(19,0,0);
		System.out.println(h);
		System.out.println(now);
		Date r=now.after(3700);
		System.out.println(h.diff(h,now));
		System.out.println(now);
		System.out.println(r);
	}
}
