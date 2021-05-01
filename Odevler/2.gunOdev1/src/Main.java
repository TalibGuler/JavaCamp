
public class Main {

	public static void main(String[] args) {
		
		Kurslar kurs1=new Kurslar();
		kurs1.id=1;
		kurs1.adı="C# kampı";
		kurs1.egitmen="Engin Demiroğ";
		
		Kurslar kurs2=new Kurslar(2,"Java Kampı","Engin Demiroğ");
		
		KursManager kursManager = new KursManager();
		
		System.out.println("----------Ekleme----------");
		kursManager.add(kurs1);
		kursManager.add(kurs2);
		
		System.out.println("----------Silme-----------");
		kursManager.delete(kurs1);
		kursManager.delete(kurs2);
		
	}

}
