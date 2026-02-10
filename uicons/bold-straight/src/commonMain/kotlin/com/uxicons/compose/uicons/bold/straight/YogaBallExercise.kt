package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaBallExercise: ImageVector? = null

val Icons.Bs.YogaBallExercise: ImageVector
    get() = _YogaBallExercise ?: UXIcon(name = "YogaBallExercise") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.98f, 0f, -1.87f, -0.41f, -2.5f, -1.06f)
                curveToRelative(0f, 0.02f, 0.0f, 0.04f, 0.0f, 0.06f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                curveToRelative(2.55f, 0f, 4.78f, 1.37f, 6f, 3.41f)
                verticalLineToRelative(-4.41f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 13f)
                curveToRelative(-0.21f, 0f, -0.4f, 0.03f, -0.6f, 0.06f)
                curveToRelative(-0.01f, 0.1f, -0.02f, 0.2f, -0.02f, 0.3f)
                curveToRelative(0f, 2.35f, 1.91f, 4.26f, 4.26f, 4.26f)
                curveToRelative(0.1f, 0f, 0.2f, -0.02f, 0.3f, -0.03f)
                curveToRelative(0.03f, -0.19f, 0.06f, -0.39f, 0.06f, -0.59f)
                curveToRelative(0f, -0.44f, -0.09f, -0.85f, -0.22f, -1.25f)
                curveToRelative(-1.24f, -0.33f, -2.21f, -1.29f, -2.53f, -2.53f)
                curveToRelative(-0.4f, -0.13f, -0.81f, -0.22f, -1.25f, -0.22f)
                close()
                moveTo(7f, 21f)
                curveToRelative(0.74f, 0f, 1.43f, -0.22f, 2.02f, -0.57f)
                curveToRelative(-2.71f, -0.62f, -4.83f, -2.75f, -5.46f, -5.45f)
                curveToRelative(-0.35f, 0.6f, -0.57f, 1.28f, -0.57f, 2.02f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
            }
        }.also { _YogaBallExercise = it}
