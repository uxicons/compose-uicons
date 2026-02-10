package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD20: ImageVector? = null

val Icons.Br.DiceD20: ImageVector
    get() = _DiceD20 ?: UXIcon(name = "DiceD20") {
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
            moveTo(19.87f, 16.02f)
            lineTo(16.81f, 11.27f)
            lineTo(20f, 9.49f)
            verticalLineToRelative(5.75f)
            arcTo(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.87f, 16.02f)
            close()
            moveTo(18.81f, 6.72f)
            lineTo(15.29f, 8.68f)
            lineTo(12.28f, 3.02f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, 0.31f)
            close()
            moveTo(10.82f, 3.33f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -0.31f)
            lineTo(8.71f, 8.68f)
            lineTo(5.19f, 6.72f)
            close()
            moveTo(4.13f, 16.02f)
            arcTo(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15.24f)
            lineTo(4f, 9.49f)
            lineToRelative(3.19f, 1.77f)
            close()
            moveTo(5.12f, 17.23f)
            arcTo(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 17f)
            lineTo(12f, 17f)
            lineTo(8f, 10f)
            horizontalLineToRelative(8f)
            lineToRelative(-4f, 7f)
            lineTo(10.5f, 17f)
            lineToRelative(0f, 3.48f)
            close()
            moveTo(13.5f, 20.48f)
            lineTo(13.5f, 17f)
            horizontalLineToRelative(5.7f)
            arcToRelative(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.32f, 0.23f)
            close()
        }
    }.also { _DiceD20 = it }
