package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _7: ImageVector? = null

val Icons.Bs.Seven: ImageVector
    get() = _7 ?: UXIcon(name = "7") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.83f, 23.92f)
            lineToRelative(-2.66f, -1.39f)
            lineToRelative(10.18f, -19.54f)
            lineToRelative(-12.35f, 0f)
            lineToRelative(0f, -3f)
            lineToRelative(16f, 0f)
            lineToRelative(0f, 2.48f)
            lineToRelative(-11.17f, 21.44f)
            close()
        }
    }.also { _7 = it }
