package jvmInternals;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

public class RunningJVMCount {

	
	public static void main(final String[] args) {
		
		
		List<VirtualMachineDescriptor> descriptors = VirtualMachine.list();
	    for (VirtualMachineDescriptor descriptor : descriptors) {
	        System.out.println("Found JVM: " + descriptor.displayName());
	        try {
	            VirtualMachine vm = VirtualMachine.attach(descriptor);
	            String version = vm.getSystemProperties().getProperty("java.runtime.version");
	            System.out.println("   Runtime Version: " + version);

	 //           Thread.sleep(2000);
	           /* String connectorAddress = vm.getAgentProperties().getProperty("com.sun.management.jmxremote.localConnectorAddress");
	            if (connectorAddress == null) {
	                vm.startLocalManagementAgent();
	                connectorAddress = vm.getAgentProperties().getProperty("com.sun.management.jmxremote.localConnectorAddress");
	            }*/

	           /* JMXServiceURL url = new JMXServiceURL(connectorAddress);
	            JMXConnector connector = JMXConnectorFactory.connect(url);
	            MBeanServerConnection mbs = connector.getMBeanServerConnection();

	            ObjectName threadName = new ObjectName(ManagementFactory.THREAD_MXBEAN_NAME);
	            Integer threadCount = (Integer)mbs.getAttribute(threadName, "ThreadCount");
	            System.out.println("    Thread count: " + threadCount);*/
	        }
	        catch (Exception e) {
	            System.out.println("exception ");
	        }
	    }
	
	}}

