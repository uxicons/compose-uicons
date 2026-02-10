package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Key: ImageVector? = null

val Icons.Br.Key: ImageVector
    get() = _Key ?: UXIcon(name = "Key") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.5f, 16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
            close()
            moveTo(9.5f, 23.86f)
            arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.07f, -5.26f)
            arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -3.85f)
            lineToRelative(0.68f, -0.69f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.43f, -1.06f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1.25f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, -1.52f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.42f, -2.63f)
            arcToRelative(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.34f, -3.85f)
            arcToRelative(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.89f, 1.61f)
            lineToRelative(-6.5f, 6.5f)
            arcToRelative(7.78f, 7.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.84f, 0.33f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.63f, 15.56f)
            arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.48f, -0.14f)
            close()
            moveTo(9.31f, 11.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.46f, -0.39f)
            lineToRelative(7.08f, -7.08f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.77f, -0.73f)
            arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.36f, 1.15f)
            arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, 0.85f)
            horizontalLineToRelative(-1.41f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 2.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 2.5f)
            verticalLineToRelative(1.88f)
            lineToRelative(-0.82f, 0.83f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, 1.46f)
            arcToRelative(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.07f, 2.96f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.36f, -6.35f)
            arcToRelative(4.9f, 4.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, -0.27f)
            arcToRelative(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.36f, 0.19f)
            close()
        }
    }.also { _Key = it }
