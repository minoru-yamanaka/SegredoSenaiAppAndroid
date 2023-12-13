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

Esse aplicativo é projetado para armazenar um "segredo" fornecido pelo usuário e exibi-lo posteriormente.

---

![image](ScreenShot_Home.jpg)

---

Dedicação ao [Professor Douglas Reis](linkedin.com/in/douglas-dos-reis-3473a868)! 🚀

Ei, Professor Douglas,

Este app é todo seu, uma mistura de códigos, magia e um toque de brilho Android! 📱💫 Desenvolvê-lo foi como embarcar em uma aventura maluca pelos fundamentos do Android, e a sua orientação foi tipo um mapa do tesouro para entender os truques mágicos dos métodos que usamos.

Valeu por ser o capitão do nosso navio de código! Cada bug corrigido foi uma batalha vencida, e cada linha de código é uma pegada divertida na trilha do desenvolvimento. Este app é praticamente uma obra de arte, com você como o mestre das artes encantadas do Android!

Obrigado por tornar nossa jornada tão incrível!

[Post no Linkedin](https://www.linkedin.com/posts/minoru-yamanaka-2272a6243_mobileapplications-programing-technology-activity-7140119454352420864-aIen?utm_source=share&utm_medium=member_desktop)
