package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Down: ImageVector? = null

val Icons.Ss.Down: ImageVector
    get() = _Down ?: UXIcon(name = "Down") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.8f, 0f, -1.56f, -0.31f, -2.12f, -0.88f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(0.07f, 13f, 0.07f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                horizontalLineToRelative(10f)
                verticalLineTo(13f)
                horizontalLineToRelative(6.95f)
                lineToRelative(-9.82f, 10.11f)
                curveToRelative(-0.58f, 0.58f, -1.33f, 0.89f, -2.13f, 0.89f)
                close()
            }
        }.also { _Down = it}
