package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microscope: ImageVector? = null

val Icons.Bs.Microscope: ImageVector
    get() = _Microscope ?: UXIcon(name = "Microscope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(9f)
                lineTo(14f, 7f)
                horizontalLineToRelative(1f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                verticalLineToRelative(-2f)
                lineTo(4f, 17f)
                verticalLineToRelative(2f)
                lineTo(0f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.22f)
                curveToRelative(4.0f, -0.91f, 7f, -4.5f, 7f, -8.78f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Microscope = it}
