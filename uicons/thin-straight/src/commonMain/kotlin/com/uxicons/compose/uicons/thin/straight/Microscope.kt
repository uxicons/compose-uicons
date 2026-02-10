package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microscope: ImageVector? = null

val Icons.Ts.Microscope: ImageVector
    get() = _Microscope ?: UXIcon(name = "Microscope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 14f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                lineTo(4f, 17f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                lineTo(1f, 21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                curveToRelative(0.34f, 0f, 0.67f, -0.03f, 1f, -0.07f)
                verticalLineToRelative(2.07f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.26f)
                curveToRelative(3.44f, -0.89f, 6f, -4.02f, 6f, -7.74f)
                close()
                moveTo(12f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(9f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _Microscope = it}
