package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Tc.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.9f, 1.73f)
                curveToRelative(-0.07f, -0.08f, -0.17f, -0.14f, -0.28f, -0.16f)
                curveToRelative(-0.12f, -0.02f, -2.84f, -0.56f, -5.62f, -0.56f)
                reflectiveCurveToRelative(-5.51f, 0.54f, -5.62f, 0.56f)
                curveToRelative(-0.11f, 0.02f, -0.21f, 0.08f, -0.28f, 0.16f)
                curveToRelative(-2.41f, 2.77f, -4.23f, 6.08f, -5.57f, 10.12f)
                curveToRelative(-0.03f, 0.1f, -0.03f, 0.21f, 0f, 0.31f)
                curveToRelative(1.34f, 4.04f, 3.16f, 7.35f, 5.57f, 10.12f)
                curveToRelative(0.07f, 0.08f, 0.17f, 0.14f, 0.28f, 0.16f)
                curveToRelative(0.12f, 0.02f, 2.84f, 0.56f, 5.62f, 0.56f)
                reflectiveCurveToRelative(5.51f, -0.54f, 5.62f, -0.56f)
                curveToRelative(0.11f, -0.02f, 0.21f, -0.08f, 0.28f, -0.16f)
                curveToRelative(2.5f, -2.87f, 4.34f, -6.18f, 5.65f, -10.12f)
                curveToRelative(0.03f, -0.1f, 0.03f, -0.21f, 0f, -0.31f)
                curveToRelative(-1.31f, -3.94f, -3.15f, -7.25f, -5.65f, -10.12f)
                close()
                moveTo(17.26f, 21.49f)
                curveToRelative(-0.63f, 0.12f, -2.96f, 0.51f, -5.26f, 0.51f)
                reflectiveCurveToRelative(-4.63f, -0.4f, -5.26f, -0.51f)
                curveToRelative(-2.23f, -2.6f, -3.94f, -5.71f, -5.21f, -9.49f)
                curveToRelative(1.27f, -3.78f, 2.98f, -6.88f, 5.21f, -9.49f)
                curveToRelative(0.63f, -0.12f, 2.96f, -0.51f, 5.26f, -0.51f)
                reflectiveCurveToRelative(4.63f, 0.4f, 5.26f, 0.51f)
                curveToRelative(2.32f, 2.7f, 4.05f, 5.81f, 5.29f, 9.49f)
                curveToRelative(-1.24f, 3.68f, -2.97f, 6.79f, -5.29f, 9.49f)
                close()
            }
        }.also { _Hexagon = it}
