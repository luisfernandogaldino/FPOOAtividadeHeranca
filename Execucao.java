package Veiculos;

public class Execucao {

	public static void main(String[] args) {

		Veículo veiculo = new Veículo("Chevrolet", "Onix",2016,"Vermelho");
		System.out.println("Veículo:");
		System.out.println("Marca:" + veiculo.getMarca());
		System.out.println("Modelo:" + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: "+ veiculo.getCor());

		Automovel automovel = new Automovel("FORD","HB20",2018,"Preto",4,"Turbo 3 cilindros");
		System.out.println("\n Automovel");
		System.out.println("Marca: "+ automovel.getMarca());
		System.out.println("Modelo: "+ automovel.getModelo());
		System.out.println("Ano: "+ automovel.getAno());
		System.out.println("Cor: "+ automovel.getAno());
		System.out.println("Numero de Portas: "+ automovel.getNumeroPortas());
		System.out.println("Motor: "+ automovel.getMotor());

		Moto moto = new Moto("Honda","Fan",2022,"Preto",1627);
		System.out.println("\n Moto");
		System.out.println("Marca: "  + moto.getMarca());
		System.out.println("Modelo :"+ moto.getModelo());
		System.out.println("Ano :"+ moto.getAno());
		System.out.println("Cor : "+ moto.getCor());
		System.out.println("Cilindrada :"+ moto.getCilindrada());

	}

}
