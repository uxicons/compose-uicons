package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Bs.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.36f)
                lineTo(6.65f, 12f)
                lineToRelative(17.35f, 8.64f)
                verticalLineToRelative(3.36f)
                lineTo(0f, 12f)
                lineTo(24f, 0f)
                verticalLineToRelative(3.36f)
                close()
            }
        }.also { _LessThan = it}
