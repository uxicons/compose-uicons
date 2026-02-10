package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallLeft: ImageVector? = null

val Icons.Sr.AngleSmallLeft: ImageVector
    get() = _AngleSmallLeft ?: UXIcon(name = "AngleSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.96f, 12.35f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.71f)
                lineToRelative(4.59f, -4.58f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
                lineTo(8.84f, 9.53f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(4.59f, 4.59f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
                close()
            }
        }.also { _AngleSmallLeft = it}
