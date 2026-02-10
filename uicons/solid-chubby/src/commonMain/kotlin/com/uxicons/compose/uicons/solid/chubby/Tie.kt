package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Sc.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.52f, 5f)
                curveToRelative(-0.3f, -0.64f, -0.52f, -1.46f, -0.52f, -2.5f)
                curveToRelative(0f, -0.43f, 0.28f, -0.81f, 0.68f, -0.95f)
                curveToRelative(0.07f, -0.02f, 1.67f, -0.55f, 3.32f, -0.55f)
                reflectiveCurveToRelative(3.25f, 0.53f, 3.32f, 0.55f)
                curveToRelative(0.41f, 0.14f, 0.68f, 0.52f, 0.68f, 0.95f)
                curveToRelative(0f, 1.04f, -0.23f, 1.86f, -0.52f, 2.5f)
                horizontalLineToRelative(-6.95f)
                close()
                moveTo(8.94f, 7f)
                curveToRelative(-2.13f, 5.82f, -2.92f, 9.84f, -2.94f, 10.02f)
                curveToRelative(-0.03f, 0.23f, 0.03f, 0.46f, 0.16f, 0.66f)
                curveToRelative(1.42f, 2.17f, 3.2f, 3.96f, 5.3f, 5.29f)
                curveToRelative(0.33f, 0.21f, 0.75f, 0.21f, 1.08f, 0f)
                curveToRelative(2.09f, -1.34f, 3.88f, -3.12f, 5.3f, -5.29f)
                curveToRelative(0.13f, -0.19f, 0.18f, -0.42f, 0.16f, -0.66f)
                curveToRelative(-0.02f, -0.18f, -0.81f, -4.2f, -2.94f, -10.02f)
                horizontalLineToRelative(-6.11f)
                close()
            }
        }.also { _Tie = it}
