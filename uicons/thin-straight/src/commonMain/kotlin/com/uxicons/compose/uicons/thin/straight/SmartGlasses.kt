package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartGlasses: ImageVector? = null

val Icons.Ts.SmartGlasses: ImageVector
    get() = _SmartGlasses ?: UXIcon(name = "SmartGlasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.54f)
                lineToRelative(1.04f, 11.46f)
                horizontalLineToRelative(7.76f)
                lineToRelative(2.38f, -4.5f)
                curveToRelative(0.16f, -0.31f, 0.47f, -0.5f, 0.82f, -0.5f)
                curveToRelative(0.35f, 0f, 0.66f, 0.19f, 0.82f, 0.5f)
                lineToRelative(2.38f, 4.5f)
                horizontalLineToRelative(7.76f)
                lineToRelative(1.04f, -11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 6f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.86f)
                lineToRelative(-0.14f, -1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22.04f, 18f)
                horizontalLineToRelative(-6.24f)
                lineToRelative(-2.1f, -3.96f)
                curveToRelative(-0.34f, -0.63f, -0.99f, -1.03f, -1.71f, -1.03f)
                curveToRelative(-0.72f, 0f, -1.37f, 0.39f, -1.71f, 1.03f)
                lineToRelative(-2.1f, 3.97f)
                horizontalLineToRelative(-6.24f)
                lineToRelative(-0.73f, -8f)
                horizontalLineToRelative(6.77f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.46f)
                lineToRelative(-0.96f, 10.54f)
                close()
            }
        }.also { _SmartGlasses = it}
