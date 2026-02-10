package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareBolt: ImageVector? = null

val Icons.Bs.SquareBolt: ImageVector
    get() = _SquareBolt ?: UXIcon(name = "SquareBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.75f, 11.61f)
                curveToRelative(0.35f, 0.65f, 0.33f, 1.44f, -0.04f, 2.07f)
                lineToRelative(-2.87f, 5.51f)
                lineToRelative(-2.66f, -1.39f)
                lineToRelative(2.24f, -4.31f)
                horizontalLineToRelative(-2.3f)
                curveToRelative(-0.67f, 0f, -1.3f, -0.32f, -1.7f, -0.85f)
                curveToRelative(-0.4f, -0.54f, -0.52f, -1.23f, -0.33f, -1.87f)
                lineToRelative(3.08f, -5.97f)
                lineToRelative(2.66f, 1.39f)
                lineToRelative(-2.24f, 4.31f)
                horizontalLineToRelative(2.31f)
                curveToRelative(0.78f, 0f, 1.49f, 0.42f, 1.85f, 1.11f)
                close()
                moveTo(24f, 3.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 21f)
                lineTo(21f, 21f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _SquareBolt = it}
