/*
 *  Copyright (c) 2022 Fraunhofer Institute for Software and Systems Engineering
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Fraunhofer Institute for Software and Systems Engineering - initial API and implementation
 *
 */

rootProject.name = "samples"

// this is needed to have access to snapshot builds of plugins
pluginManagement {
    repositories {
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
        }
        mavenCentral()
        mavenLocal()
    }
}



// modules for code samples ------------------------------------------------------------------------
include(":other:custom-runtime")
include("BlockchainCatalog:blockchain-catalog-api")
include("BlockchainCatalog:blockchain-catalog-listener")
include("BlockchainCatalog:blockchain-catalog-prosumer")
findProject(":BlockchainCatalog:blockchain-catalog-prosumer")?.name = "blockchain-catalog-prosumer"

include("blockchain-logger")

// include("transfer:TransferFileLocal")
// include("transfer:StatusChecker")
include("transfer:transfer-07-provider-push-http:provider-push-http-backend-service")
include("transfer:transfer-07-provider-push-http:http-push-connector")
include("transfer:transfer-07-provider-push-http:http-push-consumer")
include("transfer:transfer-07-provider-push-http:http-push-provider")