public class Control {
	
	
	private boolean ligado;
	private int temp;
	
	
	//construtor
	public Control() {
		ligado = false;
		temp = 21;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}

	
	public void ligar() {
		this.setLigado(true);
		
	}

	
	public void desligar() {
		this.setLigado(false);
		
	}

	
	public void aumentarTemperatura() {
		if(this.isLigado() && this.getTemp() < 32){
			this.setTemp(this.getTemp() + 1);
		}else {
			System.out.println("Ar-condicionado desligado ou acima da temperatura máxima");
		}
		
	}

	
	public void diminuirTemperatura() {
		if(this.isLigado() && this.getTemp() > 16) {
			this.setTemp(this.getTemp() - 1);
		}else {
			System.out.println("Ar-condicionado desligado ou abaixo da temperatura mínima");
		}
	}
	
	public static void main(String[] args) {
		Control controle = new Control();
		
		controle.isLigado();
		controle.getTemp();
		
		controle.ligar();
		
		controle.aumentarTemperatura();
		
        controle.diminuirTemperatura();
		
		
		System.out.println(controle.getTemp());

	}
	
}

