package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Rs.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22.59f)
                lineToRelative(-6.26f, -6.26f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(22.59f, 24f)
                close()
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                close()
            }
        }.also { _Search = it}
