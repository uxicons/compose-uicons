package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reel: ImageVector? = null

val Icons.Br.Reel: ImageVector
    get() = _Reel ?: UXIcon(name = "Reel") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 13.46f)
            curveToRelative(2.38f, -0.21f, 4f, -1.77f, 4f, -3.96f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.63f, -0.5f, 0.87f, -1f, 0.95f)
            lineTo(20f, 3f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(1.54f, 0f)
            curveTo(0.71f, 0f, 0.04f, 0.67f, 0.04f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.5f)
            lineToRelative(-0.03f, 18f)
            lineTo(1.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(22.46f, 24f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.46f)
            verticalLineToRelative(-7.54f)
            close()
            moveTo(17f, 10.5f)
            lineTo(7.02f, 10.5f)
            lineToRelative(0.01f, -2.5f)
            horizontalLineToRelative(9.97f)
            verticalLineToRelative(2.5f)
            close()
            moveTo(7.02f, 13.5f)
            horizontalLineToRelative(9.98f)
            verticalLineToRelative(2.5f)
            lineTo(7.01f, 16f)
            lineToRelative(0.01f, -2.5f)
            close()
            moveTo(17f, 3f)
            verticalLineToRelative(2f)
            lineTo(7.03f, 5f)
            lineToRelative(0.0f, -2f)
            horizontalLineToRelative(9.96f)
            close()
            moveTo(7.0f, 21f)
            lineToRelative(0.0f, -2f)
            horizontalLineToRelative(9.99f)
            verticalLineToRelative(2f)
            lineTo(7.0f, 21f)
            close()
        }
    }.also { _Reel = it }
