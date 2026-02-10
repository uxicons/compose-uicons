package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Tr.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-0.96f, 0f, -1.91f, -0.36f, -2.64f, -1.09f)
                lineTo(2.77f, 15.53f)
                curveToRelative(-0.76f, -0.75f, -0.98f, -1.87f, -0.56f, -2.88f)
                reflectiveCurveToRelative(1.36f, -1.64f, 2.45f, -1.65f)
                horizontalLineToRelative(2.34f)
                verticalLineTo(3.47f)
                curveToRelative(0f, -1.92f, 1.57f, -3.47f, 3.5f, -3.47f)
                horizontalLineToRelative(2.99f)
                curveToRelative(1.93f, 0f, 3.51f, 1.56f, 3.51f, 3.47f)
                verticalLineToRelative(7.53f)
                horizontalLineToRelative(2.34f)
                curveToRelative(1.1f, 0f, 2.04f, 0.64f, 2.45f, 1.65f)
                curveToRelative(0.42f, 1.01f, 0.2f, 2.11f, -0.57f, 2.89f)
                lineToRelative(-6.56f, 7.35f)
                curveToRelative(-0.74f, 0.74f, -1.71f, 1.11f, -2.67f, 1.11f)
                close()
                moveTo(4.66f, 12f)
                curveToRelative(-0.82f, 0f, -1.33f, 0.53f, -1.53f, 1.03f)
                reflectiveCurveToRelative(-0.22f, 1.23f, 0.36f, 1.81f)
                lineToRelative(6.59f, 7.38f)
                curveToRelative(1.05f, 1.05f, 2.79f, 1.05f, 3.86f, -0.02f)
                lineToRelative(6.55f, -7.34f)
                reflectiveCurveToRelative(0.01f, -0.01f, 0.02f, -0.02f)
                curveToRelative(0.58f, -0.58f, 0.57f, -1.31f, 0.36f, -1.81f)
                curveToRelative(-0.2f, -0.5f, -0.71f, -1.03f, -1.53f, -1.03f)
                horizontalLineToRelative(-2.84f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(3.47f)
                curveToRelative(0f, -1.36f, -1.12f, -2.47f, -2.51f, -2.47f)
                horizontalLineToRelative(-2.99f)
                curveToRelative(-1.38f, 0f, -2.51f, 1.11f, -2.51f, 2.47f)
                verticalLineTo(11.5f)
                curveToRelative(0f, 0.13f, -0.04f, 0.26f, -0.14f, 0.35f)
                reflectiveCurveToRelative(-0.22f, 0.15f, -0.35f, 0.15f)
                horizontalLineToRelative(-2.84f)
                close()
            }
        }.also { _Down = it}
