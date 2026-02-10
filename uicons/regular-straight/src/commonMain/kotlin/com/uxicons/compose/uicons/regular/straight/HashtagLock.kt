package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HashtagLock: ImageVector? = null

val Icons.Rs.HashtagLock: ImageVector
    get() = _HashtagLock ?: UXIcon(name = "HashtagLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.2f, 15f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(-0.84f, 7f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(0.84f, -7f)
                lineTo(0f, 17f)
                lineToRelative(0.23f, -2f)
                horizontalLineToRelative(5.95f)
                lineToRelative(0.72f, -6f)
                lineTo(0.71f, 9f)
                lineToRelative(0.23f, -2f)
                horizontalLineToRelative(6.21f)
                lineToRelative(0.84f, -7f)
                horizontalLineToRelative(2.01f)
                lineToRelative(-0.84f, 7f)
                horizontalLineToRelative(6.88f)
                lineToRelative(0.84f, -7f)
                horizontalLineToRelative(2.01f)
                lineToRelative(-0.84f, 7f)
                horizontalLineToRelative(5.95f)
                lineToRelative(-0.23f, 2f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(-1.1f, -1.22f, -2.69f, -2f, -4.46f, -2f)
                reflectiveCurveToRelative(-3.36f, 0.78f, -4.46f, 2f)
                horizontalLineToRelative(-4.62f)
                lineToRelative(-0.72f, 6f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _HashtagLock = it}
