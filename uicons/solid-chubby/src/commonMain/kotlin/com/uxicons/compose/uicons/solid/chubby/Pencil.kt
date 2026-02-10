package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pencil: ImageVector? = null

val Icons.Sc.Pencil: ImageVector
    get() = _Pencil ?: UXIcon(name = "Pencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.99f, 5.45f)
                curveToRelative(-0.03f, -0.18f, -0.31f, -1.77f, -1.46f, -2.93f)
                curveToRelative(-1.16f, -1.13f, -2.75f, -1.41f, -2.93f, -1.44f)
                curveToRelative(-0.24f, -0.04f, -0.48f, 0.01f, -0.68f, 0.14f)
                curveToRelative(-0.07f, 0.04f, -1.11f, 0.7f, -3.17f, 2.44f)
                curveToRelative(1.06f, 0.37f, 2.43f, 1.02f, 3.54f, 2.11f)
                curveToRelative(1.11f, 1.09f, 1.78f, 2.43f, 2.16f, 3.47f)
                curveToRelative(1.72f, -2.01f, 2.37f, -3.03f, 2.41f, -3.1f)
                curveToRelative(0.13f, -0.2f, 0.18f, -0.45f, 0.14f, -0.69f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.95f, 5.22f)
                curveToRelative(-1.07f, 0.97f, -2.32f, 2.14f, -3.75f, 3.56f)
                curveTo(3.13f, 14.81f, 1.54f, 17.21f, 1.48f, 17.31f)
                curveToRelative(-0.09f, 0.14f, -0.15f, 0.3f, -0.16f, 0.47f)
                lineToRelative(-0.32f, 4.07f)
                curveToRelative(-0.02f, 0.29f, 0.08f, 0.58f, 0.29f, 0.79f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.03f, 0f, 0.05f, 0f, 0.08f, -0.0f)
                lineToRelative(4.1f, -0.32f)
                curveToRelative(0.17f, -0.01f, 0.32f, -0.07f, 0.46f, -0.15f)
                curveToRelative(0.1f, -0.06f, 2.52f, -1.64f, 8.59f, -7.66f)
                curveToRelative(1.46f, -1.45f, 2.67f, -2.72f, 3.65f, -3.8f)
                curveToRelative(-0.15f, -0.65f, -0.68f, -2.5f, -2.0f, -3.8f)
                curveToRelative(-1.35f, -1.32f, -3.28f, -1.83f, -3.93f, -1.98f)
                close()
            }
        }.also { _Pencil = it}
