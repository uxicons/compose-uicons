package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _I: ImageVector? = null

val Icons.Ts.I: ImageVector
    get() = _I ?: UXIcon(name = "I") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                lineToRelative(0f, -1f)
                lineToRelative(-14f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(6.39f, 0f)
                lineToRelative(0.11f, 22f)
                lineToRelative(-6.5f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(14f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(-6.5f, 0f)
                lineToRelative(-0.11f, -22f)
                lineToRelative(6.61f, 0f)
                close()
            }
        }.also { _I = it}
