package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mirror: ImageVector? = null

val Icons.Ts.Mirror: ImageVector
    get() = _Mirror ?: UXIcon(name = "Mirror") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 5f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(-0.83f, 1.67f)
                close()
                moveTo(13.59f, 18.84f)
                lineToRelative(0.38f, 2.82f)
                curveToRelative(0.24f, 1.16f, -0.77f, 2.37f, -1.97f, 2.33f)
                curveToRelative(-1.21f, 0.03f, -2.21f, -1.17f, -1.97f, -2.36f)
                lineToRelative(0.36f, -2.8f)
                curveToRelative(-3.99f, -0.77f, -7.06f, -4.31f, -7.36f, -8.66f)
                lineToRelative(1.06f, 0.52f)
                curveToRelative(0.51f, 3.78f, 3.36f, 6.76f, 6.93f, 7.23f)
                curveToRelative(0.66f, 0.09f, 1.3f, 0.09f, 1.96f, 0.0f)
                curveToRelative(3.95f, -0.52f, 7.02f, -4.1f, 7.02f, -8.43f)
                curveToRelative(0f, -4.69f, -3.59f, -8.5f, -8f, -8.5f)
                curveToRelative(-1.86f, 0f, -3.57f, 0.68f, -4.93f, 1.82f)
                lineToRelative(-0.46f, -0.91f)
                curveToRelative(1.5f, -1.19f, 3.37f, -1.91f, 5.39f, -1.91f)
                curveToRelative(4.96f, 0f, 9f, 4.26f, 9f, 9.5f)
                curveToRelative(0f, 4.67f, -3.21f, 8.55f, -7.41f, 9.34f)
                close()
                moveTo(12.01f, 19f)
                curveToRelative(-0.2f, 0.0f, -0.41f, -0.01f, -0.63f, -0.03f)
                lineToRelative(-0.36f, 2.82f)
                curveToRelative(-0.06f, 0.32f, 0.02f, 0.62f, 0.21f, 0.84f)
                curveToRelative(0.38f, 0.46f, 1.15f, 0.46f, 1.53f, 0f)
                curveToRelative(0.19f, -0.23f, 0.27f, -0.53f, 0.22f, -0.82f)
                lineToRelative(-0.39f, -2.85f)
                curveToRelative(-0.21f, 0.02f, -0.4f, 0.02f, -0.59f, 0.02f)
                close()
                moveTo(4.38f, 8.37f)
                lineToRelative(-2.25f, -1.12f)
                lineToRelative(2.25f, -1.12f)
                lineToRelative(1.12f, -2.25f)
                lineToRelative(1.12f, 2.25f)
                lineToRelative(2.25f, 1.12f)
                lineToRelative(-2.25f, 1.12f)
                lineToRelative(-1.12f, 2.25f)
                lineToRelative(-1.12f, -2.25f)
                close()
                moveTo(4.37f, 7.25f)
                lineToRelative(0.76f, 0.38f)
                lineToRelative(0.38f, 0.76f)
                lineToRelative(0.38f, -0.76f)
                lineToRelative(0.76f, -0.38f)
                lineToRelative(-0.76f, -0.38f)
                lineToRelative(-0.38f, -0.76f)
                lineToRelative(-0.38f, 0.76f)
                lineToRelative(-0.76f, 0.38f)
                close()
            }
        }.also { _Mirror = it}
