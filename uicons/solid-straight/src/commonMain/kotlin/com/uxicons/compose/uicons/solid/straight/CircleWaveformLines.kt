package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleWaveformLines: ImageVector? = null

val Icons.Ss.CircleWaveformLines: ImageVector
    get() = _CircleWaveformLines ?: UXIcon(name = "CircleWaveformLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _CircleWaveformLines = it}
