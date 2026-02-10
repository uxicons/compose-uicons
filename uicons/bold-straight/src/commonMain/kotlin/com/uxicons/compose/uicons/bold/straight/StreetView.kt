package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreetView: ImageVector? = null

val Icons.Bs.StreetView: ImageVector
    get() = _StreetView ?: UXIcon(name = "StreetView") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.58f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(10f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(17f, 16.28f)
                verticalLineToRelative(3.03f)
                curveToRelative(1.4f, 0.19f, 2.48f, 0.44f, 3.19f, 0.69f)
                curveToRelative(-1.4f, 0.48f, -4.19f, 1f, -8.19f, 1f)
                reflectiveCurveToRelative(-6.79f, -0.52f, -8.19f, -1f)
                curveToRelative(0.71f, -0.24f, 1.78f, -0.5f, 3.19f, -0.69f)
                verticalLineToRelative(-3.03f)
                curveToRelative(-3.39f, 0.41f, -7f, 1.39f, -7f, 3.72f)
                curveToRelative(0f, 3.71f, 9.19f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, -0.29f, 12f, -4f)
                curveToRelative(0f, -2.33f, -3.61f, -3.31f, -7f, -3.72f)
                close()
            }
        }.also { _StreetView = it}
