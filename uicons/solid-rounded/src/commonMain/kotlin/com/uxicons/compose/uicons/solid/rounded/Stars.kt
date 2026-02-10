package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stars: ImageVector? = null

val Icons.Sr.Stars: ImageVector
    get() = _Stars ?: UXIcon(name = "Stars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 24f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, -0.56f)
                lineTo(9.99f, 21.27f)
                lineTo(7.28f, 23.42f)
                arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.35f, 0.04f)
                arcTo(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, 20.3f)
                lineToRelative(0.95f, -3.28f)
                lineTo(1.17f, 15.11f)
                arcTo(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.82f, 10f)
                horizontalLineTo(6.25f)
                lineTo(7.3f, 6.61f)
                arcTo(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.68f, 6.6f)
                lineTo(13.73f, 10f)
                horizontalLineToRelative(3.43f)
                arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, 5.1f)
                lineToRelative(-2.68f, 1.92f)
                lineToRelative(0.95f, 3.31f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.04f, 3.12f)
                arcTo(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.4f, 24f)
                close()
                moveTo(20f, 7.15f)
                lineToRelative(1.48f, 1.09f)
                arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.25f, -0.9f)
                lineToRelative(-0.57f, -1.77f)
                lineToRelative(1.51f, -1.1f)
                arcTo(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.19f, 3f)
                horizontalLineTo(21.33f)
                lineToRelative(-0.56f, -1.76f)
                arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, 0f)
                lineTo(18.67f, 3f)
                horizontalLineTo(16.81f)
                arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.48f, 1.46f)
                lineToRelative(1.51f, 1.1f)
                lineToRelative(-0.57f, 1.77f)
                arcToRelative(0.79f, 0.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, 0.91f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, -0.01f)
                close()
            }
        }.also { _Stars = it}
