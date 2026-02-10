package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareRoot: ImageVector? = null

val Icons.Tr.SquareRoot: ImageVector
    get() = _SquareRoot ?: UXIcon(name = "SquareRoot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 3f)
                curveToRelative(-1.55f, 0f, -2.93f, 1.04f, -3.36f, 2.53f)
                lineToRelative(-4.33f, 15.39f)
                curveToRelative(-0.17f, 0.63f, -0.75f, 1.05f, -1.41f, 1.08f)
                curveToRelative(-0.64f, 0f, -1.18f, -0.39f, -1.38f, -1.0f)
                lineToRelative(-2.81f, -9.31f)
                curveToRelative(-0.34f, -1.01f, -1.29f, -1.7f, -2.37f, -1.7f)
                horizontalLineToRelative(-0.34f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0.34f)
                curveToRelative(1.51f, 0f, 2.84f, 0.96f, 3.32f, 2.39f)
                lineToRelative(2.81f, 9.31f)
                curveToRelative(0.1f, 0.29f, 0.38f, 0.3f, 0.44f, 0.3f)
                curveToRelative(0.08f, -0.0f, 0.35f, -0.04f, 0.43f, -0.34f)
                lineToRelative(4.34f, -15.4f)
                curveToRelative(0.55f, -1.92f, 2.33f, -3.26f, 4.33f, -3.26f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(23.81f, 12.11f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.13f, -0.7f, 0.09f)
                lineToRelative(-3.1f, 3.99f)
                lineToRelative(-3.1f, -3.99f)
                curveToRelative(-0.17f, -0.22f, -0.48f, -0.26f, -0.7f, -0.09f)
                curveToRelative(-0.22f, 0.17f, -0.26f, 0.48f, -0.09f, 0.7f)
                lineToRelative(3.26f, 4.19f)
                lineToRelative(-3.26f, 4.19f)
                curveToRelative(-0.17f, 0.22f, -0.13f, 0.53f, 0.09f, 0.7f)
                curveToRelative(0.09f, 0.07f, 0.2f, 0.1f, 0.31f, 0.1f)
                curveToRelative(0.15f, 0f, 0.3f, -0.07f, 0.4f, -0.19f)
                lineToRelative(3.1f, -3.99f)
                lineToRelative(3.1f, 3.99f)
                curveToRelative(0.1f, 0.13f, 0.25f, 0.19f, 0.4f, 0.19f)
                curveToRelative(0.11f, 0f, 0.21f, -0.03f, 0.31f, -0.1f)
                curveToRelative(0.22f, -0.17f, 0.26f, -0.48f, 0.09f, -0.7f)
                lineToRelative(-3.26f, -4.19f)
                lineToRelative(3.26f, -4.19f)
                curveToRelative(0.17f, -0.22f, 0.13f, -0.53f, -0.09f, -0.7f)
                close()
            }
        }.also { _SquareRoot = it}
