# LeetCode Solutions

Automatically synced from my LeetCode account using a GitHub Action. This repository contains my accepted solutions, organized by problem and language.

## How It Works

A scheduled GitHub workflow runs daily and pulls my latest solved problems from LeetCode into this repo.

* Syncs accepted problems
* Updates existing solutions
* Stores code in organized folders
* Includes problem metadata
* Commits automatically



> The exact structure depends on the LeetCode Sync tool.

## Setup (If you want to use this system)

1. Generate session tokens from LeetCode

   * Open LeetCode
   * DevTools → Application/Storage → Cookies
   * Copy:

     * `LEETCODE_SESSION`
     * `csrftoken`

2. Add them as secrets in GitHub:

   * `LEETCODE_SESSION`
   * `LEETCODE_CSRF_TOKEN`

3. Create workflow file:

```
.github/workflows/sync-leetcode.yml
```

```
name: Sync Leetcode

on:
  workflow_dispatch:
  schedule:
    - cron: "0 8 * * *"

permissions:
  contents: write

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Sync
        uses: joshcai/leetcode-sync@v1.7
        with:
          github-token: ${{ secrets.GITHUB_TOKEN }}
          leetcode-csrf-token: ${{ secrets.LEETCODE_CSRF_TOKEN }}
          leetcode-session: ${{ secrets.LEETCODE_SESSION }}
          destination-folder: my-folder
          verbose: true
          commit-header: "[LeetCode Sync]"
```

## Motivation

This repository helps me:

* Track my DSA progress
* Improve coding habits
* Maintain clean, sharable solutions
* Prepare for interviews
* Learn multiple languages

## Tech Used

* GitHub Actions
* LeetCode API
* leetcode-sync: [https://github.com/joshcai/leetcode-sync](https://github.com/joshcai/leetcode-sync)

## Contact

If you're preparing for DSA or backend engineering roles and want to connect:

* GitHub: *https://github.com/AK-GUPTA-20*
* Leetcode: *https://leetcode.com/u/user_akshat/*

---

### Star the repo if it helped you!
