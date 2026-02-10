package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picture: ImageVector? = null

val Icons.Ss.Picture: ImageVector
    get() = _Picture ?: UXIcon(name = "Picture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.29f, 11.12f)
                lineTo(0f, 19.41f)
                verticalLineTo(24f)
                horizontalLineTo(22.59f)
                lineTo(9.71f, 11.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.29f, 11.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.12f, 9.71f)
                lineTo(24f, 22.59f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(16.59f)
                lineTo(6.88f, 9.71f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.12f, 9.71f)
                close()
                moveTo(18f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
        }.also { _Picture = it}
