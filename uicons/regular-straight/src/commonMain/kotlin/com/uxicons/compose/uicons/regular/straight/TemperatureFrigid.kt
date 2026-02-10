package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureFrigid: ImageVector? = null

val Icons.Rs.TemperatureFrigid: ImageVector
    get() = _TemperatureFrigid ?: UXIcon(name = "TemperatureFrigid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.18f)
                lineTo(18f, 8f)
                lineTo(16f, 8f)
                verticalLineToRelative(6.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(17f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                close()
                moveTo(22f, 12.11f)
                lineTo(22f, 5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                verticalLineToRelative(7.11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(17f, 22f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, -8.72f)
                lineToRelative(0.33f, -0.3f)
                lineTo(14f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(7.98f)
                lineToRelative(0.33f, 0.3f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                close()
                moveTo(8f, 11.31f)
                lineToRelative(1.73f, 1.73f)
                lineTo(8.32f, 14.46f)
                lineTo(7f, 13.14f)
                lineTo(5.68f, 14.46f)
                lineTo(4.27f, 13.04f)
                lineTo(6f, 11.31f)
                lineTo(6f, 8.95f)
                lineTo(3.95f, 10.12f)
                lineToRelative(-0.64f, 2.36f)
                lineToRelative(-1.93f, -0.52f)
                lineToRelative(0.49f, -1.8f)
                lineToRelative(-1.8f, -0.49f)
                lineToRelative(0.52f, -1.93f)
                lineToRelative(2.36f, 0.64f)
                lineTo(4.99f, 7.22f)
                lineTo(2.96f, 6.05f)
                lineTo(0.59f, 6.7f)
                lineTo(0.07f, 4.76f)
                lineToRelative(1.8f, -0.49f)
                lineToRelative(-0.49f, -1.8f)
                lineToRelative(1.93f, -0.52f)
                lineTo(3.95f, 4.32f)
                lineTo(6f, 5.49f)
                lineTo(6f, 3.13f)
                lineTo(4.27f, 1.4f)
                lineTo(5.68f, -0.01f)
                lineTo(7f, 1.3f)
                lineTo(8.32f, -0.01f)
                lineTo(9.73f, 1.4f)
                lineTo(8f, 3.13f)
                lineTo(8f, 5.49f)
                lineToRelative(2f, -1.15f)
                verticalLineToRelative(2.3f)
                lineToRelative(-0.99f, 0.57f)
                lineToRelative(0.99f, 0.57f)
                verticalLineToRelative(2.3f)
                lineTo(8f, 8.95f)
                close()
            }
        }.also { _TemperatureFrigid = it}
