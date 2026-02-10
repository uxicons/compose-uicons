package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAlt2: ImageVector? = null

val Icons.Rr.SignalAlt2: ImageVector
    get() = _SignalAlt2 ?: UXIcon(name = "SignalAlt2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
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
        }.also { _SignalAlt2 = it}
