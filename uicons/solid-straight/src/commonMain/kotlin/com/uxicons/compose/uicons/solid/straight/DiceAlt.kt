package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceAlt: ImageVector? = null

val Icons.Ss.DiceAlt: ImageVector
    get() = _DiceAlt ?: UXIcon(name = "DiceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                lineTo(12f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(9f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                close()
                moveTo(14f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                close()
                moveTo(19f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                close()
                moveTo(11.48f, 0.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(0.96f, 7.16f)
                arcTo(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.05f, 8.8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, 2.69f)
                lineTo(7f, 17.61f)
                lineTo(7f, 12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(5.61f)
                close()
                moveTo(5f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10f)
                close()
                moveTo(10f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5f)
                close()
            }
        }.also { _DiceAlt = it}
