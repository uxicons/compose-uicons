package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Key: ImageVector? = null

val Icons.Bs.Key: ImageVector
    get() = _Key ?: UXIcon(name = "Key") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-3.31f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.47f, 1.02f)
                lineToRelative(-7.01f, 7.01f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, 0.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.87f, 9.87f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, -2.93f)
                lineToRelative(1.04f, -1.16f)
                verticalLineToRelative(-2.07f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.96f)
                lineToRelative(1.01f, -0.72f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.02f, -2.47f)
                verticalLineToRelative(-3.31f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -2.5f)
                close()
                moveTo(21f, 5.81f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.04f, 0.19f)
                horizontalLineToRelative(-3.96f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.93f)
                lineToRelative(-1.32f, 1.36f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 1.71f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, -5f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.68f, 0.31f)
                lineToRelative(8.16f, -8.16f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.35f, -0.15f)
                horizontalLineToRelative(2.81f)
                close()
                moveTo(5f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
            }
        }.also { _Key = it}
