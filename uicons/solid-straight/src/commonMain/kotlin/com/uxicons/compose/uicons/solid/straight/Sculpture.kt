package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sculpture: ImageVector? = null

val Icons.Ss.Sculpture: ImageVector
    get() = _Sculpture ?: UXIcon(name = "Sculpture") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 13.9f)
                curveToRelative(-1.77f, -0.78f, -3.92f, -1.21f, -5.5f, -1.4f)
                verticalLineToRelative(-1.03f)
                curveToRelative(1.84f, -1.3f, 3f, -4.32f, 3f, -6.46f)
                curveToRelative(0f, -2.89f, -2.11f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.11f, -5f, 5f)
                curveToRelative(0f, 2.14f, 1.16f, 5.16f, 3f, 6.46f)
                verticalLineToRelative(1.03f)
                curveToRelative(-1.57f, 0.19f, -3.74f, 0.62f, -5.5f, 1.39f)
                curveToRelative(-0.33f, 0.15f, -0.58f, 0.39f, -0.75f, 0.67f)
                lineToRelative(1.26f, 0.76f)
                curveToRelative(1.74f, 0.85f, 3.41f, 1.36f, 5.11f, 1.57f)
                curveToRelative(0.0f, 0f, 1.17f, 0.12f, 1.88f, 0.12f)
                reflectiveCurveToRelative(1.88f, -0.12f, 1.88f, -0.12f)
                curveToRelative(1.13f, -0.14f, 2.25f, -0.42f, 3.38f, -0.84f)
                curveToRelative(-0.63f, 0.86f, -1.2f, 1.72f, -1.73f, 2.59f)
                curveToRelative(-0.47f, 0.1f, -0.94f, 0.18f, -1.42f, 0.24f)
                curveToRelative(-0.05f, 0.01f, -1.29f, 0.13f, -2.1f, 0.13f)
                reflectiveCurveToRelative(-2.05f, -0.12f, -2.1f, -0.13f)
                curveToRelative(-1.82f, -0.22f, -3.58f, -0.75f, -5.38f, -1.58f)
                curveToRelative(1.1f, 1.46f, 2.11f, 3.0f, 2.98f, 4.71f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(1.04f, -2.06f, 2.29f, -3.92f, 3.64f, -5.62f)
                curveToRelative(0.66f, -0.83f, 0.34f, -2.05f, -0.64f, -2.48f)
                close()
            }
        }.also { _Sculpture = it}
