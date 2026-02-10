package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesetaSign: ImageVector? = null

val Icons.Br.PesetaSign: ImageVector
    get() = _PesetaSign ?: UXIcon(name = "PesetaSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 7.5f)
            horizontalLineToRelative(-1.63f)
            curveTo(20.16f, 3.25f, 16.45f, 0f, 12f, 0f)
            horizontalLineToRelative(-3.5f)
            curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
            verticalLineToRelative(2f)
            lineTo(1.5f, 7.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(6f)
            curveToRelative(4.45f, 0f, 8.16f, -3.25f, 8.87f, -7.5f)
            horizontalLineToRelative(1.63f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(6f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(2.79f, 0f, 5.14f, 1.91f, 5.81f, 4.5f)
            lineTo(6f, 7.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(12f, 15f)
            lineTo(6f, 15f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(11.81f)
            curveToRelative(-0.67f, 2.59f, -3.02f, 4.5f, -5.81f, 4.5f)
            close()
        }
    }.also { _PesetaSign = it }
