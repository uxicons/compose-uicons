package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtLongSleeve: ImageVector? = null

val Icons.Ss.ShirtLongSleeve: ImageVector
    get() = _ShirtLongSleeve ?: UXIcon(name = "ShirtLongSleeve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(20.82f, 1.2f)
                curveToRelative(-1.23f, -0.66f, -2.51f, -1.03f, -3.82f, -1.14f)
                curveToRelative(-0.03f, 2.73f, -2.25f, 4.95f, -5.0f, 4.95f)
                reflectiveCurveTo(7.03f, 2.78f, 7.0f, 0.05f)
                curveToRelative(-1.31f, 0.11f, -2.59f, 0.49f, -3.82f, 1.14f)
                curveTo(1.22f, 2.25f, 0f, 4.33f, 0f, 6.64f)
                verticalLineToRelative(14.39f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-13.02f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(14f)
                lineTo(19f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(3f)
                lineTo(24f, 6.64f)
                curveToRelative(0f, -2.3f, -1.22f, -4.39f, -3.19f, -5.44f)
                close()
            }
        }.also { _ShirtLongSleeve = it}
