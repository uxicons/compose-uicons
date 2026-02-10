package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cupcake: ImageVector? = null

val Icons.Ss.Cupcake: ImageVector
    get() = _Cupcake ?: UXIcon(name = "Cupcake") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 2f)
                close()
                moveTo(19.8f, 18.66f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.8f, -0.09f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.79f, 0.09f)
                arcTo(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.52f, 19f)
                lineToRelative(0.45f, 2.53f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.92f, 24f)
                lineTo(18.08f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, -2.48f)
                lineTo(21.48f, 19f)
                arcTo(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.8f, 18.66f)
                close()
                moveTo(15.14f, 4.45f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.28f, 0f)
                curveTo(4.07f, 5.78f, 0f, 9.96f, 0f, 14.5f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.17f, 1.85f)
                arcTo(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 16.22f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, 0.13f)
                arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.5f)
                curveTo(24f, 9.96f, 19.93f, 5.78f, 15.14f, 4.45f)
                close()
            }
        }.also { _Cupcake = it}
