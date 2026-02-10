package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBag: ImageVector? = null

val Icons.Bs.MakeupBag: ImageVector
    get() = _MakeupBag ?: UXIcon(name = "MakeupBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.7f)
                curveToRelative(0f, -0.58f, 0.32f, -1.1f, 0.84f, -1.36f)
                lineToRelative(1.64f, -0.82f)
                curveToRelative(0.33f, -0.16f, 0.71f, -0.15f, 1.02f, 0.05f)
                curveToRelative(0.31f, 0.19f, 0.5f, 0.53f, 0.5f, 0.89f)
                close()
                moveTo(24f, 18.2f)
                curveToRelative(0f, 3.2f, -2.6f, 5.8f, -5.8f, 5.8f)
                horizontalLineToRelative(-12.4f)
                curveToRelative(-3.2f, 0f, -5.8f, -2.6f, -5.8f, -5.8f)
                curveToRelative(0f, -0.62f, 0.1f, -1.24f, 0.3f, -1.83f)
                lineToRelative(2.12f, -6.36f)
                horizontalLineToRelative(2.58f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.38f)
                lineToRelative(-0.24f, -3.0f)
                horizontalLineToRelative(3.7f)
                lineToRelative(-0.23f, 3.0f)
                horizontalLineToRelative(1.27f)
                lineToRelative(2.96f, -2.96f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.99f, 1.99f)
                lineToRelative(1.74f, 5.21f)
                curveToRelative(0.2f, 0.59f, 0.3f, 1.21f, 0.3f, 1.83f)
                close()
                moveTo(21f, 18.2f)
                curveToRelative(0f, -0.3f, -0.05f, -0.6f, -0.14f, -0.89f)
                lineToRelative(-1.44f, -4.31f)
                horizontalLineToRelative(-14.84f)
                lineToRelative(-1.44f, 4.32f)
                curveToRelative(-0.1f, 0.29f, -0.14f, 0.58f, -0.14f, 0.89f)
                curveToRelative(0f, 1.54f, 1.26f, 2.8f, 2.8f, 2.8f)
                horizontalLineToRelative(12.4f)
                curveToRelative(1.54f, 0f, 2.8f, -1.26f, 2.8f, -2.8f)
                close()
                moveTo(18.0f, 5f)
                lineTo(19f, 1.53f)
                curveToRelative(-0.62f, -0.78f, -1.94f, -1.62f, -3f, -1.52f)
                curveToRelative(-1.06f, -0.1f, -2.38f, 0.75f, -3f, 1.53f)
                lineToRelative(0.99f, 3.47f)
                horizontalLineToRelative(4.01f)
                close()
            }
        }.also { _MakeupBag = it}
