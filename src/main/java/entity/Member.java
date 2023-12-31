package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;

/**
 * 객체지향 쿼리 _ JPQL
 *
 * 테이블이 아닌 객체를 대상으로 검색하는 객체지향 쿼리다.
 * SQL을 추상화해서 특정 데이터베이스 SQL에 의존하지 않는다.
 *
 *  SQL이 데이터베이스 테이블을 대상으로 하는 데이터 중심의 쿼리라면 JPQL은 엔티티 객체를 대상으로 하는 객체지향 쿼리다.
 * JPQL을 사용하면 JPA는 이 JPQL을 분석한 다음 적절한 SQL을 만들어 데이터베이스를 조회한다.
 *  그리고 조회한 결과로 엔티티 객체를 생성해서 반환한다.
 */
@Entity(name = "Member")
public class Member {

    @Column(name = "name")
    private String username;

}
