package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Sr.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 2.32f)
                curveToRelative(0.02f, -0.65f, -0.25f, -1.28f, -0.74f, -1.72f)
                curveToRelative(-0.49f, -0.45f, -1.15f, -0.66f, -1.8f, -0.59f)
                curveToRelative(-5.66f, 0.65f, -8.26f, 4.43f, -9.45f, 7.57f)
                curveTo(10.81f, 4.45f, 8.21f, 0.67f, 2.55f, 0.01f)
                curveTo(1.9f, -0.06f, 1.24f, 0.15f, 0.75f, 0.6f)
                curveTo(0.27f, 1.05f, -0.0f, 1.67f, 0.01f, 2.32f)
                curveToRelative(0.09f, 3.27f, 1.16f, 5.87f, 3.18f, 7.72f)
                curveToRelative(2.61f, 2.39f, 6.08f, 2.86f, 7.81f, 2.94f)
                verticalLineToRelative(10.01f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-10.01f)
                curveToRelative(1.73f, -0.08f, 5.2f, -0.56f, 7.81f, -2.94f)
                curveToRelative(2.02f, -1.85f, 3.09f, -4.45f, 3.18f, -7.72f)
                close()
            }
        }.also { _Seedling = it}
