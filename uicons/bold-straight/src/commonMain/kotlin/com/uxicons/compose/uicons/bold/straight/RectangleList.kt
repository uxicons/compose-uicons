package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleList: ImageVector? = null

val Icons.Bs.RectangleList: ImageVector
    get() = _RectangleList ?: UXIcon(name = "RectangleList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(19.5f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _RectangleList = it}
