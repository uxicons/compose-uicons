package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Rs.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.35f, 21f)
                lineToRelative(8.72f, -8.75f)
                curveToRelative(1.21f, -1.21f, 1.21f, -3.18f, 0f, -4.39f)
                lineToRelative(-5.93f, -5.96f)
                curveToRelative(-1.17f, -1.18f, -3.21f, -1.18f, -4.38f, 0f)
                lineTo(0.88f, 13.82f)
                curveToRelative(-1.21f, 1.21f, -1.21f, 3.18f, 0f, 4.39f)
                lineToRelative(4.77f, 4.79f)
                horizontalLineToRelative(18.34f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-9.65f)
                close()
                moveTo(14.17f, 3.32f)
                curveToRelative(0.42f, -0.42f, 1.14f, -0.42f, 1.55f, 0f)
                lineToRelative(5.93f, 5.96f)
                curveToRelative(0.43f, 0.43f, 0.43f, 1.13f, 0f, 1.56f)
                lineToRelative(-5.5f, 5.52f)
                lineToRelative(-7.49f, -7.51f)
                lineToRelative(5.51f, -5.53f)
                close()
                moveTo(6.49f, 21f)
                lineToRelative(-4.19f, -4.2f)
                curveToRelative(-0.43f, -0.43f, -0.43f, -1.13f, 0f, -1.56f)
                lineToRelative(4.95f, -4.97f)
                lineToRelative(7.49f, 7.51f)
                lineToRelative(-3.21f, 3.22f)
                horizontalLineToRelative(-5.04f)
                close()
            }
        }.also { _Eraser = it}
