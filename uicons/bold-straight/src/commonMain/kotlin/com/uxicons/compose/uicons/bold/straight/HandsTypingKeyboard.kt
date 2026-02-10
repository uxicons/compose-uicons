package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandsTypingKeyboard: ImageVector? = null

val Icons.Bs.HandsTypingKeyboard: ImageVector
    get() = _HandsTypingKeyboard ?: UXIcon(name = "HandsTypingKeyboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(12.85f)
                lineToRelative(-3f, -1.2f)
                verticalLineToRelative(-11.65f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(11.65f)
                lineToRelative(-3f, 1.2f)
                verticalLineToRelative(-12.85f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(10f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(10f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(11.16f, 18.15f)
                curveToRelative(-0.81f, -0.58f, -1.94f, -0.41f, -2.65f, 0.29f)
                lineToRelative(-0.51f, 0.53f)
                verticalLineToRelative(-6.47f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                reflectiveCurveToRelative(-5f, 2f, -5f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8.51f)
                lineToRelative(2.91f, -2.8f)
                curveToRelative(0.86f, -0.86f, 0.77f, -2.31f, -0.26f, -3.05f)
                close()
                moveTo(19.0f, 12.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.47f)
                lineToRelative(-0.51f, -0.53f)
                curveToRelative(-0.7f, -0.7f, -1.84f, -0.88f, -2.65f, -0.29f)
                curveToRelative(-1.03f, 0.74f, -1.12f, 2.19f, -0.26f, 3.05f)
                lineToRelative(2.91f, 2.8f)
                horizontalLineToRelative(8.51f)
                verticalLineToRelative(-6f)
                lineToRelative(-5f, -2f)
                close()
            }
        }.also { _HandsTypingKeyboard = it}
