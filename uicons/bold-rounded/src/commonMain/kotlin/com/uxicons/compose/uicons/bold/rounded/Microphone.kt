package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microphone: ImageVector? = null

val Icons.Br.Microphone: ImageVector
    get() = _Microphone ?: UXIcon(name = "Microphone") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 19f)
            arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -7f)
            verticalLineTo(7f)
            arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
            verticalLineToRelative(5f)
            arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            close()
            moveTo(12f, 3f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
            verticalLineTo(8f)
            horizontalLineTo(14.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(16f)
            verticalLineToRelative(1f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 0f)
            verticalLineTo(11f)
            horizontalLineTo(9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(8f)
            verticalLineTo(7f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 11.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
            verticalLineToRelative(0.39f)
            arcTo(7.62f, 7.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.39f, 21f)
            horizontalLineTo(10.61f)
            arcTo(7.62f, 7.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13.39f)
            verticalLineTo(13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(0.39f)
            arcTo(10.62f, 10.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.61f, 24f)
            horizontalLineToRelative(2.78f)
            arcTo(10.62f, 10.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13.39f)
            verticalLineTo(13f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 11.5f)
            close()
        }
    }.also { _Microphone = it }
