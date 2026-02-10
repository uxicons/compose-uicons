package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MatchFire: ImageVector? = null

val Icons.Br.MatchFire: ImageVector
    get() = _MatchFire ?: UXIcon(name = "MatchFire") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.99f, 9.69f)
            curveToRelative(0.15f, -3.68f, -3.21f, -6.96f, -5.61f, -9.39f)
            curveToRelative(-0.5f, -0.51f, -1.34f, -0.36f, -1.66f, 0.28f)
            curveToRelative(-1.32f, 2.66f, -0.99f, 6.42f, -2.17f, 6.42f)
            curveToRelative(-0.56f, 0f, -0.88f, -0.98f, -1.05f, -1.5f)
            curveToRelative(-0.21f, -0.61f, -1.04f, -0.69f, -1.39f, -0.16f)
            curveToRelative(-0.69f, 1.05f, -1.11f, 2.87f, -1.11f, 4.11f)
            curveToRelative(0f, 3.58f, 2.9f, 6.49f, 6.49f, 6.5f)
            curveToRelative(3.44f, 0.01f, 6.37f, -2.83f, 6.51f, -6.27f)
            close()
            moveTo(4.87f, 13.16f)
            curveToRelative(-0.58f, -0.81f, -0.41f, -1.94f, 0.29f, -2.65f)
            lineToRelative(0.85f, -0.85f)
            curveToRelative(0.27f, -0.27f, 0.71f, -0.27f, 0.98f, 0f)
            lineToRelative(0.92f, 0.92f)
            horizontalLineToRelative(0f)
            curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
            curveToRelative(-0.86f, 0.86f, -2.31f, 0.77f, -3.05f, -0.26f)
            close()
            moveTo(23.29f, 12.09f)
            lineToRelative(-13.19f, 8.14f)
            curveToRelative(-0.86f, 1.44f, -1.92f, 3.0f, -2.66f, 3.4f)
            curveToRelative(-1.45f, 0.8f, -3.28f, 0.27f, -4.07f, -1.18f)
            curveToRelative(-0.8f, -1.45f, -0.27f, -3.28f, 1.18f, -4.07f)
            curveToRelative(0.71f, -0.39f, 2.44f, -0.6f, 4.0f, -0.71f)
            lineToRelative(13.16f, -8.13f)
            curveToRelative(0.7f, -0.43f, 1.63f, -0.22f, 2.06f, 0.49f)
            curveToRelative(0.44f, 0.7f, 0.22f, 1.63f, -0.49f, 2.06f)
            close()
        }
    }.also { _MatchFire = it }
