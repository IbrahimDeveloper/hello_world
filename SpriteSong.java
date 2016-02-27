public class SpriteSong {
	public static void main(String[] args) {
		int spriteNum = 99;
		String word = "bottels";

		while(spriteNum > 98) {
		
		if(spriteNum == 1) {	
			word = "bottel";
			}

		System.out.println(spriteNum + " " + word + " " + "of sprite on the shelf 1");
		System.out.println(spriteNum + " " + word + " of sprite 2");
		System.out.println("Take one down 3");
		System.out.println("Pass it around 4");

		spriteNum -= 1;


		if(spriteNum > 0) {
			System.out.println(spriteNum + " " + word + " of sprite on the shelf true 1");
		}else {
			System.out.println("No more sprite on the shelf false 1");
		}

		}
	}
}
