package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Bs.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.81f)
                curveToRelative(-1.04f, -1.79f, -2.98f, -3f, -5.2f, -3f)
                curveTo(3.69f, 0f, 1f, 2.69f, 1f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(7f, 9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 2.5f)
                lineToRelative(-4f, 2.5f)
                verticalLineToRelative(6.08f)
                lineToRelative(-5.33f, 5.92f)
                lineTo(5f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8.33f)
                lineToRelative(3.67f, -4.08f)
                lineTo(17f, 0f)
                horizontalLineToRelative(3f)
                lineToRelative(4f, 2.5f)
                close()
            }
        }.also { _Guide = it}
