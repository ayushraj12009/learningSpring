package com.spring2.Mock.Spring2.Services;

import com.spring2.Mock.Spring2.Entity.BossEntity;
import com.spring2.Mock.Spring2.Repository.BossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BossServices {

    @Autowired
    private BossRepository bossRepository;

    public String addBoss(BossEntity boss){
        BossEntity bossDetails = bossRepository.save(boss);
        return "Boss details has been updates " + bossDetails;
    }

    public String findBossById(Integer bossId) throws Exception {
        Optional<BossEntity> OptionalBoss = bossRepository.findById(bossId);
        if(OptionalBoss.isEmpty()){
            throw new Exception("Boss Id is invalid please correct valid bossId");
        }

        BossEntity result = OptionalBoss.get();
        return  "This is the details of boss " + result;
    }

    public void deleteBoss(Integer bossId){
        bossRepository.deleteById(bossId);
        System.out.print("Boss Details has been deleted");
    }





}
