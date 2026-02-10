package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpiderBlackWidow: ImageVector? = null

val Icons.Bs.SpiderBlackWidow: ImageVector
    get() = _SpiderBlackWidow ?: UXIcon(name = "SpiderBlackWidow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.54f)
                lineToRelative(-6.38f, -2.8f)
                lineToRelative(4.38f, -2.34f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.6f)
                lineToRelative(-4.11f, 2.19f)
                curveToRelative(0.07f, -0.25f, 0.11f, -0.52f, 0.11f, -0.79f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.27f, 0.04f, 0.54f, 0.11f, 0.79f)
                lineToRelative(-4.11f, -2.19f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.4f)
                lineToRelative(4.38f, 2.34f)
                lineTo(0f, 11.54f)
                verticalLineToRelative(3.46f)
                lineToRelative(5.46f, -2.5f)
                lineTo(0f, 18.95f)
                verticalLineToRelative(5.05f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.95f)
                lineToRelative(2.37f, -2.8f)
                curveToRelative(0.94f, 2.76f, 3.56f, 4.75f, 6.63f, 4.75f)
                reflectiveCurveToRelative(5.69f, -1.99f, 6.63f, -4.75f)
                lineToRelative(2.37f, 2.8f)
                verticalLineToRelative(3.95f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.05f)
                lineToRelative(-5.46f, -6.45f)
                lineToRelative(5.46f, 2.5f)
                verticalLineToRelative(-3.46f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(14f, 13f)
                lineToRelative(-1.6f, 2f)
                lineToRelative(1.6f, 2f)
                horizontalLineToRelative(-4f)
                lineToRelative(1.6f, -2f)
                lineToRelative(-1.6f, -2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _SpiderBlackWidow = it}
