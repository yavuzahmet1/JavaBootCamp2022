
public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManager = new BaseKrediManager[] { new OgretmenKrediManager(),
				new TarimKrediManager(), new OgrenciKrediManager() };

		for (BaseKrediManager base : baseKrediManager) {

			System.out.println(base.hesapla(1000));
		}

	}

}
