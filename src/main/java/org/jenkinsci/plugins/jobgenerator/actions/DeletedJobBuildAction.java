/*
The MIT License

Copyright (c) 2012-2013, Sylvain Benner.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

package org.jenkinsci.plugins.jobgenerator.actions;

import java.util.List;

import hudson.model.Action;

/**
 * Summary for deleted jobs.
 * 
 * @author <a href="mailto:sylvain.benner@gmail.com">Sylvain Benner</a>
 */
public class DeletedJobBuildAction implements Action {
    public final List<String> jobs;

    public DeletedJobBuildAction(List<String> jobs) {
        this.jobs = jobs;
    }

    /**
     * No task list item.
     */
    public String getIconFileName() {
       return null;
    }

    public String getDisplayName() {
        return "Deleted Job";
    }

    public String getUrlName() {
        return "deleted_job";
    }

    public List<String> getJobs() {
        return this.jobs;
    }
}
