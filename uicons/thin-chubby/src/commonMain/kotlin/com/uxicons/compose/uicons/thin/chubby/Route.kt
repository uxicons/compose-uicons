package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Route: ImageVector? = null

val Icons.Tc.Route: ImageVector
    get() = _Route ?: UXIcon(name = "Route") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.49f, 10.42f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.07f, 0.26f, 0.07f)
                reflectiveCurveToRelative(0.18f, -0.02f, 0.26f, -0.07f)
                curveToRelative(0.16f, -0.1f, 3.98f, -2.41f, 3.98f, -5.21f)
                curveToRelative(0f, -2.52f, -2.19f, -4.21f, -4.24f, -4.21f)
                reflectiveCurveToRelative(-4.24f, 1.69f, -4.24f, 4.21f)
                curveToRelative(0f, 2.8f, 3.82f, 5.11f, 3.98f, 5.21f)
                close()
                moveTo(18.75f, 2.0f)
                curveToRelative(1.53f, 0f, 3.24f, 1.32f, 3.24f, 3.21f)
                curveToRelative(0f, 1.87f, -2.43f, 3.65f, -3.24f, 4.18f)
                curveToRelative(-0.81f, -0.54f, -3.24f, -2.31f, -3.24f, -4.18f)
                curveToRelative(0f, -1.89f, 1.71f, -3.21f, 3.24f, -3.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.25f, 13.5f)
                curveToRelative(-2.05f, 0f, -4.24f, 1.69f, -4.24f, 4.21f)
                curveToRelative(0f, 2.8f, 3.82f, 5.11f, 3.98f, 5.21f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.07f, 0.26f, 0.07f)
                reflectiveCurveToRelative(0.18f, -0.02f, 0.26f, -0.07f)
                curveToRelative(0.16f, -0.1f, 3.98f, -2.41f, 3.98f, -5.21f)
                curveToRelative(0f, -2.52f, -2.19f, -4.21f, -4.24f, -4.21f)
                close()
                moveTo(5.25f, 21.9f)
                curveToRelative(-0.81f, -0.54f, -3.24f, -2.31f, -3.24f, -4.18f)
                curveToRelative(0f, -1.89f, 1.71f, -3.21f, 3.24f, -3.21f)
                reflectiveCurveToRelative(3.24f, 1.32f, 3.24f, 3.21f)
                curveToRelative(0f, 1.87f, -2.43f, 3.65f, -3.24f, 4.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.75f, 14.5f)
                horizontalLineToRelative(-4.8f)
                curveToRelative(-0.8f, 0f, -1.45f, -0.65f, -1.45f, -1.45f)
                curveToRelative(0f, -0.9f, 0.63f, -1.55f, 1.5f, -1.55f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-1.43f, 0f, -2.5f, 1.1f, -2.5f, 2.55f)
                curveToRelative(0f, 1.35f, 1.1f, 2.45f, 2.45f, 2.45f)
                horizontalLineToRelative(4.8f)
                curveToRelative(1.79f, 0f, 3.25f, 1.46f, 3.25f, 3.25f)
                reflectiveCurveToRelative(-1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-7.75f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7.75f)
                curveToRelative(2.34f, 0f, 4.25f, -1.91f, 4.25f, -4.25f)
                reflectiveCurveToRelative(-1.91f, -4.25f, -4.25f, -4.25f)
                close()
            }
        }.also { _Route = it}
