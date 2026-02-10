package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dove: ImageVector? = null

val Icons.Sr.Dove: ImageVector
    get() = _Dove ?: UXIcon(name = "Dove") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.31f, 4.0f)
                lineToRelative(-1.41f, -0.6f)
                curveToRelative(-0.23f, -1.37f, -0.94f, -2.43f, -2.03f, -2.97f)
                curveToRelative(-0.95f, -0.48f, -2.04f, -0.56f, -3.05f, -0.22f)
                curveToRelative(-1.01f, 0.34f, -1.83f, 1.05f, -2.3f, 1.98f)
                lineToRelative(-1.3f, 2.5f)
                curveToRelative(-2.97f, -1.2f, -4.76f, -3.3f, -4.79f, -3.33f)
                curveToRelative(-0.47f, -0.45f, -1.9f, -0.71f, -1.7f, 1.0f)
                curveToRelative(1.34f, 1.29f, 2.9f, 2.77f, 5.59f, 4.03f)
                horizontalLineToRelative(0f)
                lineToRelative(-0.84f, 1.62f)
                curveToRelative(-2.98f, -0.81f, -5.37f, -3.6f, -7f, -5.52f)
                curveToRelative(-0.8f, -0.94f, -2.35f, -0.4f, -2.41f, 0.84f)
                curveToRelative(-0.01f, 0.26f, -0.09f, 1.0f, -0.09f, 1.18f)
                curveToRelative(-0.04f, 3.11f, 0.54f, 9.05f, 6f, 12.5f)
                lineToRelative(-6.58f, 0.43f)
                curveToRelative(-0.96f, 0.07f, -1.62f, 1.01f, -1.37f, 1.94f)
                curveToRelative(0.43f, 1.62f, 2.14f, 3.53f, 4.12f, 4.43f)
                curveToRelative(0.67f, 0.3f, 1.45f, 0.24f, 2.09f, -0.1f)
                lineToRelative(3.84f, -2.41f)
                curveToRelative(0.52f, -0.32f, 1.16f, -0.33f, 1.7f, -0.06f)
                curveToRelative(0.71f, 0.35f, 1.87f, 0.77f, 3.44f, 0.77f)
                curveToRelative(3.72f, 0f, 6.75f, -3.03f, 6.75f, -6.75f)
                curveToRelative(0f, -1.64f, -0.01f, -5.92f, -0.01f, -8.59f)
                lineToRelative(1.32f, -0.57f)
                curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.04f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.46f, -0.27f, -0.87f, -0.69f, -1.04f)
                close()
            }
        }.also { _Dove = it}
