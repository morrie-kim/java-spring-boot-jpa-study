package com.morrie.myshop.repository;

import com.morrie.myshop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by morrie kim on 2020/05/25.
 */
public interface MemberSpringDataJpaRepository extends JpaRepository<Member, Long> {

}
