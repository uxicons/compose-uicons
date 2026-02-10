package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Rs.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.99f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(8.01f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(4.8f, 18.0f)
                lineTo(12f, 24f)
                lineTo(12f, 0f)
                lineTo(4.8f, 5.99f)
                close()
                moveTo(10f, 4.27f)
                lineTo(10f, 19.73f)
                lineTo(5.53f, 16.01f)
                lineTo(2f, 16.01f)
                lineTo(2f, 7.99f)
                lineTo(5.53f, 7.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5.01f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.01f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.98f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.02f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -18.03f)
                close()
            }
        }.also { _Volume = it}
