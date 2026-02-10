package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plus: ImageVector? = null

val Icons.Rs.Plus: ImageVector
    get() = _Plus ?: UXIcon(name = "Plus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                lineToRelative(-11f, 0f)
                lineToRelative(0f, -11f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 11f)
                lineToRelative(-11f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(11f, 0f)
                lineToRelative(0f, 11f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -11f)
                lineToRelative(11f, 0f)
                lineToRelative(0f, -2f)
                close()
            }
        }.also { _Plus = it}
