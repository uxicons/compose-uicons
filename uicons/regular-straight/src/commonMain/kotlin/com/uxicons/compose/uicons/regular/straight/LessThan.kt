package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Rs.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.25f)
                lineTo(4.47f, 12f)
                lineToRelative(19.53f, 9.86f)
                verticalLineToRelative(2.14f)
                lineTo(0f, 12f)
                lineTo(24f, 0f)
                verticalLineToRelative(2.25f)
                close()
            }
        }.also { _LessThan = it}
