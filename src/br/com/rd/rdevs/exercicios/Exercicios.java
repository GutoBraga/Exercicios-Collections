package br.com.rd.rdevs.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Exercicios {

	public static void main(String[] args) {
		/*
		 * System.out.println("Iniciando..."); ArrayList<Integer> teste = new
		 * ArrayList<>(); long inicio = System.currentTimeMillis(); int total = 100000;
		 * for (int i = 0; i < total; i++) { teste.add(i); } for (int i = 0; i < total;
		 * i++) { teste.contains(i); } long fim = System.currentTimeMillis(); long tempo
		 * = fim - inicio; System.out.println("Tempo gasto: " + tempo);
		 */

		// tempo gasto ArrayList 268 milisegundos
		// tempo gasto Hashset 8 milisegundos
		// Com arrayList a demora é de 3030 milisegundos
		// com Hashset 100.000 foi em 15 milisegundos
		// leva mais tempo para a inserção
		// 2.colocando arrayList no começo, em vez de collections demora menos tempo,
		// mas ainda assim demorou 2947 milisegundos;
		// 2.b) quando nos referimos a um grande volume de dados, devemos programar uma
		// interface personalizada para que seja
		// retornado os valores nos quais desejamos na ordem que desejamos.
		// 3.
		/*
		 * ContaCorrente c1 = new ContaCorrente(); c1.depositar(10000); ContaCorrente c2
		 * = new ContaCorrente(); c2.depositar(3000); // cria o mapa Map mapaDeContas =
		 * new HashMap(); // adiciona duas chaves e seus valores
		 * mapaDeContas.put("diretor", c1); mapaDeContas.put("gerente", c2); // qual a
		 * conta do diretor? ContaCorrente contaDoDiretor = (ContaCorrente)
		 * mapaDeContas.get("diretor"); System.out.println(contaDoDiretor.getSaldo());
		 */
		// ADD TYPES A ARGUMENTS TO 'MAP'
		// 4.
		/*System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		List<Integer> teste = new LinkedList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);*/

		// LinkedList é mais rápido.
		// 5.
	  /*package br.com.rd.rdevs.model;

		import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;

		public class Banco {
			List<Conta> contas;
			Map<String, Conta> contasMapeadas;
			
			public Banco() {
				contas = new ArrayList<Conta>();
				contasMapeadas = new HashMap();
			}
			
			public void adiciona(Conta conta) {
				this.contas.add(conta);
				this.contasMapeadas.put(conta.getTitular(), conta);
			}
			
			public Conta pega(int index) {
				return this.contas.get(index);
			}
			
			public int pegaQtdContas() {
				return this.contas.size();
			}
			
			
		}*/
		//6.
		//public Conta buscaTitular(String nome) {
		//	return this.contasMapeadas.get(nome);
		//}
	}

}
