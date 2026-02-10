package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wind: ImageVector? = null

val Icons.Br.Wind: ImageVector
    get() = _Wind ?: UXIcon(name = "Wind") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 13f)
            horizontalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 13f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 13f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7.47f)
            arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, -1.94f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 7.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 9f)
            curveToRelative(-2.77f, -0.32f, -1.18f, -4.22f, 0.26f, -5.31f)
            arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 7.43f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 13f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 8f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(7f)
            arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.07f, -0.78f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, -0.82f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, 0.09f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.86f, 1.6f)
            arcToRelative(4.12f, 4.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.31f, -0.12f)
            arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.86f, 3.27f)
            arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.59f, 24.01f)
            arcToRelative(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.71f, -1.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.32f, -1.9f)
            arcToRelative(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.54f, 0.11f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -1.26f)
            arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.44f, 18f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(15.44f)
            arcToRelative(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.58f, 3.68f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.43f, 5.33f)
            close()
        }
    }.also { _Wind = it }
