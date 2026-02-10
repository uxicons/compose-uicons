package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketSquare: ImageVector? = null

val Icons.Tc.BracketSquare: ImageVector
    get() = _BracketSquare ?: UXIcon(name = "BracketSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.0f, 22.56f)
                curveToRelative(-0.03f, 0.28f, -0.28f, 0.47f, -0.55f, 0.44f)
                curveToRelative(-2.77f, -0.31f, -4.82f, -0.72f, -4.84f, -0.72f)
                curveToRelative(-0.19f, -0.04f, -0.34f, -0.18f, -0.39f, -0.37f)
                curveToRelative(-0.05f, -0.2f, -1.21f, -5.07f, -1.21f, -9.9f)
                reflectiveCurveToRelative(1.17f, -9.7f, 1.21f, -9.9f)
                curveToRelative(0.05f, -0.19f, 0.2f, -0.34f, 0.39f, -0.37f)
                curveToRelative(0.02f, -0.0f, 2.07f, -0.41f, 4.84f, -0.72f)
                curveToRelative(0.27f, -0.04f, 0.52f, 0.17f, 0.55f, 0.44f)
                curveToRelative(0.03f, 0.27f, -0.17f, 0.52f, -0.44f, 0.55f)
                curveToRelative(-2.1f, 0.24f, -3.77f, 0.53f, -4.44f, 0.65f)
                curveToRelative(-0.26f, 1.16f, -1.11f, 5.32f, -1.11f, 9.35f)
                reflectiveCurveToRelative(0.86f, 8.2f, 1.11f, 9.35f)
                curveToRelative(0.67f, 0.12f, 2.35f, 0.41f, 4.44f, 0.65f)
                curveToRelative(0.27f, 0.03f, 0.47f, 0.28f, 0.44f, 0.55f)
                close()
            }
        }.also { _BracketSquare = it}
