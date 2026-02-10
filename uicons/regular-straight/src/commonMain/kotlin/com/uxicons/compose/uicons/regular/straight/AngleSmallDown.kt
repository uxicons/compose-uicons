package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Rs.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.5f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -0.58f)
                lineTo(5.29f, 9.62f)
                lineTo(6.71f, 8.21f)
                lineTo(12f, 13.5f)
                lineToRelative(5.29f, -5.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-5.29f, 5.29f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.5f)
                close()
            }
        }.also { _AngleSmallDown = it}
