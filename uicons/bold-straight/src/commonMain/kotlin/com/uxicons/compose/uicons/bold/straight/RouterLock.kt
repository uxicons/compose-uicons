package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouterLock: ImageVector? = null

val Icons.Bs.RouterLock: ImageVector
    get() = _RouterLock ?: UXIcon(name = "RouterLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.31f, 5.56f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(4.58f, -4.58f, 12.04f, -4.58f, 16.62f, 0f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-3.41f, -3.41f, -8.96f, -3.41f, -12.38f, 0f)
                close()
                moveTo(3.73f, 6.98f)
                lineTo(5.85f, 9.1f)
                curveToRelative(1.42f, -1.42f, 3.89f, -1.42f, 5.3f, 0f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.27f, -1.27f, -2.97f, -1.98f, -4.77f, -1.98f)
                reflectiveCurveToRelative(-3.5f, 0.7f, -4.77f, 1.98f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(12.03f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                close()
            }
        }.also { _RouterLock = it}
