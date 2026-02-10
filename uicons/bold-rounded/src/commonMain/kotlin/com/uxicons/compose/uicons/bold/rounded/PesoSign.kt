package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesoSign: ImageVector? = null

val Icons.Br.PesoSign: ImageVector
    get() = _PesoSign ?: UXIcon(name = "PesoSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 10f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(0.04f, -0.33f, 0.06f, -0.66f, 0.06f, -1f)
            reflectiveCurveToRelative(-0.02f, -0.67f, -0.06f, -1f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.44f)
            curveTo(18.59f, 2.04f, 15.53f, 0f, 12f, 0f)
            horizontalLineToRelative(-3.5f)
            curveTo(5.64f, 0f, 3.28f, 2.2f, 3.02f, 5f)
            lineTo(1.5f, 5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2f)
            lineTo(1.5f, 10f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(6f)
            curveToRelative(3.53f, 0f, 6.59f, -2.04f, 8.06f, -5f)
            horizontalLineToRelative(2.44f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(8.5f, 3f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.77f, 0f, 3.37f, 0.77f, 4.47f, 2f)
            lineTo(6.05f, 5f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
            close()
            moveTo(6f, 8f)
            horizontalLineToRelative(11.92f)
            curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
            reflectiveCurveToRelative(-0.03f, 0.67f, -0.08f, 1f)
            lineTo(6f, 10f)
            verticalLineToRelative(-2f)
            close()
            moveTo(12f, 15f)
            lineTo(6f, 15f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(10.47f)
            curveToRelative(-1.1f, 1.23f, -2.7f, 2f, -4.47f, 2f)
            close()
        }
    }.also { _PesoSign = it }
