package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microscope: ImageVector? = null

val Icons.Ss.Microscope: ImageVector
    get() = _Microscope ?: UXIcon(name = "Microscope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13.5f)
                curveToRelative(0f, -4.69f, -3.81f, -8.5f, -8.5f, -8.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
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
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.14f)
                curveToRelative(3.97f, -0.71f, 7f, -4.18f, 7f, -8.36f)
                close()
            }
        }.also { _Microscope = it}
