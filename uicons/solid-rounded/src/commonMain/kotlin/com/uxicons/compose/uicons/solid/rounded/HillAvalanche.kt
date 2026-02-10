package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HillAvalanche: ImageVector? = null

val Icons.Sr.HillAvalanche: ImageVector
    get() = _HillAvalanche ?: UXIcon(name = "HillAvalanche") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.14f, 18.92f)
                curveToRelative(1.89f, 1.75f, 0.47f, 5.18f, -2.1f, 5.08f)
                horizontalLineToRelative(-11.03f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-10.96f)
                curveToRelative(-0.1f, -2.6f, 3.36f, -4.03f, 5.13f, -2.12f)
                close()
                moveTo(24f, 13.36f)
                curveToRelative(0f, 0.97f, -0.38f, 1.89f, -1.06f, 2.57f)
                curveToRelative(-1.35f, 1.41f, -3.79f, 1.41f, -5.14f, 0f)
                lineToRelative(-9.77f, -9.97f)
                curveToRelative(-1.35f, -1.29f, -1.35f, -3.65f, 0.01f, -4.94f)
                curveToRelative(1.12f, -1.12f, 2.83f, -1.32f, 4.16f, -0.58f)
                curveToRelative(0.56f, -0.29f, 1.18f, -0.44f, 1.81f, -0.44f)
                curveToRelative(1.9f, 0f, 3.49f, 1.33f, 3.9f, 3.1f)
                verticalLineToRelative(0.01f)
                curveToRelative(1.77f, 0.41f, 3.1f, 1.99f, 3.1f, 3.89f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                curveToRelative(-0.55f, 0f, -1.07f, -0.11f, -1.55f, -0.31f)
                lineToRelative(3.77f, 3.84f)
                curveToRelative(0.6f, 0.6f, 1.69f, 0.61f, 2.31f, -0.01f)
                curveToRelative(0.64f, -0.61f, 0.64f, -1.7f, 0f, -2.31f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.69f, 0.69f, 1.06f, 1.6f, 1.06f, 2.57f)
                close()
            }
        }.also { _HillAvalanche = it}
