package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stomach: ImageVector? = null

val Icons.Sr.Stomach: ImageVector
    get() = _Stomach ?: UXIcon(name = "Stomach") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.4f, 0f, -2.7f, -0.97f, -3.03f, -2.25f)
                curveToRelative(-0.14f, -0.54f, -0.69f, -0.85f, -1.22f, -0.72f)
                curveToRelative(-0.54f, 0.14f, -0.86f, 0.68f, -0.72f, 1.22f)
                curveToRelative(0.48f, 1.85f, 2.07f, 3.28f, 3.97f, 3.65f)
                verticalLineToRelative(9.1f)
                curveToRelative(0f, 2.18f, -3.61f, 3.19f, -3.74f, 3.33f)
                curveToRelative(-1.9f, 0.71f, -3.26f, 2.53f, -3.26f, 4.67f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.3f, 0.84f, -2.41f, 2.01f, -2.82f)
                curveToRelative(0.17f, 0.1f, 0.34f, 0.21f, 0.5f, 0.31f)
                curveToRelative(2.01f, 1.27f, 3.91f, 2.48f, 8.49f, 2.5f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.83f, 0f, 3.57f, -0.72f, 4.89f, -2.03f)
                curveToRelative(1.34f, -1.33f, 2.08f, -3.1f, 2.08f, -4.97f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(19.91f, 12.7f)
                curveToRelative(-0.22f, 0.51f, -0.81f, 0.73f, -1.32f, 0.51f)
                curveToRelative(-0.32f, -0.14f, -0.67f, -0.21f, -1.05f, -0.21f)
                curveToRelative(-0.6f, 0f, -0.98f, 0.18f, -1.46f, 0.41f)
                curveToRelative(-0.57f, 0.27f, -1.27f, 0.59f, -2.31f, 0.59f)
                curveToRelative(-0.74f, 0f, -1.47f, -0.16f, -2.18f, -0.48f)
                curveToRelative(-0.5f, -0.23f, -0.73f, -0.82f, -0.5f, -1.32f)
                curveToRelative(0.23f, -0.5f, 0.82f, -0.73f, 1.32f, -0.5f)
                curveToRelative(0.45f, 0.2f, 0.91f, 0.3f, 1.36f, 0.3f)
                curveToRelative(0.6f, 0f, 0.98f, -0.18f, 1.46f, -0.41f)
                curveToRelative(0.57f, -0.27f, 1.27f, -0.59f, 2.31f, -0.59f)
                curveToRelative(0.66f, 0f, 1.28f, 0.13f, 1.86f, 0.38f)
                curveToRelative(0.51f, 0.22f, 0.73f, 0.81f, 0.51f, 1.32f)
                close()
            }
        }.also { _Stomach = it}
