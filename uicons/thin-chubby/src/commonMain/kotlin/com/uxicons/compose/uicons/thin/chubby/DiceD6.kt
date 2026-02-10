package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Tc.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.04f, 7.25f)
                curveToRelative(-0.01f, -0.14f, -0.08f, -0.27f, -0.2f, -0.36f)
                curveToRelative(-3.53f, -2.61f, -5.7f, -3.92f, -9.69f, -5.85f)
                curveToRelative(-0.13f, -0.06f, -0.28f, -0.07f, -0.42f, -0.01f)
                curveTo(7.52f, 2.9f, 5.28f, 4.15f, 2.17f, 6.41f)
                curveToRelative(-0.12f, 0.09f, -0.2f, 0.23f, -0.21f, 0.39f)
                curveToRelative(0f, 0.0f, 0f, 10.44f, 0f, 10.44f)
                curveToRelative(0f, 0.12f, 0.04f, 0.23f, 0.11f, 0.32f)
                curveToRelative(2.21f, 2.73f, 9.45f, 5.32f, 9.76f, 5.42f)
                curveToRelative(0.05f, 0.02f, 0.11f, 0.03f, 0.17f, 0.03f)
                curveToRelative(0.06f, 0f, 0.11f, -0.01f, 0.17f, -0.03f)
                curveToRelative(0f, 0f, 0f, 0f, 0.0f, 0f)
                curveToRelative(0.31f, -0.11f, 7.54f, -2.7f, 9.76f, -5.42f)
                curveToRelative(0.07f, -0.09f, 0.11f, -0.2f, 0.11f, -0.32f)
                curveToRelative(0f, 0f, -0.0f, -9.97f, -0.0f, -9.98f)
                close()
                moveTo(11.92f, 2.05f)
                curveToRelative(3.59f, 1.74f, 5.68f, 2.98f, 8.78f, 5.25f)
                curveToRelative(-2.5f, 1.85f, -4.6f, 2.96f, -8.7f, 4.63f)
                curveToRelative(-3.93f, -1.67f, -6.01f, -2.88f, -8.72f, -5.09f)
                curveToRelative(2.76f, -1.96f, 4.83f, -3.1f, 8.64f, -4.79f)
                close()
                moveTo(2.96f, 17.05f)
                lineTo(2.96f, 7.87f)
                curveToRelative(2.62f, 2.1f, 4.73f, 3.31f, 8.54f, 4.93f)
                verticalLineToRelative(8.98f)
                curveToRelative(-1.8f, -0.69f, -6.76f, -2.72f, -8.54f, -4.73f)
                close()
                moveTo(12.5f, 21.78f)
                lineTo(12.5f, 12.81f)
                curveToRelative(3.97f, -1.62f, 6.1f, -2.73f, 8.54f, -4.51f)
                verticalLineToRelative(8.75f)
                curveToRelative(-1.78f, 2.01f, -6.73f, 4.04f, -8.54f, 4.73f)
                close()
            }
        }.also { _DiceD6 = it}
