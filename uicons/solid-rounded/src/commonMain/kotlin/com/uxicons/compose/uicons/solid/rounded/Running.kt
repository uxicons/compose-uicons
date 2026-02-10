package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Sr.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 5f)
                close()
                moveTo(22f, 11f)
                horizontalLineTo(19.13f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, -0.48f)
                lineTo(16.43f, 7.45f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.86f, 6f)
                horizontalLineTo(7.24f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.55f, 7.66f)
                lineToRelative(-1.45f, 2.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.79f, 0.89f)
                lineTo(6.34f, 8.55f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 8f)
                horizontalLineTo(9.45f)
                lineTo(7.7f, 12.27f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 3.67f)
                lineToRelative(4.12f, 2.6f)
                verticalLineTo(23f)
                arcTo(1.0f, 1.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 23f)
                verticalLineTo(18f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, -0.84f)
                lineTo(12.49f, 15.87f)
                lineToRelative(2.7f, -6.59f)
                lineToRelative(1.37f, 2.27f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.13f, 13f)
                horizontalLineTo(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(8.43f, 18.11f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 20f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(5.65f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.93f, -0.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.86f, 0.74f)
                close()
            }
        }.also { _Running = it}
