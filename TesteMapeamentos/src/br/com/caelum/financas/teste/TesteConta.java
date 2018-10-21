package br.com.caelum.financas.teste;

import java.util.Comparator;

import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Empresa;

/**
 * Created by leonardocordeiro on 24/02/17.
 */
public class TesteConta {
//	int v;   0+1+2+3+5
	public static int fibo(int n) {
		 
	        int F = 0;     // atual
	        int ant = 0;   // anterior
	  
	        for (int i = 1; i <= n; i++) {
	  
	            if (i == 1) {
	                F = 1;
	                ant = 0;
	            } else {
	                F += ant;
	                ant = F - ant;
	            }
	  
	        }
	  
	        return F;
	    }

	 
    public static void main(String[] args) {
    	fibo(8);
     
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//    	CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//    	CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
//    	Root<Empresa> root = criteriaQuery.from(Empresa.class);
//    	 ParameterExpression<Enum> p = criteriaBuilder.parameter(Enum.class);
//    	Predicate predicate = criteriaBuilder.or(criteriaBuilder.isNull(root.get("endereco").get("pais").get("tipoPais")),
//				criteriaBuilder.equal(root.get("endereco").get("pais").get("tipoPais"),p));
//    	criteriaQuery.select(root).where(predicate);
//    	
//    	TypedQuery<Empresa> query = em.createQuery(criteriaQuery);
//    	query.setParameter(p, Pais.TipoPais.TERCEIRO_MUNDO);
//    	
//    	
//    	
    	CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    	CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
    	Root<Cliente> root = criteriaQuery.from(Cliente.class);
    	Join  join = root.join("empresas",JoinType.LEFT);
//    	ParameterExpression<Enum> parameter = criteriaBuilder.parameter(Enum.class,"parametro");
////    	ParameterExpression<Enum> parameter2 = criteriaBuilder.parameter(Enum.class,"parametro");
    	Subquery subQuery = criteriaQuery.subquery(Float.class);
//    	join.fetch(Cliente.class);
    	Root subRoot = subQuery.from(Empresa.class);
//    	Join subJoin = subRoot.join("tributos");
    	subQuery.select(criteriaBuilder.avg(subRoot.get("lucro")));
//    	subQuery.where(criteriaBuilder.gt(criteriaBuilder.literal(3),criteriaBuilder.size(subRoot.get("tributos"))));
//    	Predicate predicate = criteriaBuilder.and(
//    			criteriaBuilder.or(criteriaBuilder.isNull(join.get("endereco").get("pais").get("tipoPais")),
//    			criteriaBuilder.equal(join.get("endereco").get("pais").get("tipoPais"), parameter)),
//    			criteriaBuilder.gt(join.get("lucro"), subQuery));
//    	criteriaQuery.select(root).where();
//    	
//    	TypedQuery query = em.createQuery(criteriaQuery);
////    	query.setParameter(parameter, Pais.TipoPais.TERCEIRO_MUNDO);
//    	query.setParameter("parametro",Pais.TipoPais.TERCEIRO_MUNDO);
//    	query.getResultList();
    	
    	CriteriaBuilder cb = em.getCriteriaBuilder();
    
    	CriteriaQuery<Tuple> c = cb.createTupleQuery();
    	Root r = c.from(Conta.class);
    	c.orderBy(cb.desc(root.get("")), cb.asc(root.get("")));//
//        Conta conta = new Conta();
//        conta.setTitular("Leonardo");
//        conta.setBanco("Caixa Economica");
//        conta.setAgencia("123");
//        conta.setNumero("456");
//      
//        Cliente cliente = new Cliente();
//        
//        Endereco endereco = new Endereco();
//        endereco.setBairro("Carlos Prates");
//        endereco.setCidade("Belo Horizonte");
//        endereco.setNumero(12L);
//        endereco.setRua("Cambuquira");
//        cliente.setEndereco(endereco);
//        cliente.setNacionalidadeCodigo(55L);
//        cliente.setId(3L);
//        Pais pais = new Pais();
//        pais.setCodigo(57);
//        pais.setNome("Brasil");
//        endereco.setPais(pais);
//        Empresa empresa = new Empresa();
//        empresa.setEndereco(endereco);
//        empresa.setLucro(12.344F);
//        
//        Pessoa pessoa = new Pessoa();
//        pessoa.setEmpresa(empresa);
//        pessoa.setEndereco(endereco);
//        empresa.setPessoas(new ArrayList<Pessoa>());
//        empresa.getPessoas().add(pessoa);
//        empresa.setClientes(new ArrayList<Cliente>());
//        empresa.getClientes().add(cliente);
//        empresa.setConta(conta);
//        conta.setEmpresa(empresa);
//        TributoEstadual te = new TributoEstadual();
//        te.setDescricaoEstado("Minas Gerais");
//        empresa.setTributos(new ArrayList<Tributo>());
//        empresa.getTributos().add(te);
//        
////        @PersistenceContext(type=PersistenceContextType.EXTENDED)
//        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//        em.setFlushMode(FlushModeType.AUTO);
        em.getTransaction().begin();
        em.remove(em.find(Conta.class, 1L));
        
//        em.persist(pais);
// 
//        em.persist(pessoa);
//        em.persist(te);
//        em.persist(conta);
//        em.persist(cliente);
//        em.persist(empresa);
//        Conta conta1 = em.find(Conta.class, 1L);
////        conta1.setBanco("Banco do Brasil");
//        Conta conta2 = em.find(Conta.class, 1L);
//      //entitymanager realizou flush automatico antes de buscar a conta de id 1, pois
//        //verificou que no codigo acima, foi alterado o nome do Banco, e para nao gerar inconsistencia, seria necessario atualizar antes de buscar
//        //esse comportamento de flush automatico, para evitar inconsistencia, e feito quando flushMode esta como automatico
//        //alterando para  `commit` entitymanager so realizara o flush apos o usuario realizar commit ou flush manual
//         conta2 = (Conta) em.createQuery("SELECT c FROM Conta c WHERE c.id = 1").getSingleResult(); 
//        em.merge(conta);
        em.getTransaction().commit();
//
//        PersistenceManager.INSTANCE.close();
    }
}
