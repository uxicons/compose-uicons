package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAlt: ImageVector? = null

val Icons.Br.SignalAlt: ImageVector
    get() = _SignalAlt ?: UXIcon(name = "SignalAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
            lineTo(9f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
            lineTo(15f, 9f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
            close()
            moveTo(13f, 21f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            lineTo(11f, 9f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
            lineTo(18f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
            lineTo(24f, 3f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
            close()
            moveTo(22f, 21f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            lineTo(20f, 3f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 12f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
            verticalLineToRelative(6f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
            verticalLineTo(15f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
            close()
        }
    }.also { _SignalAlt = it }
