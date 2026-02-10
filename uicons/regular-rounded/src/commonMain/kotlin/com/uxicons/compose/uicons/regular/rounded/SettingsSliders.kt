package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SettingsSliders: ImageVector? = null

val Icons.Rr.SettingsSliders: ImageVector
    get() = _SettingsSliders ?: UXIcon(name = "SettingsSliders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.75f)
                horizontalLineTo(3.74f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 0f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(10.93f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.2f, 0f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                close()
                moveTo(7.33f, 2f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.75f, 1.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.33f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                lineTo(20.26f, 11f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.19f, 0f)
                lineTo(1f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(13.07f, 13f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.19f, 0f)
                lineTo(23f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(16.67f, 13.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.42f, 12f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.67f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19.25f)
                horizontalLineTo(10.93f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.2f, 0f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(3.74f)
                arcToRelative(3.73f, 3.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 0f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(7.33f, 22f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.75f, -1.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.33f, 22f)
                close()
            }
        }.also { _SettingsSliders = it}
