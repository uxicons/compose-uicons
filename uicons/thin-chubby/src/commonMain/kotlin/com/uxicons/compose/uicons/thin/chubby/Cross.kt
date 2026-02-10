package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cross: ImageVector? = null

val Icons.Tc.Cross: ImageVector
    get() = _Cross ?: UXIcon(name = "Cross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 1.25f)
                curveToRelative(-0.14f, -0.24f, -0.45f, -0.32f, -0.69f, -0.18f)
                curveToRelative(-0.06f, 0.03f, -5.22f, 3.1f, -10.26f, 8.08f)
                curveTo(6.96f, 4.17f, 1.79f, 1.1f, 1.74f, 1.07f)
                curveToRelative(-0.24f, -0.14f, -0.55f, -0.06f, -0.69f, 0.18f)
                curveToRelative(-0.14f, 0.24f, -0.06f, 0.54f, 0.18f, 0.69f)
                curveToRelative(0.06f, 0.03f, 5.12f, 3.05f, 10.07f, 7.92f)
                curveToRelative(-0.14f, 0.14f, -0.28f, 0.29f, -0.42f, 0.43f)
                curveTo(5.53f, 15.92f, 2.15f, 22.2f, 2.11f, 22.26f)
                curveToRelative(-0.13f, 0.24f, -0.04f, 0.55f, 0.21f, 0.68f)
                curveToRelative(0.07f, 0.04f, 0.15f, 0.06f, 0.23f, 0.06f)
                curveToRelative(0.18f, 0f, 0.35f, -0.1f, 0.44f, -0.27f)
                curveToRelative(0.03f, -0.06f, 3.35f, -6.23f, 8.6f, -11.76f)
                curveToRelative(0.13f, -0.14f, 0.27f, -0.28f, 0.4f, -0.41f)
                curveToRelative(0.13f, 0.14f, 0.27f, 0.28f, 0.4f, 0.41f)
                curveToRelative(5.25f, 5.52f, 8.57f, 11.69f, 8.6f, 11.76f)
                curveToRelative(0.09f, 0.17f, 0.26f, 0.27f, 0.44f, 0.27f)
                curveToRelative(0.08f, 0f, 0.16f, -0.02f, 0.23f, -0.06f)
                curveToRelative(0.24f, -0.13f, 0.34f, -0.43f, 0.21f, -0.68f)
                curveToRelative(-0.03f, -0.06f, -3.41f, -6.35f, -8.76f, -11.97f)
                curveToRelative(-0.14f, -0.15f, -0.28f, -0.29f, -0.42f, -0.43f)
                curveTo(17.65f, 4.98f, 22.72f, 1.96f, 22.77f, 1.93f)
                curveToRelative(0.24f, -0.14f, 0.32f, -0.45f, 0.18f, -0.69f)
                close()
            }
        }.also { _Cross = it}
