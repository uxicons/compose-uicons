package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenNail: ImageVector? = null

val Icons.Bs.BrokenNail: ImageVector
    get() = _BrokenNail ?: UXIcon(name = "BrokenNail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(14f)
                lineToRelative(-7f, -12f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11.21f, 17.95f)
                lineToRelative(4.64f, -7.95f)
                horizontalLineToRelative(2.3f)
                lineToRelative(1.83f, 3.14f)
                curveToRelative(-0.11f, -3.04f, -1.56f, -5.8f, -3.98f, -7.62f)
                curveToRelative(-0.01f, -0.23f, 0.03f, -1.11f, -0.03f, -1.32f)
                curveToRelative(-0.16f, -2.34f, -2.09f, -4.2f, -4.47f, -4.2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(1.02f)
                curveTo(1.49f, 7.41f, 0f, 10.32f, 0f, 13.5f)
                verticalLineToRelative(10.5f)
                lineTo(3f, 24f)
                lineTo(3f, 13.5f)
                curveToRelative(0f, -1.3f, 0.36f, -2.53f, 1f, -3.6f)
                verticalLineToRelative(2.6f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                curveToRelative(0.46f, -0.0f, 1.27f, 0.02f, 1.72f, -0.05f)
                close()
                moveTo(7.4f, 13.84f)
                curveToRelative(-0.25f, -0.39f, -0.4f, -0.85f, -0.4f, -1.34f)
                lineTo(7f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(13f, 12.5f)
                curveToRelative(0f, 0.49f, -0.15f, 0.95f, -0.4f, 1.34f)
                curveToRelative(-0.73f, -0.53f, -1.63f, -0.84f, -2.6f, -0.84f)
                reflectiveCurveToRelative(-1.87f, 0.31f, -2.6f, 0.84f)
                close()
            }
        }.also { _BrokenNail = it}
