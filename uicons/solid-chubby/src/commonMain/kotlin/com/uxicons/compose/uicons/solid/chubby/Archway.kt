package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Sc.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.84f, 6.47f)
                curveToRelative(2.09f, -0.41f, 5.6f, -0.97f, 9.16f, -0.97f)
                reflectiveCurveToRelative(7.08f, 0.56f, 9.16f, 0.97f)
                lineToRelative(0.81f, -3.23f)
                curveToRelative(0.07f, -0.27f, 0.02f, -0.55f, -0.12f, -0.78f)
                reflectiveCurveToRelative(-0.38f, -0.39f, -0.65f, -0.45f)
                curveToRelative(-0.21f, -0.04f, -5.14f, -1.02f, -9.2f, -1.02f)
                reflectiveCurveToRelative(-8.99f, 0.98f, -9.2f, 1.02f)
                curveToRelative(-0.27f, 0.05f, -0.5f, 0.21f, -0.65f, 0.45f)
                curveToRelative(-0.15f, 0.23f, -0.19f, 0.51f, -0.12f, 0.78f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 20f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(0.28f, -1.57f, 0.57f, -3.77f, 0.57f, -6f)
                curveToRelative(0f, -2.44f, -1f, -5.5f, -1f, -5.5f)
                reflectiveCurveToRelative(-4.5f, -1f, -9f, -1f)
                reflectiveCurveToRelative(-9f, 1f, -9f, 1f)
                reflectiveCurveToRelative(-1f, 3.06f, -1f, 5.5f)
                curveToRelative(0f, 2.23f, 0.29f, 4.43f, 0.57f, 6f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Archway = it}
