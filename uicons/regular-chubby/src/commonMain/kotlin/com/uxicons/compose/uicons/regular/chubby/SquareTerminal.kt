package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareTerminal: ImageVector? = null

val Icons.Rc.SquareTerminal: ImageVector
    get() = _SquareTerminal ?: UXIcon(name = "SquareTerminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 2.86f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.19f, -9.12f, -1.19f)
                reflectiveCurveTo(3.05f, 2.14f, 2.88f, 2.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -5.17f, -1.15f, -8.98f, -1.19f, -9.14f)
                close()
                moveTo(20.04f, 20.02f)
                curveToRelative(-1.25f, 0.3f, -4.47f, 0.98f, -8.04f, 0.98f)
                reflectiveCurveToRelative(-6.8f, -0.68f, -8.04f, -0.98f)
                curveToRelative(-0.3f, -1.18f, -0.96f, -4.23f, -0.96f, -8.02f)
                curveToRelative(0f, -3.75f, 0.67f, -6.83f, 0.96f, -8.02f)
                curveToRelative(1.25f, -0.3f, 4.47f, -0.98f, 8.04f, -0.98f)
                reflectiveCurveToRelative(6.8f, 0.68f, 8.04f, 0.98f)
                curveToRelative(0.3f, 1.18f, 0.96f, 4.23f, 0.96f, 8.02f)
                curveToRelative(0f, 3.75f, -0.67f, 6.83f, -0.96f, 8.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.53f, 6.15f)
                curveToRelative(-0.47f, -0.29f, -1.08f, -0.15f, -1.38f, 0.32f)
                curveToRelative(-0.29f, 0.47f, -0.15f, 1.08f, 0.32f, 1.38f)
                curveToRelative(2.16f, 1.35f, 3.65f, 3.25f, 4.29f, 4.15f)
                curveToRelative(-0.63f, 0.9f, -2.12f, 2.79f, -4.29f, 4.15f)
                curveToRelative(-0.47f, 0.29f, -0.61f, 0.91f, -0.32f, 1.38f)
                curveToRelative(0.46f, 0.72f, 1.21f, 0.42f, 1.38f, 0.32f)
                curveToRelative(3.33f, -2.08f, 5.21f, -5.21f, 5.29f, -5.34f)
                curveToRelative(0.19f, -0.32f, 0.19f, -0.71f, 0f, -1.02f)
                curveToRelative(-0.08f, -0.13f, -1.96f, -3.25f, -5.29f, -5.34f)
                close()
            }
        }.also { _SquareTerminal = it}
