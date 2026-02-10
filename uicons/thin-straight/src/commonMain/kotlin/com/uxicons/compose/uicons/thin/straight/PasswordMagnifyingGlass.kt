package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PasswordMagnifyingGlass: ImageVector? = null

val Icons.Ts.PasswordMagnifyingGlass: ImageVector
    get() = _PasswordMagnifyingGlass ?: UXIcon(name = "PasswordMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1.18f)
                curveToRelative(0.08f, -0.33f, 0.15f, -0.66f, 0.18f, -1f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(9.03f)
                curveToRelative(0.03f, 0.34f, 0.08f, 0.68f, 0.16f, 1f)
                horizontalLineToRelative(-10.18f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(9.45f, 13.75f)
                lineTo(13.25f, 9.95f)
                lineTo(12.55f, 9.25f)
                lineTo(11f, 10.79f)
                lineTo(9.45f, 9.25f)
                lineTo(8.75f, 9.95f)
                lineTo(10.29f, 11.5f)
                lineTo(8.75f, 13.05f)
                lineTo(9.45f, 13.76f)
                close()
                moveTo(6.44f, 9.25f)
                lineTo(4.9f, 10.79f)
                lineTo(3.35f, 9.25f)
                lineTo(2.65f, 9.95f)
                lineTo(4.19f, 11.5f)
                lineTo(2.65f, 13.05f)
                lineTo(3.35f, 13.76f)
                lineTo(4.9f, 12.21f)
                lineTo(6.44f, 13.76f)
                lineTo(7.15f, 13.05f)
                lineTo(5.61f, 11.5f)
                lineTo(7.15f, 9.95f)
                close()
                moveTo(20f, 19.29f)
                lineTo(23.61f, 22.9f)
                lineTo(22.9f, 23.61f)
                lineTo(19.29f, 20.0f)
                curveToRelative(-0.77f, 0.62f, -1.73f, 1f, -2.79f, 1f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.06f, -0.38f, 2.02f, -1f, 2.79f)
                close()
                moveTo(20f, 16.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _PasswordMagnifyingGlass = it}
