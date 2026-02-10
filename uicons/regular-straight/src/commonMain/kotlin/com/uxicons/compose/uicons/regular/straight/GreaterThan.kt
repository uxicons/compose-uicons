package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThan: ImageVector? = null

val Icons.Rs.GreaterThan: ImageVector
    get() = _GreaterThan ?: UXIcon(name = "GreaterThan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                lineToRelative(-24f, -12f)
                lineToRelative(0f, 2.25f)
                lineToRelative(19.53f, 9.75f)
                lineToRelative(-19.53f, 9.86f)
                lineToRelative(0f, 2.14f)
                lineToRelative(24f, -12f)
                close()
            }
        }.also { _GreaterThan = it}
