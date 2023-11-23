## Micronaut 4.1.6 Documentation

- [User Guide](https://docs.micronaut.io/4.1.6/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.1.6/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.1.6/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Micronaut Gradle Plugin documentation](https://micronaut-projects.github.io/micronaut-gradle-plugin/latest/)
- [GraalVM Gradle Plugin documentation](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html)
- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)

## Demo Function
1. formula.js必须使用GraalVM运行。
2. 使用Micronaut框架构建服务。
3. 服务要有至少两个操作数参数A1和A2以及一个公式参数。
4. 公式参数可以输入形如A1+A2，IF(A1=0，A2， "0")这样的Excel公式。
5. POST到服务后出计算结果。
6. 输入和输出用请用JSON格式。