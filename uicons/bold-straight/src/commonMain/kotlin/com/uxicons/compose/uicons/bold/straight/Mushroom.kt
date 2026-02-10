package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Bs.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.1f, 0f, 11.36f)
                arcTo(4.88f, 4.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.78f, 15.71f)
                lineToRelative(0.81f, 0.37f)
                lineToRelative(0.71f, -0.53f)
                arcToRelative(14.79f, 14.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, -1.71f)
                arcTo(37.44f, 37.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                arcToRelative(37.28f, 37.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, -5.16f)
                arcToRelative(15.05f, 15.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, 1.71f)
                lineToRelative(0.71f, 0.53f)
                lineToRelative(0.81f, -0.37f)
                arcTo(4.88f, 4.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.36f)
                curveTo(24f, 5.1f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(14f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcToRelative(37.32f, 37.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.84f, -5.93f)
                arcTo(10.94f, 10.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcToRelative(10.94f, 10.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.16f, 0.07f)
                arcTo(37.3f, 37.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 19f)
                close()
                moveTo(20.55f, 12.53f)
                arcTo(17.18f, 17.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcToRelative(17.19f, 17.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.54f, 2.53f)
                arcTo(1.71f, 1.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11.36f)
                curveTo(3f, 6.75f, 7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 3.75f, 9f, 8.36f)
                arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.55f, 12.53f)
                close()
            }
        }.also { _Mushroom = it}
