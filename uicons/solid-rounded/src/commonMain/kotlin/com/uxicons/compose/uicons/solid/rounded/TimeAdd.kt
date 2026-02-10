package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeAdd: ImageVector? = null

val Icons.Sr.TimeAdd: ImageVector
    get() = _TimeAdd ?: UXIcon(name = "TimeAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.04f, 20.02f)
                curveToRelative(-0.0f, -3.3f, 2.67f, -5.97f, 5.96f, -5.98f)
                curveToRelative(1.28f, -0.0f, 2.53f, 0.41f, 3.56f, 1.18f)
                curveToRelative(1.77f, -6.38f, -1.97f, -13.0f, -8.35f, -14.77f)
                reflectiveCurveToRelative(-13.0f, 1.97f, -14.77f, 8.35f)
                reflectiveCurveToRelative(1.97f, 13.0f, 8.35f, 14.77f)
                curveToRelative(2.1f, 0.58f, 4.32f, 0.58f, 6.42f, 0f)
                curveToRelative(-0.76f, -1.03f, -1.17f, -2.27f, -1.17f, -3.55f)
                close()
                moveTo(13f, 12.02f)
                curveToRelative(0f, 0.27f, -0.11f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-3.0f, 3.01f)
                curveToRelative(-0.4f, 0.38f, -1.03f, 0.37f, -1.42f, -0.03f)
                curveToRelative(-0.38f, -0.39f, -0.38f, -1.0f, 0f, -1.39f)
                lineToRelative(2.71f, -2.71f)
                verticalLineToRelative(-4.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.55f, 0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }.also { _TimeAdd = it}
