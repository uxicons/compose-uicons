package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tap: ImageVector? = null

val Icons.Rs.Tap: ImageVector
    get() = _Tap ?: UXIcon(name = "Tap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 11.89f)
                curveToRelative(-1.24f, -1.26f, -2f, -2.99f, -2f, -4.89f)
                curveTo(2f, 3.14f, 5.14f, 0f, 9f, 0f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.9f, -0.77f, 3.63f, -2f, 4.89f)
                verticalLineToRelative(-4.89f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(4.89f)
                close()
                moveTo(12f, 13.18f)
                verticalLineToRelative(-6.07f)
                curveToRelative(0f, -1.52f, -1.08f, -2.83f, -2.5f, -3.07f)
                curveToRelative(-0.88f, -0.14f, -1.77f, 0.1f, -2.44f, 0.67f)
                curveToRelative(-0.67f, 0.57f, -1.06f, 1.4f, -1.06f, 2.29f)
                verticalLineToRelative(11.57f)
                lineToRelative(-0.95f, -0.76f)
                curveToRelative(-1.21f, -1.13f, -3.11f, -1.06f, -4.24f, 0.14f)
                curveToRelative(-1.13f, 1.21f, -1.06f, 3.11f, 0.13f, 4.23f)
                lineToRelative(1.89f, 1.82f)
                horizontalLineToRelative(2.88f)
                lineToRelative(-3.39f, -3.27f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.42f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.47f, 0.0f)
                lineToRelative(4.26f, 3.39f)
                lineTo(8f, 7f)
                curveToRelative(0f, -0.29f, 0.13f, -0.57f, 0.35f, -0.76f)
                curveToRelative(0.23f, -0.19f, 0.52f, -0.27f, 0.82f, -0.22f)
                curveToRelative(0.46f, 0.08f, 0.82f, 0.56f, 0.82f, 1.09f)
                verticalLineToRelative(7.71f)
                lineToRelative(10f, 2f)
                verticalLineToRelative(7.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.82f)
                lineToRelative(-10f, -2f)
                close()
            }
        }.also { _Tap = it}
