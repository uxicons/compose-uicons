package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BandageWound: ImageVector? = null

val Icons.Sr.BandageWound: ImageVector
    get() = _BandageWound ?: UXIcon(name = "BandageWound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.61f, 9.39f)
                curveTo(-0.54f, 7.24f, -0.54f, 3.76f, 1.61f, 1.61f)
                reflectiveCurveToRelative(5.63f, -2.15f, 7.78f, 0f)
                lineToRelative(1.2f, 1.2f)
                lineToRelative(-7.78f, 7.78f)
                lineToRelative(-1.2f, -1.2f)
                close()
                moveTo(21.19f, 13.41f)
                lineToRelative(-7.78f, 7.78f)
                lineToRelative(1.2f, 1.2f)
                curveToRelative(2.15f, 2.15f, 5.63f, 2.15f, 7.78f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(2.15f, -2.15f, 2.15f, -5.63f, 0f, -7.78f)
                lineToRelative(-1.2f, -1.2f)
                close()
                moveTo(22.39f, 9.39f)
                lineToRelative(-13f, 13f)
                curveToRelative(-2.15f, 2.15f, -5.63f, 2.15f, -7.78f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(-2.15f, -2.15f, -2.15f, -5.63f, 0f, -7.78f)
                lineTo(14.61f, 1.61f)
                curveToRelative(2.15f, -2.15f, 5.63f, -2.15f, 7.78f, 0f)
                reflectiveCurveToRelative(2.15f, 5.63f, 0f, 7.78f)
                close()
                moveTo(11.34f, 16.25f)
                lineToRelative(-3.59f, -3.59f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.59f, 3.59f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(17.66f, 9.92f)
                lineToRelative(-3.59f, -3.59f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.59f, 3.59f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _BandageWound = it}
