package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ts7: ImageVector? = null

val Icons.Ts.Ts7: ImageVector
    get() = _Ts7 ?: UXIcon(name = "Ts7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.89f, 24.0f)
                lineToRelative(-0.88f, -0.47f)
                lineToRelative(11.99f, -22.54f)
                lineToRelative(-14.99f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(16f, 0f)
                lineToRelative(0f, 1.24f)
                lineToRelative(-12.11f, 22.77f)
                close()
            }
        }.also { _Ts7 = it}
