package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtLongSleeve: ImageVector? = null

val Icons.Rs.ShirtLongSleeve: ImageVector
    get() = _ShirtLongSleeve ?: UXIcon(name = "ShirtLongSleeve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.64f)
                curveToRelative(0f, -2.3f, -1.22f, -4.39f, -3.19f, -5.44f)
                curveToRelative(-1.48f, -0.79f, -3.03f, -1.2f, -4.62f, -1.2f)
                lineTo(7.81f, 0.0f)
                curveToRelative(-1.59f, 0f, -3.15f, 0.4f, -4.62f, 1.2f)
                curveTo(1.22f, 2.25f, 0f, 4.33f, 0f, 6.64f)
                verticalLineToRelative(14.36f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3.02f)
                horizontalLineToRelative(4f)
                lineTo(24f, 6.64f)
                close()
                moveTo(14.9f, 2f)
                curveToRelative(-0.46f, 1.2f, -1.59f, 2f, -2.9f, 2f)
                reflectiveCurveToRelative(-2.45f, -0.8f, -2.9f, -2f)
                horizontalLineToRelative(5.8f)
                close()
                moveTo(22f, 18.98f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(15f)
                lineTo(6f, 22f)
                lineTo(6f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                lineTo(2f, 6.64f)
                curveToRelative(0f, -1.56f, 0.82f, -2.97f, 2.13f, -3.68f)
                curveToRelative(0.94f, -0.5f, 1.91f, -0.81f, 2.9f, -0.92f)
                lineToRelative(-0.01f, 0.0f)
                curveToRelative(0.54f, 2.33f, 2.59f, 3.96f, 4.97f, 3.96f)
                reflectiveCurveToRelative(4.43f, -1.63f, 4.97f, -3.96f)
                lineToRelative(-0.01f, -0.0f)
                curveToRelative(0.99f, 0.1f, 1.97f, 0.41f, 2.91f, 0.92f)
                curveToRelative(1.31f, 0.71f, 2.13f, 2.12f, 2.13f, 3.68f)
                verticalLineToRelative(12.34f)
                close()
            }
        }.also { _ShirtLongSleeve = it}
