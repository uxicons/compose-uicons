package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tubes: ImageVector? = null

val Icons.Rs.Tubes: ImageVector
    get() = _Tubes ?: UXIcon(name = "Tubes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                lineTo(10f, 2f)
                horizontalLineToRelative(1f)
                lineTo(11f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(-4f)
                lineTo(4f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                close()
                moveTo(23f, 0f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                lineTo(22f, 2f)
                horizontalLineToRelative(1f)
                lineTo(23f, 0f)
                close()
                moveTo(18f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-4f)
                lineTo(16f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Tubes = it}
