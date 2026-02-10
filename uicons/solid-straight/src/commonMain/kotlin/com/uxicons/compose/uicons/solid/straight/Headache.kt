package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headache: ImageVector? = null

val Icons.Ss.Headache: ImageVector
    get() = _Headache ?: UXIcon(name = "Headache") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.59f, 12f)
                lineToRelative(1.41f, -4f)
                horizontalLineToRelative(-3.08f)
                curveToRelative(-0.62f, 0f, -1.06f, -0.6f, -0.88f, -1.19f)
                lineToRelative(2.66f, -6.81f)
                horizontalLineToRelative(4.3f)
                lineToRelative(-1.69f, 4f)
                horizontalLineToRelative(2.79f)
                curveToRelative(0.72f, 0f, 1.15f, 0.8f, 0.75f, 1.41f)
                lineToRelative(-5.06f, 6.59f)
                close()
                moveTo(23.28f, 11.14f)
                curveToRelative(-1.18f, -2.71f, -2.29f, -5.26f, -3.48f, -6.72f)
                curveToRelative(-2.1f, -2.81f, -5.31f, -4.42f, -8.8f, -4.42f)
                curveToRelative(-0.63f, 0f, -1.27f, 0.07f, -1.91f, 0.19f)
                lineToRelative(-0.77f, 1.82f)
                curveToRelative(0.98f, 0.08f, 1.86f, 0.65f, 2.33f, 1.52f)
                curveToRelative(0.51f, 0.94f, 0.45f, 2.09f, -0.14f, 2.98f)
                lineToRelative(-0.08f, 0.11f)
                lineToRelative(-5.66f, 7.38f)
                horizontalLineToRelative(-4.35f)
                curveToRelative(0.41f, 1.46f, 1.12f, 2.83f, 2.12f, 4.03f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.21f)
                close()
            }
        }.also { _Headache = it}
