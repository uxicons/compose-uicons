package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpartanHelmet: ImageVector? = null

val Icons.Bs.SpartanHelmet: ImageVector
    get() = _SpartanHelmet ?: UXIcon(name = "SpartanHelmet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.11f, 16.43f)
                curveToRelative(0.32f, -0.97f, 0.9f, -3.06f, 0.9f, -5.4f)
                curveTo(22.02f, 3.26f, 12.39f, 0.15f, 12.0f, 0.02f)
                curveToRelative(-0.39f, 0.13f, -10f, 3.25f, -10f, 11.02f)
                curveToRelative(0f, 2.35f, 0.58f, 4.43f, 0.9f, 5.4f)
                lineToRelative(-1.91f, 5.1f)
                lineToRelative(11.01f, 2.45f)
                lineToRelative(11.01f, -2.44f)
                lineToRelative(-1.9f, -5.1f)
                close()
                moveTo(19.0f, 19.36f)
                lineToRelative(-5.48f, 1.22f)
                verticalLineToRelative(-5.01f)
                curveToRelative(1.47f, -0.95f, 3.49f, -2.53f, 3.49f, -4.12f)
                curveToRelative(0f, -1.5f, -1f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.54f, 0f, -1.08f, 0.25f, -1.5f, 0.62f)
                lineToRelative(-1f, 1.12f)
                lineToRelative(-1f, -1.12f)
                curveToRelative(-0.42f, -0.37f, -0.96f, -0.62f, -1.5f, -0.62f)
                curveToRelative(-1.5f, 0f, -2.5f, 1f, -2.5f, 2.5f)
                curveToRelative(0f, 1.6f, 2.04f, 3.19f, 3.51f, 4.14f)
                verticalLineToRelative(5.0f)
                lineToRelative(-5.5f, -1.22f)
                lineToRelative(1.1f, -2.93f)
                lineToRelative(-0.21f, -0.54f)
                curveToRelative(-0.01f, -0.02f, -0.89f, -2.29f, -0.89f, -4.86f)
                curveToRelative(0f, -4.61f, 5.36f, -7.15f, 7.0f, -7.83f)
                curveToRelative(1.65f, 0.67f, 7.01f, 3.2f, 7.01f, 7.83f)
                curveToRelative(0f, 2.56f, -0.88f, 4.82f, -0.89f, 4.86f)
                lineToRelative(-0.21f, 0.54f)
                lineToRelative(1.09f, 2.93f)
                close()
            }
        }.also { _SpartanHelmet = it}
