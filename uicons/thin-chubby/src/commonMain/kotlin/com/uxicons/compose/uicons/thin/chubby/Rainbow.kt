package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rainbow: ImageVector? = null

val Icons.Tc.Rainbow: ImageVector
    get() = _Rainbow ?: UXIcon(name = "Rainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.99f, 20.25f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.28f, -0.01f, -0.49f, -0.24f, -0.48f, -0.52f)
                curveToRelative(0f, -0.03f, 0.1f, -2.66f, 0.1f, -3.52f)
                curveToRelative(0f, -0.76f, -0.07f, -2.25f, -0.11f, -2.98f)
                curveToRelative(-0.72f, -0.06f, -2.26f, -0.06f, -2.98f, 0f)
                curveToRelative(-0.04f, 0.73f, -0.11f, 2.22f, -0.11f, 2.98f)
                curveToRelative(0f, 0.86f, 0.1f, 3.5f, 0.1f, 3.52f)
                curveToRelative(0.01f, 0.28f, -0.2f, 0.51f, -0.48f, 0.52f)
                curveToRelative(-0.31f, 0.01f, -0.51f, -0.2f, -0.52f, -0.48f)
                curveToRelative(-0.0f, -0.11f, -0.1f, -2.68f, -0.1f, -3.56f)
                curveToRelative(0f, -1.06f, 0.13f, -3.37f, 0.14f, -3.46f)
                curveToRelative(0.01f, -0.24f, 0.2f, -0.44f, 0.44f, -0.47f)
                curveToRelative(0.04f, -0.0f, 0.96f, -0.11f, 2.02f, -0.11f)
                reflectiveCurveToRelative(1.98f, 0.1f, 2.02f, 0.11f)
                curveToRelative(0.24f, 0.03f, 0.43f, 0.23f, 0.44f, 0.47f)
                curveToRelative(0.01f, 0.1f, 0.14f, 2.41f, 0.14f, 3.46f)
                curveToRelative(0f, 0.88f, -0.1f, 3.45f, -0.1f, 3.56f)
                curveToRelative(-0.01f, 0.27f, -0.23f, 0.48f, -0.5f, 0.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.95f)
                horizontalLineToRelative(0f)
                curveToRelative(-4.96f, 0f, -6.8f, 2.13f, -6.8f, 7.87f)
                curveToRelative(0f, 0.55f, 0.08f, 3.95f, 0.08f, 3.95f)
                curveToRelative(0.01f, 0.28f, 0.21f, 0.49f, 0.52f, 0.48f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.24f, 0.48f, -0.52f)
                curveToRelative(0f, -0.01f, -0.08f, -3.36f, -0.08f, -3.91f)
                curveToRelative(0f, -5.2f, 1.41f, -6.87f, 5.8f, -6.87f)
                curveToRelative(4.39f, 0f, 5.8f, 1.67f, 5.8f, 6.87f)
                curveToRelative(0f, 0.56f, -0.08f, 3.91f, -0.08f, 3.91f)
                curveToRelative(-0.01f, 0.28f, 0.2f, 0.51f, 0.48f, 0.52f)
                curveToRelative(0.31f, 0.01f, 0.51f, -0.2f, 0.52f, -0.48f)
                curveToRelative(0f, -0.0f, 0.08f, -3.4f, 0.08f, -3.95f)
                curveToRelative(0f, -5.74f, -1.87f, -7.87f, -6.8f, -7.87f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.74f)
                curveTo(4.8f, 3.74f, 1f, 7.92f, 1f, 15.83f)
                curveToRelative(0f, 0.53f, 0.08f, 3.94f, 0.08f, 3.94f)
                curveToRelative(0.01f, 0.28f, 0.21f, 0.49f, 0.52f, 0.48f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.24f, 0.48f, -0.52f)
                curveToRelative(0f, -0.01f, -0.08f, -3.38f, -0.08f, -3.9f)
                curveToRelative(0f, -7.46f, 3.27f, -11.09f, 10f, -11.09f)
                reflectiveCurveToRelative(10f, 3.63f, 10f, 11.09f)
                curveToRelative(0f, 0.53f, -0.08f, 3.9f, -0.08f, 3.9f)
                curveToRelative(-0.01f, 0.28f, 0.2f, 0.51f, 0.48f, 0.52f)
                curveToRelative(0.31f, 0.01f, 0.51f, -0.2f, 0.52f, -0.48f)
                curveToRelative(0f, -0.0f, 0.08f, -3.42f, 0.08f, -3.94f)
                curveToRelative(0f, -7.91f, -3.8f, -12.09f, -11f, -12.09f)
                close()
            }
        }.also { _Rainbow = it}
