package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiJump: ImageVector? = null

val Icons.Sr.SkiJump: ImageVector
    get() = _SkiJump ?: UXIcon(name = "SkiJump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.76f, 12.27f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, 2.26f)
                lineTo(1.42f, 23.91f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.84f, -1.82f)
                lineTo(5f, 20.05f)
                verticalLineToRelative(-5.78f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.76f, -4.24f)
                lineTo(10.78f, 6f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4f)
                horizontalLineToRelative(8.51f)
                arcTo(3.28f, 3.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6.72f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 2.16f)
                reflectiveCurveTo(7.04f, 15.96f, 7f, 15.98f)
                verticalLineTo(19.12f)
                lineToRelative(13.85f, -6.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.96f, -2.66f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.81f, -0.85f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.76f, 12.27f)
                close()
                moveTo(16.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 5f)
                close()
            }
        }.also { _SkiJump = it}
