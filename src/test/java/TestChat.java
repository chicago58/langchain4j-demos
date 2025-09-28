import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;

public class TestChat {

  /**
   * 接入openai
   */
  @Test
  void test01() {
    ChatLanguageModel model = OpenAiChatModel.builder()
        .apiKey("demo")
        .modelName("gpt-4o-mini")
        .build();

    String answer = model.chat("你好，你是谁？");
    System.out.println(answer);
  }

  /**
   * 接入deepseek
   */
  @Test
  void test02() {
    ChatLanguageModel model = OpenAiChatModel.builder()
        .baseUrl("https://api.deepseek.com")
        .apiKey(System.getenv("DEEPSEEK_API_KEY"))
        .modelName("gpt-4o-mini")
        .build();

    String answer = model.chat("你好，你是谁？");
    System.out.println(answer);
  }
}
