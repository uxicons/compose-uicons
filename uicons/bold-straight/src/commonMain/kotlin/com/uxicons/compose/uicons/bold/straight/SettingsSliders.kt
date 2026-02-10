package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SettingsSliders: ImageVector? = null

val Icons.Bs.SettingsSliders: ImageVector
    get() = _SettingsSliders ?: UXIcon(name = "SettingsSliders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.7f, 2.62f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.3f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.39f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
                horizontalLineTo(24f)
                verticalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.45f, 8.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.15f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(13.3f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
                horizontalLineTo(24f)
                verticalLineToRelative(-3f)
                horizontalLineTo(19.61f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.45f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.54f, 16.38f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.15f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.39f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
                horizontalLineTo(24f)
                verticalLineToRelative(-3f)
                horizontalLineTo(10.7f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.54f, 16.38f)
                close()
            }
        }.also { _SettingsSliders = it}
