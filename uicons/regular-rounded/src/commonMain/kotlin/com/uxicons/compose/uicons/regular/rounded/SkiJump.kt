package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiJump: ImageVector? = null

val Icons.Rr.SkiJump: ImageVector
    get() = _SkiJump ?: UXIcon(name = "SkiJump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.76f, 12.27f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, 2.26f)
                lineTo(1.42f, 23.91f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.84f, -1.82f)
                lineToRelative(4.43f, -2.05f)
                curveTo(5.01f, 20.03f, 5f, 20.02f, 5f, 20f)
                verticalLineTo(13.27f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.76f, 9.02f)
                lineTo(9.78f, 6f)
                horizontalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 4f)
                horizontalLineToRelative(8.51f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.57f, 0.93f)
                lineToRelative(0.95f, 0.79f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, 4.34f)
                lineToRelative(-3.43f, 3.43f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(3.43f, -3.43f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, -1.43f)
                lineToRelative(-0.71f, -0.59f)
                lineTo(8.17f, 10.44f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 13.27f)
                verticalLineTo(19.12f)
                lineToRelative(13.85f, -6.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.96f, -2.66f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.81f, -0.85f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.76f, 12.27f)
                close()
                moveTo(16.5f, 4.98f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 4.98f)
                close()
            }
        }.also { _SkiJump = it}
