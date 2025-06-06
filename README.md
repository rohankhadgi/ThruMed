<p align="center">
    <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" align="center" width="30%">
</p>
<p align="center"><h1 align="center">ThruMed</h1></p>
<p align="center">
	<em><code>❯ Patient Management System</code></em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/rohankhadgi/ThruMed?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/rohankhadgi/ThruMed?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/rohankhadgi/ThruMed?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/rohankhadgi/ThruMed?style=default&color=0080ff" alt="repo-language-count">
</p>
<p align="center">
</p>
<p align="center">
</p>
<br>

## 🔗 Table of Contents

- [📍 Overview](#-overview)
- [👾 Features](#-features)
- [📁 Project Structure](#-project-structure)
  - [📂 Project Index](#-project-index)
- [🚀 Getting Started](#-getting-started)
  - [☑️ Prerequisites](#-prerequisites)
  - [⚙️ Installation](#-installation)
  - [🤖 Usage](#🤖-usage)
  - [🧪 Testing](#🧪-testing)
- [🔰 Contributing](#-contributing)
- [🎗 License](#-license)
- [🙌 Acknowledgments](#-acknowledgments)

---

## 📍 Overview

ThruMed is a Cloud Based Patient Management System Application to manage patient and billing information.

---

## 👾 Features

- ThruMed is highly scalable and can be deployed in the AWS Cloud Environment with minimal effort.
- ThruMed is built to add more features on future iterations and already has placeholders to support messaging system that can allow fast communication between different microservices.
- ThruMed has proper security features with isolated database for login credentials and integrated Authorization Token login system for security.

---

## 📁 Project Structure

```sh
└── ThruMed/
    ├── README.md
    ├── ThruMed.iml
    ├── analytics-service
    │   ├── Dockerfile
    │   └── src
    │       └── main
    │           ├── java
    │           │   └── com
    │           └── proto
    │               └── patient_event.proto
    ├── api-gateway
    │   ├── Dockerfile
    │   └── src
    │       └── main
    │           ├── java
    │           │   └── com
    │           └── resources
    │               └── application-prod.yml
    ├── api-requests
    │   ├── auth-service
    │   │   ├── login.http
    │   │   └── validate.http
    │   └── patient-service
    │       ├── create-patient.http
    │       ├── delete-patient.http
    │       ├── get-patients.http
    │       └── update-patient.http
    ├── auth-service
    │   ├── Dockerfile
    │   └── src
    │       └── main
    │           ├── java
    │           │   └── com
    │           └── resources
    │               └── data.sql
    ├── billing-service
    │   ├── Dockerfile
    │   └── src
    │       └── main
    │           ├── java
    │           │   └── com
    │           └── proto
    │               └── billing_service.proto
    ├── grpc-requests
    │   └── billing-service
    │       └── create-billing-account.http
    ├── infrastructure
    │   ├── localstack-deploy.sh
    │   ├── pom.xml
    │   └── src
    │       └── main
    │           └── java
    │               └── com
    ├── integration-tests
    │   ├── pom.xml
    │   └── src
    │       └── test
    │           └── java
    │               ├── AuthIntegrationTest.java
    │               ├── IntegrationTestHelper.java
    │               └── PatientIntegrationTest.java
    └── patient-service
        ├── Dockerfile
        └── src
            └── main
                ├── java
                │   └── com
                └── proto
                    ├── billing_service.proto
                    └── patient_event.proto
```


### 📂 Project Index
<details open>
	<summary><b><code>ThruMed/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			</table>
		</blockquote>
	</details>
	<details> <!-- infrastructure Submodule -->
		<summary><b>infrastructure</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/infrastructure/localstack-deploy.sh'>localstack-deploy.sh</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<details>
												<summary><b>pm</b></summary>
												<blockquote>
													<details>
														<summary><b>stack</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/infrastructure/src/main/java/com/pm/stack/LocalStack.java'>LocalStack.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- api-requests Submodule -->
		<summary><b>api-requests</b></summary>
		<blockquote>
			<details>
				<summary><b>auth-service</b></summary>
				<blockquote>
					<table>
					<tr>
						<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-requests/auth-service/login.http'>login.http</a></b></td>
						<td><code>❯ REPLACE-ME</code></td>
					</tr>
					<tr>
						<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-requests/auth-service/validate.http'>validate.http</a></b></td>
						<td><code>❯ REPLACE-ME</code></td>
					</tr>
					</table>
				</blockquote>
			</details>
			<details>
				<summary><b>patient-service</b></summary>
				<blockquote>
					<table>
					<tr>
						<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-requests/patient-service/update-patient.http'>update-patient.http</a></b></td>
						<td><code>❯ REPLACE-ME</code></td>
					</tr>
					<tr>
						<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-requests/patient-service/create-patient.http'>create-patient.http</a></b></td>
						<td><code>❯ REPLACE-ME</code></td>
					</tr>
					<tr>
						<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-requests/patient-service/get-patients.http'>get-patients.http</a></b></td>
						<td><code>❯ REPLACE-ME</code></td>
					</tr>
					<tr>
						<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-requests/patient-service/delete-patient.http'>delete-patient.http</a></b></td>
						<td><code>❯ REPLACE-ME</code></td>
					</tr>
					</table>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- integration-tests Submodule -->
		<summary><b>integration-tests</b></summary>
		<blockquote>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>test</b></summary>
						<blockquote>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/integration-tests/src/test/java/IntegrationTestHelper.java'>IntegrationTestHelper.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/integration-tests/src/test/java/AuthIntegrationTest.java'>AuthIntegrationTest.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/integration-tests/src/test/java/PatientIntegrationTest.java'>PatientIntegrationTest.java</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- auth-service Submodule -->
		<summary><b>auth-service</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/Dockerfile'>Dockerfile</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>resources</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/resources/data.sql'>data.sql</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<details>
												<summary><b>pm</b></summary>
												<blockquote>
													<details>
														<summary><b>authservice</b></summary>
														<blockquote>
															<details>
																<summary><b>model</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/model/User.java'>User.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>config</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/config/SecurityConfig.java'>SecurityConfig.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>dto</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/dto/LoginRequestDTO.java'>LoginRequestDTO.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/dto/LoginResponseDTO.java'>LoginResponseDTO.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>controller</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/controller/AuthController.java'>AuthController.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>repository</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/repository/UserRepository.java'>UserRepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>util</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/util/JwtUtil.java'>JwtUtil.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>service</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/service/AuthService.java'>AuthService.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/auth-service/src/main/java/com/pm/authservice/service/UserService.java'>UserService.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- api-gateway Submodule -->
		<summary><b>api-gateway</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-gateway/Dockerfile'>Dockerfile</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>resources</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-gateway/src/main/resources/application-prod.yml'>application-prod.yml</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<details>
												<summary><b>pm</b></summary>
												<blockquote>
													<details>
														<summary><b>apigateway</b></summary>
														<blockquote>
															<details>
																<summary><b>exception</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-gateway/src/main/java/com/pm/apigateway/exception/JwtValidationException.java'>JwtValidationException.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>filter</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/api-gateway/src/main/java/com/pm/apigateway/filter/JwtValidationGatewayFilterFactory.java'>JwtValidationGatewayFilterFactory.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- analytics-service Submodule -->
		<summary><b>analytics-service</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/analytics-service/Dockerfile'>Dockerfile</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>proto</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/analytics-service/src/main/proto/patient_event.proto'>patient_event.proto</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<details>
												<summary><b>pm</b></summary>
												<blockquote>
													<details>
														<summary><b>analyticsservice</b></summary>
														<blockquote>
															<details>
																<summary><b>kafka</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/analytics-service/src/main/java/com/pm/analyticsservice/kafka/KafkaConsumer.java'>KafkaConsumer.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- grpc-requests Submodule -->
		<summary><b>grpc-requests</b></summary>
		<blockquote>
			<details>
				<summary><b>billing-service</b></summary>
				<blockquote>
					<table>
					<tr>
						<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/grpc-requests/billing-service/create-billing-account.http'>create-billing-account.http</a></b></td>
						<td><code>❯ REPLACE-ME</code></td>
					</tr>
					</table>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- billing-service Submodule -->
		<summary><b>billing-service</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/billing-service/Dockerfile'>Dockerfile</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>proto</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/billing-service/src/main/proto/billing_service.proto'>billing_service.proto</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<details>
												<summary><b>pm</b></summary>
												<blockquote>
													<details>
														<summary><b>billingservice</b></summary>
														<blockquote>
															<details>
																<summary><b>grpc</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/billing-service/src/main/java/com/pm/billingservice/grpc/BillingGrpcService.java'>BillingGrpcService.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- patient-service Submodule -->
		<summary><b>patient-service</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/Dockerfile'>Dockerfile</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>proto</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/proto/billing_service.proto'>billing_service.proto</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/proto/patient_event.proto'>patient_event.proto</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<details>
												<summary><b>pm</b></summary>
												<blockquote>
													<details>
														<summary><b>patientservice</b></summary>
														<blockquote>
															<details>
																<summary><b>model</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/model/Patient.java'>Patient.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>mapper</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/mapper/PatientMapper.java'>PatientMapper.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>kafka</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/kafka/KafkaProducer.java'>KafkaProducer.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>dto</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/dto/PatientRequestDTO.java'>PatientRequestDTO.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/dto/PatientResponseDTO.java'>PatientResponseDTO.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																	<details>
																		<summary><b>validators</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/dto/validators/CreatePatientValidationGroup.java'>CreatePatientValidationGroup.java</a></b></td>
																				<td><code>❯ REPLACE-ME</code></td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<details>
																<summary><b>controller</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/controller/PatientController.java'>PatientController.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>repository</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/repository/PatientRepository.java'>PatientRepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>service</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/service/PatientService.java'>PatientService.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>exception</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/exception/DriverLicenseAlreadyExistsException.java'>DriverLicenseAlreadyExistsException.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/exception/PatientNotFoundException.java'>PatientNotFoundException.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/exception/EmailAlreadyExistsException.java'>EmailAlreadyExistsException.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/exception/GlobalExceptionHandler.java'>GlobalExceptionHandler.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>grpc</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/rohankhadgi/ThruMed/blob/master/patient-service/src/main/java/com/pm/patientservice/grpc/BillingServiceGrpcClient.java'>BillingServiceGrpcClient.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with ThruMed, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 21
- **Container Runtime:** Docker
- **Local Cloud Environment:** Localstack
- **Development IDE:** IntelliJ IDEA


### ⚙️ Installation

Install ThruMed using one of the following methods:

**Build from source:**

1. Clone the ThruMed repository:
```sh
❯ git clone https://github.com/rohankhadgi/ThruMed
```

2. Navigate to the project directory:
```sh
❯ cd ThruMed
```

2. Clean and Build all project dependencies:
```sh
❯ ./infrastructure/rebuild-all.sh
```

3. Create docker images for all the microservices:


**Using `docker`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Docker-2CA5E0.svg?style={badge_style}&logo=docker&logoColor=white" />](https://www.docker.com/)

```sh
❯ docker build -t <service-name>:latest -f /<service-path/Dockerfile
```

4. Pull all required docker images:


**Using `docker`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Docker-2CA5E0.svg?style={badge_style}&logo=docker&logoColor=white" />](https://www.docker.com/)

```sh
❯ docker pull localstack/localstack
❯ docker pull postgres
❯ docker pull bitnami/kafka
```


### 🤖 Usage
Launch a New LocalStack Container with the following envrionment variables:

- Name: localstack
- Env Vars:
	- Name: LOCALSTACK_AUTH_TOKEN
	- Value: <em><code>Auth-Token-From-Localstack-Account</code></em>

Leave the rest as it is and Create.

Run the LocalStack.java file to generate the localstack.template.json file.

Run the application using the following command:
```sh
❯ ./infrastructure/localstack-deploy.sh
```


### 🧪 Testing
- Run all the tests inside the integration-tests/src/test directory
- Run the HTTP Requests inside the api-requests directory in the following order:
	- /auth-service/login.http to generate the Authorization Token and save it as a variable
	- /auth-service/validate.http to validate the Authorization Token
	- /patient-service/get-patients.http to validate proper execution of data.sql query on patient-service-db container inside patient-service/src/main/resources
	- /patient-service/create-patient.http to create a new patient
	- /patient-service/update-patient.http to update an existing patient
	- /patient-service/delete-patient.http to delete a patient

Additionally, check the logs in the docker containers using the following command: 
```sh
❯ docker logs <service-name>
```

- Run the gRPC Requests inside the grps-requests/billing-service/create-billing-account.http to confirm Kafka Message Broker System functionality

---

## 🔰 Contributing

- **💬 [Join the Discussions](https://github.com/rohankhadgi/ThruMed/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/rohankhadgi/ThruMed/issues)**: Submit bugs found or log feature requests for the `ThruMed` project.
- **💡 [Submit Pull Requests](https://github.com/rohankhadgi/ThruMed/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/rohankhadgi/ThruMed
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/rohankhadgi/ThruMed/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=rohankhadgi/ThruMed">
   </a>
</p>
</details>

---

## 🎗 License

This project is protected under the MIT License. For more details, refer to the [LICENSE](https://github.com/rohankhadgi/ThruMed/edit/master/LICENSE.md) file.

---
