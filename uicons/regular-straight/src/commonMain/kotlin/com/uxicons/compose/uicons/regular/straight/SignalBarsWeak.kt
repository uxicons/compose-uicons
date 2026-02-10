package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsWeak: ImageVector? = null

val Icons.Rs.SignalBarsWeak: ImageVector
    get() = _SignalBarsWeak ?: UXIcon(name = "SignalBarsWeak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                close()
                moveTo(5f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _SignalBarsWeak = it}
