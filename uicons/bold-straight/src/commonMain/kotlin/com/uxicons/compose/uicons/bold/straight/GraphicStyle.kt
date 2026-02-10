package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicStyle: ImageVector? = null

val Icons.Bs.GraphicStyle: ImageVector
    get() = _GraphicStyle ?: UXIcon(name = "GraphicStyle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                lineToRelative(2.67f, -1.33f)
                lineToRelative(1.33f, -2.67f)
                lineToRelative(1.33f, 2.67f)
                lineToRelative(2.67f, 1.33f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(-1.33f, 2.67f)
                lineToRelative(-1.33f, -2.67f)
                lineToRelative(-2.67f, -1.33f)
                close()
                moveTo(15.5f, 6f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                close()
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(14.26f)
                lineToRelative(-0.59f, 1.18f)
                lineToRelative(-3.65f, 1.82f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.38f)
                lineToRelative(2f, -2f)
                lineToRelative(9f, 9f)
                lineToRelative(4f, -4f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(-5.41f)
                lineToRelative(1.82f, -3.65f)
                lineToRelative(1.18f, -0.59f)
                lineTo(24f, 24f)
                close()
                moveTo(3f, 21f)
                lineTo(13.88f, 21f)
                lineTo(5f, 12.12f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(6.88f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(-0.88f)
                lineToRelative(-3f, -3f)
                lineToRelative(-3.88f, 3.88f)
                horizontalLineToRelative(6.88f)
                close()
                moveTo(8f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _GraphicStyle = it}
