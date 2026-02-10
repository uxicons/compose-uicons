package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareTerminal: ImageVector? = null

val Icons.Sc.SquareTerminal: ImageVector
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
                moveTo(11.82f, 12.51f)
                curveToRelative(-0.08f, 0.13f, -1.96f, 3.25f, -5.29f, 5.34f)
                curveToRelative(-0.17f, 0.1f, -0.92f, 0.4f, -1.38f, -0.32f)
                curveToRelative(-0.3f, -0.47f, -0.15f, -1.08f, 0.32f, -1.38f)
                curveToRelative(2.17f, -1.36f, 3.66f, -3.25f, 4.29f, -4.15f)
                curveToRelative(-0.63f, -0.9f, -2.13f, -2.8f, -4.29f, -4.15f)
                curveToRelative(-0.47f, -0.29f, -0.61f, -0.91f, -0.32f, -1.38f)
                curveToRelative(0.29f, -0.47f, 0.91f, -0.61f, 1.38f, -0.32f)
                curveToRelative(3.33f, 2.08f, 5.21f, 5.21f, 5.29f, 5.34f)
                curveToRelative(0.19f, 0.32f, 0.19f, 0.71f, 0f, 1.02f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SquareTerminal = it}
