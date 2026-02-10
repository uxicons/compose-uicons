package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Br.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.43f, 4.2f)
            lineTo(14.73f, 0.76f)
            arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.46f, 0f)
            lineTo(3.57f, 4.2f)
            arcTo(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8.76f)
            verticalLineToRelative(6.49f)
            arcTo(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, 19.8f)
            horizontalLineToRelative(0f)
            lineToRelative(5.7f, 3.44f)
            arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.46f, 0f)
            lineToRelative(5.7f, -3.44f)
            arcTo(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 15.24f)
            lineTo(23f, 8.76f)
            arcTo(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.43f, 4.2f)
            close()
            moveTo(10.82f, 3.33f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.36f, 0f)
            lineTo(18.6f, 6.59f)
            lineTo(12f, 10.57f)
            lineTo(5.41f, 6.59f)
            close()
            moveTo(5.12f, 17.23f)
            arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15.24f)
            verticalLineToRelative(-6f)
            lineToRelative(6.5f, 3.92f)
            verticalLineToRelative(7.31f)
            close()
            moveTo(18.88f, 17.23f)
            lineTo(13.5f, 20.48f)
            lineTo(13.5f, 13.17f)
            lineTo(20f, 9.25f)
            verticalLineToRelative(6f)
            arcTo(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.88f, 17.23f)
            close()
        }
    }.also { _DiceD6 = it }
