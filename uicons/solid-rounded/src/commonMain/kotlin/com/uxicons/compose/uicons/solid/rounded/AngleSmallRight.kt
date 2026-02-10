package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallRight: ImageVector? = null

val Icons.Sr.AngleSmallRight: ImageVector
    get() = _AngleSmallRight ?: UXIcon(name = "AngleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.75f, 9.53f)
                lineTo(11.16f, 4.94f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.04f, 7.06f)
                lineToRelative(4.59f, 4.58f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.71f)
                lineTo(9.04f, 16.94f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
                lineToRelative(4.59f, -4.59f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 9.53f)
                close()
            }
        }.also { _AngleSmallRight = it}
