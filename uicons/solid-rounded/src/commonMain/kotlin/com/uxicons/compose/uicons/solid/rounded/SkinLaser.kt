package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkinLaser: ImageVector? = null

val Icons.Sr.SkinLaser: ImageVector
    get() = _SkinLaser ?: UXIcon(name = "SkinLaser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17.21f, 12.33f)
                lineToRelative(-4.91f, 4.89f)
                curveToRelative(-1.05f, 1.05f, -2.75f, 1.03f, -3.78f, -0.04f)
                curveToRelative(-2.06f, -2.13f, -3.07f, -3.65f, -5.38f, -6.74f)
                curveToRelative(-1.36f, -1.82f, -1.54f, -4.33f, -0.31f, -6.2f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(1.87f, -1.24f, 4.32f, -1.03f, 6.25f, 0.33f)
                curveToRelative(2.62f, 1.84f, 4.39f, 3.18f, 6.68f, 5.4f)
                curveToRelative(1.06f, 1.03f, 1.07f, 2.73f, 0.03f, 3.77f)
                close()
                moveTo(11f, 9.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(19.95f, 14.54f)
                curveToRelative(-0.23f, -0.32f, -0.6f, -0.77f, -0.97f, -1.22f)
                curveToRelative(-0.11f, 0.14f, -0.22f, 0.3f, -0.35f, 0.43f)
                lineToRelative(-4.91f, 4.9f)
                curveToRelative(-0.1f, 0.1f, -0.22f, 0.18f, -0.33f, 0.27f)
                curveToRelative(0.45f, 0.37f, 0.91f, 0.74f, 1.22f, 0.97f)
                curveToRelative(0.69f, 0.5f, 1.65f, 0.42f, 2.25f, -0.18f)
                lineToRelative(2.91f, -2.91f)
                curveToRelative(0.61f, -0.61f, 0.69f, -1.56f, 0.18f, -2.25f)
                close()
            }
        }.also { _SkinLaser = it}
