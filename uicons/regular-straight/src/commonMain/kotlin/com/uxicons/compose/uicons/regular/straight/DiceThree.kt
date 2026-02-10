package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceThree: ImageVector? = null

val Icons.Rs.DiceThree: ImageVector
    get() = _DiceThree ?: UXIcon(name = "DiceThree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineTo(21f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(2f, 22f)
                lineTo(22f, 22f)
                lineTo(22f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(3f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                close()
                moveTo(11f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12f)
                close()
                moveTo(6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                close()
                moveTo(16f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 17f)
                close()
            }
        }.also { _DiceThree = it}
