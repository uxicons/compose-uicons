package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _P: ImageVector? = null

val Icons.Bs.P: ImageVector
    get() = _P ?: UXIcon(name = "P") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3.5f)
                curveTo(2f, 1.57f, 3.57f, 0f, 5.5f, 0f)
                lineTo(14f, 0f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                lineTo(5f, 16f)
                verticalLineToRelative(8f)
                close()
                moveTo(5f, 13f)
                lineTo(14f, 13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                lineTo(5.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                lineTo(5f, 13f)
                close()
            }
        }.also { _P = it}
