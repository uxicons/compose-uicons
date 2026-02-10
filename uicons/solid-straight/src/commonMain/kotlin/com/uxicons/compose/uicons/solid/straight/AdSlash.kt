package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdSlash: ImageVector? = null

val Icons.Ss.AdSlash: ImageVector
    get() = _AdSlash ?: UXIcon(name = "AdSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.01f, 3f)
                horizontalLineToRelative(16.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-7.05f, -7f)
                horizontalLineToRelative(0.46f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7.46f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-0.8f, -3.32f)
                reflectiveCurveToRelative(-0.21f, -2.02f, -2.08f, -2.02f)
                curveToRelative(-0.79f, 0f, -1.28f, 0.42f, -1.59f, 0.86f)
                close()
                moveTo(18f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(11.77f, 16.06f)
                lineTo(12f, 17f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-0.46f, -2f)
                horizontalLineToRelative(-2.97f)
                lineToRelative(-0.46f, 2f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(1.69f, -7.03f)
                lineToRelative(-5.34f, -5.34f)
                curveToRelative(-0.21f, 0.41f, -0.35f, 0.87f, -0.35f, 1.37f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(16.72f)
                close()
                moveTo(7.31f, 11.59f)
                lineTo(6.98f, 13f)
                horizontalLineToRelative(1.74f)
                close()
            }
        }.also { _AdSlash = it}
