package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mandolin: ImageVector? = null

val Icons.Sr.Mandolin: ImageVector
    get() = _Mandolin ?: UXIcon(name = "Mandolin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.5f, 0f, 1.5f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12f, 15.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.6f, 0f, 1.17f, 0.15f, 1.66f, 0.42f)
                lineToRelative(5.42f, -5.42f)
                horizontalLineToRelative(-7.09f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                curveToRelative(0f, 2.27f, 0.88f, 4.41f, 2.49f, 6.01f)
                curveToRelative(1.61f, 1.6f, 3.74f, 2.49f, 6.01f, 2.49f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                verticalLineToRelative(-7.09f)
                lineToRelative(-5.42f, 5.42f)
                curveToRelative(0.27f, 0.49f, 0.42f, 1.06f, 0.42f, 1.66f)
                close()
                moveTo(23.54f, 1.77f)
                lineToRelative(-1.31f, -1.31f)
                curveToRelative(-0.54f, -0.54f, -1.39f, -0.61f, -2.01f, -0.17f)
                lineToRelative(-1.21f, 0.93f)
                curveToRelative(-0.64f, 0.5f, -1.06f, 1.24f, -1.15f, 2.04f)
                lineToRelative(-0.18f, 1.64f)
                lineToRelative(-2.09f, 2.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.09f, -2.09f)
                lineToRelative(1.64f, -0.18f)
                curveToRelative(0.81f, -0.09f, 1.55f, -0.5f, 2.04f, -1.15f)
                lineToRelative(0.93f, -1.21f)
                curveToRelative(0.44f, -0.62f, 0.37f, -1.47f, -0.17f, -2.01f)
                close()
            }
        }.also { _Mandolin = it}
