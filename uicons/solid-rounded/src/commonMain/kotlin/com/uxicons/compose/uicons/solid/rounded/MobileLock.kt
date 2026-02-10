package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileLock: ImageVector? = null

val Icons.Sr.MobileLock: ImageVector
    get() = _MobileLock ?: UXIcon(name = "MobileLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(11f, 22f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(22f, 6.56f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.97f, -2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, -0.81f, -2.75f, -2f, -3.44f)
                close()
                moveTo(18f, 12.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20f, 6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(11.54f, 16f)
                horizontalLineToRelative(-9.54f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(7.69f)
                curveToRelative(-1.62f, 1.08f, -2.69f, 2.91f, -2.69f, 5f)
                verticalLineToRelative(0.55f)
                curveToRelative(-1.25f, 1.13f, -2f, 2.75f, -2f, 4.45f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.54f, 0.59f, 2.94f, 1.54f, 4f)
                close()
            }
        }.also { _MobileLock = it}
