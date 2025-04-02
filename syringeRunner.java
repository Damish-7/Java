class MethodRunner{
	public static void main(String[] args){
		System.out.println("running main");
		
		//Syringe
		int quantity1=10;
		int quantity2=20;
		int quantity3=30;
		int quantity4=5;
		int quantity5=8;
		String med1="Insulin";
		String med2="Penicillin";
		String med3="Morphine";
		String med4="Adrenaline";
		String med5="Covaxin";
		String nurseName1="Neha";
		String nurseName2="Sneha";
		String nurseName3="Donna";
		String nurseName4="Pragathi";
		String nurseName5="Swathi";
		boolean prescribed1=true;
		boolean prescribed2=false;
				
		Syringe.details(quantity1,med1,nurseName1);
		Syringe.details(quantity2,med2,nurseName2);
		Syringe.details(quantity3,med3,nurseName3);
		Syringe.details(quantity4,med4,nurseName4);
		Syringe.details(quantity5,med5,nurseName5);
		
		Syringe.inject(prescribed1);
		Syringe.inject(prescribed2);
	}
}