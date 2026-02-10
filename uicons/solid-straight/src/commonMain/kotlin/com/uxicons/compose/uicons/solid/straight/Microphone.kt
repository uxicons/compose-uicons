package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microphone: ImageVector? = null

val Icons.Ss.Microphone: ImageVector
    get() = _Microphone ?: UXIcon(name = "Microphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
                horizontalLineTo(11f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
                horizontalLineTo(0f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 24f)
                horizontalLineToRelative(2f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                horizontalLineTo(5.07f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.86f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineToRelative(4f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineToRelative(3.93f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.07f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                close()
            }
        }.also { _Microphone = it}
