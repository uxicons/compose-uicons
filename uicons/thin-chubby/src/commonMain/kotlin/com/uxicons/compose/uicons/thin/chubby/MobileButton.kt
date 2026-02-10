package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileButton: ImageVector? = null

val Icons.Tc.MobileButton: ImageVector
    get() = _MobileButton ?: UXIcon(name = "MobileButton") {
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
                curveToRelative(0.13f, 0.05f, 3.31f, 1.24f, 6.81f, 1.24f)
                curveToRelative(3.62f, 0f, 6.69f, -1.19f, 6.82f, -1.24f)
                curveToRelative(0.16f, -0.06f, 0.27f, -0.2f, 0.31f, -0.36f)
                curveToRelative(0.04f, -0.17f, 0.88f, -4.11f, 0.88f, -9.4f)
                curveToRelative(0f, -5.33f, -0.84f, -9.23f, -0.88f, -9.4f)
                close()
                moveTo(18.2f, 20.92f)
                curveToRelative(-0.79f, 0.28f, -3.35f, 1.08f, -6.2f, 1.08f)
                curveToRelative(-2.76f, 0f, -5.39f, -0.81f, -6.2f, -1.08f)
                curveToRelative(-0.19f, -0.98f, -0.8f, -4.53f, -0.8f, -8.91f)
                reflectiveCurveToRelative(0.61f, -7.93f, 0.8f, -8.92f)
                curveToRelative(0.8f, -0.28f, 3.39f, -1.08f, 6.2f, -1.08f)
                curveToRelative(2.86f, 0f, 5.41f, 0.81f, 6.2f, 1.08f)
                curveToRelative(0.19f, 0.97f, 0.8f, 4.47f, 0.8f, 8.92f)
                curveToRelative(0f, 4.41f, -0.61f, 7.94f, -0.8f, 8.92f)
                close()
            }
        }.also { _MobileButton = it}
