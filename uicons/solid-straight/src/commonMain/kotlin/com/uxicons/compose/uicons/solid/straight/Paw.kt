package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paw: ImageVector? = null

val Icons.Ss.Paw: ImageVector
    get() = _Paw ?: UXIcon(name = "Paw") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 24f)
                arcToRelative(8.81f, 8.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, -0.45f)
                arcToRelative(9.61f, 9.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.21f, 0f)
                curveToRelative(-3.3f, 1.18f, -6.02f, 0.02f, -5.9f, -3.18f)
                curveTo(3f, 15.64f, 7.46f, 11f, 12f, 11f)
                reflectiveCurveToRelative(9f, 4.64f, 9f, 9.37f)
                curveTo(21f, 22.02f, 20.39f, 24f, 17.5f, 24f)
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
                moveTo(15.84f, 0.01f)
                curveToRelative(-1.36f, -0.16f, -2.6f, 1.13f, -2.81f, 3.46f)
                curveToRelative(-0.43f, 5.51f, 4.31f, 6.22f, 4.94f, 0.59f)
                curveTo(18.18f, 1.73f, 17.21f, 0.18f, 15.84f, 0.01f)
                close()
            }
        }.also { _Paw = it}
