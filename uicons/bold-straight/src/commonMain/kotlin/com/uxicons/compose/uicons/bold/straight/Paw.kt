package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paw: ImageVector? = null

val Icons.Bs.Paw: ImageVector
    get() = _Paw ?: UXIcon(name = "Paw") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 24f)
                curveToRelative(-1.84f, -0.02f, -3.1f, -1.01f, -5f, -1f)
                curveToRelative(-1.9f, -0.01f, -3.16f, 0.98f, -5f, 1f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                arcToRelative(9.36f, 9.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, -9f)
                arcToRelative(9.36f, 9.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 24f)
                close()
                moveTo(12f, 20f)
                arcToRelative(11.02f, 11.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.53f, 0.66f)
                curveToRelative(1.05f, 0.31f, 2.61f, 0.87f, 2.47f, -0.66f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                curveToRelative(-0.14f, 1.53f, 1.43f, 0.97f, 2.47f, 0.66f)
                arcTo(11.02f, 11.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(21.84f, 5.01f)
                curveToRelative(-1.36f, -0.16f, -2.6f, 1.13f, -2.81f, 3.46f)
                curveToRelative(-0.43f, 5.51f, 4.31f, 6.22f, 4.94f, 0.59f)
                curveTo(24.18f, 6.73f, 23.21f, 5.18f, 21.84f, 5.01f)
                close()
                moveTo(0.03f, 9.06f)
                curveTo(0.66f, 14.7f, 5.4f, 13.98f, 4.97f, 8.47f)
                curveToRelative(-0.21f, -2.33f, -1.45f, -3.62f, -2.81f, -3.46f)
                reflectiveCurveTo(-0.18f, 6.73f, 0.03f, 9.06f)
                close()
                moveTo(5.98f, 4.06f)
                curveToRelative(0.64f, 5.64f, 5.37f, 4.92f, 4.94f, -0.59f)
                curveTo(10.7f, 1.14f, 9.47f, -0.15f, 8.1f, 0.01f)
                reflectiveCurveTo(5.76f, 1.73f, 5.98f, 4.06f)
                close()
                moveTo(15.88f, 0.01f)
                curveToRelative(-1.36f, -0.16f, -2.6f, 1.13f, -2.81f, 3.46f)
                curveToRelative(-0.43f, 5.51f, 4.31f, 6.22f, 4.94f, 0.59f)
                curveTo(18.22f, 1.73f, 17.25f, 0.18f, 15.88f, 0.01f)
                close()
            }
        }.also { _Paw = it}
