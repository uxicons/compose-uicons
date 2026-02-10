package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatBirthday: ImageVector? = null

val Icons.Ts.HatBirthday: ImageVector
    get() = _HatBirthday ?: UXIcon(name = "HatBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 23.99f)
                lineTo(13.03f, 5.82f)
                curveToRelative(1.15f, -0.42f, 1.97f, -1.52f, 1.97f, -2.82f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.29f, 0.82f, 2.4f, 1.97f, 2.82f)
                lineTo(0.88f, 23.99f)
                horizontalLineToRelative(22.25f)
                close()
                moveTo(10.66f, 22.99f)
                horizontalLineToRelative(-3.43f)
                lineToRelative(7.1f, -12.76f)
                lineToRelative(1.76f, 3.17f)
                lineToRelative(-5.43f, 9.6f)
                close()
                moveTo(16.66f, 14.42f)
                lineToRelative(1.78f, 3.2f)
                lineToRelative(-3.07f, 5.37f)
                horizontalLineToRelative(-3.56f)
                lineToRelative(4.85f, -8.57f)
                close()
                moveTo(16.53f, 22.99f)
                lineToRelative(2.48f, -4.35f)
                lineToRelative(2.42f, 4.35f)
                horizontalLineToRelative(-4.9f)
                close()
                moveTo(10f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(12f, 6.03f)
                lineToRelative(1.76f, 3.17f)
                lineToRelative(-7.67f, 13.79f)
                horizontalLineToRelative(-3.51f)
                lineTo(12f, 6.03f)
                close()
            }
        }.also { _HatBirthday = it}
