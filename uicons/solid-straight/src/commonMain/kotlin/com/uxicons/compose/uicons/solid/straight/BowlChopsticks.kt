package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlChopsticks: ImageVector? = null

val Icons.Ss.BowlChopsticks: ImageVector
    get() = _BowlChopsticks ?: UXIcon(name = "BowlChopsticks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 13.49f)
                curveToRelative(-0.78f, 4.6f, -3.87f, 8.69f, -7.73f, 10.52f)
                lineTo(7.78f, 24.01f)
                curveTo(3.91f, 22.18f, 0.82f, 18.09f, 0.04f, 13.49f)
                curveToRelative(-0.15f, -0.86f, 0.1f, -1.74f, 0.66f, -2.42f)
                curveToRelative(0.57f, -0.68f, 1.42f, -1.07f, 2.3f, -1.07f)
                horizontalLineToRelative(17.98f)
                curveToRelative(0.89f, 0f, 1.73f, 0.39f, 2.3f, 1.07f)
                curveToRelative(0.57f, 0.67f, 0.81f, 1.55f, 0.66f, 2.42f)
                close()
                moveTo(3.0f, 5.01f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-2f)
                lineTo(3.0f, 5.01f)
                close()
                moveTo(23.99f, 2.51f)
                lineToRelative(-0.1f, -2.0f)
                lineTo(2.96f, 1.51f)
                lineToRelative(0.1f, 2.0f)
                lineToRelative(20.94f, -1f)
                close()
            }
        }.also { _BowlChopsticks = it}
