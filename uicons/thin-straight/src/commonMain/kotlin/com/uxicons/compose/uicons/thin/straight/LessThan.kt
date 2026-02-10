package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Ts.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                lineToRelative(24f, -12f)
                lineToRelative(0f, 1.09f)
                lineToRelative(-21.76f, 10.91f)
                lineToRelative(21.76f, 10.88f)
                lineToRelative(0f, 1.12f)
                lineToRelative(-24f, -12f)
                close()
            }
        }.also { _LessThan = it}
