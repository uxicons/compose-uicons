package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileMessage: ImageVector? = null

val Icons.Sr.MobileMessage: ImageVector
    get() = _MobileMessage ?: UXIcon(name = "MobileMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                lineTo(4f, 18f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(0f, 8.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.37f)
                reflectiveCurveToRelative(2.45f, 1.69f, 2.45f, 1.69f)
                curveToRelative(0.69f, 0.46f, 1.67f, -0.04f, 1.67f, -0.92f)
                lineToRelative(0.0f, -6.27f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 6.0f)
                curveTo(1.12f, 6.0f, 0f, 7.12f, 0f, 8.5f)
                close()
                moveTo(17.5f, 0.0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineToRelative(0.0f, 6.27f)
                curveToRelative(-0.0f, 0.88f, 0.98f, 1.37f, 1.67f, 0.92f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(2.37f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24.0f, 2.5f)
                curveTo(24.0f, 1.12f, 22.88f, 0f, 21.5f, 0f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(20f, 10.0f)
                verticalLineToRelative(6.0f)
                lineTo(10.79f, 16.0f)
                curveToRelative(0.13f, -0.34f, 0.21f, -0.84f, 0.21f, -1.22f)
                verticalLineToRelative(-6.28f)
                curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(5.56f)
                curveToRelative(-0.34f, 0.59f, -0.56f, 1.27f, -0.56f, 2.0f)
                lineToRelative(0.0f, 6.73f)
                curveToRelative(0f, 1.42f, 0.94f, 2.71f, 2.32f, 3.04f)
                curveToRelative(0.85f, 0.2f, 1.69f, 0.08f, 2.48f, -0.43f)
                lineToRelative(1.94f, -1.34f)
                horizontalLineToRelative(0.25f)
                close()
            }
        }.also { _MobileMessage = it}
