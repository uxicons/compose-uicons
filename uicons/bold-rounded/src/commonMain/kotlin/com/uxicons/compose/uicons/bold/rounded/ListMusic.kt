package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListMusic: ImageVector? = null

val Icons.Br.ListMusic: ImageVector
    get() = _ListMusic ?: UXIcon(name = "ListMusic") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 0f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(8.6f)
            curveToRelative(-0.75f, -0.39f, -1.6f, -0.6f, -2.5f, -0.6f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(19f, 5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(13.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(0f, 1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            horizontalLineToRelative(10f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(0f, 7.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(10f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(8f, 13.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 15f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ListMusic = it }
