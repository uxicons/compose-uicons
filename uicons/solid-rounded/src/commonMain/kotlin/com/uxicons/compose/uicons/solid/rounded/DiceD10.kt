package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Sr.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.81f, 11.64f)
                lineToRelative(-2.8f, 2.1f)
                lineTo(9.19f, 11.64f)
                lineToRelative(2.81f, -7.72f)
                close()
                moveTo(7.26f, 11.11f)
                lineTo(11.07f, 0.66f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 0f)
                horizontalLineToRelative(0f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.91f, 1.46f)
                lineTo(1.99f, 9.71f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12.15f)
                close()
                moveTo(12.95f, 0.66f)
                lineTo(16.74f, 11.11f)
                lineTo(23f, 12.15f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.01f, -2.47f)
                lineTo(15.1f, 1.47f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.95f, 0.66f)
                close()
                moveTo(11.01f, 15.5f)
                lineTo(7.74f, 13.06f)
                lineTo(1.17f, 14.15f)
                arcToRelative(5.11f, 5.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 2.04f)
                lineToRelative(6.79f, 6.72f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.01f, 24f)
                close()
                moveTo(16.26f, 13.06f)
                lineTo(13.01f, 15.5f)
                lineTo(13.01f, 24f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, -1.08f)
                lineTo(21.7f, 16.15f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, -2f)
                close()
            }
        }.also { _DiceD10 = it}
