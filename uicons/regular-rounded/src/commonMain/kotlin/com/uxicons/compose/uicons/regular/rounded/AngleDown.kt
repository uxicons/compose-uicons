package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDown: ImageVector? = null

val Icons.Rr.AngleDown: ImageVector
    get() = _AngleDown ?: UXIcon(name = "AngleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17.17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.54f, -1.46f)
                lineTo(0.29f, 7.54f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.71f, 6.12f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(8.17f, -8.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.42f, 1.42f)
                lineToRelative(-8.17f, 8.17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17.17f)
                close()
            }
        }.also { _AngleDown = it}
