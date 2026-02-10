package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchSimple: ImageVector? = null

val Icons.Bs.WrenchSimple: ImageVector
    get() = _WrenchSimple ?: UXIcon(name = "WrenchSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 24f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.99f)
                lineToRelative(1.1f, -0.3f)
                curveToRelative(3.47f, -0.94f, 5.89f, -4.12f, 5.89f, -7.71f)
                curveToRelative(0f, -2.9f, -1.57f, -5.52f, -4f, -6.92f)
                verticalLineToRelative(6.92f)
                horizontalLineTo(8f)
                verticalLineTo(4.08f)
                curveToRelative(-2.43f, 1.4f, -4f, 4.02f, -4f, 6.92f)
                curveToRelative(0f, 3.59f, 2.42f, 6.76f, 5.89f, 7.71f)
                lineToRelative(1.1f, 0.3f)
                verticalLineToRelative(4.99f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.76f)
                curveTo(3.83f, 19.61f, 1f, 15.55f, 1f, 11f)
                curveTo(1f, 6.06f, 4.33f, 1.7f, 9.11f, 0.4f)
                lineTo(11f, -0.12f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(-0.12f)
                lineToRelative(1.9f, 0.52f)
                curveToRelative(4.77f, 1.3f, 8.11f, 5.66f, 8.11f, 10.6f)
                curveToRelative(0f, 4.55f, -2.83f, 8.61f, -7f, 10.24f)
                verticalLineToRelative(2.76f)
                close()
            }
        }.also { _WrenchSimple = it}
