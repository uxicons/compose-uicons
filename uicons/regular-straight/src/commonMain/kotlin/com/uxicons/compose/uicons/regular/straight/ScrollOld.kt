package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrollOld: ImageVector? = null

val Icons.Rs.ScrollOld: ImageVector
    get() = _ScrollOld ?: UXIcon(name = "ScrollOld") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 17f)
                lineTo(20f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(10f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.54f, -0.12f, -1.04f, -0.34f, -1.5f)
                horizontalLineToRelative(9.34f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(22f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-8.84f)
                curveToRelative(0.22f, -0.46f, 0.34f, -0.96f, 0.34f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _ScrollOld = it}
