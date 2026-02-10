package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _P: ImageVector? = null

val Icons.Ss.P: ImageVector
    get() = _P ?: UXIcon(name = "P") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                lineTo(14.5f, 0f)
                curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.36f, 7.5f, -7.5f, 7.5f)
                lineTo(4f, 15f)
                verticalLineToRelative(9f)
                close()
                moveTo(4f, 13f)
                lineTo(14.5f, 13f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 13f)
                close()
            }
        }.also { _P = it}
