package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrollOld: ImageVector? = null

val Icons.Sr.ScrollOld: ImageVector
    get() = _ScrollOld ?: UXIcon(name = "ScrollOld") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 2.5f)
                verticalLineToRelative(-1f)
                curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14.5f, 17f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(4.66f, 0f)
                curveToRelative(0.22f, 0.46f, 0.34f, 0.96f, 0.34f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(6.36f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(22.0f, 19f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.92f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(9.35f)
                curveToRelative(1.59f, 0f, 2.92f, -1.05f, 3.35f, -2.5f)
                curveToRelative(0.02f, -0.06f, 0.03f, -0.18f, 0.05f, -0.33f)
                curveToRelative(0.11f, -1.17f, -0.82f, -2.17f, -1.99f, -2.17f)
                close()
            }
        }.also { _ScrollOld = it}
