
public class Main {

	public static void main(String[] args) {
		
		Kurslar kurs1=new Kurslar();
		kurs1.id=1;
		kurs1.ad�="C# kamp�";
		kurs1.egitmen="Engin Demiro�";
		
		Kurslar kurs2=new Kurslar(2,"Java Kamp�","Engin Demiro�");
		
		KursManager kursManager = new KursManager();
		
		System.out.println("----------Ekleme----------");
		kursManager.add(kurs1);
		kursManager.add(kurs2);
		
		System.out.println("----------Silme-----------");
		kursManager.delete(kurs1);
		kursManager.delete(kurs2);
		
	}

}
