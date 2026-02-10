package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WheelchairSleeping: ImageVector? = null

val Icons.Ts.WheelchairSleeping: ImageVector
    get() = _WheelchairSleeping ?: UXIcon(name = "WheelchairSleeping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(9.5f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(20.36f, 22f)
                horizontalLineToRelative(2.64f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.36f)
                lineToRelative(-2f, -6f)
                horizontalLineToRelative(-2.67f)
                curveToRelative(-0.26f, 3.9f, -3.51f, 7f, -7.47f, 7f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                curveToRelative(0f, -3.97f, 3.1f, -7.22f, 7f, -7.47f)
                verticalLineToRelative(1f)
                curveToRelative(-3.35f, 0.26f, -6f, 3.06f, -6f, 6.47f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                curveToRelative(3.42f, 0f, 6.22f, -2.65f, 6.47f, -6f)
                horizontalLineToRelative(-2.48f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(9f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(10f, 12f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.86f)
                lineToRelative(2f, 6f)
                close()
                moveTo(24f, 1.21f)
                lineToRelative(-2.79f, 2.79f)
                horizontalLineToRelative(2.79f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.21f)
                lineToRelative(2.79f, -2.79f)
                horizontalLineToRelative(-2.79f)
                lineTo(20f, 0f)
                horizontalLineToRelative(4f)
                lineTo(24f, 1.21f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.21f)
                lineToRelative(2.79f, -2.79f)
                horizontalLineToRelative(-2.79f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.21f)
                lineToRelative(-2.79f, 2.79f)
                horizontalLineToRelative(2.79f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _WheelchairSleeping = it}
