package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Bs.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.36f, 24f)
                lineToRelative(-2.57f, -11.89f)
                curveToRelative(1.4f, -1.31f, 2.21f, -3.16f, 2.21f, -5.11f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(5f, 3.14f, 5f, 7f)
                curveToRelative(0f, 1.95f, 0.81f, 3.79f, 2.21f, 5.11f)
                lineToRelative(-2.57f, 11.89f)
                horizontalLineToRelative(14.72f)
                close()
                moveTo(12f, 3f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0.05f, 1.71f, -1.14f, 3.05f, -2.56f, 3.86f)
                lineToRelative(2.19f, 10.14f)
                horizontalLineToRelative(-7.28f)
                lineToRelative(2.19f, -10.14f)
                curveToRelative(-1.41f, -0.81f, -2.6f, -2.15f, -2.56f, -3.86f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _KeyHole = it}
