package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarTunnel: ImageVector? = null

val Icons.Sr.CarTunnel: ImageVector
    get() = _CarTunnel ?: UXIcon(name = "CarTunnel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 24f)
                lineTo(7.5f, 24f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(16f, 16f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.57f)
                curveToRelative(-0.28f, 0.89f, -0.43f, 1.8f, -0.43f, 2.73f)
                curveToRelative(0f, 0.7f, 0.57f, 1.27f, 1.27f, 1.27f)
                horizontalLineToRelative(9.46f)
                curveToRelative(0.7f, 0f, 1.27f, -0.57f, 1.27f, -1.27f)
                curveToRelative(0f, -0.93f, -0.15f, -1.85f, -0.43f, -2.73f)
                horizontalLineToRelative(-1.57f)
                close()
                moveTo(16.83f, 14f)
                lineToRelative(-0.4f, -1.05f)
                curveToRelative(-0.44f, -1.16f, -1.56f, -1.93f, -2.8f, -1.94f)
                lineToRelative(-3.31f, -0.01f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.26f, 0f, -2.4f, 0.8f, -2.83f, 1.99f)
                lineToRelative(-0.36f, 1.0f)
                horizontalLineToRelative(9.7f)
                close()
                moveTo(11.97f, 0f)
                curveTo(5.35f, 0f, -0.03f, 5.38f, -0.03f, 12f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.76f)
                curveToRelative(-1.17f, -0.5f, -2f, -1.66f, -2f, -3.01f)
                curveToRelative(0f, -1.26f, 0.21f, -2.51f, 0.64f, -3.7f)
                lineToRelative(0.97f, -2.71f)
                curveToRelative(0.71f, -1.99f, 2.6f, -3.32f, 4.71f, -3.32f)
                horizontalLineToRelative(0.01f)
                lineToRelative(3.31f, 0.01f)
                curveToRelative(2.06f, 0.0f, 3.93f, 1.3f, 4.67f, 3.23f)
                lineToRelative(1.05f, 2.77f)
                curveToRelative(0.43f, 1.21f, 0.65f, 2.46f, 0.65f, 3.72f)
                curveToRelative(0f, 1.35f, -0.83f, 2.52f, -2f, 3.01f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(6.47f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-11f)
                curveTo(23.97f, 5.38f, 18.58f, 0f, 11.97f, 0f)
                close()
            }
        }.also { _CarTunnel = it}
