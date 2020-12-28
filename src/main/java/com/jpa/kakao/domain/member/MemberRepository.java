package com.jpa.kakao.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

    boolean existsByEmail(String email);

    boolean existsByKakaoId(String kakaoId);

    boolean existsByPhoneNumber(String phoneNumber);

}
