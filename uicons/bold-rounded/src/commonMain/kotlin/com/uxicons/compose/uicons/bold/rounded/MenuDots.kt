package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenuDots: ImageVector? = null

val Icons.Br.MenuDots: ImageVector
    get() = _MenuDots ?: UXIcon(name = "MenuDots", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(458.67f, 256f)
            moveToRelative(-53.33f, 0f)
            arcToRelative(53.33f, 53.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, 106.67f, 0f)
            arcToRelative(53.33f, 53.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, -106.67f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(256f, 256f)
            moveToRelative(-53.33f, 0f)
            arcToRelative(53.33f, 53.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, 106.67f, 0f)
            arcToRelative(53.33f, 53.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, -106.67f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(53.33f, 256f)
            moveToRelative(-53.33f, 0f)
            arcToRelative(53.33f, 53.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, 106.67f, 0f)
            arcToRelative(53.33f, 53.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, -106.67f, 0f)
        }
    }.also { _MenuDots = it }
