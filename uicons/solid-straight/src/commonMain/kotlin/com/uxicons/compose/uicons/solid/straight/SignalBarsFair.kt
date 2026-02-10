package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsFair: ImageVector? = null

val Icons.Ss.SignalBarsFair: ImageVector
    get() = _SignalBarsFair ?: UXIcon(name = "SignalBarsFair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(3.5f, 17f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _SignalBarsFair = it}
