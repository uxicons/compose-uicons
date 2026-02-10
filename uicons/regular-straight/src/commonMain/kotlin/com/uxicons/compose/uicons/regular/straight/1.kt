package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rs1: ImageVector? = null

val Icons.Rs.Rs1: ImageVector
    get() = _Rs1 ?: UXIcon(name = "Rs1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -20.72f)
                lineToRelative(-5.56f, 5.72f)
                lineToRelative(-1.43f, -1.39f)
                lineToRelative(7.39f, -7.6f)
                lineToRelative(1.6f, 0f)
                lineToRelative(0f, 24f)
                close()
            }
        }.also { _Rs1 = it}
