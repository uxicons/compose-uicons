package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badge: ImageVector? = null

val Icons.Sr.Badge: ImageVector
    get() = _Badge ?: UXIcon(name = "Badge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                close()
                moveTo(12f, 18f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -2.02f)
                verticalLineToRelative(5.52f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, 1.95f)
                lineToRelative(1.63f, -1.3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.62f, 0f)
                lineToRelative(1.63f, 1.3f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, -1.95f)
                verticalLineToRelative(-5.52f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 2.02f)
                close()
            }
        }.also { _Badge = it}
