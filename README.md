Proiectul contine:

1) Fisier pom.xml cu dependența TestNG, plugin Surefire prezent, proprietăți Java setate pe versiunea 11.
2) O clasa SUT (PostValidator) care returnează "ERROR_EMPTY","ERROR_FORBIDDEN","ERROR_TOO_LONG" daca postBody este null, mai lung de 250 caractere sau contine cuvantul "politica" altfel este "POST_VALID".
3) O clasa de Test care returneaza cel puțin 5 cazuri de test care să acopere fiecare rezultat posibil (EMPTY, TOO_LONG, FORBIDDEN, VALID).
