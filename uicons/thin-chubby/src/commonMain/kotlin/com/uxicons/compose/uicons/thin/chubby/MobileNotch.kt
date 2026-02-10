package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Tc.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.24f, 17.96f)
                horizontalLineToRelative(-2.49f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.49f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.12f, 2.6f)
                curveToRelative(-0.04f, -0.16f, -0.15f, -0.3f, -0.3f, -0.36f)
                curveToRelative(-0.13f, -0.05f, -3.19f, -1.24f, -6.82f, -1.24f)
                curveToRelative(-3.56f, 0f, -6.69f, 1.19f, -6.82f, 1.24f)
                curveToRelative(-0.16f, 0.06f, -0.27f, 0.2f, -0.31f, 0.36f)
                curveToRelative(-0.01f, 0.04f, -0.87f, 4.14f, -0.87f, 9.4f)
                reflectiveCurveToRelative(0.86f, 9.36f, 0.87f, 9.4f)
                curveToRelative(0.04f, 0.17f, 0.15f, 0.3f, 0.31f, 0.36f)
                curveToRelative(0.13f, 0.05f, 3.32f, 1.24f, 6.81f, 1.24f)
                curveToRelative(3.62f, 0f, 6.69f, -1.19f, 6.82f, -1.24f)
                curveToRelative(0.16f, -0.06f, 0.27f, -0.2f, 0.31f, -0.36f)
                curveToRelative(0.04f, -0.17f, 0.87f, -4.11f, 0.87f, -9.4f)
                curveToRelative(0f, -5.33f, -0.84f, -9.23f, -0.88f, -9.4f)
                close()
                moveTo(14.26f, 2.16f)
                curveToRelative(-0.06f, 0.72f, -0.14f, 1.25f, -0.19f, 1.55f)
                curveToRelative(-0.39f, 0.12f, -1.19f, 0.33f, -2.07f, 0.33f)
                curveToRelative(-0.85f, 0f, -1.67f, -0.21f, -2.07f, -0.34f)
                curveToRelative(-0.05f, -0.29f, -0.13f, -0.83f, -0.19f, -1.54f)
                curveToRelative(0.71f, -0.1f, 1.47f, -0.16f, 2.26f, -0.16f)
                reflectiveCurveToRelative(1.55f, 0.06f, 2.26f, 0.16f)
                close()
                moveTo(18.2f, 20.92f)
                curveToRelative(-0.79f, 0.28f, -3.35f, 1.08f, -6.2f, 1.08f)
                curveToRelative(-2.76f, 0f, -5.39f, -0.81f, -6.2f, -1.08f)
                curveToRelative(-0.19f, -0.98f, -0.8f, -4.53f, -0.8f, -8.91f)
                reflectiveCurveToRelative(0.61f, -7.93f, 0.8f, -8.92f)
                curveToRelative(0.47f, -0.16f, 1.57f, -0.51f, 2.95f, -0.76f)
                curveToRelative(0.09f, 1.17f, 0.25f, 1.85f, 0.26f, 1.88f)
                curveToRelative(0.04f, 0.16f, 0.15f, 0.29f, 0.31f, 0.35f)
                curveToRelative(0.05f, 0.02f, 1.3f, 0.49f, 2.68f, 0.49f)
                curveToRelative(1.42f, 0f, 2.63f, -0.47f, 2.69f, -0.49f)
                curveToRelative(0.15f, -0.06f, 0.27f, -0.19f, 0.3f, -0.35f)
                curveToRelative(0.01f, -0.03f, 0.17f, -0.71f, 0.26f, -1.89f)
                curveToRelative(1.4f, 0.26f, 2.49f, 0.6f, 2.95f, 0.77f)
                curveToRelative(0.19f, 0.97f, 0.8f, 4.48f, 0.8f, 8.92f)
                curveToRelative(0f, 4.41f, -0.61f, 7.94f, -0.8f, 8.92f)
                close()
            }
        }.also { _MobileNotch = it}
