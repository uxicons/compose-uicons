package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaBallExercise: ImageVector? = null

val Icons.Br.YogaBallExercise: ImageVector
    get() = _YogaBallExercise ?: UXIcon(name = "YogaBallExercise") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.5f, 15f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(4.41f)
            curveToRelative(-1.23f, -2.04f, -3.45f, -3.41f, -6f, -3.41f)
            curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
            reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
            curveToRelative(3.88f, 0.0f, 7.04f, -3.18f, 7.0f, -7.06f)
            curveToRelative(0.63f, 0.66f, 1.55f, 1.03f, 2.5f, 1.06f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(8.25f, 13.22f)
            curveToRelative(0.33f, 1.24f, 1.29f, 2.21f, 2.53f, 2.53f)
            curveToRelative(0.2f, 0.57f, 0.28f, 1.23f, 0.16f, 1.84f)
            curveToRelative(-2.54f, 0.26f, -4.76f, -2.0f, -4.54f, -4.53f)
            curveToRelative(0.61f, -0.12f, 1.27f, -0.04f, 1.85f, 0.16f)
            close()
            moveTo(3f, 17f)
            curveToRelative(0f, -0.74f, 0.22f, -1.43f, 0.57f, -2.02f)
            curveToRelative(0.62f, 2.71f, 2.75f, 4.83f, 5.46f, 5.45f)
            curveToRelative(-0.6f, 0.35f, -1.28f, 0.57f, -2.02f, 0.57f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            close()
            moveTo(14f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
        }
    }.also { _YogaBallExercise = it }
