package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Tc.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.16f, 15.08f)
                curveToRelative(-2.07f, -4.76f, -5.09f, -9.32f, -8.96f, -13.55f)
                curveToRelative(-0.61f, -0.67f, -1.79f, -0.67f, -2.4f, 0f)
                curveTo(6.93f, 5.75f, 3.91f, 10.31f, 1.84f, 15.08f)
                curveToRelative(-0.07f, 0.17f, -0.05f, 0.37f, 0.07f, 0.52f)
                lineToRelative(0.12f, 0.15f)
                curveToRelative(2.48f, 3.06f, 5.86f, 5.55f, 9.78f, 7.22f)
                curveToRelative(0.06f, 0.03f, 0.13f, 0.04f, 0.2f, 0.04f)
                reflectiveCurveToRelative(0.13f, -0.01f, 0.2f, -0.04f)
                curveToRelative(3.92f, -1.66f, 7.3f, -4.16f, 9.78f, -7.22f)
                lineToRelative(0.12f, -0.15f)
                curveToRelative(0.12f, -0.14f, 0.14f, -0.34f, 0.07f, -0.52f)
                close()
                moveTo(2.88f, 15.2f)
                curveTo(4.89f, 10.65f, 7.8f, 6.29f, 11.5f, 2.24f)
                lineTo(11.5f, 21.73f)
                curveToRelative(-3.4f, -1.56f, -6.44f, -3.86f, -8.62f, -6.53f)
                close()
                moveTo(12.5f, 21.73f)
                lineTo(12.5f, 2.24f)
                curveToRelative(3.7f, 4.05f, 6.61f, 8.41f, 8.62f, 12.96f)
                curveToRelative(-2.19f, 2.67f, -5.22f, 4.97f, -8.62f, 6.53f)
                close()
            }
        }.also { _DiceD4 = it}
