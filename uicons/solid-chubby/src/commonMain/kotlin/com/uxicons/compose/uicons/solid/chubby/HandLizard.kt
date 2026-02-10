package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLizard: ImageVector? = null

val Icons.Sc.HandLizard: ImageVector
    get() = _HandLizard ?: UXIcon(name = "HandLizard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 1f)
                curveToRelative(-5.87f, 0f, -8.5f, 2.01f, -8.5f, 4f)
                curveToRelative(0f, 1.73f, 1.36f, 2.64f, 4.05f, 2.7f)
                curveToRelative(0.42f, 0.01f, 2.39f, -0.2f, 2.95f, -0.2f)
                curveToRelative(3.17f, 0f, 3.88f, 0.71f, 3.89f, 0.91f)
                curveToRelative(-0.18f, 0.33f, -1.72f, 0.85f, -4.12f, 0.95f)
                curveToRelative(-0.81f, 0.09f, -3.27f, 0.36f, -3.27f, 2.64f)
                curveToRelative(0f, 1.91f, 2.78f, 2.48f, 4.88f, 2.74f)
                curveToRelative(1.17f, 0.15f, 2.33f, 0.21f, 3.12f, 0.24f)
                verticalLineToRelative(5.02f)
                curveToRelative(0f, 0.15f, 0.04f, 0.31f, 0.1f, 0.45f)
                curveToRelative(0.05f, 0.1f, 1.32f, 2.56f, 5.38f, 2.56f)
                horizontalLineToRelative(0.01f)
                curveToRelative(4.24f, -0.01f, 4.94f, -2.68f, 4.96f, -2.79f)
                curveToRelative(0.02f, -0.08f, 0.03f, -0.16f, 0.03f, -0.24f)
                lineToRelative(0.01f, -8.96f)
                curveToRelative(0f, -6.83f, -4.29f, -10.02f, -13.5f, -10.02f)
                close()
            }
        }.also { _HandLizard = it}
