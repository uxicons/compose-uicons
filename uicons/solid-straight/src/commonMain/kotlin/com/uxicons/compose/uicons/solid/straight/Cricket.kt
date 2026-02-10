package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cricket: ImageVector? = null

val Icons.Ss.Cricket: ImageVector
    get() = _Cricket ?: UXIcon(name = "Cricket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.96f, 15.6f)
                lineTo(6.91f, 23.66f)
                lineToRelative(-0.22f, 0.07f)
                arcTo(6.24f, 6.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.86f, 24f)
                arcToRelative(4.81f, 4.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.49f, -1.37f)
                curveTo(-0.76f, 20.5f, 0.22f, 17.45f, 0.27f, 17.32f)
                lineTo(0.34f, 17.1f)
                lineTo(8.4f, 9.04f)
                lineToRelative(0.99f, 0.99f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11.67f)
                verticalLineTo(14f)
                horizontalLineToRelative(2.41f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.56f, 0.61f)
                close()
                moveTo(20.46f, 0.04f)
                lineTo(19.04f, 1.46f)
                lineTo(20.09f, 2.5f)
                lineTo(16.4f, 6.19f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.74f, 0f)
                lineToRelative(-0.71f, -0.7f)
                lineTo(9.81f, 7.62f)
                lineToRelative(0.99f, 0.99f)
                arcTo(4.22f, 4.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.67f)
                verticalLineTo(12f)
                horizontalLineToRelative(0.42f)
                arcToRelative(4.2f, 4.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.96f, 1.19f)
                lineToRelative(0.99f, 1f)
                lineToRelative(2.13f, -2.13f)
                lineToRelative(-0.7f, -0.71f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.74f)
                lineToRelative(0f, 0f)
                lineTo(21.5f, 3.91f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(24f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 24f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.5f)
                close()
            }
        }.also { _Cricket = it}
