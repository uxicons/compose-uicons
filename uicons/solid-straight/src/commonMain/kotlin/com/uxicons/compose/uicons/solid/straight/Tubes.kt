package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tubes: ImageVector? = null

val Icons.Ss.Tubes: ImageVector
    get() = _Tubes ?: UXIcon(name = "Tubes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 11f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(8f)
                close()
                moveTo(2f, 9f)
                horizontalLineToRelative(8f)
                lineTo(10f, 2f)
                horizontalLineToRelative(1f)
                lineTo(11f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                close()
                moveTo(13f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                lineTo(22f, 2f)
                horizontalLineToRelative(1f)
                lineTo(23f, 0f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(14f, 11f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _Tubes = it}
