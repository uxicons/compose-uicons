package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouterLock: ImageVector? = null

val Icons.Ss.RouterLock: ImageVector
    get() = _RouterLock ?: UXIcon(name = "RouterLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.67f, 6.79f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.61f, -1.61f, 4.22f, -1.61f, 5.83f, 0f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-2.39f, -2.39f, -6.27f, -2.39f, -8.66f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 2f)
                curveToRelative(2.47f, 0f, 4.79f, 0.96f, 6.54f, 2.71f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(-2.12f, -2.12f, -4.95f, -3.29f, -7.95f, -3.29f)
                reflectiveCurveToRelative(-5.83f, 1.17f, -7.95f, 3.29f)
                lineToRelative(1.41f, 1.42f)
                curveToRelative(1.75f, -1.75f, 4.07f, -2.71f, 6.54f, -2.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 21f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11.03f)
                curveToRelative(-0.44f, -0.58f, -0.77f, -1.26f, -0.92f, -2f)
                lineToRelative(-0.1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
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
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _RouterLock = it}
