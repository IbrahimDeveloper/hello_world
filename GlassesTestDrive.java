class GlassesTestDrive {
	public static void main(String[] args) {
		
		Glasses myGlasses = new Glasses();
		myGlasses.size = 10;
		myGlasses.lensSize = 2;
		myGlasses.color = "Black";
		myGlasses.eyeGlassFrame = "OldSchool";
		System.out.println(myGlasses.sepcOfTheChosenEyeGlasses());
	}

}
