package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forward: ImageVector? = null

val Icons.Br.Forward: ImageVector
    get() = _Forward ?: UXIcon(name = "Forward") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.16f, 20.81f)
            arcTo(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16.65f)
            verticalLineToRelative(-9.3f)
            arcTo(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.62f, 4f)
            lineTo(9.53f, 6.13f)
            arcTo(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.96f, 4f)
            lineTo(22.3f, 8.65f)
            arcToRelative(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.7f)
            lineTo(15.96f, 20f)
            arcToRelative(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.44f, -2.13f)
            lineTo(6.62f, 20f)
            arcTo(4.14f, 4.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, 20.81f)
            close()
            moveTo(10.85f, 13.54f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            verticalLineToRelative(1.61f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.84f, 0.93f)
            lineToRelative(6.34f, -4.65f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.87f)
            lineTo(14.19f, 6.42f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, 0.93f)
            lineTo(12.35f, 8.96f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.39f, 1.21f)
            lineTo(4.84f, 6.42f)
            arcTo(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7.35f)
            verticalLineToRelative(9.3f)
            arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.84f, 0.93f)
            lineTo(9.96f, 13.83f)
            arcTo(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.85f, 13.54f)
            close()
        }
    }.also { _Forward = it }
