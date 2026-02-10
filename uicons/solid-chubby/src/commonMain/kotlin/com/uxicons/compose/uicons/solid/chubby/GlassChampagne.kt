package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Sc.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.9f, 6f)
                horizontalLineToRelative(-13.81f)
                curveToRelative(0.11f, -1.8f, 0.27f, -3.27f, 0.31f, -3.62f)
                curveToRelative(0.05f, -0.41f, 0.34f, -0.74f, 0.73f, -0.85f)
                curveToRelative(0.08f, -0.02f, 2.02f, -0.54f, 5.86f, -0.54f)
                reflectiveCurveToRelative(5.78f, 0.51f, 5.86f, 0.54f)
                curveToRelative(0.4f, 0.11f, 0.69f, 0.44f, 0.73f, 0.85f)
                curveToRelative(0.04f, 0.35f, 0.2f, 1.82f, 0.31f, 3.62f)
                close()
                moveTo(18.46f, 13.53f)
                curveToRelative(0.48f, -1.22f, 0.57f, -3.4f, 0.53f, -5.53f)
                horizontalLineToRelative(-13.98f)
                curveToRelative(-0.05f, 2.12f, 0.05f, 4.3f, 0.53f, 5.53f)
                curveToRelative(0.62f, 2.31f, 2.61f, 4.03f, 4.96f, 4.38f)
                verticalLineToRelative(1.73f)
                curveToRelative(-1.5f, 0.1f, -2.53f, 0.33f, -2.86f, 0.41f)
                curveToRelative(-0.8f, 0.2f, -1.29f, 1.01f, -1.09f, 1.82f)
                curveToRelative(0.2f, 0.8f, 1.01f, 1.29f, 1.82f, 1.09f)
                curveToRelative(0.25f, -0.06f, 1.6f, -0.37f, 3.64f, -0.37f)
                curveToRelative(2.46f, 0.01f, 3.18f, 0.34f, 4.0f, 0.42f)
                curveToRelative(0.67f, 0f, 1.29f, -0.46f, 1.46f, -1.14f)
                curveToRelative(0.2f, -0.8f, -0.29f, -1.62f, -1.09f, -1.82f)
                curveToRelative(-0.33f, -0.08f, -1.36f, -0.31f, -2.86f, -0.41f)
                verticalLineToRelative(-1.73f)
                curveToRelative(2.35f, -0.35f, 4.34f, -2.06f, 4.96f, -4.38f)
                close()
            }
        }.also { _GlassChampagne = it}
