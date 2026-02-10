package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y: ImageVector? = null

val Icons.Ts.Y: ImageVector
    get() = _Y ?: UXIcon(name = "Y") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.92f, 0f)
                lineToRelative(-1.26f, 0f)
                lineToRelative(-8.66f, 11.18f)
                lineToRelative(-8.66f, -11.18f)
                lineToRelative(-1.26f, 0f)
                lineToRelative(9.42f, 12.17f)
                lineToRelative(0f, 11.83f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -11.83f)
                lineToRelative(9.42f, -12.17f)
                close()
            }
        }.also { _Y = it}
