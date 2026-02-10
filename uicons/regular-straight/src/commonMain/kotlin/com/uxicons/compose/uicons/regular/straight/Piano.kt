package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Piano: ImageVector? = null

val Icons.Rs.Piano: ImageVector
    get() = _Piano ?: UXIcon(name = "Piano") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.38f, 9.48f)
                curveToRelative(-1.08f, 0f, -2.03f, -0.77f, -2.27f, -1.82f)
                lineToRelative(-0.23f, -1.04f)
                curveToRelative(-0.86f, -3.9f, -4.25f, -6.62f, -8.24f, -6.62f)
                curveTo(3.88f, 0f, 0f, 3.88f, 0f, 8.65f)
                verticalLineToRelative(15.35f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-9.9f)
                curveToRelative(0f, -2.55f, -2.07f, -4.62f, -4.62f, -4.62f)
                close()
                moveTo(8.65f, 2f)
                curveToRelative(3.0f, 0f, 5.64f, 2.12f, 6.28f, 5.05f)
                lineToRelative(0.23f, 1.04f)
                horizontalLineToRelative(0f)
                curveToRelative(0.44f, 2.0f, 2.18f, 3.39f, 4.22f, 3.39f)
                curveToRelative(1.44f, 0f, 2.62f, 1.17f, 2.62f, 2.62f)
                verticalLineToRelative(0.91f)
                horizontalLineTo(2f)
                verticalLineToRelative(-6.35f)
                curveToRelative(0f, -3.67f, 2.98f, -6.65f, 6.65f, -6.65f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _Piano = it}
