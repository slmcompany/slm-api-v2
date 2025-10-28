#!/bin/bash

set -e

echo "=========================================="
echo "🚀 SLM API V2 Deployment Script"
echo "=========================================="

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Configuration
PROJECT_NAME="slm-api-v2"
JAR_FILE="target/*.jar"

# Function to print colored messages
print_info() {
    echo -e "${GREEN}[INFO]${NC} $1"
}

print_warn() {
    echo -e "${YELLOW}[WARN]${NC} $1"
}

print_error() {
    echo -e "${RED}[ERROR]${NC} $1"
}

# Check if Docker is running
print_info "Checking Docker..."
if ! docker info > /dev/null 2>&1; then
    print_error "Docker is not running. Please start Docker first."
    exit 1
fi

# Check if docker-compose is available
if ! command -v docker-compose &> /dev/null; then
    print_error "docker-compose is not installed."
    exit 1
fi

print_info "Docker and docker-compose are ready."

# Give execute permission to mvnw if needed
if [ ! -x "./mvnw" ]; then
    print_info "Setting execute permission for mvnw..."
    chmod +x ./mvnw
fi

# Step 1: Clean old builds
print_info "Cleaning old builds..."
./mvnw clean

# ... existing code ...