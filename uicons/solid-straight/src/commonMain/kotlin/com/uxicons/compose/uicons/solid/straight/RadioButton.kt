package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioButton: ImageVector? = null

val Icons.Ss.RadioButton: ImageVector
    get() = _RadioButton ?: UXIcon(name = "RadioButton") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(24f, 5f)
                lineTo(13f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 17f)
                lineTo(13f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 1f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(7.76f, 1f, 5f, 1f)
                close()
                moveTo(5f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _RadioButton = it}
