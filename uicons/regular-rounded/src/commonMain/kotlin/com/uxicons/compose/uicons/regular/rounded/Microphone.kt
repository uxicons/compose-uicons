package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microphone: ImageVector? = null

val Icons.Rr.Microphone: ImageVector
    get() = _Microphone ?: UXIcon(name = "Microphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8f)
                verticalLineToRelative(4f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                close()
                moveTo(12f, 2f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.91f, 5f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2.91f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.09f, 13f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                horizontalLineTo(6.09f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
                horizontalLineTo(11f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 24f)
                horizontalLineToRelative(2f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12f)
                close()
            }
        }.also { _Microphone = it}
