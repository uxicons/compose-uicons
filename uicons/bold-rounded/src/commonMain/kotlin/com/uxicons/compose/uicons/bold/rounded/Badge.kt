package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badge: ImageVector? = null

val Icons.Br.Badge: ImageVector
    get() = _Badge ?: UXIcon(name = "Badge") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.1f, 8f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.1f, 5.16f)
            verticalLineToRelative(7.99f)
            arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.63f, 2.23f)
            lineToRelative(1.37f, -1.1f)
            lineToRelative(1.37f, 1.1f)
            arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.63f, -2.23f)
            verticalLineToRelative(-7.76f)
            arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, -5.39f)
            close()
            moveTo(12.1f, 3f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 5f)
            arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
            close()
            moveTo(13.31f, 19.49f)
            arcToRelative(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.63f, 0f)
            lineToRelative(-1.68f, 1.35f)
            verticalLineToRelative(-5.46f)
            arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0.08f)
            verticalLineToRelative(5.39f)
            close()
        }
    }.also { _Badge = it }
