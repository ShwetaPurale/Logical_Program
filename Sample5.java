class Sample5
{
	public static void main(String[]args){
		char signal='b';
		//if(signal=='r'){
		//	System.out.println("Immediatly stop");
		//}
		//else if(signal=='g'){
		//	System.out.println("now go");
		//}
		//else if(signal=='y'){
		//	System.out.println("ready to go");
		//}
		//else{
		//	System.out.println("enter valid signal");
		//}
		switch(signal)
		{
			case 'r': System.out.println("Immediatly stop");
			break;
			case 'g': System.out.println("now go");
			break;
			case 'y': System.out.println("ready to go");
			break;
			default: System.out.println("enter valid signal");
			break;
		}
	}
}