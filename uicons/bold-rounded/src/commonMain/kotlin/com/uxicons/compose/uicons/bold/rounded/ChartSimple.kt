package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSimple: ImageVector? = null

val Icons.Br.ChartSimple: ImageVector
    get() = _ChartSimple ?: UXIcon(name = "ChartSimple") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3f)
            lineTo(15f, 21f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            lineTo(9f, 3f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(21f, 6f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            lineTo(24f, 9f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
            moveTo(3f, 12f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
        }
    }.also { _ChartSimple = it }
