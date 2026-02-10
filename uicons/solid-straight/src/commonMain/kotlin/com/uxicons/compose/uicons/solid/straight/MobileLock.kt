package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileLock: ImageVector? = null

val Icons.Ss.MobileLock: ImageVector
    get() = _MobileLock ?: UXIcon(name = "MobileLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(16f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(19f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(12f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(11.03f, 16f)
                horizontalLineToRelative(-9.03f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(12.72f)
                curveToRelative(-1.36f, 0.9f, -2.35f, 2.33f, -2.64f, 4f)
                horizontalLineToRelative(-2.08f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                close()
            }
        }.also { _MobileLock = it}
