package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tennis: ImageVector? = null

val Icons.Sr.Tennis: ImageVector
    get() = _Tennis ?: UXIcon(name = "Tennis") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.12f, 0.06f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.82f, 10.82f)
                arcToRelative(9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.14f, -2.68f)
                arcToRelative(9.53f, 9.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.68f, -8.14f)
                close()
                moveTo(22.55f, 13f)
                arcToRelative(11.53f, 11.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.45f, -12.95f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.06f, 11.08f)
                arcToRelative(11.37f, 11.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.83f, 12.83f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.07f, -11.05f)
                arcToRelative(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, 0.09f)
                close()
                moveTo(8.24f, 15.76f)
                arcToRelative(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.18f, -2.62f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.8f, 10.8f)
                arcToRelative(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.62f, -8.18f)
                close()
            }
        }.also { _Tennis = it}
