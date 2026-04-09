O CloudBolt é uma Landing Page de login ultra-imersiva. O diferencial não está apenas no visual estático, mas na experiência sensorial: ícones de aplicativos flutuam em órbitas irregulares ao redor de um núcleo central 3D que, ao ser provocado pelo mouse, revela a identidade do usuário (seu Memoji de Leão). Tudo isso envolvido em uma camada de "vidro líquido" que reage ao fundo dinâmico.

1. HTML5
Semântica: tags como <header>, <main> e <div> para organizar a hierarquia.

2. CSS3 Avançado
Glassmorfismo: * backdrop-filter: blur(30px): Cria o efeito de vidro fosco.
gba(255, 255, 255, 0.1): Cores semi-transparentes para simular reflexos.
Perspectiva 3D: * preserve-3d e rotateY(180deg): Permitem que o círculo central gire como uma moeda física no espaço.
translateZ(60px): O segredo para o círculo parecer "saltado" para fora da tela.

3. JavaScript
Manipulação de DOM: O script identifica quando você clica no menu de idiomas.
Gerenciamento de Estados: Controle de classes CSS (classList.toggle) para abrir e fechar menus flutuantes.

4. Recursos Visuais (Assets)
Vetores (SVG): Ícones de alta fidelidade que não perdem qualidade.
Interatividade (GIF): O uso do Memoji animado no "verso" do card central para criar conexão emocional com o usuário.
Tipografia: Importação da fonte Inter via Google Fonts, que é a que mais se aproxima da San Francisco da Apple.
