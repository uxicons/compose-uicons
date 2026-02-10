package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleWaveformLines: ImageVector? = null

val Icons.Ts.CircleWaveformLines: ImageVector
    get() = _CircleWaveformLines ?: UXIcon(name = "CircleWaveformLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 5f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                lineTo(14f, 7f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _CircleWaveformLines = it}
