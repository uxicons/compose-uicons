package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartKanban: ImageVector? = null

val Icons.Br.ChartKanban: ImageVector
    get() = _ChartKanban ?: UXIcon(name = "ChartKanban") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6f, 3f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            lineTo(0f, 3f)
            curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(21f, 0f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            lineTo(24f, 3f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
            moveTo(12f, 0f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            lineTo(15f, 3f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
        }
    }.also { _ChartKanban = it }
