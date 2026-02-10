package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Bs.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.11f, 3f)
                lineTo(2.12f, 0.01f)
                lineTo(-0.01f, 2.13f)
                lineTo(21.87f, 24.01f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.99f, -2.99f)
                verticalLineToRelative(-2.9f)
                lineToRelative(3f, 3f)
                lineTo(24f, 5.02f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(-1.52f)
                close()
                moveTo(8.11f, 6f)
                horizontalLineToRelative(9.39f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(18f, 15.89f)
                lineTo(8.11f, 6f)
                close()
                moveTo(13.04f, 18f)
                lineToRelative(3f, 3f)
                lineTo(0f, 21f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -0.45f, 0.09f, -0.88f, 0.25f, -1.28f)
                lineToRelative(2.75f, 2.75f)
                verticalLineToRelative(10.03f)
                lineTo(13.03f, 18f)
                close()
            }
        }.also { _VideoSlash = it}
