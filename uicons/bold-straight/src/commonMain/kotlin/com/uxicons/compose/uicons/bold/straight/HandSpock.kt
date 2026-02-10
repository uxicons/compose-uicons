package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandSpock: ImageVector? = null

val Icons.Bs.HandSpock: ImageVector
    get() = _HandSpock ?: UXIcon(name = "HandSpock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 3.78f)
                lineToRelative(-1.97f, 10.36f)
                verticalLineToRelative(9.86f)
                horizontalLineToRelative(-13.08f)
                lineTo(0.75f, 16.61f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(2.64f, 2.49f)
                verticalLineToRelative(-1.81f)
                lineTo(3.85f, 3.81f)
                curveToRelative(-0.19f, -0.89f, 0.46f, -1.76f, 1.42f, -1.81f)
                curveToRelative(0.75f, -0.03f, 1.39f, 0.54f, 1.54f, 1.27f)
                curveToRelative(0f, 0f, 2.19f, 10.62f, 2.2f, 10.73f)
                verticalLineToRelative(6.01f)
                lineToRelative(1.08f, 0.99f)
                horizontalLineToRelative(8.92f)
                verticalLineToRelative(-7f)
                curveToRelative(0.01f, -0.09f, 2.03f, -10.78f, 2.03f, -10.78f)
                curveToRelative(0.15f, -0.81f, 0.94f, -1.35f, 1.75f, -1.19f)
                curveToRelative(0.81f, 0.15f, 1.35f, 0.94f, 1.19f, 1.75f)
                close()
                moveTo(19.29f, 1.78f)
                curveToRelative(0.15f, -0.81f, -0.38f, -1.6f, -1.2f, -1.75f)
                curveToRelative(-0.81f, -0.16f, -1.6f, 0.38f, -1.75f, 1.2f)
                lineToRelative(-1.86f, 9.78f)
                horizontalLineToRelative(3.07f)
                lineToRelative(1.74f, -9.22f)
                close()
                moveTo(10.45f, 11f)
                horizontalLineToRelative(3.04f)
                lineTo(11.47f, 1.19f)
                curveToRelative(-0.17f, -0.81f, -0.96f, -1.33f, -1.77f, -1.16f)
                curveToRelative(-0.81f, 0.17f, -1.33f, 0.96f, -1.16f, 1.77f)
                lineToRelative(1.92f, 9.19f)
                close()
            }
        }.also { _HandSpock = it}
