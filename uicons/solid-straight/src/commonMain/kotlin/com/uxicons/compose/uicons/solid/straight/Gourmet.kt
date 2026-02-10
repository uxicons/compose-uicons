package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gourmet: ImageVector? = null

val Icons.Ss.Gourmet: ImageVector
    get() = _Gourmet ?: UXIcon(name = "Gourmet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.31f, 19.52f)
                lineToRelative(-5.0f, 4.48f)
                horizontalLineToRelative(-16.31f)
                reflectiveCurveToRelative(1.11f, -4.27f, 1.15f, -4.38f)
                curveToRelative(0.61f, -2.13f, 2.55f, -3.62f, 4.79f, -3.62f)
                horizontalLineToRelative(5.78f)
                curveToRelative(1.06f, 0f, 1.92f, 0.86f, 1.92f, 1.92f)
                curveToRelative(0f, 0.95f, -0.71f, 1.77f, -1.65f, 1.9f)
                lineToRelative(-4.8f, 0.69f)
                lineToRelative(0.28f, 1.98f)
                lineToRelative(4.8f, -0.69f)
                curveToRelative(1.39f, -0.2f, 2.53f, -1.14f, 3.05f, -2.37f)
                lineToRelative(3.33f, -2.93f)
                curveToRelative(0.84f, -0.73f, 2.11f, -0.64f, 2.84f, 0.2f)
                curveToRelative(0.72f, 0.83f, 0.64f, 2.09f, -0.18f, 2.82f)
                close()
                moveTo(22.59f, 12f)
                curveToRelative(-0.75f, -4.57f, -4.37f, -8.16f, -8.95f, -8.86f)
                curveToRelative(0.22f, -0.32f, 0.36f, -0.71f, 0.36f, -1.14f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.42f, 0.13f, 0.81f, 0.36f, 1.14f)
                curveToRelative(-4.58f, 0.71f, -8.2f, 4.29f, -8.95f, 8.86f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Gourmet = it}
