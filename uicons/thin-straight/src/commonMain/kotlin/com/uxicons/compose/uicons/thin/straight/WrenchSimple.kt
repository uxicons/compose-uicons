package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchSimple: ImageVector? = null

val Icons.Ts.WrenchSimple: ImageVector
    get() = _WrenchSimple ?: UXIcon(name = "WrenchSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 24f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.61f)
                lineToRelative(0.32f, -0.12f)
                curveToRelative(3.69f, -1.38f, 6.18f, -4.96f, 6.18f, -8.89f)
                curveToRelative(0f, -3.69f, -2.18f, -7.06f, -5.5f, -8.6f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(1.78f)
                curveTo(4.68f, 3.32f, 2.5f, 6.69f, 2.5f, 10.38f)
                curveToRelative(0f, 3.93f, 2.48f, 7.5f, 6.18f, 8.89f)
                lineToRelative(0.32f, 0.12f)
                verticalLineToRelative(4.61f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.92f)
                curveToRelative(-3.9f, -1.61f, -6.5f, -5.47f, -6.5f, -9.7f)
                curveTo(1.5f, 6.03f, 4.24f, 2.09f, 8.32f, 0.56f)
                lineToRelative(0.68f, -0.25f)
                verticalLineTo(10f)
                horizontalLineToRelative(6f)
                verticalLineTo(0.31f)
                lineToRelative(0.68f, 0.25f)
                curveToRelative(4.08f, 1.53f, 6.82f, 5.48f, 6.82f, 9.82f)
                curveToRelative(0f, 4.23f, -2.6f, 8.08f, -6.5f, 9.7f)
                verticalLineToRelative(3.92f)
                close()
            }
        }.also { _WrenchSimple = it}
