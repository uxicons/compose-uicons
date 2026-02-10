package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle: ImageVector? = null

val Icons.Bs.Angle: ImageVector
    get() = _Angle ?: UXIcon(name = "Angle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.85f, 7.4f)
                lineToRelative(1.55f, -2.56f)
                curveToRelative(1.89f, 1.26f, 3.51f, 2.88f, 4.76f, 4.76f)
                lineToRelative(-2.65f, 1.44f)
                curveToRelative(-0.96f, -1.39f, -2.27f, -2.68f, -3.66f, -3.64f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -2.4f, -0.51f, -4.68f, -1.41f, -6.76f)
                lineToRelative(-2.65f, 1.44f)
                curveToRelative(0.68f, 1.64f, 1.06f, 3.44f, 1.06f, 5.32f)
                close()
                moveTo(3.01f, 21.04f)
                lineTo(13.67f, 1.45f)
                lineTo(11.04f, 0.02f)
                lineTo(0.37f, 19.6f)
                curveToRelative(-0.51f, 0.93f, -0.49f, 2.03f, 0.06f, 2.94f)
                curveToRelative(0.54f, 0.91f, 1.5f, 1.46f, 2.56f, 1.46f)
                horizontalLineToRelative(21.02f)
                verticalLineToRelative(-3f)
                lineToRelative(-20.99f, 0.04f)
                close()
            }
        }.also { _Angle = it}
