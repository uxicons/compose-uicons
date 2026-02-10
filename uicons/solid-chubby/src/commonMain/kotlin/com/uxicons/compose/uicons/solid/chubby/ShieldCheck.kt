package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCheck: ImageVector? = null

val Icons.Sc.ShieldCheck: ImageVector
    get() = _ShieldCheck ?: UXIcon(name = "ShieldCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.88f, 5.68f)
                curveToRelative(-0.08f, -0.35f, -0.34f, -0.63f, -0.69f, -0.74f)
                lineToRelative(-0.83f, -0.25f)
                curveToRelative(-3.46f, -0.92f, -6.71f, -3.46f, -6.74f, -3.48f)
                curveToRelative(-0.36f, -0.29f, -0.88f, -0.28f, -1.24f, 0.0f)
                curveToRelative(-0.03f, 0.03f, -3.19f, 2.52f, -6.77f, 3.49f)
                lineToRelative(-0.8f, 0.24f)
                curveToRelative(-0.34f, 0.1f, -0.61f, 0.39f, -0.69f, 0.74f)
                curveToRelative(-0.4f, 1.76f, -2.26f, 10.69f, 0.26f, 13.24f)
                curveToRelative(2.42f, 2.44f, 8.11f, 3.98f, 8.35f, 4.04f)
                curveToRelative(0.16f, 0.04f, 0.34f, 0.05f, 0.51f, 0f)
                curveToRelative(0.24f, -0.06f, 5.94f, -1.6f, 8.35f, -4.04f)
                curveToRelative(2.53f, -2.56f, 0.66f, -11.48f, 0.26f, -13.24f)
                close()
                moveTo(15.7f, 11.22f)
                curveToRelative(-1.56f, 3.02f, -3.75f, 4.15f, -3.84f, 4.2f)
                curveToRelative(-0.14f, 0.07f, -0.3f, 0.11f, -0.45f, 0.11f)
                curveToRelative(-0.17f, 0f, -0.35f, -0.04f, -0.5f, -0.14f)
                curveToRelative(-0.07f, -0.04f, -1.62f, -0.95f, -2.52f, -2.18f)
                curveToRelative(-0.33f, -0.45f, -0.23f, -1.07f, 0.22f, -1.4f)
                curveToRelative(0.45f, -0.33f, 1.07f, -0.23f, 1.4f, 0.22f)
                curveToRelative(0.39f, 0.53f, 0.99f, 1.01f, 1.41f, 1.31f)
                curveToRelative(0.6f, -0.44f, 1.66f, -1.39f, 2.51f, -3.03f)
                curveToRelative(0.25f, -0.49f, 0.86f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                close()
            }
        }.also { _ShieldCheck = it}
