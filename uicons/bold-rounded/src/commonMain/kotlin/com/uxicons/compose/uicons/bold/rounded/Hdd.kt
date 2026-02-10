package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hdd: ImageVector? = null

val Icons.Br.Hdd: ImageVector
    get() = _Hdd ?: UXIcon(name = "Hdd") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(3.47f, 0f, 1f, 2.47f, 1f, 5.5f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(14f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(4f, 17f)
            lineTo(4f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(11.5f)
            lineTo(4f, 17f)
            close()
            moveTo(14.5f, 22f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(18.5f, 22f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _Hdd = it }
