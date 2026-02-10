package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBag: ImageVector? = null

val Icons.Ss.MakeupBag: ImageVector
    get() = _MakeupBag ?: UXIcon(name = "MakeupBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.01f, 18.49f)
                curveToRelative(0f, 3.04f, -2.47f, 5.51f, -5.51f, 5.51f)
                horizontalLineToRelative(-12.99f)
                curveToRelative(-3.04f, 0f, -5.51f, -2.47f, -5.51f, -5.51f)
                curveToRelative(0f, -0.59f, 0.1f, -1.18f, 0.28f, -1.74f)
                lineToRelative(2.52f, -6.75f)
                horizontalLineToRelative(2.19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.38f)
                lineToRelative(-0.24f, -3f)
                horizontalLineToRelative(3.7f)
                lineToRelative(-0.23f, 3f)
                horizontalLineToRelative(1.9f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.34f, 2.34f)
                lineToRelative(2.21f, 5.88f)
                curveToRelative(0.2f, 0.6f, 0.29f, 1.18f, 0.29f, 1.78f)
                close()
                moveTo(10f, 1.05f)
                curveToRelative(0f, -0.37f, -0.19f, -0.7f, -0.5f, -0.89f)
                curveToRelative(-0.31f, -0.19f, -0.69f, -0.21f, -1.02f, -0.05f)
                lineToRelative(-1.64f, 0.82f)
                curveToRelative(-0.52f, 0.26f, -0.84f, 0.78f, -0.84f, 1.36f)
                verticalLineToRelative(2.71f)
                horizontalLineToRelative(4f)
                close()
                moveTo(18.0f, 5f)
                lineTo(19f, 1.52f)
                curveToRelative(-0.62f, -0.78f, -1.51f, -1.52f, -3f, -1.52f)
                reflectiveCurveToRelative(-2.38f, 0.75f, -3f, 1.53f)
                lineToRelative(0.99f, 3.47f)
                close()
            }
        }.also { _MakeupBag = it}
