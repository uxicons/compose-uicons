package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilCan: ImageVector? = null

val Icons.Bs.OilCan: ImageVector
    get() = _OilCan ?: UXIcon(name = "OilCan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.17f, 9.99f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.38f, -0.08f)
                lineToRelative(-0.48f, -0.69f)
                lineToRelative(-0.17f, -0.2f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.67f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 6f)
                horizontalLineToRelative(3f)
                lineTo(15f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 8f)
                lineTo(5.75f, 8f)
                lineTo(3.51f, 7.21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.5f)
                verticalLineToRelative(3.15f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, 3.13f)
                lineTo(4f, 16.54f)
                lineTo(4f, 21f)
                lineTo(15.19f, 21f)
                lineTo(24f, 10.63f)
                lineTo(24f, 7.3f)
                close()
                moveTo(3.23f, 13.07f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.65f)
                lineTo(3f, 10.21f)
                lineToRelative(1f, 0.35f)
                verticalLineToRelative(2.79f)
                close()
                moveTo(13.81f, 18f)
                lineTo(7f, 18f)
                lineTo(7f, 11f)
                horizontalLineToRelative(6.67f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, 0.09f)
                lineToRelative(0.48f, 0.69f)
                lineToRelative(0.17f, 0.2f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.44f, 0.89f)
                lineToRelative(0.17f, -0.06f)
                close()
                moveTo(23.41f, 17.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.83f, 0f)
                lineTo(22f, 16f)
                close()
            }
        }.also { _OilCan = it}
