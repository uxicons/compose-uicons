package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Icicles: ImageVector? = null

val Icons.Br.Icicles: ImageVector
    get() = _Icicles ?: UXIcon(name = "Icicles") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 24f)
            lineTo(8.5f, 24f)
            curveToRelative(-0.7f, 0f, -1.3f, -0.5f, -1.5f, -1.2f)
            lineToRelative(-1.6f, -7.3f)
            lineTo(5f, 17.8f)
            curveTo(4.8f, 18.5f, 4.2f, 19f, 3.4f, 19f)
            curveToRelative(-0.7f, 0f, -1.3f, -0.6f, -1.4f, -1.3f)
            lineTo(0f, 4f)
            curveToRelative(-0.2f, -0.9f, 0.1f, -2f, 0.7f, -2.8f)
            reflectiveCurveTo(2.4f, 0f, 3.4f, 0f)
            horizontalLineToRelative(17.2f)
            curveToRelative(1f, 0f, 2f, 0.4f, 2.6f, 1.2f)
            reflectiveCurveTo(24.1f, 3f, 23.9f, 4f)
            lineToRelative(-2.5f, 17.7f)
            curveTo(21.4f, 22.4f, 20.8f, 23f, 20f, 23f)
            curveToRelative(-0.7f, 0f, -1.3f, -0.5f, -1.5f, -1.2f)
            lineToRelative(-1.7f, -7.2f)
            lineToRelative(-0.9f, 3.3f)
            curveToRelative(-0.2f, 0.6f, -0.8f, 1.1f, -1.4f, 1.1f)
            reflectiveCurveToRelative(-1.3f, -0.4f, -1.4f, -1.1f)
            lineToRelative(-1f, -3.5f)
            lineTo(10f, 22.9f)
            curveTo(9.8f, 23.5f, 9.2f, 24f, 8.5f, 24f)
            lineTo(8.5f, 24f)
            close()
            moveTo(5.5f, 7f)
            lineTo(5.5f, 7f)
            curveTo(6.2f, 7f, 6.8f, 7.5f, 7f, 8.2f)
            lineToRelative(1.6f, 7.7f)
            lineToRelative(1.9f, -7.7f)
            curveTo(10.7f, 7.5f, 11.3f, 7f, 12f, 7f)
            horizontalLineToRelative(0f)
            curveToRelative(0.7f, 0f, 1.3f, 0.4f, 1.4f, 1.1f)
            lineToRelative(1.1f, 3.8f)
            lineToRelative(1.1f, -3.8f)
            curveTo(15.7f, 7.4f, 16.3f, 7f, 17f, 7f)
            horizontalLineToRelative(0f)
            curveToRelative(0.7f, 0f, 1.3f, 0.5f, 1.4f, 1.2f)
            lineToRelative(1.3f, 5.6f)
            lineTo(21f, 3.5f)
            curveToRelative(0f, -0.2f, 0f, -0.3f, -0.1f, -0.4f)
            curveToRelative(0f, -0.1f, -0.2f, -0.2f, -0.3f, -0.2f)
            horizontalLineTo(3.4f)
            curveTo(3.3f, 3f, 3.1f, 3.1f, 3.1f, 3.2f)
            curveTo(3.1f, 3.2f, 3f, 3.3f, 3f, 3.5f)
            lineToRelative(0.8f, 5.7f)
            lineToRelative(0.2f, -1f)
            curveTo(4.2f, 7.5f, 4.8f, 7f, 5.5f, 7f)
            lineTo(5.5f, 7f)
            close()
        }
    }.also { _Icicles = it }
