package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exchange: ImageVector? = null

val Icons.Rr.Exchange: ImageVector
    get() = _Exchange ?: UXIcon(name = "Exchange") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16f)
                horizontalLineTo(2.68f)
                lineToRelative(0.01f, -0.01f)
                lineTo(4.94f, 13.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.43f, -1.4f)
                lineTo(1.27f, 14.58f)
                curveToRelative(-0.16f, 0.16f, -0.39f, 0.41f, -0.62f, 0.68f)
                arcToRelative(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.43f)
                curveToRelative(0.23f, 0.26f, 0.46f, 0.51f, 0.62f, 0.67f)
                lineToRelative(2.25f, 2.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.43f, -1.4f)
                lineTo(2.74f, 18f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 8f)
                horizontalLineTo(21.25f)
                lineToRelative(-2.19f, 2.23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.43f, 1.4f)
                lineToRelative(2.24f, -2.28f)
                curveToRelative(0.16f, -0.16f, 0.39f, -0.41f, 0.62f, -0.68f)
                arcToRelative(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.43f)
                curveToRelative(-0.23f, -0.26f, -0.46f, -0.51f, -0.62f, -0.67f)
                lineTo(20.49f, 2.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, 1.4f)
                lineToRelative(2.25f, 2.29f)
                lineTo(21.32f, 6f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8f)
                close()
            }
        }.also { _Exchange = it}
