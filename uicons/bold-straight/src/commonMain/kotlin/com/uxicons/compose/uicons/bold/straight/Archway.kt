package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Bs.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.11f)
                lineTo(24f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 3.11f)
                lineToRelative(2f, 2.86f)
                verticalLineToRelative(14.03f)
                lineTo(0f, 20f)
                verticalLineToRelative(3f)
                lineTo(10f, 23f)
                lineTo(10f, 14f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 5.97f)
                lineToRelative(2f, -2.86f)
                close()
                moveTo(17f, 20f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Archway = it}
