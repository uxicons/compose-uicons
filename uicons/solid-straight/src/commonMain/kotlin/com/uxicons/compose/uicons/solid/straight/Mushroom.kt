package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Ss.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.77f, 15.06f)
                lineToRelative(-0.37f, -0.27f)
                arcTo(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                arcToRelative(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.4f, 2.79f)
                lineToRelative(-0.37f, 0.27f)
                lineToRelative(-0.45f, -0.1f)
                arcTo(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.33f)
                curveTo(0f, 5.08f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveTo(24f, 5.08f, 24f, 11.33f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.79f, 3.63f)
                close()
                moveTo(12f, 14f)
                arcToRelative(11.85f, 11.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.11f, 0.8f)
                arcTo(28.59f, 28.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                arcToRelative(31.75f, 31.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.92f, -4.21f)
                arcTo(11.81f, 11.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                close()
            }
        }.also { _Mushroom = it}
