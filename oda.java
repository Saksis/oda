public class Oda {

		int armySize;
		String title;

	public static void main(String[] args) {
		Oda nobunaga = new Oda();
	  nobunaga.getArmySize();
    nobunaga.getTitle();
	}

	public void getArmySize() {
    armySize = 10000;
		System.out.println("Army size of " + armySize + " able men.");
	}

	public void getTitle() {
		title = "Ruler";
		System.out.println("Title of " + title + ".");
	}


}
