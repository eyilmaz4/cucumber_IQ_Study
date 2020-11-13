Quick way to add dependencies:
open a new project, sleect from archytype, add dependency, and fill as below:
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=6.1.1"               \
   "-DgroupId=hellocucumber"                  \
   "-DartifactId=hellocucumber"               \
   "-Dpackage=hellocucumber"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"
   
   Orhan Hoca checkList:
   Required Dependency
   -->cucumber-core
   -->cucumber-html
   -->cucumber-java
   -->cucumber-junit
   -->cucumber-jvm-deps
   -->cucumber-reporting
   -->hamcrest-core
   -->gherkin
   -->selenium-java
   -->junit