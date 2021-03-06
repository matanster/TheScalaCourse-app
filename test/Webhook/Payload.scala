package Webhook

object Payload {
  val jsonBody = """ 
    {
      "ref":"refs/heads/master",
      "before":"0000000000000000000000000000000000000000",
      "after":"433482133f73481eba4ff49c9000f0b631538aee",
      "created":true,
      "deleted":false,
      "forced":true,
      "base_ref":null,
      "compare":"https://github.com/TheScalaCourse/Bar/commit/433482133f73",
      "commits":[
        {
          "id":"433482133f73481eba4ff49c9000f0b631538aee",
          "distinct":true,
          "message":"foo",
          "timestamp":"2016-02-07T22:07:36+02:00",
          "url":"https://github.com/TheScalaCourse/Bar/commit/433482133f73481eba4ff49c9000f0b631538aee",
          "author":{
            "name":"matan",
            "email":"dev.matan@gmail.com",
            "username":"matanster"
          },
          "committer":{
            "name":"matan",
            "email":"dev.matan@gmail.com",
            "username":"matanster"
          },
          "added":[
            "bar"
          ],
          "removed":[
            
          ],
          "modified":[
            
          ]
        }
      ],
      "head_commit":{
        "id":"433482133f73481eba4ff49c9000f0b631538aee",
        "distinct":true,
        "message":"foo",
        "timestamp":"2016-02-07T22:07:36+02:00",
        "url":"https://github.com/TheScalaCourse/Bar/commit/433482133f73481eba4ff49c9000f0b631538aee",
        "author":{
          "name":"matan",
          "email":"dev.matan@gmail.com",
          "username":"matanster"
        },
        "committer":{
          "name":"matan",
          "email":"dev.matan@gmail.com",
          "username":"matanster"
        },
        "added":[
          "bar"
        ],
        "removed":[
          
        ],
        "modified":[
          
        ]
      },
      "repository":{
        "id":51203572,
        "name":"Bar",
        "full_name":"TheScalaCourse/Bar",
        "owner":{
          "name":"TheScalaCourse",
          "email":null
        },
        "private":false,
        "html_url":"https://github.com/TheScalaCourse/Bar",
        "description":"",
        "fork":false,
        "url":"https://github.com/TheScalaCourse/Bar",
        "forks_url":"https://api.github.com/repos/TheScalaCourse/Bar/forks",
        "keys_url":"https://api.github.com/repos/TheScalaCourse/Bar/keys{/key_id}",
        "collaborators_url":"https://api.github.com/repos/TheScalaCourse/Bar/collaborators{/collaborator}",
        "teams_url":"https://api.github.com/repos/TheScalaCourse/Bar/teams",
        "hooks_url":"https://api.github.com/repos/TheScalaCourse/Bar/hooks",
        "issue_events_url":"https://api.github.com/repos/TheScalaCourse/Bar/issues/events{/number}",
        "events_url":"https://api.github.com/repos/TheScalaCourse/Bar/events",
        "assignees_url":"https://api.github.com/repos/TheScalaCourse/Bar/assignees{/user}",
        "branches_url":"https://api.github.com/repos/TheScalaCourse/Bar/branches{/branch}",
        "tags_url":"https://api.github.com/repos/TheScalaCourse/Bar/tags",
        "blobs_url":"https://api.github.com/repos/TheScalaCourse/Bar/git/blobs{/sha}",
        "git_tags_url":"https://api.github.com/repos/TheScalaCourse/Bar/git/tags{/sha}",
        "git_refs_url":"https://api.github.com/repos/TheScalaCourse/Bar/git/refs{/sha}",
        "trees_url":"https://api.github.com/repos/TheScalaCourse/Bar/git/trees{/sha}",
        "statuses_url":"https://api.github.com/repos/TheScalaCourse/Bar/statuses/{sha}",
        "languages_url":"https://api.github.com/repos/TheScalaCourse/Bar/languages",
        "stargazers_url":"https://api.github.com/repos/TheScalaCourse/Bar/stargazers",
        "contributors_url":"https://api.github.com/repos/TheScalaCourse/Bar/contributors",
        "subscribers_url":"https://api.github.com/repos/TheScalaCourse/Bar/subscribers",
        "subscription_url":"https://api.github.com/repos/TheScalaCourse/Bar/subscription",
        "commits_url":"https://api.github.com/repos/TheScalaCourse/Bar/commits{/sha}",
        "git_commits_url":"https://api.github.com/repos/TheScalaCourse/Bar/git/commits{/sha}",
        "comments_url":"https://api.github.com/repos/TheScalaCourse/Bar/comments{/number}",
        "issue_comment_url":"https://api.github.com/repos/TheScalaCourse/Bar/issues/comments{/number}",
        "contents_url":"https://api.github.com/repos/TheScalaCourse/Bar/contents/{+path}",
        "compare_url":"https://api.github.com/repos/TheScalaCourse/Bar/compare/{base}...{head}",
        "merges_url":"https://api.github.com/repos/TheScalaCourse/Bar/merges",
        "archive_url":"https://api.github.com/repos/TheScalaCourse/Bar/{archive_format}{/ref}",
        "downloads_url":"https://api.github.com/repos/TheScalaCourse/Bar/downloads",
        "issues_url":"https://api.github.com/repos/TheScalaCourse/Bar/issues{/number}",
        "pulls_url":"https://api.github.com/repos/TheScalaCourse/Bar/pulls{/number}",
        "milestones_url":"https://api.github.com/repos/TheScalaCourse/Bar/milestones{/number}",
        "notifications_url":"https://api.github.com/repos/TheScalaCourse/Bar/notifications{?since,all,participating}",
        "labels_url":"https://api.github.com/repos/TheScalaCourse/Bar/labels{/name}",
        "releases_url":"https://api.github.com/repos/TheScalaCourse/Bar/releases{/id}",
        "deployments_url":"https://api.github.com/repos/TheScalaCourse/Bar/deployments",
        "created_at":1454765516,
        "updated_at":"2016-02-06T13:31:56Z",
        "pushed_at":1454875731,
        "git_url":"git://github.com/TheScalaCourse/Bar.git",
        "ssh_url":"git@github.com:TheScalaCourse/Bar.git",
        "clone_url":"https://github.com/TheScalaCourse/Bar.git",
        "svn_url":"https://github.com/TheScalaCourse/Bar",
        "homepage":null,
        "size":0,
        "stargazers_count":0,
        "watchers_count":0,
        "language":null,
        "has_issues":true,
        "has_downloads":true,
        "has_wiki":true,
        "has_pages":false,
        "forks_count":0,
        "mirror_url":null,
        "open_issues_count":0,
        "forks":0,
        "open_issues":0,
        "watchers":0,
        "default_branch":"master",
        "stargazers":0,
        "master_branch":"master",
        "organization":"TheScalaCourse"
      },
      "pusher":{
        "name":"matanster",
        "email":"matanster@users.noreply.github.com"
      },
      "organization":{
        "login":"TheScalaCourse",
        "id":17097573,
        "url":"https://api.github.com/orgs/TheScalaCourse",
        "repos_url":"https://api.github.com/orgs/TheScalaCourse/repos",
        "events_url":"https://api.github.com/orgs/TheScalaCourse/events",
        "hooks_url":"https://api.github.com/orgs/TheScalaCourse/hooks",
        "issues_url":"https://api.github.com/orgs/TheScalaCourse/issues",
        "members_url":"https://api.github.com/orgs/TheScalaCourse/members{/member}",
        "public_members_url":"https://api.github.com/orgs/TheScalaCourse/public_members{/member}",
        "avatar_url":"https://avatars.githubusercontent.com/u/17097573?v=3",
        "description":null
      },
      "sender":{
        "login":"matanster",
        "id":4996067,
        "avatar_url":"https://avatars.githubusercontent.com/u/4996067?v=3",
        "gravatar_id":"",
        "url":"https://api.github.com/users/matanster",
        "html_url":"https://github.com/matanster",
        "followers_url":"https://api.github.com/users/matanster/followers",
        "following_url":"https://api.github.com/users/matanster/following{/other_user}",
        "gists_url":"https://api.github.com/users/matanster/gists{/gist_id}",
        "starred_url":"https://api.github.com/users/matanster/starred{/owner}{/repo}",
        "subscriptions_url":"https://api.github.com/users/matanster/subscriptions",
        "organizations_url":"https://api.github.com/users/matanster/orgs",
        "repos_url":"https://api.github.com/users/matanster/repos",
        "events_url":"https://api.github.com/users/matanster/events{/privacy}",
        "received_events_url":"https://api.github.com/users/matanster/received_events",
        "type":"User",
        "site_admin":false
      }
    }
  """
}