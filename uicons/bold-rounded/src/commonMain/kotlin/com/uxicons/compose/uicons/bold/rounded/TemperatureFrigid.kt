package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureFrigid: ImageVector? = null

val Icons.Br.TemperatureFrigid: ImageVector
    get() = _TemperatureFrigid ?: UXIcon(name = "TemperatureFrigid") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 16.04f)
            arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.58f)
            lineTo(14.5f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(4.95f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16.04f)
            close()
            moveTo(24f, 16f)
            arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
            curveToRelative(-6.74f, 0.14f, -10.57f, -8.32f, -6f, -13.27f)
            lineTo(10f, 6.04f)
            curveToRelative(0.25f, -7.93f, 11.75f, -7.93f, 12f, 0f)
            verticalLineToRelative(4.69f)
            arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
            close()
            moveTo(21f, 16f)
            arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11.33f)
            lineTo(19f, 6.04f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
            lineTo(13f, 11.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, 1.08f)
            arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 16f)
            close()
            moveTo(8f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineTo(5f, 3.91f)
            lineToRelative(-2.09f, -1.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.49f, 2.6f)
            lineTo(3.48f, 6.5f)
            lineTo(1.42f, 7.69f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.49f, 2.6f)
            lineTo(5f, 9.09f)
            lineTo(5f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
        }
    }.also { _TemperatureFrigid = it }
