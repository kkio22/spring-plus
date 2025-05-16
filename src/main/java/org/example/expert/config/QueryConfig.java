package org.example.expert.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class QueryConfig {

    private final EntityManager entityManager;
    // entityManager은 스프링이 자동으로 관리해주는 객체이다. 그래서 자동으로 생성하고, 주입이 가능하다.

    @Bean
    public JPAQueryFactory jpaQueryFactory(){
        return new JPAQueryFactory(entityManager);
    }
    //JPAQueryFactory는 entityManager을 통해 동적 쿼리를 작성하고 실행하기 때문에 entityManager가 필요하다. 그래서 JPAQueryFactory를 생성할 때 넣어줌
}
