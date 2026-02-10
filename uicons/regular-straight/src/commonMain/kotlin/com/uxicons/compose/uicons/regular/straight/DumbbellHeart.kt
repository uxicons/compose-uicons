package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellHeart: ImageVector? = null

val Icons.Rs.DumbbellHeart: ImageVector
    get() = _DumbbellHeart ?: UXIcon(name = "DumbbellHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.52f, 12.63f)
                lineToRelative(0.56f, 0.38f)
                curveToRelative(1.13f, -0.85f, 6.75f, -4.33f, 7f, -8.71f)
                curveToRelative(0f, -2.37f, -1.79f, -4.3f, -4f, -4.3f)
                curveToRelative(-1.19f, 0f, -2.27f, 0.56f, -3f, 1.46f)
                curveToRelative(-0.73f, -0.89f, -1.81f, -1.46f, -3f, -1.46f)
                curveToRelative(-2.21f, 0f, -4f, 1.93f, -4f, 4.3f)
                curveToRelative(0f, 3.88f, 5.78f, 7.88f, 6.44f, 8.33f)
                close()
                moveTo(9.08f, 2f)
                curveToRelative(1.1f, 0f, 2f, 1.03f, 2f, 2.3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.27f, 0.9f, -2.3f, 2f, -2.3f)
                reflectiveCurveToRelative(2f, 1.03f, 2f, 2.3f)
                curveToRelative(0f, 1.95f, -2.86f, 4.71f, -5.0f, 6.28f)
                curveToRelative(-1.73f, -1.29f, -5.0f, -4.15f, -5.0f, -6.28f)
                curveToRelative(0f, -1.27f, 0.9f, -2.3f, 2f, -2.3f)
                close()
                moveTo(24f, 19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                lineTo(6f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-5f)
                close()
                moveTo(1f, 14f)
                lineTo(3f, 14f)
                verticalLineToRelative(8f)
                lineTo(1f, 22f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19f)
                verticalLineToRelative(-2f)
                lineTo(1f, 17f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _DumbbellHeart = it}
