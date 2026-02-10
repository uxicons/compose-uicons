package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureFrigid: ImageVector? = null

val Icons.Ss.TemperatureFrigid: ImageVector
    get() = _TemperatureFrigid ?: UXIcon(name = "TemperatureFrigid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
                curveToRelative(-6.08f, 0.12f, -9.33f, -7.64f, -5f, -11.89f)
                lineTo(12f, 5f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                verticalLineToRelative(7.11f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17f)
                close()
                moveTo(20f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.82f)
                lineTo(18f, 8f)
                lineTo(16f, 8f)
                verticalLineToRelative(6.18f)
                arcTo(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 17f)
                close()
                moveTo(8f, 8.95f)
                lineToRelative(2f, 1.15f)
                verticalLineToRelative(-2.3f)
                lineTo(9.01f, 7.22f)
                lineTo(10f, 6.65f)
                verticalLineToRelative(-2.3f)
                lineTo(8f, 5.49f)
                lineTo(8f, 3.13f)
                lineTo(9.73f, 1.4f)
                lineTo(8.32f, -0.01f)
                lineTo(7f, 1.3f)
                lineTo(5.68f, -0.01f)
                lineTo(4.27f, 1.4f)
                lineTo(6f, 3.13f)
                lineTo(6f, 5.49f)
                lineTo(3.95f, 4.32f)
                lineTo(3.31f, 1.96f)
                lineToRelative(-1.93f, 0.52f)
                lineToRelative(0.49f, 1.8f)
                lineToRelative(-1.8f, 0.49f)
                lineTo(0.59f, 6.7f)
                lineToRelative(2.36f, -0.64f)
                lineTo(4.99f, 7.22f)
                lineTo(2.96f, 8.39f)
                lineTo(0.59f, 7.75f)
                lineTo(0.07f, 9.68f)
                lineToRelative(1.8f, 0.49f)
                lineToRelative(-0.49f, 1.8f)
                lineToRelative(1.93f, 0.52f)
                lineToRelative(0.64f, -2.36f)
                lineTo(6f, 8.95f)
                verticalLineToRelative(2.36f)
                lineTo(4.27f, 13.04f)
                lineToRelative(1.41f, 1.41f)
                lineTo(7f, 13.14f)
                lineToRelative(1.32f, 1.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(8f, 11.31f)
                close()
            }
        }.also { _TemperatureFrigid = it}
