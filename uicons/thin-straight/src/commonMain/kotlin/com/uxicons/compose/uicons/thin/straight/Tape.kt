package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tape: ImageVector? = null

val Icons.Ts.Tape: ImageVector
    get() = _Tape ?: UXIcon(name = "Tape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(11f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(15.58f, 22f)
                curveToRelative(3.79f, -1.74f, 6.42f, -5.57f, 6.42f, -10f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(0f, 5.93f, 0f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8.42f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 6.49f, 5.49f, 2f, 11f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(1f, 17.51f, 1f, 12f)
                close()
            }
        }.also { _Tape = it}
