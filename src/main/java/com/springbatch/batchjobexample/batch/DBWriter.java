package com.springbatch.batchjobexample.batch;

import com.springbatch.batchjobexample.model.User;
import com.springbatch.batchjobexample.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data Saved for users : " + users);
        userRepository.saveAll(users);
    }
}
