package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binary: ImageVector? = null

val Icons.Bs.Binary: ImageVector
    get() = _Binary ?: UXIcon(name = "Binary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(4f, 2.02f, 4f, 4.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(7f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(17f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.44f)
                lineToRelative(-1.88f, -1.83f)
                lineToRelative(2.66f, -2.72f)
                horizontalLineToRelative(2.22f)
                close()
                moveTo(16f, 4.56f)
                lineToRelative(-1.88f, -1.83f)
                lineToRelative(2.66f, -2.72f)
                horizontalLineToRelative(2.22f)
                lineTo(19f, 11f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 4.56f)
                close()
            }
        }.also { _Binary = it}
