#!/bin/bash

script_dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

root_path="$(cd "$script_dir/.." && pwd)"

echo "Root folder: $root_path"

# Find all Maven projects (pom.xml) under the root folder
find "$root_path" -name "pom.xml" -exec dirname {} \; | sort -u | while read -r project_dir; do
    echo -e "\033[0;36mProcessing project: $project_dir\033[0m"

    pushd "$project_dir" > /dev/null
    mvn clean install -DskipTests

    if [ $? -eq 0 ]; then
        echo -e "\033[0;32mSuccess: $project_dir\033[0m"
    else
        echo -e "\033[0;31mFailed: $project_dir\033[0m"
    fi

    popd > /dev/null
done

echo -e "\033[0;33mAll projects processed.\033[0m"