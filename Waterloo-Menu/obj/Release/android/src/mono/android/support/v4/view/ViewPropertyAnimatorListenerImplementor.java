package mono.android.support.v4.view;


public class ViewPropertyAnimatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v4.view.ViewPropertyAnimatorListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationCancel:(Landroid/view/View;)V:GetOnAnimationCancel_Landroid_view_View_Handler:Android.Support.V4.View.IViewPropertyAnimatorListenerInvoker, Xamarin.Android.Support.v4\n" +
			"n_onAnimationEnd:(Landroid/view/View;)V:GetOnAnimationEnd_Landroid_view_View_Handler:Android.Support.V4.View.IViewPropertyAnimatorListenerInvoker, Xamarin.Android.Support.v4\n" +
			"n_onAnimationStart:(Landroid/view/View;)V:GetOnAnimationStart_Landroid_view_View_Handler:Android.Support.V4.View.IViewPropertyAnimatorListenerInvoker, Xamarin.Android.Support.v4\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.View.IViewPropertyAnimatorListenerImplementor, Xamarin.Android.Support.v4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ViewPropertyAnimatorListenerImplementor.class, __md_methods);
	}


	public void onAnimationCancel (android.view.View p0)
	{
		n_onAnimationCancel (p0);
	}

	private native void n_onAnimationCancel (android.view.View p0);


	public void onAnimationEnd (android.view.View p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.view.View p0);


	public void onAnimationStart (android.view.View p0)
	{
		n_onAnimationStart (p0);
	}

	private native void n_onAnimationStart (android.view.View p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
