package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Slash: ImageVector? = null

val Icons.Rs.Slash: ImageVector
    get() = _Slash ?: UXIcon(name = "Slash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(-0.01f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(22.6f, 22.6f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _Slash = it}
