package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltSlash: ImageVector? = null

val Icons.Bs.BoltSlash: ImageVector
    get() = _BoltSlash ?: UXIcon(name = "BoltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.8f, 15.67f)
                lineToRelative(2.22f, -3.07f)
                curveToRelative(0.6f, -0.91f, 0.66f, -2.07f, 0.14f, -3.04f)
                curveToRelative(-0.52f, -0.96f, -1.52f, -1.56f, -2.61f, -1.56f)
                horizontalLineToRelative(-3.16f)
                lineTo(16.41f, 0f)
                horizontalLineToRelative(-4.19f)
                lineToRelative(-4.24f, 5.86f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-6.17f, -6.17f)
                close()
                moveTo(17.47f, 11f)
                lineToRelative(-1.82f, 2.52f)
                lineToRelative(-2.52f, -2.52f)
                horizontalLineToRelative(4.35f)
                close()
                moveTo(14.83f, 19.78f)
                lineToRelative(-3.05f, 4.22f)
                horizontalLineToRelative(-4.19f)
                lineToRelative(2.02f, -8f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(-1.1f, 0f, -2.11f, -0.6f, -2.63f, -1.58f)
                curveToRelative(-0.52f, -0.96f, -0.46f, -2.12f, 0.14f, -3.02f)
                lineToRelative(1.04f, -1.44f)
                lineToRelative(9.81f, 9.81f)
                close()
            }
        }.also { _BoltSlash = it}
