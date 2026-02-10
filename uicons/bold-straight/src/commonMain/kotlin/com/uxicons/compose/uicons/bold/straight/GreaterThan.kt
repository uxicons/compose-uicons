package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThan: ImageVector? = null

val Icons.Bs.GreaterThan: ImageVector
    get() = _GreaterThan ?: UXIcon(name = "GreaterThan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 20.64f)
                lineToRelative(17.35f, -8.64f)
                lineToRelative(-17.35f, -8.64f)
                lineToRelative(0f, -3.36f)
                lineToRelative(24f, 12f)
                lineToRelative(-24f, 12f)
                lineToRelative(0f, -3.36f)
                close()
            }
        }.also { _GreaterThan = it}
