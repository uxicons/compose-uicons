package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Rr.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.71f, 8.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 0f)
                lineToRelative(-4.58f, 4.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, 0f)
                lineTo(6.71f, 8.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                lineToRelative(4.59f, 4.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(4.59f, -4.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.71f, 8.21f)
                close()
            }
        }.also { _AngleSmallDown = it}
