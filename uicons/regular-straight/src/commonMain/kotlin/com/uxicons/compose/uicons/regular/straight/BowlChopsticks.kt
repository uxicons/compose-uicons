package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlChopsticks: ImageVector? = null

val Icons.Rs.BowlChopsticks: ImageVector
    get() = _BowlChopsticks ?: UXIcon(name = "BowlChopsticks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 5.01f)
                verticalLineToRelative(2f)
                lineTo(3.0f, 7.01f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(23.99f, 2.51f)
                lineToRelative(-0.1f, -2.0f)
                lineTo(2.96f, 1.51f)
                lineToRelative(0.1f, 2.0f)
                lineToRelative(20.94f, -1f)
                close()
                moveTo(23.3f, 11.08f)
                curveToRelative(0.57f, 0.67f, 0.81f, 1.55f, 0.66f, 2.42f)
                curveToRelative(-0.78f, 4.6f, -3.87f, 8.69f, -7.73f, 10.52f)
                lineTo(7.78f, 24.01f)
                curveTo(3.91f, 22.18f, 0.82f, 18.09f, 0.04f, 13.49f)
                curveToRelative(-0.15f, -0.86f, 0.1f, -1.74f, 0.66f, -2.42f)
                curveToRelative(0.57f, -0.68f, 1.42f, -1.07f, 2.3f, -1.07f)
                horizontalLineToRelative(17.98f)
                curveToRelative(0.89f, 0f, 1.73f, 0.39f, 2.3f, 1.07f)
                close()
                moveTo(21.77f, 12.37f)
                curveToRelative(-0.19f, -0.23f, -0.48f, -0.36f, -0.78f, -0.36f)
                lineTo(3.01f, 12.01f)
                curveToRelative(-0.3f, 0f, -0.58f, 0.13f, -0.78f, 0.36f)
                curveToRelative(-0.11f, 0.13f, -0.28f, 0.41f, -0.22f, 0.79f)
                curveToRelative(0.65f, 3.83f, 3.08f, 7.27f, 6.22f, 8.85f)
                horizontalLineToRelative(7.54f)
                curveToRelative(3.14f, -1.57f, 5.57f, -5.02f, 6.22f, -8.85f)
                curveToRelative(0.07f, -0.38f, -0.11f, -0.66f, -0.22f, -0.79f)
                close()
            }
        }.also { _BowlChopsticks = it}
