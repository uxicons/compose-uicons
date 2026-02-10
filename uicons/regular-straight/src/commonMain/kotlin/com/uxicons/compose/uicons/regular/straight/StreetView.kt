package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Rs.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(9f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(18f, 15.54f)
                verticalLineToRelative(2.04f)
                curveToRelative(2.65f, 0.58f, 4f, 1.45f, 4f, 1.92f)
                curveToRelative(0f, 0.75f, -3.4f, 2.5f, -10f, 2.5f)
                reflectiveCurveToRelative(-10f, -1.75f, -10f, -2.5f)
                curveToRelative(0f, -0.47f, 1.35f, -1.34f, 4f, -1.92f)
                verticalLineToRelative(-2.04f)
                curveToRelative(-3.4f, 0.67f, -6f, 1.96f, -6f, 3.96f)
                curveToRelative(0f, 3.09f, 6.22f, 4.5f, 12f, 4.5f)
                reflectiveCurveToRelative(12f, -1.41f, 12f, -4.5f)
                curveToRelative(0f, -2.0f, -2.6f, -3.29f, -6f, -3.96f)
                close()
            }
        }.also { _StreetView = it}
