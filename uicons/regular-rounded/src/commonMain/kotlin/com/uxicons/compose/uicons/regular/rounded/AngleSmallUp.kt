package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallUp: ImageVector? = null

val Icons.Rr.AngleSmallUp: ImageVector
    get() = _AngleSmallUp ?: UXIcon(name = "AngleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -0.29f)
                lineToRelative(-4.58f, -4.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 0f)
                lineTo(6.71f, 15.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, -1.42f)
                lineTo(9.88f, 9.21f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                lineToRelative(4.59f, 4.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.42f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.5f)
                close()
            }
        }.also { _AngleSmallUp = it}
