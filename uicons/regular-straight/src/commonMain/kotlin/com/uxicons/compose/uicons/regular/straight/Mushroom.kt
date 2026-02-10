package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Rs.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.08f, 0f, 11.33f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.79f, 3.63f)
                lineToRelative(0.45f, 0.1f)
                lineToRelative(0.37f, -0.27f)
                arcToRelative(16.59f, 16.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, -2.07f)
                arcTo(43.13f, 43.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                arcToRelative(43.14f, 43.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -6.28f)
                arcToRelative(16.59f, 16.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, 2.07f)
                lineToRelative(0.37f, 0.27f)
                lineToRelative(0.44f, -0.1f)
                arcTo(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.33f)
                curveTo(24f, 5.08f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(15f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(42.61f, 42.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, -6.82f)
                arcTo(12.34f, 12.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcToRelative(12.33f, 12.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.04f, 0.18f)
                arcTo(42.61f, 42.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19f)
                close()
                moveTo(21.14f, 12.87f)
                arcTo(17.57f, 17.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcToRelative(17.57f, 17.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.14f, 2.87f)
                arcTo(1.63f, 1.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11.33f)
                curveTo(2f, 6.19f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.19f, 10f, 9.33f)
                arcTo(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.14f, 12.87f)
                close()
            }
        }.also { _Mushroom = it}
