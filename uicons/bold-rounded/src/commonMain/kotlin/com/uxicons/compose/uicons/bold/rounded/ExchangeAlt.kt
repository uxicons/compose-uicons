package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExchangeAlt: ImageVector? = null

val Icons.Br.ExchangeAlt: ImageVector
    get() = _ExchangeAlt ?: UXIcon(name = "ExchangeAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 6.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 5f)
            horizontalLineTo(18f)
            verticalLineTo(2.45f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, -0.7f)
            lineToRelative(4.01f, 3.96f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.55f)
            lineToRelative(-4.01f, 3.96f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, -0.7f)
            verticalLineTo(8f)
            horizontalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.5f)
            close()
            moveTo(22.5f, 16f)
            horizontalLineTo(6f)
            verticalLineTo(13.45f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.67f, -0.7f)
            lineTo(0.32f, 16.71f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.55f)
            lineToRelative(4.01f, 3.96f)
            arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21.52f)
            verticalLineTo(19f)
            horizontalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _ExchangeAlt = it }
