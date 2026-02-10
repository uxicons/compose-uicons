package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureLow: ImageVector? = null

val Icons.Br.TemperatureLow: ImageVector
    get() = _TemperatureLow ?: UXIcon(name = "TemperatureLow") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 0f)
            close()
            moveTo(14f, 16.04f)
            arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.58f)
            lineTo(9.5f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(1.95f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16.04f)
            close()
            moveTo(17f, 6.04f)
            curveToRelative(-0.25f, -7.93f, -11.75f, -7.93f, -12f, 0f)
            verticalLineToRelative(4.69f)
            curveTo(0.43f, 15.68f, 4.26f, 24.14f, 11f, 24f)
            curveToRelative(6.74f, 0.14f, 10.57f, -8.32f, 6f, -13.27f)
            close()
            moveTo(11f, 21f)
            arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.46f, -8.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 11.33f)
            lineTo(8f, 6.04f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            lineTo(14f, 11.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, 1.08f)
            arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 21f)
            close()
        }
    }.also { _TemperatureLow = it }
