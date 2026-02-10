package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperOpen: ImageVector? = null

val Icons.Rr.ClapperOpen: ImageVector
    get() = _ClapperOpen ?: UXIcon(name = "ClapperOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                lineTo(5.45f, 11f)
                lineTo(21.5f, 6.83f)
                curveToRelative(1.05f, -0.27f, 1.69f, -1.32f, 1.44f, -2.43f)
                lineToRelative(-0.35f, -1.25f)
                curveToRelative(-0.42f, -2.18f, -2.82f, -3.64f, -4.95f, -3.01f)
                lineTo(2.97f, 4.06f)
                curveTo(0.88f, 4.62f, -0.39f, 6.79f, 0.14f, 8.91f)
                lineToRelative(0.86f, 3.22f)
                verticalLineToRelative(6.87f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(11.44f, 3.87f)
                lineToRelative(-2.68f, 4.21f)
                lineToRelative(-2.69f, 0.7f)
                lineToRelative(2.68f, -4.19f)
                lineToRelative(2.69f, -0.72f)
                close()
                moveTo(17.26f, 2.31f)
                lineToRelative(-2.65f, 4.24f)
                lineToRelative(-3.01f, 0.78f)
                lineToRelative(2.7f, -4.23f)
                lineToRelative(2.95f, -0.79f)
                close()
                moveTo(21.0f, 4.89f)
                lineToRelative(-3.58f, 0.93f)
                lineToRelative(2.22f, -3.56f)
                curveToRelative(0.02f, 0.01f, 0.05f, 0.02f, 0.07f, 0.03f)
                curveToRelative(0.47f, 0.29f, 0.8f, 0.74f, 0.93f, 1.34f)
                lineToRelative(0.35f, 1.26f)
                close()
                moveTo(3.49f, 5.99f)
                lineToRelative(2.4f, -0.64f)
                lineToRelative(-2.66f, 4.16f)
                lineToRelative(-0.8f, 0.21f)
                lineToRelative(-0.35f, -1.31f)
                curveToRelative(-0.26f, -1.05f, 0.38f, -2.13f, 1.42f, -2.42f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(6f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                lineTo(22f, 13f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ClapperOpen = it}
