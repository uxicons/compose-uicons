package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Tc.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.01f, 12.77f)
                curveToRelative(-1.69f, -3.9f, -6.04f, -8.64f, -8.47f, -11.12f)
                curveToRelative(-0.82f, -0.83f, -2.26f, -0.83f, -3.08f, 0f)
                curveTo(8.02f, 4.13f, 3.68f, 8.88f, 1.99f, 12.77f)
                curveToRelative(-0.07f, 0.16f, -0.05f, 0.35f, 0.05f, 0.49f)
                curveToRelative(0.21f, 0.29f, 5.19f, 7.14f, 8.85f, 9.43f)
                curveToRelative(0.34f, 0.21f, 0.72f, 0.32f, 1.11f, 0.32f)
                reflectiveCurveToRelative(0.77f, -0.1f, 1.11f, -0.32f)
                curveToRelative(3.66f, -2.29f, 8.64f, -9.14f, 8.85f, -9.43f)
                curveToRelative(0.1f, -0.14f, 0.12f, -0.33f, 0.05f, -0.49f)
                close()
                moveTo(20.76f, 12.45f)
                lineToRelative(-0.06f, 0.02f)
                curveToRelative(-2.63f, 1.03f, -5.38f, 1.62f, -8.2f, 1.77f)
                lineTo(12.5f, 2.13f)
                curveToRelative(0.12f, 0.06f, 0.23f, 0.13f, 0.33f, 0.23f)
                curveToRelative(1.81f, 1.84f, 6.02f, 6.33f, 7.93f, 10.09f)
                close()
                moveTo(11.17f, 2.36f)
                curveToRelative(0.1f, -0.1f, 0.21f, -0.17f, 0.33f, -0.23f)
                lineTo(11.5f, 14.24f)
                curveToRelative(-2.81f, -0.15f, -5.57f, -0.74f, -8.2f, -1.77f)
                lineToRelative(-0.06f, -0.02f)
                curveToRelative(1.91f, -3.76f, 6.12f, -8.26f, 7.93f, -10.09f)
                close()
                moveTo(3.58f, 13.64f)
                curveToRelative(2.55f, 0.92f, 5.21f, 1.46f, 7.92f, 1.6f)
                verticalLineToRelative(6.65f)
                curveToRelative(-0.03f, -0.01f, -0.06f, -0.03f, -0.08f, -0.04f)
                curveToRelative(-2.71f, -1.69f, -6.32f, -6.21f, -7.84f, -8.2f)
                close()
                moveTo(12.58f, 21.84f)
                curveToRelative(-0.03f, 0.02f, -0.05f, 0.03f, -0.08f, 0.04f)
                verticalLineToRelative(-6.65f)
                curveToRelative(2.71f, -0.14f, 5.37f, -0.68f, 7.92f, -1.6f)
                curveToRelative(-1.52f, 1.99f, -5.14f, 6.51f, -7.84f, 8.2f)
                close()
            }
        }.also { _DiceD8 = it}
