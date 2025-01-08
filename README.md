# GestorPRO 📱💼

> Seu negócio sob controle, suas finanças em dia.

## Sobre o Projeto

GestorPRO é uma aplicação mobile que simplifica a gestão financeira empresarial através de dashboards intuitivos e alertas automáticos via WhatsApp.

### Funcionalidades Principais

- 📊 Dashboard financeiro interativo
- 💬 Alertas automáticos via WhatsApp
- 📈 Análise de crescimento empresarial
- 📅 Sistema de lembretes personalizados

### Stack Tecnológica

**Mobile (Frontend)**
- React Native + Expo
- React Native Paper
- Victory Native (gráficos)
- AsyncStorage

**Backend**
- Node.js + Express
- MongoDB
- Twilio API (WhatsApp)
- JWT (autenticação)

### Requisitos de Ambiente

- Node.js 18+
- Expo CLI
- MongoDB
- Conta Twilio

### Estrutura do Projeto

```
gestor-pro/
├── mobile/              # Aplicação React Native
├── backend/             # API Node.js
└── docs/               # Documentação
```

### Instalação e Execução

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/gestor-pro.git
```

2. Mobile
```bash
cd mobile
npm install
expo start
```

3. Backend
```bash
cd backend
npm install
npm run dev
```

### Variáveis de Ambiente

**Backend (.env)**
```
PORT=3000
MONGODB_URI=
JWT_SECRET=
TWILIO_ACCOUNT_SID=
TWILIO_AUTH_TOKEN=
TWILIO_PHONE_NUMBER=
```

**Mobile (.env)**
```
API_URL=http://localhost:3000
```

## Documentação

- [Setup do Projeto](./docs/setup.md)
- [Arquitetura](./docs/architecture.md)
- [API](./docs/api.md)
- [Mobile](./docs/mobile.md)

## Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.