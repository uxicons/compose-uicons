package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Slash: ImageVector? = null

val Icons.Ts.Slash: ImageVector
    get() = _Slash ?: UXIcon(name = "Slash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(-0.01f, 0.7f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(23.3f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _Slash = it}
