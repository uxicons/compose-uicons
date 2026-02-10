package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomIn: ImageVector? = null

val Icons.Br.ZoomIn: ImageVector
    get() = _ZoomIn ?: UXIcon(name = "ZoomIn", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(288f, 192f)
            horizontalLineToRelative(-32f)
            verticalLineToRelative(-32f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(32f)
            horizontalLineToRelative(-32f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
            horizontalLineToRelative(32f)
            verticalLineToRelative(32f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-32f)
            horizontalLineToRelative(32f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveTo(305.67f, 192f, 288f, 192f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(502.66f, 457.57f)
            lineToRelative(-99.05f, -99.07f)
            curveToRelative(74.18f, -99.06f, 54.01f, -239.5f, -45.05f, -313.68f)
            reflectiveCurveTo(119.07f, -9.19f, 44.89f, 89.87f)
            reflectiveCurveToRelative(-54.01f, 239.5f, 45.05f, 313.68f)
            curveToRelative(79.59f, 59.6f, 188.93f, 59.62f, 268.54f, 0.06f)
            lineToRelative(99.09f, 99.09f)
            curveToRelative(12.45f, 12.45f, 32.64f, 12.45f, 45.09f, 0f)
            curveToRelative(12.45f, -12.45f, 12.45f, -32.64f, 0f, -45.09f)
            lineTo(502.66f, 457.57f)
            close()
            moveTo(225.12f, 384.49f)
            curveToRelative(-88.02f, 0f, -159.37f, -71.35f, -159.37f, -159.37f)
            reflectiveCurveTo(137.1f, 65.74f, 225.12f, 65.74f)
            reflectiveCurveToRelative(159.37f, 71.35f, 159.37f, 159.37f)
            curveTo(384.4f, 313.1f, 313.1f, 384.4f, 225.12f, 384.49f)
            close()
        }
    }.also { _ZoomIn = it }
