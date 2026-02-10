package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtLongSleeve: ImageVector? = null

val Icons.Sr.ShirtLongSleeve: ImageVector
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
                verticalLineToRelative(11.36f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11.98f)
                horizontalLineToRelative(0f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(24f, 6.64f)
                curveToRelative(0f, -2.3f, -1.22f, -4.39f, -3.19f, -5.44f)
                close()
            }
        }.also { _ShirtLongSleeve = it}
