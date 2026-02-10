package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bone: ImageVector? = null

val Icons.Sr.Bone: ImageVector
    get() = _Bone ?: UXIcon(name = "Bone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 24f)
                curveToRelative(-0.93f, 0f, -1.83f, -0.28f, -2.6f, -0.83f)
                curveToRelative(-0.82f, -0.58f, -1.42f, -1.42f, -1.7f, -2.37f)
                curveToRelative(-0.95f, -0.29f, -1.79f, -0.89f, -2.37f, -1.7f)
                curveToRelative(-0.73f, -1.03f, -0.99f, -2.29f, -0.73f, -3.55f)
                curveToRelative(0.36f, -1.75f, 1.79f, -3.15f, 3.56f, -3.48f)
                curveToRelative(1.16f, -0.21f, 2.33f, 0.02f, 3.3f, 0.65f)
                lineToRelative(5.81f, -5.74f)
                curveToRelative(-0.67f, -1f, -0.9f, -2.18f, -0.69f, -3.34f)
                curveToRelative(0.32f, -1.77f, 1.72f, -3.2f, 3.48f, -3.56f)
                curveToRelative(1.25f, -0.26f, 2.52f, 0f, 3.55f, 0.73f)
                curveToRelative(0.82f, 0.58f, 1.42f, 1.42f, 1.7f, 2.37f)
                curveToRelative(0.95f, 0.29f, 1.79f, 0.89f, 2.37f, 1.7f)
                curveToRelative(0.73f, 1.03f, 0.99f, 2.29f, 0.73f, 3.55f)
                curveToRelative(-0.36f, 1.75f, -1.79f, 3.15f, -3.56f, 3.48f)
                curveToRelative(-1.16f, 0.21f, -2.33f, -0.02f, -3.3f, -0.65f)
                lineToRelative(-5.81f, 5.74f)
                curveToRelative(0.67f, 1f, 0.9f, 2.18f, 0.69f, 3.34f)
                curveToRelative(-0.32f, 1.77f, -1.72f, 3.2f, -3.48f, 3.56f)
                curveToRelative(-0.32f, 0.07f, -0.64f, 0.1f, -0.95f, 0.1f)
                close()
            }
        }.also { _Bone = it}
