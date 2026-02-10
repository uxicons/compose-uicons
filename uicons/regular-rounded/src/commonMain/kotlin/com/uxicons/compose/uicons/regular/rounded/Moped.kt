package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moped: ImageVector? = null

val Icons.Rr.Moped: ImageVector
    get() = _Moped ?: UXIcon(name = "Moped") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(23f, 13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.27f, 0f, -0.53f, 0.02f, -0.8f, 0.05f)
                lineToRelative(-1.68f, -4.31f)
                curveToRelative(0.29f, 0.16f, 0.62f, 0.26f, 0.97f, 0.26f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.89f, 0f, -1.64f, 0.59f, -1.9f, 1.4f)
                curveToRelative(-0.64f, -1.46f, -2.05f, -2.4f, -3.65f, -2.4f)
                horizontalLineToRelative(-0.45f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.45f)
                curveToRelative(0.82f, 0f, 1.57f, 0.51f, 1.86f, 1.27f)
                lineToRelative(2.45f, 6.29f)
                curveToRelative(-0.93f, 0.4f, -1.78f, 1.0f, -2.48f, 1.77f)
                lineToRelative(-1.64f, 1.95f)
                curveToRelative(-0.38f, 0.45f, -0.94f, 0.71f, -1.53f, 0.71f)
                horizontalLineToRelative(-0.23f)
                lineToRelative(-2.19f, -5.49f)
                curveToRelative(-0.61f, -1.53f, -2.07f, -2.52f, -3.71f, -2.52f)
                horizontalLineToRelative(-1.97f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.53f, 0.88f, 2.85f, 2.15f, 3.52f)
                curveToRelative(-0.09f, 0.32f, -0.15f, 0.64f, -0.15f, 0.98f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.04f, -0.5f)
                horizontalLineToRelative(3.15f)
                curveToRelative(1.18f, 0f, 2.3f, -0.52f, 3.06f, -1.42f)
                lineToRelative(1.62f, -1.92f)
                curveToRelative(0.95f, -1.05f, 2.3f, -1.66f, 3.72f, -1.66f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(4f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.97f)
                curveToRelative(0.82f, 0f, 1.55f, 0.49f, 1.86f, 1.26f)
                lineToRelative(1.9f, 4.74f)
                horizontalLineToRelative(-5.72f)
                close()
            }
        }.also { _Moped = it}
