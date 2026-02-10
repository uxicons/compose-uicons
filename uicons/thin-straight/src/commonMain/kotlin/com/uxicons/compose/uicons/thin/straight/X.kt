package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _X: ImageVector? = null

val Icons.Ts.X: ImageVector
    get() = _X ?: UXIcon(name = "X") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.66f, 0f)
                lineToRelative(-8.66f, 11.18f)
                lineToRelative(-8.66f, -11.18f)
                lineToRelative(-1.26f, 0f)
                lineToRelative(9.29f, 12f)
                lineToRelative(-9.29f, 12f)
                lineToRelative(1.26f, 0f)
                lineToRelative(8.66f, -11.18f)
                lineToRelative(8.66f, 11.18f)
                lineToRelative(1.26f, 0f)
                lineToRelative(-9.29f, -12f)
                lineToRelative(9.29f, -12f)
                lineToRelative(-1.26f, 0f)
                close()
            }
        }.also { _X = it}
