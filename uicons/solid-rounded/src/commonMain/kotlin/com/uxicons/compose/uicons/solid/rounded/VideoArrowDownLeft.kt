package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoArrowDownLeft: ImageVector? = null

val Icons.Sr.VideoArrowDownLeft: ImageVector
    get() = _VideoArrowDownLeft ?: UXIcon(name = "VideoArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                lineTo(5f, 4f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(13f, 20f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12.71f, 9.71f)
                lineToRelative(-4.29f, 4.29f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.59f)
                lineToRelative(4.29f, -4.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(24.0f, 8.31f)
                verticalLineToRelative(7.32f)
                curveToRelative(0f, 0.76f, -0.42f, 1.44f, -1.1f, 1.77f)
                curveToRelative(-0.28f, 0.14f, -0.59f, 0.21f, -0.89f, 0.21f)
                curveToRelative(-0.42f, 0f, -0.84f, -0.14f, -1.19f, -0.4f)
                curveToRelative(-0.04f, -0.03f, -0.82f, -0.81f, -0.82f, -0.81f)
                lineTo(20.0f, 7.54f)
                reflectiveCurveToRelative(0.79f, -0.79f, 0.82f, -0.82f)
                curveToRelative(0.6f, -0.45f, 1.4f, -0.53f, 2.08f, -0.19f)
                reflectiveCurveToRelative(1.1f, 1.02f, 1.1f, 1.77f)
                close()
            }
        }.also { _VideoArrowDownLeft = it}
