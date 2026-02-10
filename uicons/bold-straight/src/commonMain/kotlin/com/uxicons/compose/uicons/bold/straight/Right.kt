package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Right: ImageVector? = null

val Icons.Bs.Right: ImageVector
    get() = _Right ?: UXIcon(name = "Right") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24.04f)
                verticalLineToRelative(-7.04f)
                horizontalLineTo(0f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(-0.01f)
                lineToRelative(10.03f, 9.68f)
                curveToRelative(0.63f, 0.62f, 0.97f, 1.45f, 0.97f, 2.33f)
                curveToRelative(0f, 0.88f, -0.34f, 1.71f, -0.97f, 2.33f)
                lineToRelative(-10.03f, 9.7f)
                close()
                moveTo(3f, 14f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2.96f)
                lineToRelative(4.93f, -4.77f)
                curveToRelative(0.06f, -0.06f, 0.07f, -0.14f, 0.07f, -0.19f)
                reflectiveCurveToRelative(-0.01f, -0.13f, -0.08f, -0.2f)
                lineToRelative(-4.92f, -4.75f)
                verticalLineToRelative(2.95f)
                horizontalLineTo(3f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Right = it}
