package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandZoomIn: ImageVector? = null

val Icons.Rr.HandZoomIn: ImageVector
    get() = _HandZoomIn ?: UXIcon(name = "HandZoomIn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.46f)
                curveToRelative(-0.07f, -1.12f, -0.83f, -2.16f, -1.94f, -2.58f)
                lineToRelative(-5.41f, -2.03f)
                curveToRelative(-0.39f, -0.15f, -0.65f, -0.52f, -0.65f, -0.94f)
                verticalLineToRelative(-5.89f)
                curveToRelative(0f, -0.54f, -0.36f, -1.02f, -0.82f, -1.09f)
                curveToRelative(-0.6f, -0.11f, -1.19f, 0.38f, -1.18f, 0.99f)
                verticalLineToRelative(9.49f)
                curveToRelative(0f, 0.61f, -0.34f, 1.15f, -0.89f, 1.42f)
                curveToRelative(-0.55f, 0.26f, -1.18f, 0.19f, -1.66f, -0.19f)
                curveToRelative(0f, 0f, -1.76f, -1.4f, -1.77f, -1.41f)
                curveToRelative(-0.4f, -0.37f, -1.03f, -0.35f, -1.41f, 0.05f)
                curveToRelative(-0.38f, 0.4f, -0.36f, 1.04f, 0.05f, 1.42f)
                lineToRelative(1.53f, 1.51f)
                curveToRelative(0.65f, 0.62f, 0.21f, 1.72f, -0.69f, 1.72f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.1f, -0.69f, -0.28f)
                lineToRelative(-1.52f, -1.5f)
                curveToRelative(-1.2f, -1.12f, -1.26f, -3.02f, -0.13f, -4.23f)
                curveToRelative(1.1f, -1.18f, 2.94f, -1.26f, 4.15f, -0.21f)
                curveToRelative(0.01f, 0.01f, 1.04f, 0.82f, 1.04f, 0.82f)
                verticalLineToRelative(-8.6f)
                curveToRelative(0f, -0.88f, 0.39f, -1.72f, 1.06f, -2.29f)
                curveToRelative(0.67f, -0.57f, 1.56f, -0.82f, 2.44f, -0.67f)
                curveToRelative(1.43f, 0.23f, 2.5f, 1.55f, 2.5f, 3.07f)
                verticalLineToRelative(5.2f)
                lineToRelative(4.76f, 1.78f)
                curveToRelative(1.85f, 0.69f, 3.12f, 2.42f, 3.23f, 4.39f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(7.59f, -7.59f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-7.59f, 7.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _HandZoomIn = it}
