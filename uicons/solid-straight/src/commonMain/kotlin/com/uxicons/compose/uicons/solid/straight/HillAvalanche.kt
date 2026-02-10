package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HillAvalanche: ImageVector? = null

val Icons.Ss.HillAvalanche: ImageVector
    get() = _HillAvalanche ?: UXIcon(name = "HillAvalanche") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 1f)
                lineToRelative(23f, 23f)
                horizontalLineToRelative(-20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(17.79f, 15.94f)
                curveToRelative(1.35f, 1.41f, 3.79f, 1.41f, 5.14f, 0f)
                curveToRelative(1.41f, -1.35f, 1.41f, -3.79f, 0f, -5.14f)
                lineToRelative(-1.41f, 1.42f)
                curveToRelative(0.64f, 0.61f, 0.64f, 1.7f, 0f, 2.31f)
                curveToRelative(-0.62f, 0.62f, -1.7f, 0.61f, -2.31f, 0.01f)
                lineToRelative(-3.77f, -3.84f)
                curveToRelative(0.48f, 0.2f, 1.0f, 0.31f, 1.55f, 0.31f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.9f, -1.33f, -3.48f, -3.1f, -3.89f)
                curveToRelative(0f, -0.0f, 0f, -0.01f, 0f, -0.01f)
                curveToRelative(-0.41f, -1.77f, -2.0f, -3.1f, -3.9f, -3.1f)
                curveToRelative(-0.64f, 0f, -1.25f, 0.15f, -1.81f, 0.44f)
                curveToRelative(-1.34f, -0.74f, -3.04f, -0.54f, -4.16f, 0.58f)
                curveToRelative(-1.36f, 1.3f, -1.36f, 3.65f, -0.01f, 4.94f)
                lineToRelative(9.77f, 9.97f)
                close()
            }
        }.also { _HillAvalanche = it}
