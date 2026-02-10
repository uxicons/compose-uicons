package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Rs.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.8f, 0f, -1.56f, -0.31f, -2.12f, -0.88f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(0.07f, 13f, 0.07f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 0f)
                horizontalLineToRelative(10f)
                lineTo(17f, 13f)
                horizontalLineToRelative(6.95f)
                lineToRelative(-9.82f, 10.11f)
                curveToRelative(-0.58f, 0.58f, -1.33f, 0.89f, -2.13f, 0.89f)
                close()
                moveTo(11.29f, 21.71f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.7f, 0.29f)
                horizontalLineToRelative(0f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                lineToRelative(6.51f, -6.71f)
                horizontalLineToRelative(-4.22f)
                lineTo(14.99f, 2f)
                horizontalLineToRelative(-6f)
                lineTo(8.99f, 15f)
                lineTo(4.79f, 15f)
                lineToRelative(6.5f, 6.71f)
                close()
            }
        }.also { _Down = it}
