package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceAlt: ImageVector? = null

val Icons.Br.DiceAlt: ImageVector
    get() = _DiceAlt ?: UXIcon(name = "DiceAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 9f)
            horizontalLineToRelative(-4f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14.5f)
            verticalLineToRelative(4f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 24f)
            horizontalLineToRelative(4f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            verticalLineToRelative(-4f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 9f)
            close()
            moveTo(21f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            horizontalLineToRelative(-4f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18.5f)
            verticalLineToRelative(-4f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 12f)
            horizontalLineToRelative(4f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14.5f)
            close()
            moveTo(6.66f, 13.24f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.54f, 15.36f)
            lineToRelative(-2.9f, -2.9f)
            arcToRelative(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.92f)
            lineToRelative(2.9f, -2.9f)
            arcToRelative(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.92f, 0f)
            lineToRelative(2.9f, 2.9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.12f, 2.12f)
            lineToRelative(-2.9f, -2.9f)
            arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.68f, 0f)
            lineToRelative(-2.9f, 2.9f)
            arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.68f)
            close()
            moveTo(16f, 14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 13f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 14.5f)
            close()
            moveTo(8.5f, 10f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 10f)
            close()
            moveTo(20f, 18.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18.5f)
            close()
        }
    }.also { _DiceAlt = it }
