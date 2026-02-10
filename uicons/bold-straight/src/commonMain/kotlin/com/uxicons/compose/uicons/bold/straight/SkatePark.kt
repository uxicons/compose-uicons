package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkatePark: ImageVector? = null

val Icons.Bs.SkatePark: ImageVector
    get() = _SkatePark ?: UXIcon(name = "SkatePark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.07f)
                curveToRelative(-7.88f, -5.32f, -8.07f, -15.85f, -8.07f, -15.99f)
                verticalLineToRelative(-2.01f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                curveToRelative(0.01f, 0.64f, 0.34f, 16f, 16f, 16f)
                close()
                moveTo(21.25f, 14f)
                curveToRelative(-0.14f, 0f, -0.28f, -0.06f, -0.38f, -0.16f)
                lineToRelative(-6.72f, -6.72f)
                curveToRelative(-0.1f, -0.1f, -0.16f, -0.24f, -0.16f, -0.38f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.75f)
                curveToRelative(0f, 0.87f, 0.32f, 1.68f, 0.89f, 2.33f)
                curveToRelative(-0.5f, -0.14f, -1.06f, -0.03f, -1.45f, 0.36f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                curveToRelative(0.39f, -0.39f, 0.49f, -0.92f, 0.37f, -1.42f)
                lineToRelative(4.92f, 4.92f)
                curveToRelative(-0.49f, -0.12f, -1.03f, -0.01f, -1.42f, 0.37f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                curveToRelative(0.4f, -0.4f, 0.5f, -0.95f, 0.36f, -1.45f)
                curveToRelative(0.65f, 0.57f, 1.46f, 0.89f, 2.33f, 0.89f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.75f)
                close()
            }
        }.also { _SkatePark = it}
