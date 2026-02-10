package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tubes: ImageVector? = null

val Icons.Bs.Tubes: ImageVector
    get() = _Tubes ?: UXIcon(name = "Tubes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(23f, 3f)
                horizontalLineToRelative(1f)
                lineTo(24f, 0f)
                close()
                moveTo(18.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20f, 8f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(10f, 3f)
                horizontalLineToRelative(1f)
                lineTo(11f, 0f)
                close()
                moveTo(5.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(-3f)
                lineTo(4f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _Tubes = it}
