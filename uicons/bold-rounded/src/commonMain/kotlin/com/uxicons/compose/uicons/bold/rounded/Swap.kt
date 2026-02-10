package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swap: ImageVector? = null

val Icons.Br.Swap: ImageVector
    get() = _Swap ?: UXIcon(name = "Swap") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.72f, 19.6f)
            lineToRelative(-3.52f, 3.52f)
            curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0f)
            lineToRelative(-3.52f, -3.52f)
            curveToRelative(-0.59f, -0.59f, -0.17f, -1.6f, 0.66f, -1.6f)
            horizontalLineToRelative(2.06f)
            verticalLineToRelative(-9.25f)
            curveToRelative(0f, -0.96f, -0.79f, -1.75f, -1.75f, -1.75f)
            reflectiveCurveToRelative(-1.75f, 0.79f, -1.75f, 1.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 2.62f, -2.13f, 4.75f, -4.75f, 4.75f)
            reflectiveCurveToRelative(-4.75f, -2.13f, -4.75f, -4.75f)
            verticalLineTo(6f)
            horizontalLineTo(1.94f)
            curveToRelative(-0.84f, 0f, -1.26f, -1.01f, -0.66f, -1.6f)
            lineTo(4.8f, 0.87f)
            curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
            lineToRelative(3.52f, 3.52f)
            curveToRelative(0.59f, 0.59f, 0.17f, 1.6f, -0.66f, 1.6f)
            horizontalLineToRelative(-2.06f)
            verticalLineToRelative(9.25f)
            curveToRelative(0f, 0.96f, 0.79f, 1.75f, 1.75f, 1.75f)
            reflectiveCurveToRelative(1.75f, -0.79f, 1.75f, -1.75f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -2.62f, 2.13f, -4.75f, 4.75f, -4.75f)
            reflectiveCurveToRelative(4.75f, 2.13f, 4.75f, 4.75f)
            verticalLineToRelative(9.25f)
            horizontalLineToRelative(2.06f)
            curveToRelative(0.84f, 0f, 1.26f, 1.01f, 0.66f, 1.6f)
            close()
        }
    }.also { _Swap = it }
