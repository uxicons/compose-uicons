package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SettingsSliders: ImageVector? = null

val Icons.Ss.SettingsSliders: ImageVector
    get() = _SettingsSliders ?: UXIcon(name = "SettingsSliders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.87f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.13f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(3.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.87f, 3f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(13.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(11f)
                horizontalLineTo(20.87f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.87f, 3f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(19f)
                horizontalLineTo(10.87f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16f)
                close()
            }
        }.also { _SettingsSliders = it}
