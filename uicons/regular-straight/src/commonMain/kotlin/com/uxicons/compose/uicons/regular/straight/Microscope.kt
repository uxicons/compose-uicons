package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microscope: ImageVector? = null

val Icons.Rs.Microscope: ImageVector
    get() = _Microscope ?: UXIcon(name = "Microscope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13.5f)
                curveToRelative(0f, -4.69f, -3.81f, -8.5f, -8.5f, -8.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2.5f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(4f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(1f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.13f)
                curveToRelative(3.97f, -0.71f, 7f, -4.19f, 7f, -8.37f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Microscope = it}
