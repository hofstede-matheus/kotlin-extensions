fun View.gone() {
    this.visibility = View.GONE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

infix fun View?.isVisibleIf(shouldShow: Boolean) {
    if (shouldShow) this?.visible()
    else this?.gone()
}

infix fun EditText?.isEnabledIf(shouldBeEnabled: Boolean) {
    this?.apply {
        isEnabled = shouldBeEnabled
    }
}
