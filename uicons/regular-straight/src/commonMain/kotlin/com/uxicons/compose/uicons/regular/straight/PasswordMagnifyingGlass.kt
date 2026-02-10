package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PasswordMagnifyingGlass: ImageVector? = null

val Icons.Rs.PasswordMagnifyingGlass: ImageVector
    get() = _PasswordMagnifyingGlass ?: UXIcon(name = "PasswordMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.02f, 22.6f)
                lineToRelative(-2.85f, -2.85f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.85f, 2.85f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(2f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9f)
                curveToRelative(0f, -1.91f, -0.76f, -3.63f, -2f, -4.89f)
                verticalLineToRelative(-4.11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(8.96f, 10.46f)
                lineTo(7.91f, 11.5f)
                lineTo(8.96f, 12.54f)
                lineTo(7.54f, 13.96f)
                lineTo(6.5f, 12.91f)
                lineTo(5.46f, 13.96f)
                lineTo(4.04f, 12.54f)
                lineTo(5.09f, 11.5f)
                lineTo(4.04f, 10.46f)
                lineTo(5.46f, 9.04f)
                lineTo(6.5f, 10.09f)
                lineTo(7.54f, 9.04f)
                close()
                moveTo(14.49f, 10.46f)
                lineTo(10.99f, 13.96f)
                lineTo(9.57f, 12.54f)
                lineTo(10.62f, 11.5f)
                lineTo(9.57f, 10.46f)
                lineTo(10.99f, 9.04f)
                lineTo(12.03f, 10.09f)
                lineTo(13.07f, 9.04f)
                close()
            }
        }.also { _PasswordMagnifyingGlass = it}
