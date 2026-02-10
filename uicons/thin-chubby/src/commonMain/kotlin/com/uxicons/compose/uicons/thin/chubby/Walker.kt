package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Tc.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.59f, 18.15f)
                curveToRelative(0.09f, -0.82f, 0.41f, -3.82f, 0.41f, -6.15f)
                curveToRelative(0f, -6.31f, -1.1f, -9.49f, -1.15f, -9.62f)
                curveToRelative(-0.05f, -0.15f, -0.17f, -0.26f, -0.32f, -0.31f)
                curveToRelative(-0.14f, -0.04f, -3.46f, -1.07f, -7.97f, -1.07f)
                curveToRelative(-1.54f, 0f, -3.43f, 0.12f, -4.6f, 0.3f)
                curveToRelative(-0.15f, 0.02f, -0.28f, 0.11f, -0.36f, 0.24f)
                curveToRelative(-1.16f, 2.02f, -2.65f, 4.84f, -3.91f, 8.78f)
                curveToRelative(-2.66f, 8.33f, -2.69f, 12.03f, -2.69f, 12.18f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.04f, 0.04f, -3.62f, 2.52f, -11.5f)
                horizontalLineToRelative(16.46f)
                curveToRelative(0.01f, 0.33f, 0.02f, 0.65f, 0.02f, 1f)
                curveToRelative(0f, 2.22f, -0.31f, 5.17f, -0.4f, 6.01f)
                curveToRelative(-1.72f, -0.06f, -2.61f, 0.75f, -2.6f, 2.49f)
                curveToRelative(0f, 1.71f, 0.79f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -0.79f, 2.5f, -2.5f)
                curveToRelative(0f, -1.29f, -0.46f, -2.06f, -1.41f, -2.35f)
                close()
                moveTo(4.85f, 10f)
                curveToRelative(1.13f, -3.37f, 2.38f, -5.81f, 3.49f, -7.75f)
                curveToRelative(1.12f, -0.15f, 2.84f, -0.25f, 4.21f, -0.25f)
                curveToRelative(3.67f, 0f, 6.59f, 0.72f, 7.43f, 0.96f)
                curveToRelative(0.21f, 0.72f, 0.81f, 3.08f, 0.98f, 7.04f)
                close()
                moveTo(20.5f, 22f)
                curveToRelative(-1.15f, 0f, -1.5f, -0.35f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.35f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.35f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.35f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Walker = it}
