# Use Cases

## UC-01 Customer asks a question

### Actor

Customer

### Preconditions

- Chatbot is available.

### Flow

1. Customer submits a message.
2. Dialogflow identifies the intent.
3. Backend webhook is called.
4. Backend retrieves data.
5. Response is returned.
6. Conversation is stored.

### Outcome

Customer receives an appropriate response.

---

## UC-02 Administrator reviews conversations

### Actor

Administrator

### Preconditions

Administrator is authenticated.

### Flow

1. Login.
2. Open dashboard.
3. View conversation history.
4. Search conversations.
5. Review analytics.

---

## UC-03 Backend processes webhook

### Actor

Dialogflow CX

### Flow

1. Intent detected.
2. Webhook invoked.
3. Backend validates request.
4. Business logic executes.
5. Database queried.
6. Response returned.