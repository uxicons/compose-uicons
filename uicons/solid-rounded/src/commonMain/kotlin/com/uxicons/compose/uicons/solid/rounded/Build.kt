package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Build: ImageVector? = null

val Icons.Sr.Build: ImageVector
    get() = _Build ?: UXIcon(name = "Build") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 4f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.74f, 0f, -1.39f, 0.4f, -1.73f, 1f)
                horizontalLineToRelative(-2.27f)
                verticalLineToRelative(-0.92f)
                curveToRelative(0f, -1.25f, -0.61f, -2.39f, -1.63f, -3.05f)
                curveToRelative(-0.95f, -0.61f, -2.13f, -0.69f, -3.24f, -0.18f)
                lineTo(1.41f, 3.6f)
                curveToRelative(-0.87f, 0.47f, -1.41f, 1.39f, -1.41f, 2.4f)
                curveToRelative(0f, 1f, 0.54f, 1.91f, 1.4f, 2.39f)
                lineToRelative(4.82f, 2.81f)
                curveToRelative(0.44f, 0.2f, 0.91f, 0.3f, 1.37f, 0.3f)
                curveToRelative(0.62f, 0f, 1.24f, -0.18f, 1.78f, -0.52f)
                curveToRelative(1.02f, -0.66f, 1.63f, -1.79f, 1.63f, -3.05f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.35f, 0.6f, 0.99f, 1f, 1.73f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(6f, 18f)
                lineTo(2f, 18f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _Build = it}
