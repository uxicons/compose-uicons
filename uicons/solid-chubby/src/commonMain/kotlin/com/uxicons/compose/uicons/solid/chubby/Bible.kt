package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bible: ImageVector? = null

val Icons.Sc.Bible: ImageVector
    get() = _Bible ?: UXIcon(name = "Bible") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 18f)
                horizontalLineToRelative(14.63f)
                curveToRelative(-0.21f, 1.81f, -0.42f, 3.08f, -0.44f, 3.17f)
                curveToRelative(-0.07f, 0.38f, -0.35f, 0.69f, -0.72f, 0.79f)
                curveToRelative(-0.15f, 0.04f, -3.82f, 1.04f, -7.46f, 1.04f)
                curveToRelative(-1.47f, 0f, -3.1f, -0.16f, -4.87f, -0.47f)
                curveToRelative(-1.6f, -0.28f, -2.87f, -1.39f, -3.42f, -2.86f)
                curveToRelative(0.56f, -1.57f, 2.1f, -1.67f, 2.29f, -1.67f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 1.37f, -0.07f, 2.75f, -0.18f, 4f)
                horizontalLineToRelative(-14.82f)
                curveToRelative(-0.7f, 0f, -1.8f, 0.26f, -2.73f, 0.98f)
                curveToRelative(-0.14f, -1.47f, -0.27f, -3.23f, -0.27f, -4.98f)
                curveToRelative(0f, -2.48f, 0.24f, -4.98f, 0.45f, -6.65f)
                curveToRelative(0.24f, -1.93f, 1.66f, -3.45f, 3.55f, -3.85f)
                curveToRelative(0f, 0f, 2f, -0.51f, 5f, -0.51f)
                curveToRelative(3.65f, 0f, 7.31f, 0.99f, 7.46f, 1.04f)
                curveToRelative(0.37f, 0.1f, 0.65f, 0.41f, 0.72f, 0.79f)
                curveToRelative(0.03f, 0.19f, 0.81f, 4.69f, 0.81f, 9.17f)
                close()
                moveTo(14.99f, 7.21f)
                curveToRelative(0.06f, -0.55f, -0.34f, -1.04f, -0.89f, -1.1f)
                curveToRelative(-0.36f, -0.04f, -0.73f, -0.04f, -1.1f, -0.06f)
                verticalLineToRelative(-1.05f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.05f)
                curveToRelative(-0.37f, 0.02f, -0.74f, 0.02f, -1.1f, 0.06f)
                curveToRelative(-0.55f, 0.06f, -0.95f, 0.55f, -0.89f, 1.1f)
                curveToRelative(0.06f, 0.55f, 0.54f, 0.94f, 1.1f, 0.89f)
                curveToRelative(0.29f, -0.03f, 0.6f, -0.03f, 0.9f, -0.05f)
                verticalLineToRelative(3.95f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.95f)
                curveToRelative(0.34f, 0.01f, 0.67f, 0.03f, 1.0f, 0.05f)
                curveToRelative(0.51f, 0f, 0.94f, -0.38f, 0.99f, -0.9f)
                close()
            }
        }.also { _Bible = it}
