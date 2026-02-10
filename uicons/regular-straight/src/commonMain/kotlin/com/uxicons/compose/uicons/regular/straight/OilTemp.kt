package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilTemp: ImageVector? = null

val Icons.Rs.OilTemp: ImageVector
    get() = _OilTemp ?: UXIcon(name = "OilTemp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 21.32f)
                lineToRelative(1.51f, 1.31f)
                arcToRelative(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.01f, 0.01f)
                arcToRelative(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.01f, -0.01f)
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
                moveTo(3f, 19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(5f, 15f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 1.32f)
                lineTo(-0.01f, 17.63f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 19f)
                close()
                moveTo(8f, 14f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3.87f)
                lineTo(11f, 0f)
                horizontalLineToRelative(6f)
                lineTo(17f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 4f)
                horizontalLineToRelative(4f)
                lineTo(17f, 6f)
                lineTo(13f, 6f)
                verticalLineToRelative(4.13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 14f)
                close()
                moveTo(10f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 14f)
                close()
            }
        }.also { _OilTemp = it}
