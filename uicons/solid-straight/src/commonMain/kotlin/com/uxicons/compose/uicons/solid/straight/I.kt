package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _I: ImageVector? = null

val Icons.Ss.I: ImageVector
    get() = _I ?: UXIcon(name = "I") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineToRelative(0f, -2f)
                lineToRelative(-14f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(6f, 0f)
                lineToRelative(0f, 20f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(14f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, -20f)
                lineToRelative(6f, 0f)
                close()
            }
        }.also { _I = it}
