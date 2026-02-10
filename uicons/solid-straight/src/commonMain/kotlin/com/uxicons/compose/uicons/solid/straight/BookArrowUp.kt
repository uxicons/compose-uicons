package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowUp: ImageVector? = null

val Icons.Ss.BookArrowUp: ImageVector
    get() = _BookArrowUp ?: UXIcon(name = "BookArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18.0f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                verticalLineTo(3.0f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7.01f)
                lineToRelative(-2.29f, 2.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.78f, -0.78f, 2.04f, -0.78f, 2.81f, 0f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(5f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(4f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineTo(22f)
                verticalLineToRelative(-4f)
                horizontalLineTo(4f)
                close()
            }
        }.also { _BookArrowUp = it}
