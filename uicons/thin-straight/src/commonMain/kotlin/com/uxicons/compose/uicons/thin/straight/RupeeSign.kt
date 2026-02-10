package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupeeSign: ImageVector? = null

val Icons.Ts.RupeeSign: ImageVector
    get() = _RupeeSign ?: UXIcon(name = "RupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.5f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 24f)
                lineTo(1f, 24f)
                lineTo(1f, 15f)
                lineTo(7.5f, 15f)
                curveToRelative(0.46f, 0f, 0.92f, -0.04f, 1.36f, -0.12f)
                lineToRelative(4.91f, 9.12f)
                horizontalLineToRelative(1.23f)
                lineToRelative(-5.07f, -9.41f)
                curveToRelative(2.94f, -1.01f, 5.07f, -3.81f, 5.07f, -7.09f)
                close()
                moveTo(7.5f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 1f)
                lineTo(7.5f, 1f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(23f, 17f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.88f, 0.63f, 1.61f, 1.49f, 1.75f)
                lineToRelative(3.17f, 0.51f)
                curveToRelative(1.35f, 0.22f, 2.33f, 1.37f, 2.33f, 2.74f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.88f, -0.63f, -1.61f, -1.49f, -1.75f)
                lineToRelative(-3.17f, -0.51f)
                curveToRelative(-1.35f, -0.22f, -2.33f, -1.37f, -2.33f, -2.74f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _RupeeSign = it}
