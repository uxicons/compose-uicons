package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLocation: ImageVector? = null

val Icons.Sc.LandLocation: ImageVector
    get() = _LandLocation ?: UXIcon(name = "LandLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                curveToRelative(0f, 3.91f, 4.79f, 8.27f, 5.34f, 8.75f)
                curveToRelative(0.19f, 0.17f, 0.43f, 0.25f, 0.66f, 0.25f)
                reflectiveCurveToRelative(0.47f, -0.08f, 0.66f, -0.25f)
                curveToRelative(0.55f, -0.48f, 5.34f, -4.84f, 5.34f, -8.75f)
                curveToRelative(0f, -4.15f, -1.85f, -6f, -6f, -6f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-1.43f, 0f, -2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                close()
                moveTo(23f, 20.89f)
                curveToRelative(0f, 0.47f, -0.33f, 0.88f, -0.79f, 0.98f)
                curveToRelative(-0.12f, 0.03f, -1.84f, 0.4f, -4.22f, 0.71f)
                curveToRelative(-0.01f, -1.82f, -0.14f, -3.75f, -0.3f, -5.57f)
                horizontalLineToRelative(5.12f)
                curveToRelative(0.11f, 1.28f, 0.19f, 2.63f, 0.19f, 3.89f)
                close()
                moveTo(6.68f, 13.61f)
                curveToRelative(-0.06f, 0.45f, -0.11f, 0.91f, -0.17f, 1.39f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(0.26f, -2.21f, 0.56f, -3.94f, 0.61f, -4.26f)
                curveToRelative(0.07f, -0.41f, 0.39f, -0.73f, 0.8f, -0.81f)
                curveToRelative(0.46f, -0.09f, 1.03f, -0.18f, 1.68f, -0.28f)
                curveToRelative(0.5f, 1.44f, 1.32f, 2.79f, 2.19f, 3.96f)
                close()
                moveTo(1.19f, 17f)
                horizontalLineToRelative(5.12f)
                curveToRelative(-0.17f, 1.82f, -0.29f, 3.75f, -0.3f, 5.57f)
                curveToRelative(-2.38f, -0.31f, -4.1f, -0.68f, -4.22f, -0.71f)
                curveToRelative(-0.46f, -0.1f, -0.79f, -0.51f, -0.79f, -0.98f)
                curveToRelative(0f, -1.26f, 0.08f, -2.6f, 0.19f, -3.89f)
                close()
                moveTo(22.6f, 15f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-0.06f, -0.48f, -0.11f, -0.94f, -0.17f, -1.39f)
                curveToRelative(0.87f, -1.17f, 1.69f, -2.53f, 2.19f, -3.96f)
                curveToRelative(0.65f, 0.1f, 1.23f, 0.2f, 1.68f, 0.28f)
                curveToRelative(0.41f, 0.08f, 0.73f, 0.4f, 0.8f, 0.81f)
                curveToRelative(0.06f, 0.32f, 0.35f, 2.05f, 0.61f, 4.26f)
                close()
                moveTo(15.68f, 17f)
                curveToRelative(0.18f, 1.91f, 0.31f, 3.93f, 0.32f, 5.8f)
                curveToRelative(-1.27f, 0.12f, -2.63f, 0.2f, -4.0f, 0.2f)
                reflectiveCurveToRelative(-2.73f, -0.08f, -4.0f, -0.2f)
                curveToRelative(0.01f, -1.87f, 0.14f, -3.89f, 0.32f, -5.8f)
                horizontalLineToRelative(7.36f)
                close()
            }
        }.also { _LandLocation = it}
