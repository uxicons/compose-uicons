package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tape: ImageVector? = null

val Icons.Rs.Tape: ImageVector
    get() = _Tape ?: UXIcon(name = "Tape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(11f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(17.32f, 21f)
                curveToRelative(2.83f, -1.99f, 4.68f, -5.28f, 4.68f, -9f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(0f, 5.93f, 0f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6.68f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 7.04f, 6.04f, 3f, 11f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(2f, 16.96f, 2f, 12f)
                close()
            }
        }.also { _Tape = it}
