1. La table question aura 6 colones: l'id, description,difficulty  points  answers id et quiz id .
2. En tant que User, j'ai besoin d' un formulaire  afin de pouvoir ecrire mes questionnaires.
3.  La relation **Quiz** _written by_ **User** est une relation d'dagregation , alors que la relation **Question** _belongs to_ **Quiz**  est une relation de composition.
4.  Dans un questionnaire, il dois y avoir au minimun une question et (n) question au maximum .
5. Une question peut avoir 1 reponse au minimum et  4 reponses au maximum.
6. Si je supprime une question , je supprime un questionnaire.
7. Si je supprime un utilisateur, les questionnaires peuvent rester.
8. Pour coder la relation **Tag** _describes_ **Quiz**  je crée une table intermediere, et je fait : tag_id_quiz_id.
9. La table **Quiz** peut avoir une seule clée étrangère , elle s'appelle user_id
10. Par ce que chaque question a au moins une reponse et q'une reponse ne peut pas exister sans question.
11. par  ce que , la table **QuizResult** est une table intermédiaire entre les tables **User** et **Quiz**

4