package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Settings: ImageVector? = null

val Icons.Bs.Settings: ImageVector
    get() = _Settings ?: UXIcon(name = "Settings") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.64f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.36f, 12f)
                arcTo(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.64f)
                close()
                moveTo(12f, 13.36f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.36f, 12f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.36f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                arcToRelative(9.92f, 9.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.7f, -3.64f)
                lineTo(23.14f, 7.3f)
                lineToRelative(-1.5f, -2.6f)
                lineTo(19.81f, 5.77f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 2.12f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2.12f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 5.76f)
                lineTo(2.36f, 4.7f)
                lineTo(0.86f, 7.3f)
                lineTo(2.7f, 8.36f)
                arcToRelative(9.87f, 9.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.28f)
                lineTo(0.85f, 16.7f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.84f, -1.06f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 21.88f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(21.88f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, -3.64f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(1.5f, -2.6f)
                lineTo(21.3f, 15.64f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
                moveTo(12f, 19f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, -7f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                close()
            }
        }.also { _Settings = it}
