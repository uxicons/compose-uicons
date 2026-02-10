package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Iron: ImageVector? = null

val Icons.Bs.Iron: ImageVector
    get() = _Iron ?: UXIcon(name = "Iron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 1f)
                lineTo(8f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                lineTo(10.5f, 10f)
                curveTo(2.21f, 10f, 0f, 16.6f, 0f, 20.5f)
                verticalLineToRelative(2.5f)
                lineTo(24f, 23f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(21f, 20f)
                lineTo(3.02f, 20f)
                curveToRelative(0.12f, -1.91f, 1.04f, -7f, 7.48f, -7f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(7f)
                close()
                moveTo(11f, 16.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Iron = it}
