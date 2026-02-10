package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaBallExercise: ImageVector? = null

val Icons.Sr.YogaBallExercise: ImageVector
    get() = _YogaBallExercise ?: UXIcon(name = "YogaBallExercise") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7.04f)
                verticalLineToRelative(0.0f)
                curveToRelative(-1.64f, 0.02f, -2.96f, 1.35f, -2.96f, 3.0f)
                verticalLineToRelative(4.45f)
                curveToRelative(-1.04f, -1.76f, -2.82f, -3.03f, -4.92f, -3.36f)
                curveToRelative(-0.56f, 3.06f, 1.98f, 5.98f, 5.09f, 5.84f)
                curveToRelative(0.39f, 1.2f, 1.51f, 2.07f, 2.84f, 2.07f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(6f, 10.92f)
                curveToRelative(0f, -0.28f, 0.02f, -0.57f, 0.05f, -0.85f)
                curveToRelative(-1.12f, 0.15f, -2.16f, 0.57f, -3.05f, 1.19f)
                curveToRelative(0.01f, 5.25f, 4.35f, 9.53f, 9.75f, 9.72f)
                curveToRelative(0.63f, -0.91f, 1.05f, -1.97f, 1.19f, -3.11f)
                curveToRelative(-0.31f, 0.04f, -0.61f, 0.07f, -0.92f, 0.07f)
                curveToRelative(-3.87f, 0f, -7.02f, -3.15f, -7.02f, -7.02f)
                close()
                moveTo(1.17f, 13.13f)
                curveToRelative(-0.74f, 1.11f, -1.17f, 2.44f, -1.17f, 3.87f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                curveToRelative(1.45f, 0f, 2.8f, -0.45f, 3.92f, -1.2f)
                curveToRelative(-5.0f, -0.9f, -8.93f, -4.78f, -9.75f, -9.66f)
                close()
            }
        }.also { _YogaBallExercise = it}
