package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilTemp: ImageVector? = null

val Icons.Ss.OilTemp: ImageVector
    get() = _OilTemp ?: UXIcon(name = "OilTemp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 21.32f)
                lineToRelative(1.51f, 1.31f)
                arcTo(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22.62f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.01f, 0.01f)
                lineTo(1.5f, 21.32f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                lineTo(7f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 21.32f)
                close()
                moveTo(21f, 19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.01f, -1.37f)
                lineTo(22.5f, 16.32f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15f)
                lineTo(17f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                close()
                moveTo(7f, 15f)
                lineTo(5f, 15f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 1.32f)
                lineTo(-0.01f, 17.63f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 15f)
                close()
                moveTo(12f, 18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -7.86f)
                lineTo(13f, 6f)
                horizontalLineToRelative(4f)
                lineTo(17f, 4f)
                lineTo(13f, 4f)
                lineTo(13f, 2f)
                horizontalLineToRelative(4f)
                lineTo(17f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 10.14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                close()
            }
        }.also { _OilTemp = it}
