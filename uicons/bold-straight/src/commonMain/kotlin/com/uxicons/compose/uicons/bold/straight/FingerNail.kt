package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FingerNail: ImageVector? = null

val Icons.Bs.FingerNail: ImageVector
    get() = _FingerNail ?: UXIcon(name = "FingerNail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9.9f)
                curveToRelative(0.64f, 1.07f, 1f, 2.3f, 1f, 3.6f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -3.18f, -1.49f, -6.09f, -4f, -7.98f)
                verticalLineToRelative(-1.02f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(1.02f)
                curveToRelative(-2.51f, 1.89f, -4f, 4.8f, -4f, 7.98f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(3f)
                lineTo(5f, 13.5f)
                curveToRelative(0f, -1.3f, 0.36f, -2.53f, 1f, -3.6f)
                verticalLineToRelative(2.6f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-2.6f)
                close()
                moveTo(9f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(15f, 12.5f)
                curveToRelative(0f, 0.49f, -0.15f, 0.95f, -0.4f, 1.34f)
                curveToRelative(-0.73f, -0.53f, -1.63f, -0.84f, -2.6f, -0.84f)
                reflectiveCurveToRelative(-1.87f, 0.31f, -2.6f, 0.84f)
                curveToRelative(-0.25f, -0.39f, -0.4f, -0.85f, -0.4f, -1.34f)
                lineTo(9f, 4.5f)
                close()
                moveTo(23.5f, 21f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                close()
                moveTo(2.5f, 5f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(-0.83f, 1.67f)
                close()
            }
        }.also { _FingerNail = it}
