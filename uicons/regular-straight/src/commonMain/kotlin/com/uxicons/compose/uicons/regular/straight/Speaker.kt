package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speaker: ImageVector? = null

val Icons.Rs.Speaker: ImageVector
    get() = _Speaker ?: UXIcon(name = "Speaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(5f, 22f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                close()
                moveTo(12f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, -5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(12f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Speaker = it}
