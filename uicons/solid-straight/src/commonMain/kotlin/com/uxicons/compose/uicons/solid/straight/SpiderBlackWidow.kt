package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpiderBlackWidow: ImageVector? = null

val Icons.Ss.SpiderBlackWidow: ImageVector
    get() = _SpiderBlackWidow ?: UXIcon(name = "SpiderBlackWidow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.42f)
                lineToRelative(-7.98f, -3.5f)
                lineToRelative(5.98f, -2.79f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.86f)
                lineToRelative(-5.32f, 2.48f)
                curveToRelative(0.2f, -0.41f, 0.32f, -0.86f, 0.32f, -1.34f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.48f, 0.12f, 0.94f, 0.32f, 1.34f)
                lineToRelative(-5.32f, -2.48f)
                lineTo(4f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.14f)
                lineToRelative(5.98f, 2.79f)
                lineTo(0f, 12.42f)
                verticalLineToRelative(2.23f)
                lineToRelative(5.16f, -2.37f)
                lineTo(0f, 19.17f)
                verticalLineToRelative(4.83f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.17f)
                lineToRelative(4.31f, -5.75f)
                curveToRelative(-0.2f, 0.6f, -0.31f, 1.25f, -0.31f, 1.92f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.67f, -0.11f, -1.31f, -0.31f, -1.92f)
                lineToRelative(4.31f, 5.75f)
                verticalLineToRelative(4.17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.83f)
                lineToRelative(-5.16f, -6.88f)
                lineToRelative(5.16f, 2.37f)
                verticalLineToRelative(-2.23f)
                close()
                moveTo(15f, 19f)
                horizontalLineToRelative(-6f)
                lineToRelative(2.4f, -3f)
                lineToRelative(-2.4f, -3f)
                horizontalLineToRelative(6f)
                lineToRelative(-2.4f, 3f)
                lineToRelative(2.4f, 3f)
                close()
            }
        }.also { _SpiderBlackWidow = it}
