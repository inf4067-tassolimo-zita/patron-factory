# patron-factory - Patron de construction : Factory Method et Factory

Devoir INF4067 / INF461 - Design Patterns : patrons de construction.

Auteur : TASSOLIMO Zita - Matricule 23U2313

## Organisation du code

```
src/
  cours/     -> code source de l'exemple vu en cours
  modifie/   -> code source de l'exemple modifie
```

## Compilation et execution (Java 8+)

```bash
javac -d bin $(find src -name "*.java")
java -cp bin <classe principale>
```

| Classe principale | Exemple |
|---|---|
| `cours.factorymethod.Client` | Factory Method, exemple du cours (3 produits A, B, C) |
| `cours.factory.Client` | Factory, exemple du cours (3 produits, 3 fabriques) |
| `modifie.factorymethod.Client` | Factory Method, exemple modifie (4 produits A, B, C, D) |
| `modifie.factory.Client` | Factory, exemple modifie (4 produits, 4 fabriques) |

Sous Windows (PowerShell) : `javac -d bin (Get-ChildItem -Recurse src -Filter *.java).FullName`
