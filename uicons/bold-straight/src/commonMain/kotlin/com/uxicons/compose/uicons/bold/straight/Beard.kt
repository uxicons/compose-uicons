package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beard: ImageVector? = null

val Icons.Bs.Beard: ImageVector
    get() = _Beard ?: UXIcon(name = "Beard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.01f, 2f)
                lineToRelative(-0.39f, 0.91f)
                curveToRelative(-0.82f, 1.92f, -2.27f, 3.54f, -3.26f, 4.49f)
                curveToRelative(-1.05f, -0.87f, -2.46f, -1.4f, -3.86f, -1.4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.41f, 0f, -2.81f, 0.53f, -3.86f, 1.4f)
                curveToRelative(-0.98f, -0.95f, -2.43f, -2.56f, -3.26f, -4.49f)
                lineToRelative(-0.39f, -0.91f)
                lineTo(0f, 2f)
                verticalLineToRelative(6.83f)
                curveToRelative(-0.09f, 5.24f, 4.91f, 10.56f, 12f, 13.29f)
                curveToRelative(7.09f, -2.73f, 12.09f, -8.05f, 12f, -13.29f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-2.99f)
                close()
                moveTo(21f, 8.83f)
                curveToRelative(0f, 3.69f, -3.51f, 7.59f, -9f, 10.03f)
                curveTo(6.51f, 16.42f, 3f, 12.53f, 3f, 8.83f)
                verticalLineToRelative(-0.95f)
                curveToRelative(1.41f, 1.69f, 2.76f, 2.74f, 2.85f, 2.81f)
                lineToRelative(1.33f, 1.02f)
                lineToRelative(0.86f, -1.44f)
                curveToRelative(0.44f, -0.74f, 1.48f, -1.28f, 2.45f, -1.28f)
                horizontalLineToRelative(3f)
                curveToRelative(0.98f, 0f, 2.01f, 0.54f, 2.45f, 1.28f)
                lineToRelative(0.86f, 1.44f)
                lineToRelative(1.33f, -1.02f)
                curveToRelative(0.09f, -0.07f, 1.44f, -1.12f, 2.85f, -2.81f)
                verticalLineToRelative(0.95f)
                close()
                moveTo(14.77f, 12.77f)
                verticalLineToRelative(0.05f)
                curveToRelative(-0.79f, 0.33f, -2.01f, 0.52f, -2.77f, 0.52f)
                curveToRelative(-0.75f, 0f, -1.99f, -0.19f, -2.77f, -0.51f)
                curveToRelative(-0.03f, -0.99f, 0.77f, -1.83f, 1.77f, -1.82f)
                horizontalLineToRelative(2f)
                curveToRelative(0.97f, 0f, 1.76f, 0.79f, 1.76f, 1.76f)
                close()
            }
        }.also { _Beard = it}
