package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dress: ImageVector? = null

val Icons.Br.Dress: ImageVector
    get() = _Dress ?: UXIcon(name = "Dress") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.55f, 13.69f)
            lineToRelative(-4.98f, -3.86f)
            lineToRelative(0.11f, -1.13f)
            curveToRelative(0.21f, -2.07f, 0.31f, -4.17f, 0.31f, -6.25f)
            verticalLineToRelative(-0.94f)
            curveTo(17f, 0.68f, 16.33f, 0.01f, 15.5f, 0.01f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.78f)
            curveToRelative(-1.4f, 0.55f, -2f, 1.72f, -2f, 1.72f)
            curveToRelative(0f, 0f, -0.6f, -1.17f, -2f, -1.72f)
            verticalLineToRelative(-0.78f)
            curveTo(10f, 0.68f, 9.33f, 0.01f, 8.5f, 0.01f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.94f)
            curveToRelative(0f, 2.08f, 0.1f, 4.18f, 0.31f, 6.25f)
            lineToRelative(0.11f, 1.14f)
            lineToRelative(-4.91f, 3.9f)
            curveToRelative(-1.6f, 1.39f, -1.84f, 3.82f, -0.54f, 5.53f)
            curveToRelative(2.19f, 2.88f, 6.13f, 4.74f, 10.03f, 4.74f)
            curveToRelative(3.92f, 0f, 8.0f, -1.9f, 10.16f, -4.74f)
            curveToRelative(1.3f, -1.71f, 1.06f, -4.13f, -0.61f, -5.58f)
            close()
            moveTo(13.88f, 6.01f)
            curveToRelative(-0.06f, 1.0f, -0.13f, 2.01f, -0.24f, 3f)
            horizontalLineToRelative(-3.29f)
            curveToRelative(-0.11f, -0.99f, -0.18f, -2.0f, -0.24f, -3f)
            horizontalLineToRelative(3.77f)
            close()
            moveTo(19.77f, 17.45f)
            curveToRelative(-1.59f, 2.09f, -4.79f, 3.55f, -7.77f, 3.55f)
            curveToRelative(-2.95f, 0f, -6.02f, -1.43f, -7.64f, -3.55f)
            curveToRelative(-0.35f, -0.46f, -0.3f, -1.08f, 0.07f, -1.4f)
            lineToRelative(5.09f, -4.04f)
            horizontalLineToRelative(4.96f)
            lineToRelative(5.16f, 4f)
            curveToRelative(0.42f, 0.36f, 0.47f, 0.99f, 0.12f, 1.45f)
            close()
        }
    }.also { _Dress = it }
