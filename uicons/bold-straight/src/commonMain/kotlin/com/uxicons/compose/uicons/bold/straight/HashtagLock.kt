package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HashtagLock: ImageVector? = null

val Icons.Bs.HashtagLock: ImageVector
    get() = _HashtagLock ?: UXIcon(name = "HashtagLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.7f, 15f)
                horizontalLineToRelative(2.3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.66f)
                lineToRelative(-0.72f, 6f)
                horizontalLineToRelative(-3.02f)
                lineToRelative(0.72f, -6f)
                lineTo(0f, 18f)
                lineToRelative(0.35f, -3f)
                horizontalLineToRelative(5.33f)
                lineToRelative(0.72f, -6f)
                lineTo(0f, 9f)
                lineToRelative(0.35f, -3f)
                horizontalLineToRelative(6.41f)
                lineToRelative(0.72f, -6f)
                horizontalLineToRelative(3.02f)
                lineToRelative(-0.72f, 6f)
                horizontalLineToRelative(5.88f)
                lineToRelative(0.72f, -6f)
                horizontalLineToRelative(3.02f)
                lineToRelative(-0.72f, 6f)
                horizontalLineToRelative(5.32f)
                lineToRelative(-0.35f, 3f)
                horizontalLineToRelative(-0.47f)
                curveToRelative(-1.18f, -1.23f, -2.84f, -2f, -4.68f, -2f)
                reflectiveCurveToRelative(-3.5f, 0.77f, -4.68f, 2f)
                horizontalLineToRelative(-4.4f)
                lineToRelative(-0.72f, 6f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(1f)
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
                verticalLineToRelative(1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _HashtagLock = it}
