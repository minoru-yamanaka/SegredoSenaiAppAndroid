# Segredo App Android

Este aplicativo Android foi desenvolvido para armazenar e recuperar dados simples usando SharedPreferences. Aqui está um resumo simples dos métodos utilizados no código:

1. **onCreate:**
   - O método `onCreate` é chamado quando a atividade é criada.
   - Ele inicializa elementos da interface do usuário, como botões, campos de texto e textos.
   - Configura um ouvinte de clique para o botãoSalvar.

2. **onClick (Ouvinte do botãoSalvar):**
   - Quando o botãoSalvar é clicado, este método é acionado.
   - Obtém uma instância do SharedPreferences chamada "ArquivoPreferencia" com modo privado.
   - Obtém o texto inserido no campo de edição (editNome).
   - Se o campo estiver vazio, exibe uma mensagem de aviso.
   - Se não estiver vazio, salva o texto no SharedPreferences com a chave "segredo".
   - Atualiza o TextView (textResultado) com o texto salvo.

3. **Recuperação de Dados no onCreate:**
   - Após a configuração inicial, o código tenta recuperar dados armazenados anteriormente no SharedPreferences.
   - Verifica se existe um valor associado à chave "nome".
   - Se existir, recupera o valor e exibe no TextView (textResultado).
   - Se não existir, exibe uma mensagem indicando que o usuário não está definido.

Esse aplicativo é projetado para armazenar um "segredo" fornecido pelo usuário e exibi-lo posteriormente. No geral, este código ilustra a utilização básica do SharedPreferences em um aplicativo Android.

---

![image](ScreenShot_Home.jpg)

---

Dedicação ao [Professor Douglas Reis](linkedin.com/in/douglas-dos-reis-3473a868)! 🚀

É com imensa gratidão que dedico este aplicativo a você! 📱💡 Desenvolvê-lo foi uma jornada empolgante de aprendizado sobre os fundamentos do Android, e sua orientação foi crucial para eu compreender a aplicação prática dos métodos usados.
