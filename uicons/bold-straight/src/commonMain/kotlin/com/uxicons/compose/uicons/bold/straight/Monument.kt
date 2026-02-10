package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Bs.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(24f, 21f)
                close()
                moveTo(22f, 19f)
                lineTo(2f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.9f)
                lineToRelative(1.24f, -10.53f)
                curveToRelative(0.09f, -0.78f, 0.45f, -1.51f, 1.0f, -2.07f)
                lineToRelative(2.38f, -2.38f)
                curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
                lineToRelative(2.38f, 2.38f)
                curveToRelative(0.56f, 0.55f, 0.91f, 1.29f, 1.0f, 2.07f)
                lineToRelative(1.24f, 10.53f)
                horizontalLineToRelative(2.9f)
                verticalLineToRelative(3f)
                close()
                moveTo(13.5f, 6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2.57f)
                lineToRelative(-1.18f, -10f)
                horizontalLineToRelative(-1.4f)
                close()
                moveTo(7.93f, 16f)
                horizontalLineToRelative(2.57f)
                lineTo(10.5f, 6f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-1.18f, 10f)
                close()
            }
        }.also { _Monument = it}
