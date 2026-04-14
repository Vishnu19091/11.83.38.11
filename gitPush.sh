#!/bin/bash

commitmsg=$1

if [ -z "$commitmsg" ]; then
    echo "Commit Message is required"
    exit 1
else
    echo "Commit Message -> $commitmsg"
    # sleep 10
    
    echo "GIT STATUS"
    echo "--------------------"
    git status
    # sleep 10

    echo "GIT STAGING FILES"
    echo "--------------------"
    # git add .
    # sleep 10

    # git commit -m "$commitmsg"

    # echo "Pushing to remote repo"
    # git push origin main
    
    # echo "Commit '$commitmsg' pushed to remote repo successfully!"
fi