package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Ts.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(17f, 16.35f)
                verticalLineToRelative(1.0f)
                curveToRelative(3.8f, 0.57f, 6f, 1.74f, 6f, 2.65f)
                curveToRelative(0f, 1.25f, -4.18f, 3f, -11f, 3f)
                reflectiveCurveToRelative(-11f, -1.75f, -11f, -3f)
                curveToRelative(0f, -0.91f, 2.2f, -2.07f, 6f, -2.65f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-3.88f, 0.57f, -7f, 1.8f, -7f, 3.65f)
                curveToRelative(0f, 2.6f, 6.18f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, -1.4f, 12f, -4f)
                curveToRelative(0f, -1.84f, -3.12f, -3.08f, -7f, -3.65f)
                close()
            }
        }.also { _StreetView = it}
