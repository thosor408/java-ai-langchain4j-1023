package com.atguigu.java.ai.langchain4j;


import dev.langchain4j.model.openai.OpenAiChatModel;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;

@SpringBootTest
public class LLMTest {

    @Test
    public void testGPTDemo() {

        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        String answer = model.chat("你是谁呀");
        System.out.println(answer);

    }

}
