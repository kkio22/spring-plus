package org.example.expert.domain.todo.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class TodoQueryRepositoryImpl implements TodoQueryRepository{

    private final JPAQueryFactory queryFactory;


    @Override
    public Page<Todo> findAllByOrderByModifiedAtDesc(Pageable pageable) {
        QTodo qTodo = QTodo.todo;
        return
                queryFactory
                        .selectFrom(qTodo)
                        .orderBy(qTodo.modifiedAt.desc())
                        .
        /*
        QTodo:Todo 엔티티의 QueryDSL 전용 클래스
        QTodo.todo : Todo 테이블을 의미하는 QueryDSL 객체
        qTodo : 개발자가 코드에서 쓰기 쉽게 만든 별명 변수

         */
    }
}
