package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dog: ImageVector? = null

val Icons.Rs.Dog: ImageVector
    get() = _Dog ?: UXIcon(name = "Dog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.62f, 5f)
                curveToRelative(-0.31f, 0f, -0.59f, -0.17f, -0.72f, -0.45f)
                curveToRelative(-0.48f, -0.96f, -1.44f, -1.55f, -2.51f, -1.55f)
                horizontalLineToRelative(-1.38f)
                lineTo(17f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1.67f)
                lineToRelative(-1.2f, 3.33f)
                lineToRelative(-6.8f, 0.0f)
                curveToRelative(-0.83f, 0f, -1.62f, 0.25f, -2.28f, 0.71f)
                curveToRelative(-0.48f, -0.33f, -1.72f, -1.41f, -1.72f, -3.72f)
                lineTo(0f, 5f)
                curveToRelative(0f, 2.96f, 1.53f, 4.56f, 2.41f, 5.23f)
                curveToRelative(-0.27f, 0.55f, -0.41f, 1.15f, -0.41f, 1.77f)
                lineToRelative(0.0f, 12f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5f)
                lineToRelative(5f, -0.0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.39f)
                lineToRelative(1.19f, -5.61f)
                horizontalLineToRelative(0.81f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.38f)
                close()
                moveTo(22f, 9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(-1.55f, 7.29f)
                lineToRelative(-0.02f, 4.71f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5f)
                lineToRelative(-9f, 0.01f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.0f, -10f)
                curveToRelative(0f, -0.53f, 0.21f, -1.04f, 0.58f, -1.42f)
                curveToRelative(0.38f, -0.38f, 0.88f, -0.59f, 1.42f, -0.59f)
                lineToRelative(8.2f, -0.01f)
                lineToRelative(1.8f, -5.0f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.31f, 0f, 0.59f, 0.17f, 0.72f, 0.45f)
                curveToRelative(0.48f, 0.96f, 1.44f, 1.55f, 2.51f, 1.55f)
                horizontalLineToRelative(0.38f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Dog = it}
