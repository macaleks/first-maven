package org.example.alekdev;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello", defaultPhase = LifecyclePhase.GENERATE_RESOURCES)
public class HelloMojo extends AbstractMojo {

    @Parameter(defaultValue = "Hello from my first plugin!!", property = "hello.message")
    private String message;
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(message);
    }
}
