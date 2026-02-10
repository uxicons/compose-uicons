package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picture: ImageVector? = null

val Icons.Sc.Picture: ImageVector
    get() = _Picture ?: UXIcon(name = "Picture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.93f, 6.96f)
                curveToRelative(-0.82f, 0f, -1.03f, 0.1f, -1.03f, 1.03f)
                reflectiveCurveToRelative(0.21f, 1.03f, 1.03f, 1.03f)
                reflectiveCurveToRelative(1.03f, -0.12f, 1.03f, -1.03f)
                curveToRelative(0f, -0.93f, -0.21f, -1.03f, -1.03f, -1.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 3.21f)
                curveToRelative(-0.1f, -0.32f, -0.36f, -0.57f, -0.69f, -0.66f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.14f, -9.11f, -1.14f)
                reflectiveCurveTo(3.06f, 2.51f, 2.89f, 2.55f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.34f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.15f, -1.2f, 3.85f, -1.2f, 8.78f)
                curveToRelative(0f, 1.64f, 0.12f, 3.13f, 0.29f, 4.4f)
                curveToRelative(3.21f, -3.88f, 6.86f, -5.53f, 7.03f, -5.61f)
                curveToRelative(0.2f, -0.09f, 0.42f, -0.11f, 0.63f, -0.06f)
                curveToRelative(0.2f, 0.05f, 5.01f, 1.18f, 9.93f, 5.98f)
                curveToRelative(1.24f, 1.2f, 2.29f, 2.46f, 3.09f, 3.48f)
                curveToRelative(0.33f, -1.24f, 1.03f, -4.34f, 1.03f, -8.2f)
                curveToRelative(0f, -4.97f, -1.15f, -8.63f, -1.2f, -8.79f)
                close()
                moveTo(15.93f, 11.02f)
                curveToRelative(-2.51f, 0f, -3.03f, -1.65f, -3.03f, -3.03f)
                reflectiveCurveToRelative(0.53f, -3.03f, 3.03f, -3.03f)
                reflectiveCurveToRelative(3.03f, 1.65f, 3.03f, 3.03f)
                reflectiveCurveToRelative(-0.53f, 3.03f, -3.03f, 3.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.48f, 18.15f)
                curveToRelative(-3.82f, -3.72f, -7.55f, -5.05f, -8.65f, -5.38f)
                curveToRelative(-1.02f, 0.53f, -4.4f, 2.47f, -7.0f, 6.24f)
                curveToRelative(-0.02f, 0.03f, -0.04f, 0.05f, -0.06f, 0.08f)
                curveToRelative(0.23f, 1.02f, 0.42f, 1.64f, 0.44f, 1.7f)
                curveToRelative(0.1f, 0.32f, 0.36f, 0.57f, 0.69f, 0.66f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.14f, 9.11f, 1.14f)
                curveToRelative(3.83f, 0f, 7.2f, -0.68f, 8.52f, -0.99f)
                curveToRelative(-0.78f, -1.0f, -1.82f, -2.25f, -3.04f, -3.44f)
                close()
            }
        }.also { _Picture = it}
