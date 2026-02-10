package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Ts.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.69f, 0f, -1.35f, -0.27f, -1.83f, -0.76f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(0.33f, 13f, 0.33f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 0f)
                horizontalLineToRelative(10f)
                lineTo(17f, 13f)
                horizontalLineToRelative(6.67f)
                lineToRelative(-9.83f, 10.23f)
                curveToRelative(-0.5f, 0.5f, -1.15f, 0.77f, -1.84f, 0.77f)
                close()
                moveTo(10.88f, 22.53f)
                curveToRelative(0.3f, 0.3f, 0.7f, 0.46f, 1.12f, 0.47f)
                horizontalLineToRelative(0f)
                curveToRelative(0.43f, 0f, 0.83f, -0.17f, 1.13f, -0.47f)
                lineToRelative(8.2f, -8.53f)
                horizontalLineToRelative(-5.33f)
                lineTo(16f, 1f)
                lineTo(8f, 1f)
                lineTo(8f, 14f)
                lineTo(2.67f, 14f)
                lineToRelative(8.2f, 8.53f)
                close()
            }
        }.also { _Down = it}
