package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Tc.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 5.5f)
                curveToRelative(1.52f, 0f, 2.25f, -0.74f, 2.25f, -2.25f)
                reflectiveCurveToRelative(-0.74f, -2.25f, -2.25f, -2.25f)
                curveToRelative(-1.5f, 0f, -2.25f, 0.76f, -2.25f, 2.25f)
                curveToRelative(0f, 1.51f, 0.74f, 2.25f, 2.25f, 2.25f)
                close()
                moveTo(12.75f, 2f)
                curveToRelative(0.85f, 0f, 1.25f, 0.19f, 1.25f, 1.25f)
                curveToRelative(0f, 1.06f, -0.42f, 1.25f, -1.25f, 1.25f)
                curveToRelative(-0.85f, 0f, -1.25f, -0.19f, -1.25f, -1.25f)
                curveToRelative(0f, -1.06f, 0.42f, -1.25f, 1.25f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.57f, 11.51f)
                curveToRelative(-0.02f, -0.0f, -2.13f, -0.37f, -4.12f, -4.23f)
                curveToRelative(-0.0f, -0.01f, -0.06f, -0.09f, -0.07f, -0.11f)
                curveToRelative(-0.1f, -0.1f, -0.23f, -0.17f, -0.37f, -0.17f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.05f, 0f, -0.1f, 0.01f, -0.15f, 0.02f)
                curveToRelative(-0.32f, 0.1f, -3.17f, 1f, -4.13f, 2.01f)
                curveToRelative(-0.06f, 0.06f, -0.1f, 0.13f, -0.12f, 0.2f)
                lineToRelative(-1.08f, 3.67f)
                curveToRelative(-0.08f, 0.27f, 0.07f, 0.54f, 0.34f, 0.62f)
                curveToRelative(0.27f, 0.08f, 0.54f, -0.07f, 0.62f, -0.34f)
                lineToRelative(1.05f, -3.55f)
                curveToRelative(0.51f, -0.46f, 1.65f, -0.96f, 2.58f, -1.3f)
                curveToRelative(-0.76f, 1.93f, -1.01f, 3.96f, -0.81f, 6.33f)
                curveToRelative(0.02f, 0.19f, 0.14f, 0.36f, 0.32f, 0.42f)
                curveToRelative(0.07f, 0.03f, 6.72f, 2.56f, 6.72f, 7.41f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -2.59f, -1.55f, -4.56f, -3.23f, -5.94f)
                lineToRelative(0.74f, -7.47f)
                curveToRelative(2.02f, 3.1f, 4.0f, 3.39f, 4.09f, 3.4f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                curveToRelative(0.24f, 0f, 0.46f, -0.18f, 0.49f, -0.43f)
                curveToRelative(0.04f, -0.27f, -0.15f, -0.52f, -0.42f, -0.56f)
                close()
                moveTo(9.77f, 14.28f)
                curveToRelative(-0.17f, -2.36f, 0.18f, -4.36f, 1.06f, -6.27f)
                curveToRelative(0.0f, -0.0f, 0.0f, -0.01f, 0.0f, -0.01f)
                horizontalLineToRelative(2.62f)
                lineToRelative(-0.78f, 7.86f)
                curveToRelative(-1.22f, -0.84f, -2.37f, -1.36f, -2.9f, -1.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.3f, 17.6f)
                curveToRelative(-0.22f, -0.17f, -0.54f, -0.12f, -0.7f, 0.1f)
                lineToRelative(-3.33f, 4.5f)
                curveToRelative(-0.16f, 0.22f, -0.12f, 0.54f, 0.1f, 0.7f)
                curveToRelative(0.09f, 0.07f, 0.19f, 0.1f, 0.3f, 0.1f)
                curveToRelative(0.15f, 0f, 0.3f, -0.07f, 0.4f, -0.2f)
                lineToRelative(3.33f, -4.5f)
                curveToRelative(0.16f, -0.22f, 0.12f, -0.54f, -0.1f, -0.7f)
                close()
            }
        }.also { _Walking = it}
