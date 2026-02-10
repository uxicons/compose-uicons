package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pie: ImageVector? = null

val Icons.Ss.Pie: ImageVector
    get() = _Pie ?: UXIcon(name = "Pie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 19.93f)
                lineToRelative(-0.35f, 1.68f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.13f, 24f)
                lineTo(5.87f, 24f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.94f, -2.39f)
                lineToRelative(-0.35f, -1.68f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20.19f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.41f, -0.26f)
                close()
                moveTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 4f)
                lineTo(9f, 4f)
                close()
                moveTo(12f, 6f)
                curveTo(5.35f, 6f, 0f, 10.38f, 0f, 14f)
                arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.53f, 2.95f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17.62f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.47f, -0.67f)
                arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14f)
                curveTo(24f, 10.38f, 18.65f, 6f, 12f, 6f)
                close()
                moveTo(10.12f, 11.64f)
                arcTo(1.24f, 1.24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.36f, 9.88f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.12f, 11.64f)
                close()
                moveTo(15.64f, 11.64f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.76f, 0f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 9f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0.88f)
                arcTo(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.64f, 11.64f)
                close()
            }
        }.also { _Pie = it}
