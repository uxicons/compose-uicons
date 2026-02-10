package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlChopsticks: ImageVector? = null

val Icons.Ts.BowlChopsticks: ImageVector
    get() = _BowlChopsticks ?: UXIcon(name = "BowlChopsticks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.0f, 5.01f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(1f)
                lineTo(3.0f, 6.01f)
                verticalLineToRelative(-1f)
                close()
                moveTo(23.96f, 2.01f)
                lineToRelative(-0.05f, -1.0f)
                lineTo(2.98f, 2.01f)
                lineToRelative(0.05f, 1.0f)
                lineToRelative(20.94f, -1f)
                close()
                moveTo(23.97f, 12.91f)
                curveToRelative(-0.76f, 4.71f, -3.95f, 9.26f, -7.75f, 11.05f)
                lineToRelative(-0.1f, 0.05f)
                lineToRelative(-8.33f, -0.05f)
                curveTo(3.98f, 22.16f, 0.8f, 17.62f, 0.04f, 12.91f)
                curveToRelative(-0.12f, -0.72f, 0.09f, -1.46f, 0.56f, -2.02f)
                curveToRelative(0.48f, -0.56f, 1.17f, -0.88f, 1.91f, -0.88f)
                horizontalLineToRelative(18.98f)
                curveToRelative(0.74f, 0f, 1.43f, 0.32f, 1.91f, 0.88f)
                curveToRelative(0.48f, 0.56f, 0.68f, 1.29f, 0.56f, 2.02f)
                close()
                moveTo(22.64f, 11.54f)
                curveToRelative(-0.29f, -0.34f, -0.71f, -0.53f, -1.15f, -0.53f)
                lineTo(2.51f, 11.01f)
                curveToRelative(-0.44f, 0f, -0.86f, 0.19f, -1.15f, 0.53f)
                curveToRelative(-0.29f, 0.34f, -0.41f, 0.78f, -0.34f, 1.21f)
                curveToRelative(0.7f, 4.36f, 3.61f, 8.56f, 7.09f, 10.26f)
                horizontalLineToRelative(7.77f)
                curveToRelative(3.48f, -1.7f, 6.39f, -5.9f, 7.09f, -10.26f)
                curveToRelative(0.07f, -0.43f, -0.05f, -0.87f, -0.34f, -1.21f)
                close()
            }
        }.also { _BowlChopsticks = it}
