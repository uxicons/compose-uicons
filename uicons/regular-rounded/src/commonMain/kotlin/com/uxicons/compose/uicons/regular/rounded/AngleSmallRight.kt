package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallRight: ImageVector? = null

val Icons.Rr.AngleSmallRight: ImageVector
    get() = _AngleSmallRight ?: UXIcon(name = "AngleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.4f, 9.88f)
                lineTo(10.81f, 5.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.42f)
                lineTo(14f, 11.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.42f)
                lineTo(9.4f, 17.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.42f)
                lineToRelative(4.59f, -4.59f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.4f, 9.88f)
                close()
            }
        }.also { _AngleSmallRight = it}
