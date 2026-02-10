package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Tc.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.75f, 6f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(22.76f, 7.43f)
                curveToRelative(-0.43f, 0.26f, -0.99f, 0.55f, -1.76f, 0.77f)
                verticalLineToRelative(2.8f)
                curveToRelative(0f, 6.13f, -2.17f, 9.12f, -7.33f, 9.83f)
                curveToRelative(0.14f, 0.51f, 0.25f, 1.05f, 0.32f, 1.61f)
                curveToRelative(0.04f, 0.27f, -0.16f, 0.52f, -0.43f, 0.56f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.16f, -0.56f, -0.43f)
                curveToRelative(-0.07f, -0.57f, -0.19f, -1.12f, -0.33f, -1.63f)
                curveToRelative(-0.53f, 0.04f, -1.08f, 0.07f, -1.67f, 0.07f)
                curveToRelative(-0.45f, 0f, -0.88f, -0.01f, -1.29f, -0.04f)
                curveToRelative(0.12f, 0.47f, 0.22f, 0.96f, 0.29f, 1.47f)
                curveToRelative(0.04f, 0.27f, -0.16f, 0.52f, -0.43f, 0.56f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.16f, -0.56f, -0.43f)
                curveToRelative(-0.08f, -0.59f, -0.2f, -1.16f, -0.35f, -1.69f)
                curveToRelative(-5.4f, -0.62f, -7.65f, -3.61f, -7.65f, -9.87f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveToRelative(0f, 2.58f, 0.92f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -0.92f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.21f, 1.79f, -6f, 6f, -6f)
                curveToRelative(3.77f, 0f, 5.59f, 1.46f, 5.93f, 4.78f)
                curveToRelative(0.81f, 0.23f, 1.38f, 0.52f, 1.83f, 0.79f)
                curveToRelative(0.15f, 0.09f, 0.24f, 0.25f, 0.24f, 0.43f)
                reflectiveCurveToRelative(-0.09f, 0.34f, -0.24f, 0.43f)
                close()
                moveTo(20f, 7f)
                curveToRelative(0f, -3.65f, -1.35f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.35f, -5f, 5f)
                verticalLineToRelative(0.3f)
                curveToRelative(2.06f, 0.58f, 3f, 2.04f, 3f, 4.7f)
                curveToRelative(0f, 3.5f, -1.65f, 5f, -5.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(3.76f, 0f, 4.5f, -1.47f, 4.5f, -4f)
                curveToRelative(0f, -2.11f, -0.59f, -3.19f, -2.05f, -3.68f)
                curveToRelative(-0.23f, 2.56f, -1.59f, 3.68f, -4.45f, 3.68f)
                curveToRelative(-1.63f, 0f, -2.77f, -0.36f, -3.5f, -1.14f)
                curveToRelative(-0.05f, 6.5f, 2.46f, 9.16f, 9f, 9.14f)
                curveToRelative(6.48f, 0f, 9f, -2.52f, 9f, -9f)
                close()
            }
        }.also { _Bird = it}
