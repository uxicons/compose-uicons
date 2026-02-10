package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tennis: ImageVector? = null

val Icons.Ss.Tennis: ImageVector
    get() = _Tennis ?: UXIcon(name = "Tennis") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.14f, 0.06f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.8f, 10.8f)
                arcToRelative(9.34f, 9.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.8f, -10.8f)
                close()
                moveTo(8.28f, 15.72f)
                arcToRelative(9.28f, 9.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.21f, -2.57f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.79f, 10.79f)
                arcToRelative(9.28f, 9.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.57f, -8.22f)
                close()
                moveTo(22.36f, 13f)
                arcToRelative(11.34f, 11.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.22f, -12.95f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.09f, 11.1f)
                arcToRelative(11.25f, 11.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.81f, 12.81f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.1f, -11.08f)
                arcToRelative(11.46f, 11.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 0.12f)
                close()
            }
        }.also { _Tennis = it}
