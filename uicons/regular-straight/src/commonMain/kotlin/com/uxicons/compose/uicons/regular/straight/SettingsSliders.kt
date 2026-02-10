package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SettingsSliders: ImageVector? = null

val Icons.Rs.SettingsSliders: ImageVector
    get() = _SettingsSliders ?: UXIcon(name = "SettingsSliders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.93f, 2.75f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.2f, 0f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.74f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 0f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7.33f, 5.5f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.75f, -1.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.33f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.67f, 8.25f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.07f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(13.07f, 13f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.19f, 0f)
                lineTo(24f, 13f)
                lineTo(24f, 11f)
                lineTo(20.26f, 11f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.67f, 8.25f)
                close()
                moveTo(16.67f, 13.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.42f, 12f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.67f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.33f, 16.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.6f, 2.75f)
                lineTo(0f, 19.25f)
                verticalLineToRelative(2f)
                lineTo(3.74f, 21.25f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 0f)
                lineTo(24f, 21.25f)
                verticalLineToRelative(-2f)
                lineTo(10.93f, 19.25f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.33f, 16.5f)
                close()
                moveTo(7.33f, 22f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.75f, -1.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.33f, 22f)
                close()
            }
        }.also { _SettingsSliders = it}
