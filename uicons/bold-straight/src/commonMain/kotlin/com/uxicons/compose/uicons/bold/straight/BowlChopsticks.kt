package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlChopsticks: ImageVector? = null

val Icons.Bs.BowlChopsticks: ImageVector
    get() = _BowlChopsticks ?: UXIcon(name = "BowlChopsticks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.58f, 10f)
                lineTo(3.42f, 10f)
                curveToRelative(-1.01f, 0f, -1.96f, 0.44f, -2.62f, 1.22f)
                curveToRelative(-0.65f, 0.77f, -0.92f, 1.77f, -0.76f, 2.75f)
                curveToRelative(0.73f, 4.33f, 3.53f, 8.02f, 7.49f, 9.89f)
                lineToRelative(0.3f, 0.14f)
                horizontalLineToRelative(8.31f)
                lineToRelative(0.3f, -0.14f)
                curveToRelative(3.96f, -1.87f, 6.76f, -5.57f, 7.49f, -9.89f)
                curveToRelative(0.17f, -0.98f, -0.11f, -1.98f, -0.76f, -2.75f)
                curveToRelative(-0.65f, -0.77f, -1.61f, -1.22f, -2.62f, -1.22f)
                close()
                moveTo(20.99f, 13.46f)
                curveToRelative(-0.55f, 3.25f, -2.6f, 6.04f, -5.52f, 7.54f)
                horizontalLineToRelative(-6.94f)
                curveToRelative(-2.92f, -1.49f, -4.97f, -4.29f, -5.52f, -7.54f)
                curveToRelative(-0.02f, -0.14f, 0.04f, -0.25f, 0.09f, -0.31f)
                curveToRelative(0.05f, -0.06f, 0.15f, -0.15f, 0.32f, -0.15f)
                horizontalLineToRelative(17.16f)
                curveToRelative(0.17f, 0f, 0.28f, 0.1f, 0.32f, 0.15f)
                curveToRelative(0.05f, 0.06f, 0.11f, 0.17f, 0.09f, 0.31f)
                close()
                moveTo(3f, 5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(3f)
                lineTo(3f, 7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(3f)
                lineTo(3f, 3f)
                lineTo(3f, 1f)
                lineTo(24f, 0f)
                close()
            }
        }.also { _BowlChopsticks = it}
