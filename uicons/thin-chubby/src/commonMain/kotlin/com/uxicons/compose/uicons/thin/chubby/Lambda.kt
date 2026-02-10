package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Tc.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.72f, 22.45f)
                curveToRelative(-1.01f, 0.51f, -1.94f, 0.53f, -2.24f, 0.54f)
                curveToRelative(-0.87f, 0.06f, -1.72f, -0.16f, -2.2f, -0.66f)
                curveToRelative(-0.07f, -0.07f, -0.12f, -0.15f, -0.14f, -0.24f)
                curveToRelative(-1.59f, -6.63f, -4.46f, -11.64f, -6.87f, -14.96f)
                curveToRelative(-0.14f, 0.14f, -7.71f, 5.22f, -9.27f, 15.44f)
                curveToRelative(-0.04f, 0.27f, -0.3f, 0.46f, -0.57f, 0.42f)
                curveToRelative(-0.27f, -0.04f, -0.46f, -0.29f, -0.42f, -0.57f)
                curveToRelative(1.59f, -10.59f, 9.34f, -15.86f, 9.67f, -16.08f)
                curveToRelative(0.0f, -0.0f, 0.0f, -0.0f, 0.01f, -0.0f)
                curveToRelative(-1.96f, -2.56f, -3.49f, -3.89f, -3.53f, -3.92f)
                curveToRelative(-0.33f, -0.32f, -0.78f, -0.45f, -1.43f, -0.41f)
                curveToRelative(-0.35f, 0.01f, -1.19f, 0.04f, -2.0f, 0.44f)
                curveToRelative(-0.25f, 0.12f, -0.55f, 0.02f, -0.67f, -0.22f)
                curveToRelative(-0.12f, -0.25f, -0.02f, -0.55f, 0.22f, -0.67f)
                curveToRelative(1.01f, -0.51f, 2.01f, -0.53f, 2.34f, -0.54f)
                curveToRelative(0.98f, -0.05f, 1.69f, 0.17f, 2.21f, 0.66f)
                curveToRelative(0.06f, 0.05f, 8.07f, 7.0f, 11.25f, 20.02f)
                curveToRelative(0.3f, 0.23f, 0.72f, 0.33f, 1.3f, 0.3f)
                curveToRelative(0.33f, -0.01f, 1.09f, -0.03f, 1.9f, -0.44f)
                curveToRelative(0.25f, -0.12f, 0.55f, -0.02f, 0.67f, 0.22f)
                curveToRelative(0.12f, 0.25f, 0.02f, 0.55f, -0.22f, 0.67f)
                close()
            }
        }.also { _Lambda = it}
