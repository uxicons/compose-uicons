package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Sr.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 5.32f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.18f, -1f)
                lineToRelative(6f, -3.6f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.14f, 0f)
                lineToRelative(6f, 3.6f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.18f, 1f)
                lineTo(12f, 11.17f)
                close()
                moveTo(13f, 12.9f)
                lineTo(13f, 23.89f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, -0.6f)
                lineToRelative(6f, -3.6f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 15.4f)
                lineTo(23f, 8.6f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.26f, -1.54f)
                close()
                moveTo(11f, 12.9f)
                lineTo(1.26f, 7.06f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, 4.29f)
                lineToRelative(6f, 3.6f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, 0.6f)
                close()
            }
        }.also { _DiceD6 = it}
