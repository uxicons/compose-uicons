package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Perfume: ImageVector? = null

val Icons.Sr.Perfume: ImageVector
    get() = _Perfume ?: UXIcon(name = "Perfume") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.92f, 5.35f)
                curveToRelative(-0.33f, 1.8f, -1.8f, 3.25f, -3.61f, 3.58f)
                reflectiveCurveToRelative(-3.43f, -0.45f, -4.4f, -1.74f)
                curveToRelative(-1.39f, 0.64f, -2.62f, 0.77f, -3.92f, 0.8f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.49f)
                curveToRelative(1.11f, -0.02f, 2.05f, -0.14f, 3.09f, -0.62f)
                curveToRelative(-0.17f, -0.87f, -0.12f, -1.81f, 0.4f, -2.82f)
                curveToRelative(0.78f, -1.48f, 2.27f, -2.53f, 3.94f, -2.56f)
                curveToRelative(2.79f, -0.04f, 5.02f, 2.48f, 4.49f, 5.35f)
                close()
                moveTo(14.61f, 10f)
                horizontalLineToRelative(-11.22f)
                curveToRelative(-2.06f, 1.65f, -3.39f, 4.16f, -3.39f, 7f)
                curveToRelative(-0.0f, 1.6f, 0.42f, 3.17f, 1.19f, 4.54f)
                curveToRelative(0.86f, 1.55f, 2.54f, 2.46f, 4.31f, 2.46f)
                horizontalLineToRelative(7.01f)
                curveToRelative(1.77f, 0f, 3.45f, -0.91f, 4.31f, -2.46f)
                curveToRelative(0.76f, -1.37f, 1.19f, -2.94f, 1.19f, -4.54f)
                curveToRelative(0f, -2.84f, -1.33f, -5.35f, -3.39f, -7f)
                close()
            }
        }.also { _Perfume = it}
