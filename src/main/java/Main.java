import entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_lab_8");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        // 회원이름이 kim인 엔티티를 조회한다. JPQL에서 Member는 엔티티 이름이다.
        // 그리고 m.username은 테이블 컬럼명이 아니라 엔티티 객체의 필드명이다.
        String jpql = "select m from Member m as m where m.username = 'kim'";
        // JPA는 JPQL을 SQL로 변환해서 데이터베이스를 조회한다. 그리고 조회한 결과로 Member 엔티티를 생성해서 반환한다.
        List<Member> resultList =
                em.createQuery(jpql, Member.class).getResultList();


    }
}
