package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fox: ImageVector? = null

val Icons.Ss.Fox: ImageVector
    get() = _Fox ?: UXIcon(name = "Fox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                verticalLineTo(8.02f)
                curveToRelative(-5.19f, 0.28f, -10.86f, 3.27f, -11f, 10.98f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                lineToRelative(0f, -1f)
                lineToRelative(0f, -0.01f)
                curveTo(11f, 12.03f, 6.03f, 9.41f, 3.14f, 8.48f)
                arcTo(10.54f, 10.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineTo(0f)
                horizontalLineTo(1f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 3.78f)
                arcTo(21.88f, 21.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcToRelative(21.87f, 21.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 0.78f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 0f)
                close()
                moveTo(21.49f, 10.35f)
                arcTo(11.26f, 11.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10.93f)
                arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.61f, 3.04f)
                arcTo(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 18.99f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(17.99f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.39f, -4.02f)
                arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10.93f)
                arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -0.94f)
                verticalLineToRelative(1.94f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.76f, 4.24f)
                lineToRelative(6.95f, 6.95f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.83f, 24f)
                horizontalLineToRelative(2.34f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineToRelative(6.95f, -6.95f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.93f)
                verticalLineTo(9.99f)
                arcTo(8.58f, 8.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.49f, 10.35f)
                close()
            }
        }.also { _Fox = it}
