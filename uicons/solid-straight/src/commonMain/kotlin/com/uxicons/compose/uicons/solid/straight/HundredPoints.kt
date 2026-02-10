package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HundredPoints: ImageVector? = null

val Icons.Ss.HundredPoints: ImageVector
    get() = _HundredPoints ?: UXIcon(name = "HundredPoints") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.41f, 7.97f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(2.51f, -2.57f)
                horizontalLineToRelative(1.51f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-0.59f, 0.6f)
                close()
                moveTo(16f, 7.5f)
                lineTo(16f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(18f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(7f, 9.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(9f, 9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(23.55f, 13.48f)
                lineTo(0.05f, 18.3f)
                lineToRelative(0.4f, 1.96f)
                lineToRelative(23.5f, -4.83f)
                lineToRelative(-0.4f, -1.96f)
                close()
                moveTo(23.59f, 19.05f)
                lineToRelative(-14.54f, 2.97f)
                lineToRelative(0.4f, 1.96f)
                lineToRelative(14.54f, -2.97f)
                lineToRelative(-0.4f, -1.96f)
                close()
            }
        }.also { _HundredPoints = it}
