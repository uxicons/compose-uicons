package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSlash: ImageVector? = null

val Icons.Sr.CompassSlash: ImageVector
    get() = _CompassSlash ?: UXIcon(name = "CompassSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.48f, 22.21f)
                curveToRelative(-0.06f, 0.33f, -0.27f, 0.6f, -0.58f, 0.74f)
                curveToRelative(-1.55f, 0.69f, -3.2f, 1.05f, -4.91f, 1.05f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -1.71f, 0.35f, -3.36f, 1.05f, -4.91f)
                curveToRelative(0.14f, -0.3f, 0.41f, -0.51f, 0.73f, -0.57f)
                curveToRelative(0.32f, -0.06f, 0.66f, 0.04f, 0.89f, 0.28f)
                lineToRelative(5.47f, 5.46f)
                lineToRelative(-1.91f, 3.29f)
                curveToRelative(-0.84f, 1.45f, 0.78f, 3.07f, 2.23f, 2.23f)
                lineToRelative(3.29f, -1.91f)
                curveToRelative(5.8f, 5.8f, 5.82f, 5.86f, 5.73f, 6.35f)
                close()
                moveTo(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(2.55f, 2.55f)
                curveTo(6.42f, 1.01f, 9.14f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 2.85f, -1.01f, 5.57f, -2.85f, 7.74f)
                lineToRelative(2.55f, 2.55f)
                close()
                moveTo(11.4f, 8.21f)
                curveToRelative(-0.57f, 0.33f, -0.67f, 1.11f, -0.21f, 1.57f)
                horizontalLineToRelative(0f)
                curveToRelative(0.32f, 0.32f, 0.82f, 0.39f, 1.21f, 0.16f)
                lineToRelative(3.29f, -1.91f)
                curveToRelative(0.04f, -0.02f, 0.13f, -0.08f, 0.24f, 0.03f)
                curveToRelative(0.11f, 0.11f, 0.06f, 0.2f, 0.03f, 0.24f)
                lineToRelative(-1.91f, 3.29f)
                curveToRelative(-0.23f, 0.39f, -0.16f, 0.89f, 0.16f, 1.21f)
                horizontalLineToRelative(0f)
                curveToRelative(0.47f, 0.47f, 1.24f, 0.36f, 1.57f, -0.21f)
                lineToRelative(1.84f, -3.19f)
                curveToRelative(0.49f, -0.84f, 0.45f, -1.93f, -0.19f, -2.66f)
                curveToRelative(-0.71f, -0.8f, -1.84f, -0.98f, -2.75f, -0.45f)
                lineToRelative(-3.29f, 1.91f)
                close()
            }
        }.also { _CompassSlash = it}
