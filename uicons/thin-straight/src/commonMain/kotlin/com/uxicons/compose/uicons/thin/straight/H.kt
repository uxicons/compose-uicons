package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H: ImageVector? = null

val Icons.Ts.H: ImageVector
    get() = _H ?: UXIcon(name = "H") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineToRelative(0f, 12f)
                lineToRelative(-18f, 0f)
                lineToRelative(0f, -12f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, 24f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -11f)
                lineToRelative(18f, 0f)
                lineToRelative(0f, 11f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -24f)
                lineToRelative(-1f, 0f)
                close()
            }
        }.also { _H = it}
