package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Rr.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-5.97f, -5.97f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(5.97f, 5.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                close()
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                close()
            }
        }.also { _Search = it}
