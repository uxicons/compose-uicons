package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSimpleHorizontal: ImageVector? = null

val Icons.Br.ChartSimpleHorizontal: ImageVector
    get() = _ChartSimpleHorizontal ?: UXIcon(name = "ChartSimpleHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            lineTo(3f, 15f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            lineTo(21f, 9f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            close()
            moveTo(3f, 6f)
            lineTo(15f, 6f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            lineTo(3f, 0f)
            curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            close()
            moveTo(9f, 18f)
            lineTo(3f, 18f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            close()
        }
    }.also { _ChartSimpleHorizontal = it }
