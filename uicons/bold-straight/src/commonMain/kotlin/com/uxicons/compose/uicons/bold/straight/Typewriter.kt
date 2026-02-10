package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Typewriter: ImageVector? = null

val Icons.Bs.Typewriter: ImageVector
    get() = _Typewriter ?: UXIcon(name = "Typewriter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(-3f)
                lineTo(2f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                lineTo(4f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(10f)
                lineTo(17f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(7.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(19f, 9f)
                horizontalLineToRelative(-2.31f)
                curveToRelative(0.19f, 0.38f, 0.31f, 0.8f, 0.31f, 1.25f)
                curveToRelative(0f, 1.52f, -1.23f, 2.75f, -2.75f, 2.75f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.52f, 0f, -2.75f, -1.23f, -2.75f, -2.75f)
                curveToRelative(0f, -0.45f, 0.12f, -0.87f, 0.31f, -1.25f)
                horizontalLineToRelative(-2.31f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                lineTo(19.0f, 9f)
                close()
            }
        }.also { _Typewriter = it}
