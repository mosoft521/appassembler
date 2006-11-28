package org.codehaus.mojo.appassembler.daemon.jsw;

import org.codehaus.mojo.appassembler.daemon.AbstractDaemonGeneratorTest;

import java.io.File;

/**
 * @author <a href="mailto:trygve.laugstol@objectware.no">Trygve Laugst&oslash;l</a>
 * @version $Id$
 */
public class JavaServiceWrapperDaemonGeneratorTest
    extends AbstractDaemonGeneratorTest
{
    public void testGenerationWithAllInfoInDescriptor()
        throws Exception
    {
        runTest( "jsw", "src/test/resources/project-1/pom.xml", "src/test/resources/project-1/descriptor.xml", "target/output-1-jsw" );

        File wrapper = new File( getTestFile( "target/output-1-jsw" ), "etc/app-wrapper.conf" );

        assertTrue( "Wrapper file is missing: " + wrapper.getAbsolutePath(), wrapper.isFile());
    }
}
