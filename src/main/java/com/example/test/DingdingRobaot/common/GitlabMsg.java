package com.example.test.DingdingRobaot.common;

import java.util.List;

public class GitlabMsg {

    private String object_kind;
    private ObjectAttributesBean object_attributes;
    private Object merge_request;
    private UserBean user;
    private ProjectBean project;
    private CommitBean commit;
    private List<BuildsBean> builds;

    public String getObject_kind() {
        return object_kind;
    }

    public void setObject_kind(String object_kind) {
        this.object_kind = object_kind;
    }

    public ObjectAttributesBean getObject_attributes() {
        return object_attributes;
    }

    public void setObject_attributes(ObjectAttributesBean object_attributes) {
        this.object_attributes = object_attributes;
    }

    public Object getMerge_request() {
        return merge_request;
    }

    public void setMerge_request(Object merge_request) {
        this.merge_request = merge_request;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public ProjectBean getProject() {
        return project;
    }

    public void setProject(ProjectBean project) {
        this.project = project;
    }

    public CommitBean getCommit() {
        return commit;
    }

    public void setCommit(CommitBean commit) {
        this.commit = commit;
    }

    public List<BuildsBean> getBuilds() {
        return builds;
    }

    public void setBuilds(List<BuildsBean> builds) {
        this.builds = builds;
    }

    public static class ObjectAttributesBean {

        private int id;
        private String ref;
        private boolean tag;
        private String sha;
        private String before_sha;
        private String source;
        private String status;
        private String detailed_status;
        private String created_at;
        private String finished_at;
        private int duration;
        private List<String> stages;
        private List<?> variables;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }

        public boolean isTag() {
            return tag;
        }

        public void setTag(boolean tag) {
            this.tag = tag;
        }

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public String getBefore_sha() {
            return before_sha;
        }

        public void setBefore_sha(String before_sha) {
            this.before_sha = before_sha;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDetailed_status() {
            return detailed_status;
        }

        public void setDetailed_status(String detailed_status) {
            this.detailed_status = detailed_status;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getFinished_at() {
            return finished_at;
        }

        public void setFinished_at(String finished_at) {
            this.finished_at = finished_at;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public List<String> getStages() {
            return stages;
        }

        public void setStages(List<String> stages) {
            this.stages = stages;
        }

        public List<?> getVariables() {
            return variables;
        }

        public void setVariables(List<?> variables) {
            this.variables = variables;
        }
    }

    public static class UserBean {

        private int id;
        private String name;
        private String username;
        private String avatar_url;
        private String email;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public static class ProjectBean {

        private int id;
        private String name;
        private String description;
        private String web_url;
        private Object avatar_url;
        private String git_ssh_url;
        private String git_http_url;
        private String namespace;
        private int visibility_level;
        private String path_with_namespace;
        private String default_branch;
        private Object ci_config_path;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public Object getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(Object avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGit_ssh_url() {
            return git_ssh_url;
        }

        public void setGit_ssh_url(String git_ssh_url) {
            this.git_ssh_url = git_ssh_url;
        }

        public String getGit_http_url() {
            return git_http_url;
        }

        public void setGit_http_url(String git_http_url) {
            this.git_http_url = git_http_url;
        }

        public String getNamespace() {
            return namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public int getVisibility_level() {
            return visibility_level;
        }

        public void setVisibility_level(int visibility_level) {
            this.visibility_level = visibility_level;
        }

        public String getPath_with_namespace() {
            return path_with_namespace;
        }

        public void setPath_with_namespace(String path_with_namespace) {
            this.path_with_namespace = path_with_namespace;
        }

        public String getDefault_branch() {
            return default_branch;
        }

        public void setDefault_branch(String default_branch) {
            this.default_branch = default_branch;
        }

        public Object getCi_config_path() {
            return ci_config_path;
        }

        public void setCi_config_path(Object ci_config_path) {
            this.ci_config_path = ci_config_path;
        }
    }

    public static class CommitBean {

        private String id;
        private String message;
        private String title;
        private String timestamp;
        private String url;
        private AuthorBean author;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public static class AuthorBean {

            private String name;
            private String email;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }
    }

    public static class BuildsBean {

        private int id;
        private String stage;
        private String name;
        private String status;
        private String created_at;
        private Object started_at;
        private Object finished_at;
        private String when;
        private boolean manual;
        private boolean allow_failure;
        private UserBeanX user;
        private Object runner;
        private ArtifactsFileBean artifacts_file;
        private EnvironmentBean environment;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public Object getStarted_at() {
            return started_at;
        }

        public void setStarted_at(Object started_at) {
            this.started_at = started_at;
        }

        public Object getFinished_at() {
            return finished_at;
        }

        public void setFinished_at(Object finished_at) {
            this.finished_at = finished_at;
        }

        public String getWhen() {
            return when;
        }

        public void setWhen(String when) {
            this.when = when;
        }

        public boolean isManual() {
            return manual;
        }

        public void setManual(boolean manual) {
            this.manual = manual;
        }

        public boolean isAllow_failure() {
            return allow_failure;
        }

        public void setAllow_failure(boolean allow_failure) {
            this.allow_failure = allow_failure;
        }

        public UserBeanX getUser() {
            return user;
        }

        public void setUser(UserBeanX user) {
            this.user = user;
        }

        public Object getRunner() {
            return runner;
        }

        public void setRunner(Object runner) {
            this.runner = runner;
        }

        public ArtifactsFileBean getArtifacts_file() {
            return artifacts_file;
        }

        public void setArtifacts_file(ArtifactsFileBean artifacts_file) {
            this.artifacts_file = artifacts_file;
        }

        public EnvironmentBean getEnvironment() {
            return environment;
        }

        public void setEnvironment(EnvironmentBean environment) {
            this.environment = environment;
        }

        public static class UserBeanX {

            private int id;
            private String name;
            private String username;
            private String avatar_url;
            private String email;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }

        public static class ArtifactsFileBean {

            private Object filename;
            private Object size;

            public Object getFilename() {
                return filename;
            }

            public void setFilename(Object filename) {
                this.filename = filename;
            }

            public Object getSize() {
                return size;
            }

            public void setSize(Object size) {
                this.size = size;
            }
        }

        public static class EnvironmentBean {

            private String name;
            private String action;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }
        }
    }
}
