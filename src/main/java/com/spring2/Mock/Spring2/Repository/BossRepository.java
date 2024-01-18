package com.spring2.Mock.Spring2.Repository;

import com.spring2.Mock.Spring2.Entity.BossEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BossRepository extends JpaRepository<BossEntity, Integer> {
}
