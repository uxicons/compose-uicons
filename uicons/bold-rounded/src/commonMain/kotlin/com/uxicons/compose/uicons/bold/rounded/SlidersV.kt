package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlidersV: ImageVector? = null

val Icons.Br.SlidersV: ImageVector
    get() = _SlidersV ?: UXIcon(name = "SlidersV") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.5f, 7.5f)
            curveToRelative(0f, 1.39f, -0.82f, 2.59f, -2f, 3.15f)
            verticalLineToRelative(11.85f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-11.85f)
            curveToRelative(-1.18f, -0.56f, -2f, -1.76f, -2f, -3.15f)
            reflectiveCurveToRelative(0.82f, -2.59f, 2f, -3.15f)
            lineTo(2.5f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.85f)
            curveToRelative(1.18f, 0.56f, 2f, 1.76f, 2f, 3.15f)
            close()
            moveTo(13.5f, 13.35f)
            lineTo(13.5f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(11.85f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.76f, -2f, 3.15f)
            reflectiveCurveToRelative(0.82f, 2.59f, 2f, 3.15f)
            verticalLineToRelative(2.85f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.85f)
            curveToRelative(1.18f, -0.56f, 2f, -1.76f, 2f, -3.15f)
            reflectiveCurveToRelative(-0.82f, -2.59f, -2f, -3.15f)
            close()
            moveTo(23.5f, 7.5f)
            curveToRelative(0f, -1.39f, -0.82f, -2.59f, -2f, -3.15f)
            lineTo(21.5f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.85f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.76f, -2f, 3.15f)
            reflectiveCurveToRelative(0.82f, 2.59f, 2f, 3.15f)
            verticalLineToRelative(11.85f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-11.85f)
            curveToRelative(1.18f, -0.56f, 2f, -1.76f, 2f, -3.15f)
            close()
        }
    }.also { _SlidersV = it }
