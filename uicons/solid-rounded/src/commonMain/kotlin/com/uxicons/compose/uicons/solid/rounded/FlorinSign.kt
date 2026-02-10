package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Sr.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-1.17f, 0f, -2.25f, 0.69f, -2.73f, 1.76f)
                lineToRelative(-2.84f, 6.24f)
                horizontalLineToRelative(3.99f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4.9f)
                lineToRelative(-4.12f, 9.07f)
                curveToRelative(-0.81f, 1.78f, -2.59f, 2.93f, -4.55f, 2.93f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.42f)
                curveToRelative(1.17f, 0f, 2.25f, -0.69f, 2.73f, -1.76f)
                lineToRelative(3.75f, -8.24f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.81f)
                lineToRelative(3.21f, -7.07f)
                curveToRelative(0.81f, -1.78f, 2.59f, -2.93f, 4.55f, -2.93f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _FlorinSign = it}
