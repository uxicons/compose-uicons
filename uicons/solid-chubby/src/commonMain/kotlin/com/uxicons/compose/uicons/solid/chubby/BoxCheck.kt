package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Sc.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 9.41f)
                lineToRelative(-0.5f, -5.5f)
                curveToRelative(-0.04f, -0.43f, -0.35f, -0.79f, -0.78f, -0.89f)
                curveToRelative(-0.19f, -0.04f, -4.67f, -1.02f, -9.72f, -1.02f)
                reflectiveCurveToRelative(-9.53f, 0.98f, -9.72f, 1.02f)
                curveToRelative(-0.43f, 0.09f, -0.74f, 0.45f, -0.78f, 0.89f)
                lineToRelative(-0.5f, 5.5f)
                curveToRelative(-0.03f, 0.32f, 0.1f, 0.63f, 0.33f, 0.84f)
                curveToRelative(0.18f, 0.16f, 0.42f, 0.25f, 0.66f, 0.25f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.02f)
                lineToRelative(0.57f, -0.13f)
                curveToRelative(1.68f, -0.38f, 5.18f, -1.35f, 9.22f, -1.35f)
                reflectiveCurveToRelative(7.54f, 0.98f, 9.22f, 1.35f)
                lineToRelative(0.57f, 0.13f)
                curveToRelative(0.31f, 0.07f, 0.63f, -0.02f, 0.87f, -0.23f)
                reflectiveCurveToRelative(0.36f, -0.52f, 0.33f, -0.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11f)
                curveToRelative(-4f, 0f, -10f, 1.5f, -10.0f, 1.5f)
                curveToRelative(0.07f, 4.41f, 1.0f, 7.64f, 1.04f, 7.78f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.59f, 0.7f, 0.68f)
                curveToRelative(0.15f, 0.04f, 3.84f, 1.04f, 8.27f, 1.04f)
                reflectiveCurveToRelative(8.11f, -0.99f, 8.26f, -1.03f)
                curveToRelative(0.34f, -0.09f, 0.6f, -0.35f, 0.7f, -0.69f)
                curveToRelative(0.04f, -0.14f, 0.97f, -3.4f, 1.03f, -7.78f)
                curveToRelative(0.0f, 0f, -6.0f, -1.5f, -10.0f, -1.5f)
                close()
                moveTo(15.89f, 14.96f)
                curveToRelative(-1.74f, 3.37f, -3.94f, 4.82f, -4.03f, 4.88f)
                curveToRelative(-0.17f, 0.11f, -0.35f, 0.16f, -0.55f, 0.16f)
                curveToRelative(-0.17f, 0f, -0.35f, -0.04f, -0.5f, -0.14f)
                curveToRelative(-0.07f, -0.04f, -1.83f, -1.07f, -2.85f, -2.46f)
                curveToRelative(-0.33f, -0.45f, -0.23f, -1.07f, 0.22f, -1.4f)
                curveToRelative(0.44f, -0.33f, 1.07f, -0.23f, 1.4f, 0.21f)
                curveToRelative(0.45f, 0.61f, 1.16f, 1.18f, 1.69f, 1.55f)
                curveToRelative(0.65f, -0.57f, 1.83f, -1.77f, 2.85f, -3.73f)
                curveToRelative(0.25f, -0.49f, 0.86f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                close()
            }
        }.also { _BoxCheck = it}
