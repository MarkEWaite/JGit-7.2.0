// Run all the jobs once
Jenkins.instance.getAllItems(org.jenkinsci.plugins.workflow.job.WorkflowJob.class).findAll().each {
    it.scheduleBuild(0, new hudson.model.Cause.UserIdCause())
    println('Scheduled ' + it.fullName)
}
return ""
