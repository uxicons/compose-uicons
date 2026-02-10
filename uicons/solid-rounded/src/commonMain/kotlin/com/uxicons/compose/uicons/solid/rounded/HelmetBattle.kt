package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelmetBattle: ImageVector? = null

val Icons.Sr.HelmetBattle: ImageVector
    get() = _HelmetBattle ?: UXIcon(name = "HelmetBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.7f, 13.06f)
                lineToRelative(-3.7f, 2.0f)
                lineToRelative(-3.7f, -2.0f)
                curveToRelative(-0.18f, -0.1f, -0.3f, -0.29f, -0.3f, -0.5f)
                curveToRelative(0f, -0.31f, 0.25f, -0.57f, 0.56f, -0.57f)
                horizontalLineToRelative(6.87f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.57f)
                curveToRelative(0f, 0.21f, -0.11f, 0.4f, -0.3f, 0.5f)
                close()
                moveTo(14.34f, 0.63f)
                curveToRelative(-1.3f, -0.85f, -2.98f, -0.85f, -4.29f, 0f)
                curveToRelative(-2.93f, 1.91f, -7.86f, 5.72f, -7.86f, 9.78f)
                verticalLineToRelative(6.34f)
                curveToRelative(0f, 2.13f, 1.27f, 4.03f, 3.24f, 4.84f)
                lineToRelative(4.97f, 2.05f)
                curveToRelative(0.19f, 0.08f, 0.39f, 0.13f, 0.59f, 0.18f)
                verticalLineToRelative(-7.03f)
                lineToRelative(-3.65f, -1.97f)
                curveToRelative(-0.83f, -0.45f, -1.35f, -1.31f, -1.35f, -2.26f)
                curveToRelative(0f, -1.42f, 1.15f, -2.57f, 2.56f, -2.57f)
                horizontalLineToRelative(6.87f)
                curveToRelative(1.42f, 0f, 2.56f, 1.15f, 2.56f, 2.57f)
                curveToRelative(0f, 0.94f, -0.52f, 1.81f, -1.35f, 2.26f)
                lineToRelative(-3.65f, 1.97f)
                verticalLineToRelative(7.12f)
                curveToRelative(0.33f, -0.06f, 0.66f, -0.14f, 0.98f, -0.28f)
                lineToRelative(4.97f, -2.05f)
                curveToRelative(1.97f, -0.81f, 3.24f, -2.71f, 3.24f, -4.84f)
                verticalLineToRelative(-6.34f)
                curveToRelative(0f, -4.06f, -4.92f, -7.87f, -7.86f, -9.78f)
                close()
            }
        }.also { _HelmetBattle = it}
