package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighFive: ImageVector? = null

val Icons.Ss.HighFive: ImageVector
    get() = _HighFive ?: UXIcon(name = "HighFive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.49f, 9.18f)
                lineToRelative(0.51f, -2.36f)
                lineToRelative(0.0f, -4.82f)
                curveTo(7.0f, 0.79f, 8.09f, -0.17f, 9.33f, 0.03f)
                curveToRelative(0.99f, 0.16f, 1.67f, 1.09f, 1.67f, 2.09f)
                verticalLineToRelative(6.35f)
                curveToRelative(-0.53f, -0.29f, -1.14f, -0.47f, -1.78f, -0.47f)
                curveToRelative(-1.06f, 0f, -2.03f, 0.46f, -2.72f, 1.18f)
                close()
                moveTo(9.01f, 10.01f)
                curveToRelative(-0.83f, 0.09f, -1.46f, 0.81f, -1.58f, 1.63f)
                lineToRelative(-0.57f, 4.0f)
                lineToRelative(-1.98f, -0.28f)
                lineToRelative(0.51f, -3.55f)
                lineTo(0f, 13.82f)
                verticalLineToRelative(7.16f)
                lineToRelative(5.54f, -0.5f)
                curveToRelative(3.09f, -0.28f, 5.46f, -2.87f, 5.46f, -5.97f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -1.05f, -0.92f, -1.89f, -1.99f, -1.77f)
                close()
                moveTo(17.51f, 12.21f)
                lineToRelative(-0.51f, -2.36f)
                lineToRelative(-0.0f, -4.82f)
                curveToRelative(0f, -1.21f, -1.08f, -2.17f, -2.33f, -1.97f)
                curveToRelative(-0.99f, 0.16f, -1.67f, 1.09f, -1.67f, 2.09f)
                verticalLineToRelative(6.35f)
                curveToRelative(0.53f, -0.29f, 1.14f, -0.47f, 1.78f, -0.47f)
                curveToRelative(1.06f, 0f, 2.03f, 0.46f, 2.72f, 1.18f)
                close()
                moveTo(13f, 14.81f)
                verticalLineToRelative(2.71f)
                curveToRelative(0f, 3.1f, 2.37f, 5.69f, 5.46f, 5.97f)
                lineToRelative(5.54f, 0.5f)
                verticalLineToRelative(-7.16f)
                reflectiveCurveToRelative(-5.39f, -2.01f, -5.39f, -2.01f)
                lineToRelative(0.51f, 3.55f)
                lineToRelative(-1.98f, 0.28f)
                lineToRelative(-0.57f, -4.0f)
                curveToRelative(-0.12f, -0.83f, -0.75f, -1.54f, -1.58f, -1.63f)
                curveToRelative(-1.08f, -0.12f, -1.99f, 0.72f, -1.99f, 1.77f)
                close()
            }
        }.also { _HighFive = it}
