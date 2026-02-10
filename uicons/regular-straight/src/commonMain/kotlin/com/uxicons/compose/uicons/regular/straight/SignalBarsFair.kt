package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsFair: ImageVector? = null

val Icons.Rs.SignalBarsFair: ImageVector
    get() = _SignalBarsFair ?: UXIcon(name = "SignalBarsFair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(7f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(11f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _SignalBarsFair = it}
