package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleUp: ImageVector? = null

val Icons.Rr.AngleUp: ImageVector
    get() = _AngleUp ?: UXIcon(name = "AngleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 16.29f)
                lineTo(15.54f, 8.12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.08f, 0f)
                lineTo(0.29f, 16.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 1.42f)
                lineTo(9.88f, 9.54f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.71f, 16.29f)
                close()
            }
        }.also { _AngleUp = it}
