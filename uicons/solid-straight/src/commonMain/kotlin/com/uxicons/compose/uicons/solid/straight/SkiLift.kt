package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiLift: ImageVector? = null

val Icons.Ss.SkiLift: ImageVector
    get() = _SkiLift ?: UXIcon(name = "SkiLift") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.73f, 12.96f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, 2.22f)
                lineToRelative(-18.8f, 8.46f)
                lineTo(2f, 21.81f)
                lineToRelative(12.15f, -5.47f)
                lineToRelative(-1.35f, -2.82f)
                lineToRelative(-2.63f, 1.14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.29f, 13.3f)
                lineToRelative(-1.37f, -3.3f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.3f, -2.65f)
                lineToRelative(1.13f, 2.52f)
                lineTo(7.7f, 11.5f)
                lineToRelative(0.4f, 0.96f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.26f, 0.37f)
                lineToRelative(4.41f, -1.91f)
                lineToRelative(2.2f, 4.6f)
                lineToRelative(4.83f, -2.17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.02f, -2.64f)
                lineTo(23.65f, 9.9f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.73f, 12.96f)
                close()
                moveTo(2.74f, 15.14f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.71f, 3.32f)
                lineToRelative(0.72f, -1.87f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.53f, 14.26f)
                lineTo(1.92f, 8f)
                lineTo(0.08f, 8.77f)
                close()
                moveTo(15f, 0f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5.5f, 5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5f)
                close()
            }
        }.also { _SkiLift = it}
