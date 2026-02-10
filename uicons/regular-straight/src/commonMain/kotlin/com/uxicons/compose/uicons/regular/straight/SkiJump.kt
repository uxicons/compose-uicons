package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiJump: ImageVector? = null

val Icons.Rs.SkiJump: ImageVector
    get() = _SkiJump ?: UXIcon(name = "SkiJump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.74f, 12.26f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, 2.26f)
                lineTo(0.83f, 23.93f)
                lineTo(0f, 22.1f)
                lineToRelative(4.97f, -2.24f)
                verticalLineTo(12.02f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.86f, 9.9f)
                lineTo(9.76f, 6f)
                horizontalLineTo(1.98f)
                verticalLineTo(4f)
                horizontalLineToRelative(9.96f)
                lineTo(14f, 5.72f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, 4.34f)
                lineToRelative(0f, -0.01f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.02f, -0.02f, 0.03f)
                lineToRelative(-5.1f, 4.79f)
                verticalLineTo(12.13f)
                lineToRelative(3.71f, -3.49f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, -1.43f)
                lineToRelative(-0.71f, -0.59f)
                lineTo(7.27f, 11.31f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, 0.71f)
                verticalLineToRelative(6.94f)
                lineTo(20.84f, 12.7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, -2.65f)
                lineTo(23.6f, 9.2f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.74f, 12.26f)
                close()
                moveTo(16.48f, 5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.48f, 5f)
                close()
            }
        }.also { _SkiJump = it}
