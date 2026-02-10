package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HashtagLock: ImageVector? = null

val Icons.Ts.HashtagLock: ImageVector
    get() = _HashtagLock ?: UXIcon(name = "HashtagLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.14f, 16f)
                horizontalLineToRelative(3.86f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.98f)
                lineToRelative(-0.84f, 7f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(0.84f, -7f)
                lineTo(0f, 17f)
                lineToRelative(0.12f, -1f)
                horizontalLineToRelative(5.95f)
                lineToRelative(0.96f, -8f)
                lineTo(0.82f, 8f)
                lineToRelative(0.12f, -1f)
                horizontalLineToRelative(6.21f)
                lineToRelative(0.84f, -7f)
                horizontalLineToRelative(1.07f)
                lineToRelative(-0.84f, 7f)
                horizontalLineToRelative(8.76f)
                lineToRelative(0.84f, -7f)
                horizontalLineToRelative(1.07f)
                lineToRelative(-0.84f, 7f)
                horizontalLineToRelative(5.95f)
                lineToRelative(-0.12f, 1f)
                horizontalLineToRelative(-15.78f)
                lineToRelative(-0.96f, 8f)
                close()
                moveTo(19f, 18.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(23f, 16f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.also { _HashtagLock = it}
