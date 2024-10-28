//package br.com.alura.screenmatch.service;
//
//import com.theokanning.openai.completion.CompletionRequest;
//import com.theokanning.openai.service.OpenAiService;
//import com.theokanning.openai.completion.CompletionChoice;
//
//public class ConsultaChatGPT {
//    private static final String API_K
//
//    public static String obterTraducao(String texto) {
//        OpenAiService service = new OpenAiService(API_KEY);
//
//        CompletionRequest requisicao = CompletionRequest.builder()
//                .model("gpt-3.5-turbo")
//                .prompt("Traduza para o português o seguinte texto: " + texto)
//                .maxTokens(1000)
//                .temperature(0.7)
//                .build();
//
//        var resposta = service.createCompletion(requisicao);
//        return resposta.getChoices().stream()
//                .map(CompletionChoice::getText)
//                .findFirst()
//                .orElse("Nenhuma resposta disponível.");
//    }
//}
