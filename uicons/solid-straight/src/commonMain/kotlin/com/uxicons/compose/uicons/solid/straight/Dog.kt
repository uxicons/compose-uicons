package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dog: ImageVector? = null

val Icons.Ss.Dog: ImageVector
    get() = _Dog ?: UXIcon(name = "Dog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.62f, 5f)
                curveToRelative(-0.31f, 0f, -0.59f, -0.17f, -0.72f, -0.45f)
                curveToRelative(-0.48f, -0.96f, -1.44f, -1.55f, -2.51f, -1.55f)
                horizontalLineToRelative(-1.38f)
                verticalLineTo(0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1.67f)
                lineToRelative(-1.2f, 3.33f)
                lineToRelative(-6.8f, 0.0f)
                curveToRelative(-0.83f, 0f, -1.62f, 0.25f, -2.28f, 0.71f)
                curveToRelative(-0.48f, -0.33f, -1.72f, -1.41f, -1.72f, -3.72f)
                horizontalLineTo(0f)
                curveToRelative(0f, 2.96f, 1.53f, 4.56f, 2.41f, 5.23f)
                curveToRelative(-0.27f, 0.55f, -0.41f, 1.15f, -0.41f, 1.77f)
                lineToRelative(0.0f, 12f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(6f, -0.0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6.39f)
                lineToRelative(2.19f, -6.61f)
                horizontalLineToRelative(0.81f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.38f)
                close()
            }
        }.also { _Dog = it}
