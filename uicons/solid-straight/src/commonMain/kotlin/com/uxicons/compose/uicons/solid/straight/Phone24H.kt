package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Phone24H: ImageVector? = null

val Icons.Ss.Phone24H: ImageVector
    get() = _Phone24H ?: UXIcon(name = "Phone24H") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0.01f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1f, 0.67f, -1.5f, 1.2f, -1.9f)
                curveToRelative(0.51f, -0.38f, 0.8f, -0.62f, 0.8f, -1.1f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 1f, -0.67f, 1.5f, -1.2f, 1.9f)
                curveToRelative(-0.3f, 0.22f, -0.52f, 0.4f, -0.65f, 0.6f)
                close()
                moveTo(22f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(23.88f, 18.99f)
                lineTo(20.71f, 22.16f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveToRelative(-7.25f, 0f, -16.5f, -9.25f, -16.5f, -16.5f)
                curveToRelative(0f, -1.61f, 0.61f, -3.1f, 1.72f, -4.21f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(6.26f, 6.27f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(4.13f, -4.13f)
                close()
            }
        }.also { _Phone24H = it}
