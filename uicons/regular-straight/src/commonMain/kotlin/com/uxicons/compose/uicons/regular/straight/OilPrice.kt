package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilPrice: ImageVector? = null

val Icons.Rs.OilPrice: ImageVector
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
                moveTo(21f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(1.55f)
                curveToRelative(-0.06f, -0.67f, 0f, -1.35f, 0.19f, -2f)
                horizontalLineToRelative(-1.74f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(9.43f)
                curveToRelative(0.35f, -0.8f, 0.91f, -1.48f, 1.6f, -2f)
                horizontalLineToRelative(-14.03f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12f, 7.6f)
                lineTo(14.47f, 10.02f)
                curveToRelative(1.37f, 1.37f, 1.37f, 3.59f, 0.01f, 4.96f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                reflectiveCurveToRelative(-1.81f, -0.36f, -2.48f, -1.02f)
                curveToRelative(-1.36f, -1.36f, -1.36f, -3.58f, 0f, -4.95f)
                close()
                moveTo(13.06f, 11.44f)
                lineTo(12f, 10.4f)
                lineTo(10.93f, 11.45f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.53f, 0.01f, 2.11f)
                curveToRelative(0.57f, 0.57f, 1.55f, 0.57f, 2.12f, 0f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _OilPrice = it}
