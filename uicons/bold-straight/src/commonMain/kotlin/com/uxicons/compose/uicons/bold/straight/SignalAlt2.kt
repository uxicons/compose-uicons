package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAlt2: ImageVector? = null

val Icons.Bs.SignalAlt2: ImageVector
    get() = _SignalAlt2 ?: UXIcon(name = "SignalAlt2") {
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
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineTo(24f)
                horizontalLineToRelative(6f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
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
        }.also { _SignalAlt2 = it}
