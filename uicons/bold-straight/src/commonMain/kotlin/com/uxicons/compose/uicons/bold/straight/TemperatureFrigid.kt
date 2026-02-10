package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureFrigid: ImageVector? = null

val Icons.Bs.TemperatureFrigid: ImageVector
    get() = _TemperatureFrigid ?: UXIcon(name = "TemperatureFrigid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.6f)
                verticalLineToRelative(-5.4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16.04f)
                close()
                moveTo(24f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -5.27f)
                lineTo(10f, 6.04f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                verticalLineToRelative(4.69f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(21f, 16f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
                lineTo(19f, 11.97f)
                lineTo(19f, 6.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
                verticalLineToRelative(5.93f)
                lineToRelative(-0.46f, 0.44f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(8f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 3.91f)
                lineTo(1.61f, 1.97f)
                lineTo(0.12f, 4.57f)
                lineTo(3.48f, 6.5f)
                lineTo(0.12f, 8.43f)
                lineToRelative(1.49f, 2.6f)
                lineTo(5f, 9.09f)
                lineTo(5f, 13f)
                lineTo(6.47f, 13f)
                arcTo(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10.05f)
                close()
            }
        }.also { _TemperatureFrigid = it}
