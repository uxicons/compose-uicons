package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiJump: ImageVector? = null

val Icons.Bs.SkiJump: ImageVector
    get() = _SkiJump ?: UXIcon(name = "SkiJump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.73f, 12.31f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.33f, 2.54f)
                lineTo(1.26f, 23.97f)
                lineTo(0.03f, 21.24f)
                lineTo(5f, 18.98f)
                verticalLineTo(12.8f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.95f, -2.4f)
                lineTo(9.16f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(8.49f)
                lineToRelative(1.43f, 1.05f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, 5.01f)
                lineTo(8f, 15.06f)
                verticalLineToRelative(2.56f)
                lineToRelative(12.15f, -5.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.99f)
                lineToRelative(2.72f, -1.27f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.73f, 12.31f)
                close()
                moveTo(16.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 5f)
                close()
            }
        }.also { _SkiJump = it}
