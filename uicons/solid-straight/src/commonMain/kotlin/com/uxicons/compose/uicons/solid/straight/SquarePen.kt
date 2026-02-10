package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Ss.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.36f, 11.53f)
                lineToRelative(-5.47f, 5.47f)
                horizontalLineToRelative(-1.89f)
                verticalLineToRelative(-1.89f)
                lineToRelative(5.47f, -5.47f)
                lineToRelative(1.89f, 1.89f)
                close()
                moveTo(15.23f, 6.89f)
                lineTo(13.89f, 8.23f)
                lineTo(15.77f, 10.11f)
                lineTo(17.11f, 8.78f)
                curveToRelative(0.51f, -0.46f, 0.51f, -1.42f, 0.02f, -1.87f)
                curveToRelative(-0.53f, -0.53f, -1.4f, -0.52f, -1.9f, -0.02f)
                close()
                moveTo(24.0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19.5f, 7.83f)
                curveToRelative(0f, -0.91f, -0.36f, -1.77f, -0.97f, -2.35f)
                curveToRelative(-1.26f, -1.26f, -3.46f, -1.26f, -4.71f, 0f)
                lineToRelative(-8.81f, 8.81f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(4.71f)
                lineToRelative(8.8f, -8.8f)
                curveToRelative(0.63f, -0.6f, 0.99f, -1.47f, 0.99f, -2.37f)
                close()
            }
        }.also { _SquarePen = it}
