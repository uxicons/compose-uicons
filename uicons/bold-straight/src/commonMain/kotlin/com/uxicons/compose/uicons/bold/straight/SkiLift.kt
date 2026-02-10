package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiLift: ImageVector? = null

val Icons.Bs.SkiLift: ImageVector
    get() = _SkiLift ?: UXIcon(name = "SkiLift") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 13.13f)
                arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.37f, 2.5f)
                lineToRelative(-18.8f, 8.46f)
                lineTo(1.3f, 21.36f)
                lineTo(13.93f, 15.67f)
                lineToRelative(-0.98f, -2.03f)
                lineToRelative(-2.74f, 1.18f)
                arcToRelative(2.61f, 2.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.27f, -1.26f)
                lineTo(5.27f, 9.77f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.7f, -2.35f)
                lineToRelative(1.57f, 3.62f)
                lineTo(14.41f, 9.74f)
                lineToRelative(2.26f, 4.7f)
                lineTo(20.1f, 12.9f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, -1.98f)
                lineToRelative(2.74f, -1.22f)
                arcTo(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.7f, 13.13f)
                close()
                moveTo(2.29f, 15.37f)
                arcTo(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.2f, 18.42f)
                lineToRelative(1.5f, -2.6f)
                arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.72f, -1.77f)
                lineTo(2.76f, 8.71f)
                lineTo(-0.01f, 9.86f)
                close()
                moveTo(16f, 0f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(5.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5f)
                close()
            }
        }.also { _SkiLift = it}
