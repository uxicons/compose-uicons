package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Tc.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 11.71f)
                curveToRelative(0.03f, 0.27f, -0.17f, 0.52f, -0.44f, 0.55f)
                curveToRelative(-1.39f, 0.16f, -2.76f, 0.24f, -4.06f, 0.24f)
                curveToRelative(-2.42f, 0f, -4.51f, -0.28f, -5.5f, -0.43f)
                curveToRelative(0.0f, 2.71f, 0.15f, 4.45f, 0.15f, 4.47f)
                curveToRelative(0.24f, 4.14f, 1.54f, 5.46f, 5.35f, 5.46f)
                curveToRelative(1.18f, 0f, 2.1f, -0.14f, 2.82f, -0.42f)
                curveToRelative(0.26f, -0.1f, 0.55f, 0.03f, 0.65f, 0.28f)
                reflectiveCurveToRelative(-0.03f, 0.55f, -0.28f, 0.65f)
                curveToRelative(-0.84f, 0.33f, -1.88f, 0.49f, -3.18f, 0.49f)
                curveToRelative(-4.36f, 0f, -6.08f, -1.73f, -6.35f, -6.39f)
                curveToRelative(-0.01f, -0.06f, -0.15f, -1.81f, -0.15f, -4.61f)
                reflectiveCurveToRelative(0.15f, -4.55f, 0.15f, -4.62f)
                curveToRelative(0.27f, -4.65f, 1.99f, -6.38f, 6.35f, -6.38f)
                reflectiveCurveToRelative(6.08f, 1.73f, 6.35f, 6.39f)
                curveToRelative(0.0f, 0.03f, 0.1f, 1.18f, 0.14f, 3.1f)
                curveToRelative(0.01f, 0.28f, -0.21f, 0.5f, -0.49f, 0.51f)
                curveToRelative(-0.28f, -0.03f, -0.5f, -0.21f, -0.51f, -0.49f)
                curveToRelative(-0.04f, -1.88f, -0.14f, -3.03f, -0.14f, -3.04f)
                curveToRelative(-0.24f, -4.14f, -1.54f, -5.46f, -5.35f, -5.46f)
                reflectiveCurveToRelative(-5.11f, 1.32f, -5.35f, 5.45f)
                curveToRelative(-0.0f, 0.03f, -0.12f, 1.4f, -0.14f, 3.6f)
                curveToRelative(0.87f, 0.14f, 3.03f, 0.45f, 5.49f, 0.45f)
                curveToRelative(1.26f, 0f, 2.59f, -0.08f, 3.94f, -0.23f)
                curveToRelative(0.28f, -0.04f, 0.52f, 0.17f, 0.55f, 0.44f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 3.85f, -1.65f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -1.65f, -5.5f, -5.5f)
                reflectiveCurveToRelative(1.65f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 1.65f, 5.5f, 5.5f)
                close()
                moveTo(13.72f, 20.58f)
                lineTo(20.58f, 13.72f)
                curveToRelative(-0.71f, -0.49f, -1.71f, -0.72f, -3.08f, -0.72f)
                curveToRelative(-3.28f, 0f, -4.5f, 1.22f, -4.5f, 4.5f)
                curveToRelative(0f, 1.37f, 0.23f, 2.36f, 0.72f, 3.08f)
                close()
                moveTo(22f, 17.5f)
                curveToRelative(0f, -1.37f, -0.23f, -2.36f, -0.72f, -3.08f)
                lineToRelative(-6.86f, 6.86f)
                curveToRelative(0.71f, 0.49f, 1.71f, 0.72f, 3.08f, 0.72f)
                curveToRelative(3.28f, 0f, 4.5f, -1.22f, 4.5f, -4.5f)
                close()
            }
        }.also { _Pills = it}
