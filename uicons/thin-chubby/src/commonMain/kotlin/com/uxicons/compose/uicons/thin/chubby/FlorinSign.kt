package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Tc.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-3.24f, 0f, -5.03f, 0.88f, -5.82f, 2.84f)
                lineToRelative(-1.86f, 6.18f)
                curveToRelative(1.45f, 0.06f, 2.7f, 0.26f, 2.77f, 0.27f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.3f, 0.41f, 0.57f)
                reflectiveCurveToRelative(-0.31f, 0.46f, -0.57f, 0.41f)
                curveToRelative(-0.01f, -0.0f, -1.4f, -0.22f, -2.9f, -0.27f)
                lineToRelative(-2.25f, 7.48f)
                curveToRelative(-0.96f, 2.4f, -3.11f, 3.51f, -6.76f, 3.51f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(3.24f, 0f, 5.03f, -0.88f, 5.82f, -2.84f)
                lineToRelative(2.15f, -7.15f)
                curveToRelative(-1.58f, 0.05f, -2.88f, 0.28f, -2.98f, 0.28f)
                curveToRelative(-0.24f, 0f, -0.45f, -0.17f, -0.49f, -0.42f)
                curveToRelative(-0.04f, -0.27f, 0.14f, -0.53f, 0.41f, -0.57f)
                curveToRelative(0.07f, -0.01f, 1.67f, -0.27f, 3.36f, -0.29f)
                lineToRelative(1.96f, -6.5f)
                curveToRelative(0.96f, -2.4f, 3.11f, -3.51f, 6.76f, -3.51f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _FlorinSign = it}
