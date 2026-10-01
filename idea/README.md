# Haokee Theme for JetBrains

JetBrains/IDEA/CLion port of Haokee Theme. The port is intentionally compact: it does not mirror every VS Code UI key. It keeps the core UI palette plus editor schemes, with C/C++, Java and Kotlin treated as first-class targets.

## Syntax mapping

The main mapping follows the original VS Code semantic palette:

- keywords -> purple
- classes / structs / enums / namespaces / type parameters -> teal
- local variables -> cyan
- ordinary/global variables -> blue
- fields / properties -> red
- parameters -> orange italic
- functions / methods -> indigo italic
- macros / named constants -> lavender bold
- enum members -> orange
- strings -> green
- numbers -> orange
- comments -> gray; documentation comments -> green
- operators -> olive/yellow-green

C/C++ uses JetBrains' `OC.*` editor-scheme keys, including functions, macro names, struct fields, namespaces, templates, local/global variables and parameters. Java and Kotlin use their current dedicated external keys rather than inheriting only the generic language defaults.

JetBrains does not expose a stable C++ color-scheme key equivalent to VS Code's very specific `storage.type.built-in.cpp` scope in the same way, so primitive C++ type keywords currently follow the C/C++ keyword color instead of the VS Code theme's separate primitive-type green.

## Build

Use Gradle 9+ and a JDK compatible with the target IntelliJ Platform, then run:

```bash
gradle buildPlugin
```

The installable ZIP will be generated under `build/distributions/`.
