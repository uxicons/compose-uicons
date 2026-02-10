package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Ss.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(4.8f)
                lineTo(12f, 23.98f)
                verticalLineTo(0.02f)
                lineTo(4.8f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineToRelative(1f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
                close()
            }
        }.also { _Volume = it}
