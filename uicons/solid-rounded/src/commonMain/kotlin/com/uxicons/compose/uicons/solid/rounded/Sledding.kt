package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sledding: ImageVector? = null

val Icons.Sr.Sledding: ImageVector
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
                moveTo(16f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.5f)
                close()
                moveTo(3f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineToRelative(7.93f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.69f, 0.79f)
                reflectiveCurveToRelative(1.45f, 0.94f, 1.5f, 0.98f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, 4.21f)
                lineTo(13.62f, 14f)
                horizontalLineToRelative(1.77f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 2.37f)
                lineToRelative(0.3f, 1.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.77f, 1.19f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.21f, 0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, -0.79f)
                lineToRelative(-0.3f, -1.42f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.38f, 16f)
                horizontalLineTo(11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.29f, -4.94f)
                lineTo(11.97f, 6f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5f)
                close()
            }
        }.also { _Sledding = it}
