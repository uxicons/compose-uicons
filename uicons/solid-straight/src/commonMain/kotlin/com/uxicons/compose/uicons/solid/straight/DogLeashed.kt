package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DogLeashed: ImageVector? = null

val Icons.Ss.DogLeashed: ImageVector
    get() = _DogLeashed ?: UXIcon(name = "DogLeashed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10.09f)
                lineToRelative(6.56f, 2.81f)
                lineToRelative(-1.56f, 4.7f)
                verticalLineToRelative(6.39f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-13.9f)
                close()
                moveTo(21.62f, 5.0f)
                curveToRelative(-0.31f, 0f, -0.59f, -0.17f, -0.72f, -0.45f)
                curveToRelative(-0.48f, -0.96f, -1.44f, -1.55f, -2.51f, -1.55f)
                horizontalLineToRelative(-1.38f)
                lineTo(17f, -0.0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1.67f)
                lineToRelative(-0.91f, 2.51f)
                lineTo(3.24f, 0f)
                lineTo(0f, 0f)
                lineToRelative(10.99f, 8.0f)
                lineToRelative(-4.99f, 0.0f)
                curveToRelative(-0.83f, 0f, -1.62f, 0.25f, -2.28f, 0.71f)
                curveToRelative(-0.48f, -0.33f, -1.72f, -1.41f, -1.72f, -3.72f)
                lineTo(0f, 5.0f)
                curveToRelative(0f, 2.96f, 1.53f, 4.56f, 2.41f, 5.23f)
                curveToRelative(-0.27f, 0.55f, -0.41f, 1.15f, -0.41f, 1.77f)
                lineToRelative(0.0f, 12f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(4f, -0.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(2.25f)
                lineToRelative(6.95f, 3.0f)
                horizontalLineToRelative(0.81f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.38f)
                close()
            }
        }.also { _DogLeashed = it}
