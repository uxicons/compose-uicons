package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Piano: ImageVector? = null

val Icons.Bs.Piano: ImageVector
    get() = _Piano ?: UXIcon(name = "Piano") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.05f, 9.05f)
                curveToRelative(-0.78f, 0f, -1.46f, -0.55f, -1.63f, -1.31f)
                lineToRelative(-0.22f, -0.99f)
                curveToRelative(-0.88f, -3.97f, -4.33f, -6.74f, -8.39f, -6.74f)
                curveTo(3.95f, 0f, 0f, 3.95f, 0f, 8.8f)
                verticalLineToRelative(15.2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.73f, -2.22f, -4.95f, -4.95f, -4.95f)
                close()
                moveTo(8.8f, 3f)
                curveToRelative(2.65f, 0f, 4.89f, 1.8f, 5.46f, 4.39f)
                lineToRelative(0.22f, 0.99f)
                horizontalLineToRelative(0f)
                curveToRelative(0.48f, 2.16f, 2.35f, 3.66f, 4.56f, 3.66f)
                curveToRelative(1.08f, 0f, 1.95f, 0.88f, 1.95f, 1.95f)
                horizontalLineTo(3f)
                verticalLineToRelative(-5.2f)
                curveToRelative(0f, -3.2f, 2.6f, -5.8f, 5.8f, -5.8f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _Piano = it}
