package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PigFace: ImageVector? = null

val Icons.Sr.PigFace: ImageVector
    get() = _PigFace ?: UXIcon(name = "PigFace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 16.5f)
                curveToRelative(0f, 0.81f, -0.92f, 1.5f, -2f, 1.5f)
                reflectiveCurveToRelative(-2f, -0.69f, -2f, -1.5f)
                reflectiveCurveToRelative(0.92f, -1.5f, 2f, -1.5f)
                reflectiveCurveToRelative(2f, 0.69f, 2f, 1.5f)
                close()
                moveTo(23f, 13f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 19.07f, 1f, 13f)
                reflectiveCurveTo(5.93f, 2f, 12f, 2f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                close()
                moveTo(8.5f, 12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(16f, 16.5f)
                curveToRelative(0f, -1.93f, -1.79f, -3.5f, -4f, -3.5f)
                reflectiveCurveToRelative(-4f, 1.57f, -4f, 3.5f)
                reflectiveCurveToRelative(1.79f, 3.5f, 4f, 3.5f)
                reflectiveCurveToRelative(4f, -1.57f, 4f, -3.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(0.96f, 6.13f)
                curveTo(2.43f, 3.77f, 4.64f, 1.92f, 7.27f, 0.89f)
                curveTo(5.8f, 0.17f, 4.15f, 0.05f, 2.62f, 0.01f)
                curveTo(1.88f, -0.0f, 1.15f, 0.31f, 0.65f, 0.88f)
                curveTo(0.16f, 1.44f, -0.05f, 2.18f, 0.06f, 2.91f)
                curveToRelative(0.09f, 0.57f, 0.33f, 1.76f, 0.9f, 3.22f)
                close()
                moveTo(23.06f, 6.16f)
                curveToRelative(0.47f, -1.14f, 0.81f, -2.26f, 0.96f, -3.25f)
                curveToRelative(0.12f, -0.73f, -0.1f, -1.48f, -0.59f, -2.04f)
                curveToRelative(-0.49f, -0.57f, -1.21f, -0.88f, -1.97f, -0.86f)
                curveToRelative(-1.56f, 0.04f, -3.24f, 0.16f, -4.72f, 0.88f)
                curveToRelative(2.63f, 1.03f, 4.84f, 2.9f, 6.31f, 5.27f)
                close()
            }
        }.also { _PigFace = it}
