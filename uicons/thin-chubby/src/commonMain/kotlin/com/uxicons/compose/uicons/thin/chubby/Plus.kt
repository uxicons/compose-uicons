package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plus: ImageVector? = null

val Icons.Tc.Plus: ImageVector
    get() = _Plus ?: UXIcon(name = "Plus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.6f, 12.04f)
                curveToRelative(-0.17f, -0.04f, -4.24f, -1.06f, -10.6f, -1.06f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.01f, 0f)
                curveToRelative(0.1f, -5.66f, 1.01f, -9.31f, 1.02f, -9.35f)
                curveToRelative(0.07f, -0.27f, -0.09f, -0.54f, -0.36f, -0.61f)
                curveToRelative(-0.27f, -0.07f, -0.54f, 0.09f, -0.61f, 0.36f)
                curveToRelative(-0.04f, 0.16f, -0.95f, 3.82f, -1.05f, 9.61f)
                curveToRelative(-5.81f, 0.1f, -9.43f, 1.01f, -9.59f, 1.06f)
                curveToRelative(-0.27f, 0.07f, -0.43f, 0.34f, -0.36f, 0.61f)
                curveToRelative(0.06f, 0.23f, 0.31f, 0.44f, 0.61f, 0.36f)
                curveToRelative(0.04f, -0.01f, 3.64f, -0.92f, 9.33f, -1.02f)
                curveToRelative(0f, 0.01f, 0f, 0.01f, 0f, 0.01f)
                curveToRelative(0f, 6.41f, 1.02f, 10.46f, 1.06f, 10.62f)
                curveToRelative(0.06f, 0.23f, 0.33f, 0.44f, 0.61f, 0.36f)
                curveToRelative(0.27f, -0.08f, 0.43f, -0.32f, 0.36f, -0.61f)
                curveToRelative(-0.01f, -0.04f, -1.03f, -4.09f, -1.03f, -10.38f)
                curveToRelative(0f, -0.01f, 0f, -0.02f, 0f, -0.02f)
                curveToRelative(0.01f, 0f, 0.01f, 0f, 0.02f, 0f)
                curveToRelative(6.22f, 0f, 10.31f, 1.02f, 10.35f, 1.03f)
                curveToRelative(0.27f, 0.07f, 0.54f, -0.09f, 0.61f, -0.36f)
                curveToRelative(0.07f, -0.27f, -0.09f, -0.54f, -0.36f, -0.61f)
                close()
            }
        }.also { _Plus = it}
