package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicStyle: ImageVector? = null

val Icons.Rs.GraphicStyle: ImageVector
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
                moveTo(22.82f, 6.82f)
                lineToRelative(1.18f, -0.59f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(14.76f)
                lineToRelative(-0.59f, 1.18f)
                lineToRelative(-1.65f, 0.82f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 11.59f)
                lineToRelative(3f, -3f)
                lineToRelative(9f, 9f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                lineTo(22f, 8.47f)
                lineToRelative(0.82f, -1.65f)
                close()
                moveTo(22f, 22f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                lineTo(5f, 11.41f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(7.59f)
                lineTo(22f, 22f)
                close()
                moveTo(8f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _GraphicStyle = it}
