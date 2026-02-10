package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandScissors: ImageVector? = null

val Icons.Ss.HandScissors: ImageVector
    get() = _HandScissors ?: UXIcon(name = "HandScissors") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.95f, 2.95f)
                curveToRelative(-0.44f, -0.46f, -1.01f, -0.77f, -1.64f, -0.9f)
                curveToRelative(-0.98f, -0.18f, -1.98f, 0.12f, -2.68f, 0.83f)
                lineToRelative(-2.44f, 2.48f)
                lineToRelative(4.78f, 1.1f)
                lineToRelative(-0.44f, 1.91f)
                lineTo(1.88f, 5.05f)
                curveToRelative(-0.89f, -0.21f, -1.78f, 0.34f, -1.99f, 1.23f)
                curveToRelative(-0.21f, 0.89f, 0.34f, 1.78f, 1.23f, 1.99f)
                lineToRelative(9.18f, 2.24f)
                lineTo(1.12f, 12.74f)
                curveToRelative(-0.89f, 0.21f, -1.44f, 1.1f, -1.23f, 1.99f)
                curveToRelative(0.21f, 0.89f, 1.1f, 1.44f, 1.99f, 1.23f)
                lineToRelative(7.39f, -1.78f)
                lineToRelative(1.73f, 7.83f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-14f)
                lineToRelative(-5.04f, -5.05f)
                close()
            }
        }.also { _HandScissors = it}
