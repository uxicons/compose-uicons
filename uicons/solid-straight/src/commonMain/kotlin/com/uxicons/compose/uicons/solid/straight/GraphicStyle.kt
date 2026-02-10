package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicStyle: ImageVector? = null

val Icons.Ss.GraphicStyle: ImageVector
    get() = _GraphicStyle ?: UXIcon(name = "GraphicStyle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23.41f)
                verticalLineToRelative(0.59f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6.59f)
                lineToRelative(5f, -5f)
                lineToRelative(9f, 9f)
                lineToRelative(4f, -4f)
                lineToRelative(6f, 6f)
                close()
                moveTo(18.67f, 5.33f)
                lineToRelative(1.33f, 2.67f)
                lineToRelative(1.33f, -2.67f)
                lineToRelative(2.67f, -1.33f)
                lineToRelative(-2.67f, -1.33f)
                lineToRelative(-1.33f, -2.67f)
                lineToRelative(-1.33f, 2.67f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(2.67f, 1.33f)
                close()
                moveTo(24f, 6.23f)
                verticalLineToRelative(14.35f)
                lineToRelative(-6f, -6f)
                lineToRelative(-4f, 4f)
                lineTo(5f, 9.59f)
                lineTo(0f, 14.59f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(14.76f)
                lineToRelative(-0.59f, 1.18f)
                lineToRelative(-5.65f, 2.82f)
                lineToRelative(5.65f, 2.82f)
                lineToRelative(2.82f, 5.65f)
                lineToRelative(2.82f, -5.65f)
                lineToRelative(1.18f, -0.59f)
                close()
                moveTo(9f, 5.49f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(17f, 10.49f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                close()
            }
        }.also { _GraphicStyle = it}
