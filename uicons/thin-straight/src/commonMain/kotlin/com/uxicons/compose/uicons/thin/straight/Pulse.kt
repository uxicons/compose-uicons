package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pulse: ImageVector? = null

val Icons.Ts.Pulse: ImageVector
    get() = _Pulse ?: UXIcon(name = "Pulse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                lineTo(1f, 18f)
                lineTo(1f, 4.5f)
                close()
                moveTo(15.23f, 10f)
                horizontalLineToRelative(4.77f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(-2.33f, 3.49f)
                lineToRelative(-3f, -6f)
                lineToRelative(-1.67f, 2.51f)
                horizontalLineToRelative(-4.77f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.23f)
                lineToRelative(2.33f, -3.49f)
                lineToRelative(3f, 6f)
                lineToRelative(1.67f, -2.51f)
                close()
            }
        }.also { _Pulse = it}
