plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "jml-tools"
include("prettyprinting")
include("smt")
include("wd")
include("jml2java")
include("stat")
include("redux")
include("utils")
include("xpath")
include("cli")
include("lsp")
include("web")
