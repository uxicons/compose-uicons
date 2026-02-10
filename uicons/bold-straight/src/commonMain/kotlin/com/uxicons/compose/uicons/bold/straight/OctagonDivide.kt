package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonDivide: ImageVector? = null

val Icons.Bs.OctagonDivide: ImageVector
    get() = _OctagonDivide ?: UXIcon(name = "OctagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 6.0f)
                lineToRelative(-4.98f, -4.98f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.48f, -1.02f)
                horizontalLineToRelative(-7.04f)
                curveToRelative(-0.94f, 0f, -1.81f, 0.36f, -2.48f, 1.02f)
                lineTo(1.02f, 6.0f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                verticalLineToRelative(7.04f)
                curveToRelative(0f, 0.94f, 0.36f, 1.81f, 1.02f, 2.48f)
                lineToRelative(4.98f, 4.98f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.48f, 1.02f)
                horizontalLineToRelative(7.04f)
                curveToRelative(0.94f, 0f, 1.81f, -0.36f, 2.48f, -1.02f)
                lineToRelative(4.98f, -4.98f)
                curveToRelative(0.66f, -0.66f, 1.02f, -1.54f, 1.02f, -2.48f)
                verticalLineToRelative(-7.04f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                close()
                moveTo(21f, 15.52f)
                curveToRelative(0f, 0.13f, -0.05f, 0.26f, -0.15f, 0.35f)
                lineToRelative(-4.98f, 4.98f)
                curveToRelative(-0.09f, 0.09f, -0.22f, 0.15f, -0.35f, 0.15f)
                horizontalLineToRelative(-7.04f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-4.98f, -4.98f)
                curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                verticalLineToRelative(-7.04f)
                curveToRelative(0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f)
                lineToRelative(4.98f, -4.98f)
                curveToRelative(0.09f, -0.09f, 0.22f, -0.15f, 0.35f, -0.15f)
                horizontalLineToRelative(7.04f)
                curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.35f, 0.15f)
                lineToRelative(4.98f, 4.98f)
                curveToRelative(0.09f, 0.09f, 0.15f, 0.22f, 0.15f, 0.35f)
                verticalLineToRelative(7.04f)
                close()
                moveTo(7f, 10.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(7f, 13.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10.5f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _OctagonDivide = it}
