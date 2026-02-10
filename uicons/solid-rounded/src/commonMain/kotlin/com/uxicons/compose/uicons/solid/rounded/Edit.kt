package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Edit: ImageVector? = null

val Icons.Sr.Edit: ImageVector
    get() = _Edit ?: UXIcon(name = "Edit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 19f)
                verticalLineToRelative(4.7f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.88f, -1.16f)
                lineToRelative(2.66f, -2.66f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.7f, 18f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.17f, 13.83f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16.66f)
                verticalLineTo(18f)
                horizontalLineTo(7.34f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -1.17f)
                lineTo(21.5f, 5.5f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.95f)
                arcToRelative(4.09f, 4.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.08f, 1.96f)
                lineTo(11.59f, 18.24f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.34f, 20f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(16.66f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.76f, -4.24f)
                lineTo(17.09f, 1.09f)
                arcTo(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.04f, 0f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.04f, 0f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(5f)
                verticalLineTo(5f)
                curveTo(24f, 4.98f, 24f, 4.97f, 24f, 4.95f)
                close()
            }
        }.also { _Edit = it}
