package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Socks: ImageVector? = null

val Icons.Sr.Socks: ImageVector
    get() = _Socks ?: UXIcon(name = "Socks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 4f)
                curveToRelative(0f, -1.07f, 0.41f, -2.07f, 1.17f, -2.83f)
                reflectiveCurveToRelative(1.76f, -1.17f, 2.83f, -1.17f)
                horizontalLineToRelative(4f)
                curveToRelative(2.2f, 0f, 4.0f, 1.79f, 4f, 4.0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-12f, 0.0f, -12f, 0.0f)
                close()
                moveTo(12.0f, 6f)
                verticalLineToRelative(3.72f)
                curveToRelative(0.0f, 0.25f, -0.09f, 0.49f, -0.26f, 0.68f)
                lineToRelative(-3.34f, 3.67f)
                curveToRelative(-2.11f, 2.64f, -1.8f, 6.47f, 0.7f, 8.54f)
                curveToRelative(1.08f, 0.9f, 2.44f, 1.39f, 3.84f, 1.39f)
                curveToRelative(1.83f, 0f, 3.54f, -0.82f, 4.66f, -2.22f)
                lineToRelative(4.21f, -4.86f)
                curveToRelative(1.42f, -1.64f, 2.2f, -3.73f, 2.2f, -5.9f)
                verticalLineToRelative(-5.02f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(10.0f, 4f)
                curveToRelative(0f, -1.49f, 0.55f, -2.9f, 1.54f, -4f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-1.07f, 0f, -2.07f, 0.42f, -2.83f, 1.17f)
                reflectiveCurveToRelative(-1.17f, 1.76f, -1.17f, 2.83f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(6.83f, 12.82f)
                lineToRelative(3.17f, -3.48f)
                lineToRelative(-0.0f, -3.34f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.72f)
                curveToRelative(0.0f, 0.25f, -0.09f, 0.49f, -0.26f, 0.68f)
                lineToRelative(-3.34f, 3.67f)
                curveToRelative(-2.11f, 2.64f, -1.8f, 6.47f, 0.7f, 8.54f)
                curveToRelative(1.08f, 0.9f, 2.44f, 1.39f, 3.84f, 1.39f)
                curveToRelative(0.52f, 0f, 1.02f, -0.07f, 1.51f, -0.2f)
                curveToRelative(-2.97f, -2.83f, -3.28f, -7.64f, -0.61f, -10.99f)
                close()
            }
        }.also { _Socks = it}
