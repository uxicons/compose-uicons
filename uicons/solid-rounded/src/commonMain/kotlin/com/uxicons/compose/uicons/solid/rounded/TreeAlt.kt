package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeAlt: ImageVector? = null

val Icons.Sr.TreeAlt: ImageVector
    get() = _TreeAlt ?: UXIcon(name = "TreeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18.91f, 15.48f)
                curveToRelative(0.32f, -0.24f, 0.59f, -0.54f, 0.78f, -0.91f)
                curveToRelative(0.46f, -0.88f, 0.4f, -1.94f, -0.17f, -2.75f)
                curveToRelative(-0.03f, -0.04f, -1.89f, -2.09f, -1.89f, -2.09f)
                curveToRelative(0.46f, -0.23f, 0.84f, -0.6f, 1.08f, -1.07f)
                curveToRelative(0.42f, -0.81f, 0.35f, -1.78f, -0.18f, -2.53f)
                curveToRelative(-0.02f, -0.03f, -4.66f, -5.29f, -4.66f, -5.29f)
                curveToRelative(-0.95f, -1.07f, -2.82f, -1.07f, -3.77f, 0f)
                curveToRelative(0f, 0f, -4.64f, 5.25f, -4.66f, 5.28f)
                curveToRelative(-0.53f, 0.75f, -0.6f, 1.72f, -0.18f, 2.53f)
                curveToRelative(0.24f, 0.47f, 0.63f, 0.84f, 1.08f, 1.07f)
                curveToRelative(0f, 0f, -1.86f, 2.06f, -1.89f, 2.09f)
                curveToRelative(-0.56f, 0.82f, -0.63f, 1.87f, -0.17f, 2.75f)
                curveToRelative(0.19f, 0.37f, 0.46f, 0.67f, 0.78f, 0.91f)
                curveToRelative(0f, 0f, -1.54f, 1.78f, -1.56f, 1.81f)
                curveToRelative(-0.64f, 0.92f, -0.71f, 2.11f, -0.19f, 3.1f)
                curveToRelative(0.52f, 0.99f, 1.54f, 1.6f, 2.65f, 1.6f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                curveToRelative(1.12f, -0.0f, 2.13f, -0.62f, 2.65f, -1.6f)
                curveToRelative(0.52f, -0.99f, 0.45f, -2.18f, -0.19f, -3.1f)
                curveToRelative(-0.02f, -0.03f, -1.56f, -1.81f, -1.56f, -1.81f)
                close()
            }
        }.also { _TreeAlt = it}
