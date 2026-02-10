package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayAlt: ImageVector? = null

val Icons.Sr.PlayAlt: ImageVector
    get() = _PlayAlt ?: UXIcon(name = "PlayAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.82f, 11.71f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 0.29f)
                arcToRelative(0.31f, 0.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, 0.27f)
                lineToRelative(-5.37f, 2.69f)
                arcToRelative(0.34f, 0.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.29f)
                verticalLineToRelative(-5.32f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -0.29f)
                arcToRelative(0.31f, 0.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, -0.04f)
                arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 0.07f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                close()
                moveTo(16.99f, 12f)
                arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.23f, -2.06f)
                lineToRelative(-5.28f, -2.63f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 2.03f)
                verticalLineToRelative(5.32f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.16f, 2.02f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.19f, 0.32f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, -0.29f)
                lineToRelative(5.38f, -2.69f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, -2.03f)
                close()
            }
        }.also { _PlayAlt = it}
