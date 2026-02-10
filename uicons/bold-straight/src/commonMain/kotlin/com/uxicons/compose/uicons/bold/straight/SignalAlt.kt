package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAlt: ImageVector? = null

val Icons.Bs.SignalAlt: ImageVector
    get() = _SignalAlt ?: UXIcon(name = "SignalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                lineTo(11f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                lineTo(9f, 24f)
                horizontalLineToRelative(6f)
                lineTo(15f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6f)
                close()
                moveTo(13f, 22f)
                lineTo(11f, 22f)
                lineTo(11f, 8f)
                horizontalLineToRelative(2f)
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
        }.also { _SignalAlt = it}
