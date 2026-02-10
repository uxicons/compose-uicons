package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxUp: ImageVector? = null

val Icons.Bs.BoxUp: ImageVector
    get() = _BoxUp ?: UXIcon(name = "BoxUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(9f, 19f)
                verticalLineToRelative(-3f)
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
                moveTo(15.79f, 6.29f)
                lineToRelative(-1.79f, 1.75f)
                lineToRelative(-1.79f, -1.75f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.77f, 2.71f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.98f)
                lineToRelative(-2.77f, -2.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                close()
            }
        }.also { _BoxUp = it}
