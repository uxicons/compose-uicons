package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayingCards: ImageVector? = null

val Icons.Br.PlayingCards: ImageVector
    get() = _PlayingCards ?: UXIcon(name = "PlayingCards") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.17f, 2f)
            lineTo(14.9f, 0.24f)
            arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, 3.62f)
            lineTo(8f, 4f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.5f)
            verticalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(5f)
            arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.27f, -2.04f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.95f, -3.86f)
            lineTo(23.8f, 8.8f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.17f, 2f)
            close()
            moveTo(13f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 21f)
            horizontalLineToRelative(-5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 7f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 9.5f)
            close()
            moveTo(20.94f, 7.9f)
            lineTo(17.85f, 17.21f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.87f, 1.73f)
            curveToRelative(0.01f, -0.15f, 0.02f, -0.29f, 0.02f, -0.44f)
            verticalLineToRelative(-9f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.74f, -5.44f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.99f, 3.1f)
            lineToRelative(5.27f, 1.76f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.94f, 7.9f)
            close()
            moveTo(12f, 13f)
            curveToRelative(0f, 1.45f, -1.54f, 3.39f, -2.71f, 4.38f)
            arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.57f, 0f)
            curveTo(5.54f, 16.39f, 4f, 14.45f, 4f, 13f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            close()
        }
    }.also { _PlayingCards = it }
