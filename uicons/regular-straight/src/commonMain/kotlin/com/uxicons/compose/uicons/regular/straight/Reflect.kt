package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reflect: ImageVector? = null

val Icons.Rs.Reflect: ImageVector
    get() = _Reflect ?: UXIcon(name = "Reflect") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                horizontalLineTo(0f)
                verticalLineTo(11f)
                horizontalLineTo(24f)
                close()
                moveTo(8.89f, 0.43f)
                lineToRelative(-0.1f, -0.07f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 2.5f)
                verticalLineTo(9f)
                horizontalLineTo(19.92f)
                close()
                moveTo(7f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.72f, -0.45f)
                lineTo(14.08f, 7f)
                horizontalLineTo(7f)
                close()
                moveTo(8.79f, 23.64f)
                lineTo(19.92f, 15f)
                horizontalLineTo(5f)
                verticalLineToRelative(6.5f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.79f, 2.14f)
                close()
                moveTo(14.08f, 17f)
                lineTo(7.72f, 21.95f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21.5f)
                verticalLineTo(17f)
                close()
            }
        }.also { _Reflect = it}
