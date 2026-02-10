package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointLeft: ImageVector? = null

val Icons.Tr.HandBackPointLeft: ImageVector
    get() = _HandBackPointLeft ?: UXIcon(name = "HandBackPointLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 22f)
                horizontalLineToRelative(-4.72f)
                curveToRelative(-2.14f, 0f, -3.99f, -1.52f, -4.41f, -3.62f)
                lineToRelative(-1.28f, -6.38f)
                horizontalLineTo(2.61f)
                curveTo(1.33f, 12f, 0.23f, 11.1f, 0.03f, 9.92f)
                curveToRelative(-0.12f, -0.73f, 0.09f, -1.48f, 0.56f, -2.04f)
                reflectiveCurveToRelative(1.17f, -0.88f, 1.91f, -0.88f)
                horizontalLineTo(11.0f)
                lineTo(15.05f, 2.93f)
                curveToRelative(0.59f, -0.6f, 1.38f, -0.93f, 2.22f, -0.93f)
                curveToRelative(0.84f, 0.04f, 1.63f, 0.33f, 2.23f, 0.92f)
                lineToRelative(2.31f, 2.31f)
                curveToRelative(1.42f, 1.42f, 2.2f, 3.3f, 2.2f, 5.3f)
                verticalLineToRelative(6.97f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(2.5f, 8f)
                curveToRelative(-0.44f, 0f, -0.86f, 0.19f, -1.14f, 0.53f)
                curveToRelative(-0.29f, 0.34f, -0.41f, 0.78f, -0.34f, 1.23f)
                curveToRelative(0.12f, 0.71f, 0.8f, 1.24f, 1.59f, 1.24f)
                horizontalLineToRelative(6.89f)
                curveToRelative(0.24f, 0f, 0.44f, 0.17f, 0.49f, 0.4f)
                lineToRelative(1.36f, 6.79f)
                curveToRelative(0.33f, 1.63f, 1.77f, 2.81f, 3.43f, 2.81f)
                horizontalLineToRelative(4.72f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-6.97f)
                curveToRelative(0f, -1.74f, -0.68f, -3.37f, -1.9f, -4.6f)
                lineToRelative(-2.31f, -2.31f)
                curveToRelative(-0.41f, -0.41f, -0.94f, -0.6f, -1.52f, -0.63f)
                curveToRelative(-0.57f, 0f, -1.11f, 0.23f, -1.51f, 0.63f)
                lineToRelative(-3.35f, 3.37f)
                horizontalLineToRelative(5.09f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(2.5f)
                close()
            }
        }.also { _HandBackPointLeft = it}
