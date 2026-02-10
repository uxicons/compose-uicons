package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snap: ImageVector? = null

val Icons.Ss.Snap: ImageVector
    get() = _Snap ?: UXIcon(name = "Snap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.21f, 6.21f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3f, -3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(6.21f, 4.79f)
                lineTo(3.21f, 1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3f, 3f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(10f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(10f, 0f)
                close()
                moveTo(17.93f, 24f)
                lineToRelative(3.65f, -3.5f)
                lineToRelative(-4.8f, -8.43f)
                lineToRelative(5.58f, -5.58f)
                curveToRelative(0.7f, -0.7f, 0.88f, -1.84f, 0.29f, -2.65f)
                curveToRelative(-0.74f, -1.03f, -2.19f, -1.12f, -3.05f, -0.26f)
                lineToRelative(-11.11f, 10.86f)
                lineToRelative(-0.07f, -3.24f)
                curveToRelative(0f, -0.14f, -0.03f, -0.34f, -0.08f, -0.6f)
                curveToRelative(-0.29f, -1.02f, -1.3f, -1.75f, -2.46f, -1.58f)
                curveToRelative(-1.1f, 0.16f, -1.88f, 1.19f, -1.88f, 2.31f)
                lineToRelative(-0.01f, 8.67f)
                lineTo(0f, 24f)
                horizontalLineToRelative(17.93f)
                close()
            }
        }.also { _Snap = it}
