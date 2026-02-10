package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Operation: ImageVector? = null

val Icons.Bs.Operation: ImageVector
    get() = _Operation ?: UXIcon(name = "Operation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-2.46f, 0f, -4.83f, -0.76f, -6.83f, -2.15f)
                lineToRelative(-2.13f, 2.13f)
                verticalLineToRelative(-5.01f)
                curveToRelative(0f, -0.54f, 0.44f, -0.99f, 0.99f, -0.99f)
                horizontalLineToRelative(5.01f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(1.4f, 0.85f, 3.0f, 1.31f, 4.67f, 1.31f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                horizontalLineToRelative(3f)
                close()
                moveTo(17.95f, 10.3f)
                lineToRelative(-1.53f, 0.88f)
                curveToRelative(0.05f, 0.27f, 0.08f, 0.54f, 0.08f, 0.82f)
                reflectiveCurveToRelative(-0.03f, 0.55f, -0.08f, 0.82f)
                lineToRelative(1.53f, 0.88f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(-1.54f, -0.89f)
                curveToRelative(-0.41f, 0.35f, -0.88f, 0.63f, -1.4f, 0.81f)
                verticalLineToRelative(1.78f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.78f)
                curveToRelative(-0.52f, -0.19f, -0.99f, -0.46f, -1.4f, -0.81f)
                lineToRelative(-1.54f, 0.89f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(1.53f, -0.88f)
                curveToRelative(-0.05f, -0.27f, -0.08f, -0.54f, -0.08f, -0.82f)
                reflectiveCurveToRelative(0.03f, -0.55f, 0.08f, -0.82f)
                lineToRelative(-1.53f, -0.88f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.54f, 0.89f)
                curveToRelative(0.41f, -0.35f, 0.88f, -0.63f, 1.4f, -0.81f)
                verticalLineToRelative(-1.78f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.78f)
                curveToRelative(0.52f, 0.19f, 0.99f, 0.46f, 1.4f, 0.81f)
                lineToRelative(1.54f, -0.89f)
                lineToRelative(1.5f, 2.6f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.66f, 0f, 3.27f, 0.46f, 4.67f, 1.31f)
                lineToRelative(-1.71f, 1.71f)
                horizontalLineToRelative(5.01f)
                curveToRelative(0.54f, 0f, 0.99f, -0.44f, 0.99f, -0.99f)
                lineTo(20.96f, 0.01f)
                lineToRelative(-2.13f, 2.13f)
                curveToRelative(-2.0f, -1.39f, -4.36f, -2.15f, -6.83f, -2.15f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(3f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                close()
            }
        }.also { _Operation = it}
