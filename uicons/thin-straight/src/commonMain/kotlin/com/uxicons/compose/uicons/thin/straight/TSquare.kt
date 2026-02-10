package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TSquare: ImageVector? = null

val Icons.Ts.TSquare: ImageVector
    get() = _TSquare ?: UXIcon(name = "TSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.9f)
                curveToRelative(-2.81f, -0.79f, -5.22f, -2.1f, -6.45f, -3.64f)
                curveToRelative(-0.66f, -0.8f, -1.63f, -1.26f, -2.68f, -1.26f)
                horizontalLineToRelative(-5.75f)
                curveToRelative(-1.05f, 0f, -2.02f, 0.46f, -2.68f, 1.26f)
                curveToRelative(-1.22f, 1.54f, -3.63f, 2.85f, -6.45f, 3.64f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(7f)
                close()
                moveTo(1f, 7f)
                verticalLineToRelative(-1.36f)
                curveToRelative(2.68f, -0.86f, 4.69f, -2.03f, 6f, -3.5f)
                verticalLineToRelative(4.86f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-21.72f)
                curveToRelative(0.34f, -0.17f, 0.73f, -0.28f, 1.13f, -0.28f)
                horizontalLineToRelative(5.75f)
                curveToRelative(0.4f, 0f, 0.78f, 0.1f, 1.13f, 0.28f)
                verticalLineToRelative(5.72f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                close()
                moveTo(23f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4.86f)
                curveToRelative(1.31f, 1.47f, 3.32f, 2.65f, 6f, 3.5f)
                verticalLineToRelative(1.36f)
                close()
            }
        }.also { _TSquare = it}
