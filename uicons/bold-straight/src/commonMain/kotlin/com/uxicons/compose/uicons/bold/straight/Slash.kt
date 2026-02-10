package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Slash: ImageVector? = null

val Icons.Bs.Slash: ImageVector
    get() = _Slash ?: UXIcon(name = "Slash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.04f, 2.16f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(-2.12f, 2.12f)
                close()
            }
        }.also { _Slash = it}
