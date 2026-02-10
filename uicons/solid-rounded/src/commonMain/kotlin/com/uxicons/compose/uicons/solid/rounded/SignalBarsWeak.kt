package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsWeak: ImageVector? = null

val Icons.Sr.SignalBarsWeak: ImageVector
    get() = _SignalBarsWeak ?: UXIcon(name = "SignalBarsWeak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 19f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _SignalBarsWeak = it}
