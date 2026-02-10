package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pulse: ImageVector? = null

val Icons.Ss.Pulse: ImageVector
    get() = _Pulse ?: UXIcon(name = "Pulse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(-15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9.04f, 11f)
                horizontalLineToRelative(-6.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.96f)
                lineToRelative(2.66f, -3.99f)
                lineToRelative(3f, 6f)
                lineToRelative(1.34f, -2.01f)
                horizontalLineToRelative(6.04f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(-2.66f, 3.99f)
                lineToRelative(-3f, -6f)
                close()
            }
        }.also { _Pulse = it}
