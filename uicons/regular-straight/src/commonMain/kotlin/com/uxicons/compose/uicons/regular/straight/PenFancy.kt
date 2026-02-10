package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Rs.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-10.51f, 10.54f)
                lineToRelative(-5.71f, 1.37f)
                lineTo(0.03f, 24.0f)
                lineToRelative(11.2f, -2.63f)
                lineToRelative(1.4f, -5.73f)
                lineToRelative(10.49f, -10.51f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
                moveTo(4.56f, 20.88f)
                lineToRelative(3.28f, -3.28f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.28f, 3.28f)
                lineToRelative(1.18f, -5.02f)
                lineToRelative(3.61f, -0.87f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(-0.88f, 3.6f)
                lineToRelative(-5.02f, 1.18f)
                close()
                moveTo(21.71f, 3.71f)
                lineToRelative(-10.39f, 10.42f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(20.29f, 2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
            }
        }.also { _PenFancy = it}
