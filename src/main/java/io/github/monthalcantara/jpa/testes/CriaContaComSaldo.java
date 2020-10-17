package io.github.monthalcantara.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import io.github.monthalcantara.jpa.modelo.Conta;

public class CriaContaComSaldo {
	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
	EntityManager em = emf.createEntityManager();
	
	Conta conta = new Conta();
	conta.setTitular("Jr");
	conta.setAgencia(5678);
	conta.setNumero(8765);
	conta.setSaldo(500.0);
	
	em.getTransaction().begin();
	em.persist(conta);
	em.getTransaction().commit();
	
}
}
