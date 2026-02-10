package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _I: ImageVector? = null

val Icons.Bs.I: ImageVector
    get() = _I ?: UXIcon(name = "I") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                lineToRelative(0f, -3f)
                lineToRelative(-14f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(5.5f, 0f)
                lineToRelative(0f, 18f)
                lineToRelative(-5.5f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(14f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-5.5f, 0f)
                lineToRelative(0f, -18f)
                lineToRelative(5.5f, 0f)
                close()
            }
        }.also { _I = it}
