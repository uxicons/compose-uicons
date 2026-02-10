package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleList: ImageVector? = null

val Icons.Ss.RectangleList: ImageVector
    get() = _RectangleList ?: UXIcon(name = "RectangleList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6.5f, 18.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(6.5f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(6.5f, 8.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 8f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _RectangleList = it}
