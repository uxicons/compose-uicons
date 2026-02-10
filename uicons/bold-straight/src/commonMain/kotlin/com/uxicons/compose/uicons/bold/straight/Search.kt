package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Bs.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.9f, 16.78f)
                arcTo(10.54f, 10.54f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.78f, 18.9f)
                lineToRelative(5.1f, 5.1f)
                lineTo(24f, 21.88f)
                close()
                moveTo(10.5f, 18f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 10.5f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 18f)
                close()
            }
        }.also { _Search = it}
