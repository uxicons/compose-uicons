package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilPrice: ImageVector? = null

val Icons.Ss.OilPrice: ImageVector
    get() = _OilPrice ?: UXIcon(name = "OilPrice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.38f, -0.27f, -0.7f, -0.65f, -0.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-1.34f, -0.22f, -2.31f, -1.37f, -2.31f, -2.73f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.38f, 0.27f, 0.7f, 0.65f, 0.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.34f, 0.22f, 2.31f, 1.37f, 2.31f, 2.73f)
                close()
                moveTo(21f, 22f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5.26f)
                curveToRelative(-0.4f, -0.6f, -0.63f, -1.28f, -0.71f, -2f)
                horizontalLineToRelative(-5.55f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14.03f)
                curveToRelative(-1.23f, 0.91f, -2.03f, 2.36f, -2.03f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.04f, 1.24f, 3.8f, 3f, 4.58f)
                verticalLineToRelative(1.42f)
                horizontalLineToRelative(4f)
                close()
                moveTo(13.77f, 10.73f)
                lineTo(12f, 9.0f)
                lineTo(10.23f, 10.73f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0f, 3.54f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
                curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
                close()
            }
        }.also { _OilPrice = it}
