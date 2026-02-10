package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microphone: ImageVector? = null

val Icons.Sr.Microphone: ImageVector
    get() = _Microphone ?: UXIcon(name = "Microphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(4.07f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.86f, 0f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(5f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4.93f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.07f, 7f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
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
