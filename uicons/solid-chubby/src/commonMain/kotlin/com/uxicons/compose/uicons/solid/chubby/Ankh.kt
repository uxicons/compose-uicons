package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ankh: ImageVector? = null

val Icons.Sc.Ankh: ImageVector
    get() = _Ankh ?: UXIcon(name = "Ankh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.08f, 13.12f)
                curveToRelative(-0.07f, -0.03f, -1.35f, -0.55f, -3.37f, -0.83f)
                curveToRelative(1.07f, -1.75f, 2.3f, -4.2f, 2.3f, -6.28f)
                curveToRelative(0f, -3.32f, -1.68f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.68f, -5f, 5f)
                curveToRelative(0f, 2.08f, 1.23f, 4.54f, 2.3f, 6.28f)
                curveToRelative(-2.02f, 0.29f, -3.3f, 0.81f, -3.37f, 0.83f)
                curveToRelative(-0.76f, 0.32f, -1.12f, 1.19f, -0.81f, 1.96f)
                reflectiveCurveToRelative(1.19f, 1.13f, 1.96f, 0.82f)
                curveToRelative(0.02f, -0.01f, 1.35f, -0.53f, 3.43f, -0.73f)
                verticalLineToRelative(6.34f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.34f)
                curveToRelative(2.8f, 0.29f, 2.99f, 0.73f, 4f, 0.84f)
                curveToRelative(0.59f, 0f, 1.15f, -0.35f, 1.39f, -0.92f)
                curveToRelative(0.32f, -0.77f, -0.04f, -1.64f, -0.81f, -1.96f)
                close()
                moveTo(12f, 4f)
                curveToRelative(1.66f, 0f, 2f, 0.34f, 2f, 2f)
                curveToRelative(0f, 1.31f, -0.99f, 3.32f, -2f, 4.95f)
                curveToRelative(-1.01f, -1.62f, -2f, -3.63f, -2f, -4.95f)
                curveToRelative(0f, -1.66f, 0.34f, -2f, 2f, -2f)
                close()
            }
        }.also { _Ankh = it}
