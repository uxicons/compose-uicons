package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crutch: ImageVector? = null

val Icons.Bs.Crutch: ImageVector
    get() = _Crutch ?: UXIcon(name = "Crutch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 9.33f)
                lineTo(14.66f, 0.03f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(0.92f, 0.92f)
                lineToRelative(-5.45f, 5.45f)
                curveToRelative(-1.94f, 1.94f, -3.01f, 4.53f, -3.01f, 7.28f)
                verticalLineToRelative(1.09f)
                lineTo(0.16f, 21.72f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.84f, -4.84f)
                horizontalLineToRelative(1.09f)
                curveToRelative(2.71f, 0f, 5.36f, -1.1f, 7.27f, -3.01f)
                lineToRelative(5.45f, -5.45f)
                lineToRelative(0.91f, 0.91f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(8f, 16f)
                verticalLineToRelative(-0.21f)
                curveToRelative(0f, -1.44f, 0.41f, -2.81f, 1.18f, -3.98f)
                lineToRelative(3.01f, 3.01f)
                curveToRelative(-1.18f, 0.76f, -2.57f, 1.19f, -3.98f, 1.19f)
                horizontalLineToRelative(-0.21f)
                close()
                moveTo(14.43f, 12.8f)
                lineToRelative(-3.23f, -3.23f)
                lineToRelative(4.38f, -4.38f)
                lineToRelative(3.23f, 3.23f)
                lineToRelative(-4.39f, 4.38f)
                close()
            }
        }.also { _Crutch = it}
