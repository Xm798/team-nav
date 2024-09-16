package com.tuituidan.openhub.repository;

import com.tuituidan.openhub.bean.entity.EmailSetting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CardRepository.
 *
 * @author tuituidan
 * @version 1.0
 * @date 2020/10/2
 */
public interface EmailSettingRepository extends JpaRepository<EmailSetting, String> {

}
