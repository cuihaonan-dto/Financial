package com.breach.huajinbao.service.quest;

import com.breach.common.entity.ConsumerQuestionnaire;
import org.apache.velocity.runtime.directive.MacroParseException;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public interface IRequestService {

     Map quest1(ConsumerQuestionnaire q);
}
