package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocation: ImageVector? = null

val Icons.Br.HomeLocation: ImageVector
    get() = _HomeLocation ?: UXIcon(name = "HomeLocation") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.66f, 5.42f)
            lineTo(14.97f, 0.91f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.95f, 0f)
            lineTo(2.34f, 5.42f)
            arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.83f)
            verticalLineToRelative(8.86f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 24f)
            lineTo(18.68f, 24f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.68f)
            lineTo(24f, 9.83f)
            arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.66f, 5.42f)
            close()
            moveTo(21f, 18.68f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.68f, 21f)
            lineTo(5.32f, 21f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.68f)
            lineTo(3f, 9.83f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.02f, 7.91f)
            lineTo(10.7f, 3.4f)
            arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.59f, 0f)
            lineToRelative(6.68f, 4.51f)
            arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.83f)
            close()
            moveTo(12f, 8f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 8.54f)
            lineToRelative(2.65f, 2.59f)
            arcToRelative(1.27f, 1.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 0f)
            lineToRelative(2.65f, -2.59f)
            arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
            close()
            moveTo(12f, 14.55f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, -1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.55f)
            close()
        }
    }.also { _HomeLocation = it }
