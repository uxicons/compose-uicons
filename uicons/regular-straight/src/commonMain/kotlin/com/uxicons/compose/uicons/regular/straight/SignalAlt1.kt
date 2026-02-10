package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAlt1: ImageVector? = null

val Icons.Rs.SignalAlt1: ImageVector
    get() = _SignalAlt1 ?: UXIcon(name = "SignalAlt1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                verticalLineTo(24f)
                horizontalLineToRelative(6f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                lineTo(20f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                lineTo(18f, 24f)
                horizontalLineToRelative(6f)
                lineTo(24f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
                close()
                moveTo(22f, 22f)
                lineTo(20f, 22f)
                lineTo(20f, 2f)
                horizontalLineToRelative(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 12f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineTo(24f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                close()
            }
        }.also { _SignalAlt1 = it}
