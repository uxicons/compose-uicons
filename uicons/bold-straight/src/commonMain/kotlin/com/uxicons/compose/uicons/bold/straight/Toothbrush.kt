package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toothbrush: ImageVector? = null

val Icons.Bs.Toothbrush: ImageVector
    get() = _Toothbrush ?: UXIcon(name = "Toothbrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(7.5f, 2f)
                curveTo(3.36f, 2f, 0f, 5.36f, 0f, 9.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8.87f)
                curveToRelative(2.38f, -1.26f, 4f, -3.76f, 4f, -6.63f)
                close()
                moveTo(7.5f, 5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.65f, 0f, 1.28f, -0.13f, 1.85f, -0.35f)
                curveToRelative(-0.51f, 1.93f, -2.27f, 3.35f, -4.35f, 3.35f)
                lineTo(3.26f, 8f)
                curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
                close()
                moveTo(12f, 11f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 11f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.17f, 0f, 0.34f, -0.01f, 0.5f, -0.02f)
                verticalLineToRelative(8.02f)
                close()
            }
        }.also { _Toothbrush = it}
