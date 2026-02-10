package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSouth: ImageVector? = null

val Icons.Rr.CompassSouth: ImageVector
    get() = _CompassSouth ?: UXIcon(name = "CompassSouth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.4f, 7.22f)
                curveToRelative(-0.69f, -0.3f, -1.47f, -0.29f, -2.23f, 0.07f)
                curveToRelative(-0.15f, 0.09f, -1.25f, 0.66f, -2.18f, 1.14f)
                curveToRelative(-0.78f, -0.4f, -2.29f, -1.17f, -2.46f, -1.26f)
                curveToRelative(-0.9f, -0.37f, -1.99f, -0.14f, -2.73f, 0.6f)
                curveToRelative(-0.76f, 0.78f, -0.96f, 1.91f, -0.52f, 2.88f)
                curveToRelative(0.01f, 0.02f, 3.39f, 6.39f, 3.39f, 6.39f)
                curveToRelative(0.44f, 0.89f, 1.33f, 1.46f, 2.32f, 1.46f)
                curveToRelative(0.99f, 0f, 1.89f, -0.56f, 2.32f, -1.41f)
                curveToRelative(0.11f, -0.2f, 2.77f, -5.01f, 3.4f, -6.45f)
                curveToRelative(0.28f, -0.63f, 0.3f, -1.34f, 0.05f, -1.98f)
                curveToRelative(-0.25f, -0.65f, -0.73f, -1.15f, -1.36f, -1.43f)
                close()
                moveTo(15.88f, 9.83f)
                curveToRelative(-0.59f, 1.36f, -3.29f, 6.24f, -3.33f, 6.32f)
                curveToRelative(-0.15f, 0.3f, -0.43f, 0.33f, -0.54f, 0.33f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.11f, 0f, -0.39f, -0.03f, -0.55f, -0.36f)
                curveToRelative(-2.52f, -4.74f, -3.17f, -5.97f, -3.35f, -6.31f)
                curveToRelative(-0.1f, -0.21f, -0.04f, -0.47f, 0.12f, -0.64f)
                curveToRelative(0.18f, -0.18f, 0.43f, -0.2f, 0.47f, -0.19f)
                curveToRelative(0.17f, 0.08f, 2.85f, 1.45f, 2.85f, 1.45f)
                curveToRelative(0.29f, 0.15f, 0.63f, 0.15f, 0.91f, 0f)
                curveToRelative(0.41f, -0.21f, 2.44f, -1.25f, 2.66f, -1.39f)
                curveToRelative(0.15f, -0.07f, 0.32f, -0.07f, 0.48f, -0.0f)
                curveToRelative(0.14f, 0.06f, 0.25f, 0.18f, 0.31f, 0.32f)
                curveToRelative(0.06f, 0.15f, 0.05f, 0.31f, -0.02f, 0.46f)
                close()
            }
        }.also { _CompassSouth = it}
