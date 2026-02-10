package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hiking: ImageVector? = null

val Icons.Sr.Hiking: ImageVector
    get() = _Hiking ?: UXIcon(name = "Hiking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.61f, 19.2f)
                lineToRelative(-0.6f, 3.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 0.8f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.2f, -0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.78f, -1.18f)
                lineToRelative(0.6f, -3.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.96f, 0.4f)
                close()
                moveTo(10f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2.5f)
                close()
                moveTo(20f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineTo(16.62f)
                lineTo(15.45f, 7.66f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.76f, 6f)
                horizontalLineTo(10.42f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.94f, 7.23f)
                lineToRelative(-1.05f, 5.76f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.2f, 16.08f)
                lineTo(13f, 18.54f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, -0.84f)
                lineToRelative(-1.21f, -0.78f)
                lineToRelative(1.13f, -6.21f)
                lineToRelative(0.64f, 1.27f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                horizontalLineToRelative(3f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7f)
                close()
                moveTo(6.4f, 15.89f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.67f, 16f)
                arcTo(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.97f)
                arcTo(7.68f, 7.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.07f, 6.68f)
                lineTo(5.91f, 12.61f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 15.89f)
                close()
            }
        }.also { _Hiking = it}
