package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _1: ImageVector? = null

val Icons.Bs.One: ImageVector
    get() = _1 ?: UXIcon(name = "1") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 24f)
            lineToRelative(-3f, 0f)
            lineToRelative(0f, -18.99f)
            lineToRelative(-4.7f, 4.84f)
            lineToRelative(-2.15f, -2.09f)
            lineToRelative(7.54f, -7.75f)
            lineToRelative(2.31f, 0f)
            lineToRelative(0f, 24f)
            close()
        }
    }.also { _1 = it }
