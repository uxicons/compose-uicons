package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitHand: ImageVector? = null

val Icons.Bs.LimitHand: ImageVector
    get() = _LimitHand ?: UXIcon(name = "LimitHand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.08f, 21f)
                horizontalLineToRelative(1.35f)
                lineToRelative(-1.75f, 3f)
                horizontalLineToRelative(-0.77f)
                lineToRelative(-3.67f, -3.35f)
                lineTo(0.75f, 16.61f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(2.64f, 2.3f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -0.91f, 0.8f, -1.63f, 1.74f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.25f, 0.81f, 1.25f, 1.56f)
                verticalLineToRelative(16.42f)
                lineToRelative(1.09f, 1.0f)
                close()
                moveTo(19f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(3f)
                lineTo(19f, 1.5f)
                close()
                moveTo(14f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(3f)
                lineTo(14f, 1.5f)
                close()
                moveTo(18f, 13.71f)
                lineToRelative(6f, 10.29f)
                horizontalLineToRelative(-12f)
                lineToRelative(6f, -10.29f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.39f)
                lineToRelative(3f, 5.14f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _LimitHand = it}
