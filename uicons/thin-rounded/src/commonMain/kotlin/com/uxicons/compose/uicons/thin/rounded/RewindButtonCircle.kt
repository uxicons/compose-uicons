package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RewindButtonCircle: ImageVector? = null

val Icons.Tr.RewindButtonCircle: ImageVector
    get() = _RewindButtonCircle ?: UXIcon(name = "RewindButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(17.26f, 7.16f)
                curveToRelative(-0.51f, -0.26f, -1.1f, -0.2f, -1.56f, 0.13f)
                lineToRelative(-3.21f, 2.25f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0f, -0.55f, -0.3f, -1.04f, -0.81f, -1.31f)
                curveToRelative(-0.54f, -0.28f, -1.19f, -0.25f, -1.7f, 0.11f)
                lineToRelative(-4.64f, 3.49f)
                curveToRelative(-0.41f, 0.28f, -0.65f, 0.73f, -0.65f, 1.21f)
                reflectiveCurveToRelative(0.24f, 0.93f, 0.63f, 1.2f)
                lineToRelative(4.68f, 3.52f)
                curveToRelative(0.28f, 0.19f, 0.6f, 0.29f, 0.92f, 0.29f)
                curveToRelative(0.26f, 0f, 0.52f, -0.06f, 0.77f, -0.19f)
                curveToRelative(0.51f, -0.27f, 0.81f, -0.76f, 0.81f, -1.31f)
                verticalLineToRelative(-1.04f)
                lineToRelative(3.2f, 2.24f)
                curveToRelative(0.46f, 0.34f, 1.06f, 0.39f, 1.56f, 0.14f)
                curveToRelative(0.51f, -0.26f, 0.82f, -0.77f, 0.82f, -1.33f)
                verticalLineToRelative(-7.01f)
                curveToRelative(0f, -0.57f, -0.32f, -1.08f, -0.82f, -1.33f)
                close()
                moveTo(17.09f, 15.5f)
                curveToRelative(0f, 0.19f, -0.1f, 0.35f, -0.27f, 0.44f)
                curveToRelative(-0.17f, 0.09f, -0.36f, 0.07f, -0.53f, -0.05f)
                lineToRelative(-4f, -2.8f)
                curveToRelative(-0.15f, -0.11f, -0.35f, -0.12f, -0.52f, -0.03f)
                reflectiveCurveToRelative(-0.27f, 0.26f, -0.27f, 0.44f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.25f, -0.19f, 0.38f, -0.28f, 0.42f)
                curveToRelative(-0.17f, 0.09f, -0.42f, 0.12f, -0.64f, -0.02f)
                lineToRelative(-4.68f, -3.52f)
                curveToRelative(-0.19f, -0.13f, -0.22f, -0.3f, -0.22f, -0.39f)
                curveToRelative(0f, -0.09f, 0.03f, -0.26f, 0.23f, -0.4f)
                lineToRelative(4.64f, -3.49f)
                curveToRelative(0.12f, -0.08f, 0.24f, -0.11f, 0.35f, -0.11f)
                reflectiveCurveToRelative(0.22f, 0.03f, 0.3f, 0.07f)
                curveToRelative(0.08f, 0.04f, 0.28f, 0.17f, 0.28f, 0.42f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.19f, 0.1f, 0.36f, 0.27f, 0.44f)
                reflectiveCurveToRelative(0.36f, 0.07f, 0.52f, -0.03f)
                lineToRelative(4f, -2.8f)
                reflectiveCurveToRelative(0.01f, -0.01f, 0.01f, -0.01f)
                curveToRelative(0.15f, -0.11f, 0.35f, -0.13f, 0.52f, -0.04f)
                reflectiveCurveToRelative(0.27f, 0.25f, 0.27f, 0.44f)
                verticalLineToRelative(7.01f)
                close()
            }
        }.also { _RewindButtonCircle = it}
