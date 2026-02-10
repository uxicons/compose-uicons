package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Bs.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.9f, 0f)
                lineToRelative(-6.48f, 24f)
                horizontalLineToRelative(-3.19f)
                lineTo(13.71f, 0f)
                horizontalLineToRelative(3.19f)
                close()
                moveTo(6.9f, 5f)
                lineToRelative(-1.9f, 7.3f)
                lineToRelative(-1.9f, -7.3f)
                lineTo(0f, 5f)
                lineToRelative(3.26f, 12.53f)
                curveToRelative(0.23f, 0.89f, 0.93f, 1.49f, 1.74f, 1.49f)
                reflectiveCurveToRelative(1.51f, -0.6f, 1.74f, -1.5f)
                lineToRelative(3.26f, -12.53f)
                horizontalLineToRelative(-3.1f)
                close()
                moveTo(20.37f, 17f)
                horizontalLineToRelative(-2.75f)
                lineToRelative(-0.53f, 2f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(3.26f, -12.51f)
                curveToRelative(0.23f, -0.9f, 0.93f, -1.5f, 1.74f, -1.5f)
                reflectiveCurveToRelative(1.51f, 0.6f, 1.74f, 1.49f)
                lineToRelative(3.26f, 12.51f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(-0.53f, -2f)
                close()
                moveTo(20.04f, 14f)
                lineToRelative(-1.04f, -4f)
                lineToRelative(-1.04f, 4f)
                horizontalLineToRelative(2.08f)
                close()
            }
        }.also { _Kerning = it}
