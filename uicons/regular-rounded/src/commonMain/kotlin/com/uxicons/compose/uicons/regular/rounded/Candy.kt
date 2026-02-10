package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Candy: ImageVector? = null

val Icons.Rr.Candy: ImageVector
    get() = _Candy ?: UXIcon(name = "Candy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.0f, 23.99f)
                curveToRelative(-2.02f, -0.1f, -3.87f, -2.08f, -4.74f, -3.76f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, 16f)
                curveTo(0.84f, 9.03f, 9.03f, 0.84f, 16f, 3.41f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.23f, 0.27f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.49f, 3.5f)
                horizontalLineToRelative(0f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.59f, 8f)
                curveTo(23.16f, 14.97f, 14.97f, 23.16f, 8f, 20.59f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 23.99f)
                close()
                moveTo(3.0f, 17.99f)
                curveToRelative(-2.54f, 0.51f, 0.41f, 3.42f, 1.61f, 3.91f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20.98f)
                curveToRelative(0.08f, -0.99f, -0.3f, -2.48f, 0.52f, -2.86f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.02f, 0.04f)
                curveTo(13.43f, 21.9f, 21.9f, 13.42f, 18.16f, 7.54f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 6f)
                horizontalLineToRelative(1.98f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.93f, -1.39f)
                horizontalLineToRelative(0f)
                curveTo(21.41f, 3.41f, 18.5f, 0.46f, 18f, 3.0f)
                curveToRelative(-0.08f, 1f, 0.3f, 2.5f, -0.52f, 2.88f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.02f, -0.04f)
                curveTo(13.88f, 4.2f, 10.11f, 4.89f, 7.5f, 7.5f)
                reflectiveCurveTo(4.2f, 13.88f, 5.84f, 16.46f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18f)
                close()
                moveTo(14.64f, 15.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, -1.53f)
                curveToRelative(-1.24f, 1.05f, -2.89f, 1.35f, -3.75f, 0.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.4f, 16.25f)
                curveTo(10.3f, 17.61f, 12.8f, 17.01f, 14.64f, 15.49f)
                close()
            }
        }.also { _Candy = it}
