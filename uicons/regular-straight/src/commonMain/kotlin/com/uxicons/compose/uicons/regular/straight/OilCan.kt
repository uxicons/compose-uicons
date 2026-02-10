package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilCan: ImageVector? = null

val Icons.Rs.OilCan: ImageVector
    get() = _OilCan ?: UXIcon(name = "OilCan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.86f, 9.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.93f, -0.2f)
                lineTo(15.4f, 9.01f)
                lineToRelative(-0.11f, -0.13f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.17f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 5f)
                horizontalLineToRelative(3f)
                lineTo(14f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 5f)
                lineTo(9f, 5f)
                lineTo(9f, 8f)
                lineTo(5.17f, 8f)
                lineTo(2.83f, 7.18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineToRelative(3.15f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.66f, 2.68f)
                lineTo(4f, 15.7f)
                lineTo(4f, 20f)
                lineTo(15.46f, 20f)
                lineTo(24f, 9.95f)
                lineTo(24f, 7.62f)
                close()
                moveTo(2.51f, 13.02f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12.15f)
                lineTo(2f, 9f)
                lineToRelative(2f, 0.71f)
                verticalLineToRelative(3.86f)
                close()
                moveTo(14.54f, 18f)
                lineTo(6f, 18f)
                lineTo(6f, 10f)
                horizontalLineToRelative(7.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.65f, 0.24f)
                lineToRelative(0.52f, 0.74f)
                lineToRelative(0.11f, 0.13f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.98f, 0.75f)
                lineToRelative(3.18f, -1.04f)
                close()
                moveTo(23.41f, 16.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.83f, 0f)
                lineTo(22f, 15f)
                close()
            }
        }.also { _OilCan = it}
