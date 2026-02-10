package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Road: ImageVector? = null

val Icons.Sr.Road: ImageVector
    get() = _Road ?: UXIcon(name = "Road") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.92f, 18.13f)
                lineToRelative(-2.46f, -14f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.54f, 0f)
                lineTo(7.45f, 0f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.52f, 4.14f)
                lineToRelative(-2.45f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 24f)
                lineTo(19f, 24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.92f, -5.87f)
                close()
                moveTo(13f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
                moveTo(13f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
                moveTo(13f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
        }.also { _Road = it}
