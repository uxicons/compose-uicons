package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartNetwork: ImageVector? = null

val Icons.Rs.ChartNetwork: ImageVector
    get() = _ChartNetwork ?: UXIcon(name = "ChartNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.17f, 1.57f)
                lineToRelative(-0.07f, -0.03f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.01f, -6.38f)
                lineToRelative(-0.09f, -0.17f)
                arcTo(4.0f, 4.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.88f, 7.9f)
                lineToRelative(0.07f, 0.14f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, 6.7f)
                lineTo(5.93f, 16.5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.46f, 1.38f)
                lineToRelative(1.84f, -1.72f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.54f, -0.87f)
                lineToRelative(0.28f, 0.12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 12f)
                close()
                moveTo(6f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 4f)
                close()
                moveTo(4f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 22f)
                close()
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -5.53f)
                lineToRelative(0.41f, -0.22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(20f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                close()
            }
        }.also { _ChartNetwork = it}
