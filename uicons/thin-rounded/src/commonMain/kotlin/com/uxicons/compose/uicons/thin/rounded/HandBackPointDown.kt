package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Tr.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.51f, 24f)
                curveToRelative(-0.59f, 0f, -1.17f, -0.21f, -1.62f, -0.59f)
                curveToRelative(-0.56f, -0.48f, -0.88f, -1.17f, -0.88f, -1.91f)
                lineTo(7f, 13.0f)
                lineTo(2.93f, 8.95f)
                curveToRelative(-0.6f, -0.59f, -0.93f, -1.38f, -0.93f, -2.22f)
                curveToRelative(-0.0f, -0.84f, 0.33f, -1.63f, 0.92f, -2.23f)
                lineToRelative(2.31f, -2.31f)
                curveTo(6.64f, 0.78f, 8.53f, 0f, 10.53f, 0f)
                horizontalLineToRelative(6.97f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(4.72f)
                curveToRelative(0f, 2.14f, -1.52f, 3.99f, -3.62f, 4.41f)
                lineToRelative(-6.38f, 1.28f)
                verticalLineToRelative(6.48f)
                curveToRelative(0f, 1.27f, -0.9f, 2.38f, -2.08f, 2.57f)
                curveToRelative(-0.14f, 0.02f, -0.28f, 0.03f, -0.41f, 0.03f)
                close()
                moveTo(8f, 12.79f)
                verticalLineToRelative(8.71f)
                curveToRelative(0f, 0.44f, 0.19f, 0.86f, 0.53f, 1.14f)
                curveToRelative(0.34f, 0.29f, 0.77f, 0.41f, 1.23f, 0.34f)
                curveToRelative(0.71f, -0.12f, 1.24f, -0.8f, 1.24f, -1.59f)
                verticalLineToRelative(-6.89f)
                curveToRelative(0f, -0.24f, 0.17f, -0.44f, 0.4f, -0.49f)
                lineToRelative(6.79f, -1.36f)
                curveToRelative(1.63f, -0.33f, 2.81f, -1.77f, 2.81f, -3.43f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-1.74f, 0f, -3.37f, 0.68f, -4.6f, 1.9f)
                lineToRelative(-2.31f, 2.31f)
                curveToRelative(-0.41f, 0.41f, -0.63f, 0.94f, -0.63f, 1.52f)
                reflectiveCurveToRelative(0.23f, 1.11f, 0.63f, 1.51f)
                lineToRelative(3.37f, 3.35f)
                lineTo(7.0f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.29f)
                close()
            }
        }.also { _HandBackPointDown = it}
