# slack-alert-manager

`slack-alert-manager` is a microservice that monitors and tracks system health, logs, and error alerts. It integrates with Prometheus for metrics collection and Alertmanager for sending error notifications to Slack.

## Features

- Monitors application health and logs.
- Sends error alerts to Slack channels using Prometheus Alertmanager.
- Configurable alerting rules and notifications.
- Supports multiple environments for monitoring.

## Prerequisites

Before you begin, ensure that you have the following tools installed:

- Java 21
- Docker (for containerization)
- Docker Compose (for multi-container setups)
- Prometheus (for monitoring)
- Alertmanager (for sending alerts)
- Slack (for receiving notifications)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/slack-alert-manager.git
cd slack-alert-manager
