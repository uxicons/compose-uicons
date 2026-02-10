package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Ss.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22.59f)
                lineToRelative(-6.26f, -6.26f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.42f, 1.42f)
                lineTo(22.59f, 24f)
                close()
            }
        }.also { _Search = it}
