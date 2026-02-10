package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Perfume: ImageVector? = null

val Icons.Ss.Perfume: ImageVector
    get() = _Perfume ?: UXIcon(name = "Perfume") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-1.47f, 0f, -2.76f, -0.72f, -3.58f, -1.81f)
                curveToRelative(-1.39f, 0.64f, -2.62f, 0.77f, -3.92f, 0.8f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(0.99f)
                curveToRelative(1.11f, -0.02f, 2.05f, -0.14f, 3.09f, -0.62f)
                curveToRelative(-0.06f, -0.28f, -0.09f, -0.57f, -0.09f, -0.87f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(14.61f, 10f)
                horizontalLineToRelative(-11.22f)
                curveToRelative(-2.06f, 1.65f, -3.39f, 4.16f, -3.39f, 7f)
                curveToRelative(-0.0f, 2.68f, 1.2f, 5.3f, 3.18f, 7f)
                horizontalLineToRelative(11.63f)
                curveToRelative(1.98f, -1.7f, 3.19f, -4.32f, 3.18f, -7f)
                curveToRelative(0f, -2.84f, -1.33f, -5.35f, -3.39f, -7f)
                close()
            }
        }.also { _Perfume = it}
