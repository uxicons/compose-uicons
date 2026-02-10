package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Rr.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(19.13f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.57f, -1.45f)
                lineTo(15.19f, 9.28f)
                lineTo(13.71f, 12.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, -0.76f)
                lineTo(13.55f, 8f)
                horizontalLineTo(11.62f)
                lineTo(9.55f, 13.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.39f, 1.23f)
                lineToRelative(4.59f, 2.9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(18.55f)
                lineToRelative(-4.13f, -2.6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.7f, 12.27f)
                lineTo(9.45f, 8f)
                horizontalLineTo(7.24f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.89f, 0.55f)
                lineTo(4.89f, 11.45f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.79f, -0.89f)
                lineToRelative(1.45f, -2.9f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 6f)
                horizontalLineToRelative(6.62f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.43f, 7.45f)
                lineToRelative(1.84f, 3.06f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.13f, 11f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                close()
                moveTo(7.88f, 16.81f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, 0.56f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 18f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(5.65f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.79f, -1.89f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.88f, 16.81f)
                close()
                moveTo(15f, 5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                close()
            }
        }.also { _Running = it}
