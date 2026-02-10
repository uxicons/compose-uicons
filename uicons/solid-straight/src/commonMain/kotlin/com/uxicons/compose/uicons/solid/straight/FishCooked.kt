package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishCooked: ImageVector? = null

val Icons.Ss.FishCooked: ImageVector
    get() = _FishCooked ?: UXIcon(name = "FishCooked") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.7f, 12f)
                horizontalLineToRelative(2.3f)
                curveToRelative(0f, 1f, -0.14f, 3.39f, -0.25f, 4.0f)
                curveToRelative(-0.23f, 1.16f, -1.26f, 2.0f, -2.46f, 2.0f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(0.8f, -1.69f, 1.34f, -3.68f, 1.65f, -6f)
                close()
                moveTo(12f, 5.3f)
                verticalLineToRelative(-2.3f)
                curveToRelative(-3f, 0f, -7.05f, 1.08f, -8.38f, 1.77f)
                curveToRelative(-1f, 0.52f, -1.62f, 1.54f, -1.62f, 2.67f)
                verticalLineToRelative(2.47f)
                curveToRelative(2.24f, -2.52f, 5.49f, -4.02f, 10f, -4.61f)
                close()
                moveTo(24f, 6.86f)
                curveToRelative(0f, 0.69f, -0.34f, 1.14f, -1.03f, 1.14f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(-0.17f, 7.69f, -2.27f, 12.2f, -7.15f, 14.37f)
                curveToRelative(0f, 0f, -0.82f, 0.4f, -1.88f, 0.7f)
                curveToRelative(-2.19f, 0.64f, -4.82f, 0.93f, -7.96f, 0.93f)
                curveToRelative(0f, -3.13f, 0.29f, -5.76f, 0.93f, -7.95f)
                curveToRelative(0.24f, -0.65f, 0.48f, -1.46f, 0.7f, -1.88f)
                curveToRelative(2.17f, -4.88f, 6.67f, -6.99f, 14.37f, -7.15f)
                lineTo(16f, 1.03f)
                curveToRelative(0f, -0.69f, 0.46f, -1.03f, 1.14f, -1.03f)
                curveToRelative(1.14f, 0f, 3.43f, 0.89f, 3.43f, 3.43f)
                curveToRelative(2.54f, 0f, 3.43f, 2.29f, 3.43f, 3.43f)
                close()
                moveTo(7.62f, 19.21f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(11.21f, 16.79f)
                lineToRelative(-4f, -4f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4f, 4f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(13.62f, 13.21f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _FishCooked = it}
