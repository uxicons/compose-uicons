package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffin: ImageVector? = null

val Icons.Rr.Coffin: ImageVector
    get() = _Coffin ?: UXIcon(name = "Coffin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.63f, 6.73f)
                lineToRelative(-1.44f, -3.59f)
                curveToRelative(-0.76f, -1.91f, -2.59f, -3.14f, -4.64f, -3.14f)
                horizontalLineToRelative(-5.04f)
                curveToRelative(-2.06f, 0f, -3.88f, 1.23f, -4.64f, 3.14f)
                lineToRelative(-1.44f, 3.59f)
                curveToRelative(-0.44f, 1.1f, -0.54f, 2.29f, -0.3f, 3.44f)
                lineToRelative(2.04f, 9.84f)
                curveToRelative(0.48f, 2.31f, 2.54f, 3.99f, 4.9f, 3.99f)
                horizontalLineToRelative(3.94f)
                curveToRelative(2.36f, 0f, 4.42f, -1.68f, 4.9f, -3.99f)
                lineToRelative(2.04f, -9.84f)
                curveToRelative(0.24f, -1.16f, 0.13f, -2.35f, -0.3f, -3.44f)
                close()
                moveTo(18.97f, 9.77f)
                lineToRelative(-2.04f, 9.84f)
                curveToRelative(-0.29f, 1.39f, -1.52f, 2.39f, -2.94f, 2.39f)
                horizontalLineToRelative(-3.94f)
                curveToRelative(-1.42f, 0f, -2.65f, -1.01f, -2.94f, -2.39f)
                lineToRelative(-2.04f, -9.84f)
                curveToRelative(-0.16f, -0.77f, -0.09f, -1.57f, 0.2f, -2.3f)
                lineToRelative(1.44f, -3.59f)
                curveToRelative(0.46f, -1.15f, 1.55f, -1.89f, 2.79f, -1.89f)
                horizontalLineToRelative(5.04f)
                curveToRelative(1.23f, 0f, 2.33f, 0.74f, 2.79f, 1.89f)
                lineToRelative(1.44f, 3.59f)
                curveToRelative(0.29f, 0.73f, 0.36f, 1.53f, 0.2f, 2.3f)
                close()
            }
        }.also { _Coffin = it}
