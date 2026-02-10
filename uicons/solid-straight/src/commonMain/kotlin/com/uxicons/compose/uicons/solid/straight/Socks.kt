package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Socks: ImageVector? = null

val Icons.Ss.Socks: ImageVector
    get() = _Socks ?: UXIcon(name = "Socks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 4f)
                lineToRelative(-0.0f, -4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4f)
                reflectiveCurveToRelative(-12.0f, 0f, -12.0f, 0f)
                close()
                moveTo(12.0f, 6f)
                lineToRelative(0.0f, 4.11f)
                lineToRelative(-3.61f, 3.95f)
                curveToRelative(-2.11f, 2.64f, -1.8f, 6.47f, 0.7f, 8.54f)
                curveToRelative(1.08f, 0.9f, 2.44f, 1.39f, 3.84f, 1.39f)
                curveToRelative(1.83f, 0f, 3.54f, -0.82f, 4.66f, -2.22f)
                lineToRelative(4.21f, -4.86f)
                curveToRelative(1.42f, -1.64f, 2.2f, -3.73f, 2.2f, -5.9f)
                verticalLineToRelative(-5.02f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(6.83f, 12.82f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(3.08f, -3.38f)
                lineToRelative(-0.0f, -3.34f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.0f, 4.11f)
                lineToRelative(-3.61f, 3.95f)
                curveToRelative(-2.11f, 2.64f, -1.8f, 6.47f, 0.7f, 8.54f)
                curveToRelative(1.08f, 0.9f, 2.44f, 1.39f, 3.84f, 1.39f)
                curveToRelative(0.51f, 0f, 1.01f, -0.08f, 1.5f, -0.21f)
                curveToRelative(-2.96f, -2.83f, -3.26f, -7.64f, -0.59f, -10.97f)
                close()
                moveTo(10.0f, 4f)
                lineTo(10.0f, 0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.0f, 4f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }.also { _Socks = it}
