package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Power: ImageVector? = null

val Icons.Rr.Power: ImageVector
    get() = _Power ?: UXIcon(name = "Power") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3.85f)
                horizontalLineToRelative(0f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 0.93f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13.29f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.37f, 4.78f)
                arcTo(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3.85f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.37f, -0.93f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.75f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                lineTo(12f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 1f)
                lineTo(13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                lineTo(12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                lineTo(11f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                close()
            }
        }.also { _Power = it}
