package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sledding: ImageVector? = null

val Icons.Rr.Sledding: ImageVector
    get() = _Sledding ?: UXIcon(name = "Sledding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 21.73f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.24f, 1.88f)
                lineTo(0.57f, 14.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, -1.8f)
                lineToRelative(18.09f, 8.7f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.57f, -0.94f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, 0.86f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(7.57f)
                lineTo(8.71f, 11.06f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                horizontalLineToRelative(4.38f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.98f, 0.79f)
                lineToRelative(0.3f, 1.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.96f, -0.42f)
                lineToRelative(-0.3f, -1.42f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.38f, 14f)
                horizontalLineTo(11f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.91f, -0.58f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, -1.11f)
                lineToRelative(4.39f, -5.76f)
                lineToRelative(1.13f, 0.72f)
                arcToRelative(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, 1.47f)
                lineToRelative(-1.28f, 1.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, 1.23f)
                lineToRelative(1.28f, -1.64f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, -4.21f)
                arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, -0.12f)
                lineToRelative(-1.35f, -0.86f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.93f, 4f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                close()
                moveTo(18.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
                close()
            }
        }.also { _Sledding = it}
