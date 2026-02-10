package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeWindow: ImageVector? = null

val Icons.Bs.CodeWindow: ImageVector
    get() = _CodeWindow ?: UXIcon(name = "CodeWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 1f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 20f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                close()
                moveTo(12.85f, 16.93f)
                lineTo(15.79f, 14.0f)
                lineTo(12.85f, 11.06f)
                lineTo(14.97f, 8.94f)
                lineTo(18.27f, 12.24f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.09f, 0.73f, 1.76f)
                reflectiveCurveToRelative(-0.26f, 1.29f, -0.73f, 1.76f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(5f, 14.0f)
                curveToRelative(0f, -0.66f, 0.26f, -1.29f, 0.73f, -1.76f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.94f, 2.94f)
                lineToRelative(2.94f, 2.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-3.3f, -3.3f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.09f, -0.73f, -1.76f)
                close()
            }
        }.also { _CodeWindow = it}
