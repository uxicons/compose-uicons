package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellFitness: ImageVector? = null

val Icons.Sr.DumbbellFitness: ImageVector
    get() = _DumbbellFitness ?: UXIcon(name = "DumbbellFitness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 0f)
                curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(11.53f, 0f, 8.5f, 0f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.01f, 19.09f)
                curveToRelative(0f, 1.17f, -0.68f, 2.23f, -1.75f, 2.73f)
                curveToRelative(-1.99f, 0.93f, -5.58f, 2.2f, -10.25f, 2.2f)
                curveToRelative(-4.91f, 0f, -9.17f, -2.34f, -10.79f, -3.9f)
                curveToRelative(-0.78f, -0.75f, -1.22f, -1.78f, -1.22f, -2.86f)
                curveToRelative(0.0f, -1.95f, 0.49f, -5.1f, 1.86f, -8.29f)
                curveToRelative(1.0f, 1.91f, 2.81f, 3.33f, 4.97f, 3.82f)
                curveToRelative(-0.11f, 1.02f, -0.31f, 2.01f, -0.64f, 2.88f)
                curveToRelative(0.53f, -0.64f, 2.99f, -2.59f, 6.32f, -2.67f)
                curveToRelative(2.1f, -0.04f, 4.12f, 1.92f, 4.17f, 1.97f)
                curveToRelative(0.2f, 0.2f, 0.46f, 0.3f, 0.72f, 0.3f)
                curveToRelative(0.25f, 0f, 0.5f, -0.1f, 0.7f, -0.28f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.02f, -1.41f)
                curveToRelative(-0.05f, -0.05f, -0.58f, -0.59f, -1.43f, -1.17f)
                curveToRelative(0.88f, -0.72f, 2.06f, -1.43f, 3.32f, -1.43f)
                curveToRelative(0.45f, 0f, 0.88f, 0.02f, 1.3f, 0.06f)
                curveToRelative(1.54f, 0.13f, 2.7f, 1.44f, 2.7f, 2.99f)
                verticalLineToRelative(5.05f)
                close()
            }
        }.also { _DumbbellFitness = it}
