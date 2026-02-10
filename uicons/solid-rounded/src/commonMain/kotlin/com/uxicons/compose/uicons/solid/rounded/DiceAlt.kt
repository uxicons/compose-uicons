package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceAlt: ImageVector? = null

val Icons.Sr.DiceAlt: ImageVector
    get() = _DiceAlt ?: UXIcon(name = "DiceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                lineTo(14f, 9f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 14f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                close()
                moveTo(14f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                close()
                moveTo(19f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                close()
                moveTo(15.6f, 5f)
                lineTo(12.07f, 1.46f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 1.46f)
                lineTo(1.46f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.07f)
                lineTo(5f, 15.6f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1.22f)
                lineTo(7f, 14f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, -7f)
                horizontalLineToRelative(2.83f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.6f, 5f)
                close()
                moveTo(5f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10f)
                close()
                moveTo(9f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                close()
            }
        }.also { _DiceAlt = it}
