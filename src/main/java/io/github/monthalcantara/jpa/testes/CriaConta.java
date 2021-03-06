package io.github.monthalcantara.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import io.github.monthalcantara.jpa.modelo.Conta;

public class CriaConta {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
	EntityManager em = emf.createEntityManager();
	
	Conta conta = new Conta();
	conta.setId(1L);
	conta.setTitular("Junior");
	conta.setAgencia(1234);
	conta.setNumero(4321);
	conta.setSaldo(200.0);
	
	em.getTransaction().begin();
	em.merge(conta);
	em.getTransaction().commit();
	
}
}
