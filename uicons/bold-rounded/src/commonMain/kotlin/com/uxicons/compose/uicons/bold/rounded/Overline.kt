package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Overline: ImageVector? = null

val Icons.Br.Overline: ImageVector
    get() = _Overline ?: UXIcon(name = "Overline") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
            close()
            moveTo(12f, 8f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
            moveTo(22f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(3.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(20.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _Overline = it }
