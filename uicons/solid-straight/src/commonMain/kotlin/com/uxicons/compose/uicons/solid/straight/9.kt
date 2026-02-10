package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ss9: ImageVector? = null

val Icons.Ss.Ss9: ImageVector
    get() = _Ss9 ?: UXIcon(name = "Ss9") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-2.71f)
                curveToRelative(-1.47f, 1.66f, -3.61f, 2.71f, -6f, 2.71f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
            }
        }.also { _Ss9 = it}
