package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiJump: ImageVector? = null

val Icons.Ss.SkiJump: ImageVector
    get() = _SkiJump ?: UXIcon(name = "SkiJump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.76f, 12.27f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, 2.26f)
                lineTo(0.85f, 23.93f)
                lineTo(0.03f, 22.11f)
                lineTo(5f, 19.86f)
                verticalLineTo(11.74f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.88f, -2.12f)
                lineTo(9.78f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(9.96f)
                lineToRelative(1.06f, 1.07f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7.25f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 2.16f)
                lineToRelative(0f, -0.01f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.02f, -0.02f, 0.03f)
                lineTo(7f, 15.12f)
                verticalLineToRelative(3.84f)
                lineToRelative(13.86f, -6.25f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, -2.65f)
                lineToRelative(1.81f, -0.85f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.76f, 12.27f)
                close()
                moveTo(16.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 5f)
                close()
            }
        }.also { _SkiJump = it}
