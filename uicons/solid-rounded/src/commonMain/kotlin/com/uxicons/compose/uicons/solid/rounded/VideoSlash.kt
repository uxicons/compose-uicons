package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Sr.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-5.92f, -5.92f)
                curveToRelative(0.13f, -0.45f, 0.21f, -0.9f, 0.21f, -1.37f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5.41f, 4f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(0f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(15.22f, 19.46f)
                curveToRelative(-0.67f, 0.34f, -1.42f, 0.54f, -2.22f, 0.54f)
                lineTo(5f, 20f)
                curveTo(2.24f, 20f, 0f, 17.76f, 0f, 15f)
                verticalLineToRelative(-6f)
                curveTo(0f, 7.68f, 0.52f, 6.49f, 1.35f, 5.59f)
                lineToRelative(13.87f, 13.87f)
                close()
                moveTo(24f, 8.31f)
                verticalLineToRelative(7.32f)
                curveToRelative(0f, 0.76f, -0.42f, 1.44f, -1.1f, 1.77f)
                curveToRelative(-0.28f, 0.14f, -0.59f, 0.21f, -0.89f, 0.21f)
                curveToRelative(-0.42f, 0f, -0.84f, -0.14f, -1.19f, -0.4f)
                curveToRelative(-0.04f, -0.03f, -0.82f, -0.81f, -0.82f, -0.81f)
                lineTo(20f, 7.54f)
                reflectiveCurveToRelative(0.79f, -0.79f, 0.82f, -0.82f)
                curveToRelative(0.6f, -0.45f, 1.4f, -0.53f, 2.08f, -0.19f)
                reflectiveCurveToRelative(1.1f, 1.02f, 1.1f, 1.77f)
                close()
            }
        }.also { _VideoSlash = it}
