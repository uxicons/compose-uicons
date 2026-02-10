package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WheelchairSleeping: ImageVector? = null

val Icons.Rs.WheelchairSleeping: ImageVector
    get() = _WheelchairSleeping ?: UXIcon(name = "WheelchairSleeping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7.5f, 22f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                curveToRelative(0f, -2.13f, 1.22f, -3.98f, 3f, -4.89f)
                verticalLineToRelative(-2.17f)
                curveToRelative(-2.91f, 1.03f, -5f, 3.8f, -5f, 7.06f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                curveToRelative(3.26f, 0f, 6.03f, -2.09f, 7.06f, -5f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-0.91f, 1.78f, -2.76f, 3f, -4.89f, 3f)
                close()
                moveTo(18f, 7f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(2.09f, -2.09f)
                verticalLineToRelative(-1.91f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.09f, 2.09f)
                verticalLineToRelative(1.91f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-5f)
                lineTo(19f, 2f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.09f, 2.09f)
                verticalLineToRelative(1.91f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(2.09f, -2.09f)
                lineTo(24f, 0f)
                close()
                moveTo(17.28f, 15f)
                horizontalLineToRelative(-7.28f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5.72f)
                lineToRelative(1.5f, 6f)
                horizontalLineToRelative(3.78f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-1.5f, -6f)
                close()
            }
        }.also { _WheelchairSleeping = it}
