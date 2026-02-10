package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Ts.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.12f, 22f)
                lineToRelative(10.09f, -10.12f)
                curveToRelative(1.05f, -1.06f, 1.05f, -2.77f, 0f, -3.83f)
                lineToRelative(-6.23f, -6.25f)
                curveToRelative(-1.02f, -1.02f, -2.8f, -1.02f, -3.82f, 0f)
                lineTo(0.82f, 14.17f)
                curveToRelative(-1.05f, 1.06f, -1.05f, 2.77f, 0f, 3.83f)
                lineToRelative(4.98f, 5.0f)
                horizontalLineToRelative(18.21f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-10.88f)
                close()
                moveTo(13.86f, 2.5f)
                curveToRelative(0.64f, -0.65f, 1.76f, -0.65f, 2.41f, 0f)
                lineToRelative(6.23f, 6.25f)
                curveToRelative(0.67f, 0.67f, 0.67f, 1.75f, 0f, 2.42f)
                lineToRelative(-6.17f, 6.19f)
                lineTo(7.69f, 8.69f)
                lineToRelative(6.17f, -6.19f)
                close()
                moveTo(6.21f, 22f)
                lineToRelative(-4.68f, -4.7f)
                curveToRelative(-0.67f, -0.67f, -0.67f, -1.75f, 0f, -2.42f)
                lineToRelative(5.46f, -5.48f)
                lineToRelative(8.64f, 8.67f)
                lineToRelative(-3.92f, 3.93f)
                horizontalLineToRelative(-5.5f)
                close()
            }
        }.also { _Eraser = it}
