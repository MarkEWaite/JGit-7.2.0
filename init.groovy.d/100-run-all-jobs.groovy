// Run all the jobs once

import hudson.model.Cause.UserIdCause;
import jenkins.model.Jenkins;
import org.jenkinsci.plugins.workflow.job.WorkflowJob;

Jenkins.instance.getAllItems(WorkflowJob.class).findAll().each {
    if (it.fullName.contains("pipeline-all-start") {
        continue
    }
    it.scheduleBuild(0, new UserIdCause())
    println('Scheduled ' + it.fullName)
}
return ""
