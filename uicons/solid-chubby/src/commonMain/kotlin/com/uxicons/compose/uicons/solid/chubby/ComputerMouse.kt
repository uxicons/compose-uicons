package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Sc.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.0f, 10f)
                horizontalLineToRelative(-7.32f)
                curveToRelative(0.23f, -2.66f, 0.42f, -3.68f, 0.68f, -5.09f)
                curveToRelative(0.07f, -0.37f, 0.34f, -0.67f, 0.7f, -0.78f)
                curveToRelative(1.5f, -0.44f, 2.94f, -0.85f, 5.44f, -1.06f)
                verticalLineToRelative(-0.56f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.56f)
                curveToRelative(2.51f, 0.22f, 3.94f, 0.62f, 5.44f, 1.06f)
                curveToRelative(0.36f, 0.11f, 0.63f, 0.41f, 0.7f, 0.78f)
                curveToRelative(0.26f, 1.42f, 0.45f, 2.45f, 0.67f, 5.09f)
                horizontalLineToRelative(-7.31f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(20.43f, 12f)
                horizontalLineToRelative(-16.88f)
                curveToRelative(-0.04f, 0.82f, -0.06f, 1.69f, -0.06f, 2.62f)
                curveToRelative(0.01f, 4.62f, 3.83f, 8.38f, 8.5f, 8.38f)
                curveToRelative(4.61f, 0f, 8.5f, -3.82f, 8.5f, -8.34f)
                curveToRelative(0f, -0.94f, -0.03f, -1.82f, -0.07f, -2.66f)
                close()
            }
        }.also { _ComputerMouse = it}
