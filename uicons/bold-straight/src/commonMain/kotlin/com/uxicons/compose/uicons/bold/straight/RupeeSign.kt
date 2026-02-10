package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupeeSign: ImageVector? = null

val Icons.Bs.RupeeSign: ImageVector
    get() = _RupeeSign ?: UXIcon(name = "RupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.5f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 15f)
                horizontalLineToRelative(3.31f)
                lineToRelative(4.85f, 9f)
                horizontalLineToRelative(3.41f)
                lineToRelative(-5.0f, -9.29f)
                curveToRelative(3.13f, -0.9f, 5.43f, -3.79f, 5.43f, -7.21f)
                close()
                moveTo(3f, 3f)
                lineTo(7.5f, 3f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(3f, 12f)
                lineTo(3f, 3f)
                close()
                moveTo(21f, 16f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                curveToRelative(0f, 0.25f, 0.16f, 0.47f, 0.4f, 0.55f)
                lineToRelative(3.15f, 1.05f)
                curveToRelative(1.47f, 0.49f, 2.45f, 1.85f, 2.45f, 3.4f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                curveToRelative(0f, -0.25f, -0.16f, -0.47f, -0.4f, -0.55f)
                lineToRelative(-3.15f, -1.05f)
                curveToRelative(-1.47f, -0.49f, -2.45f, -1.85f, -2.45f, -3.4f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _RupeeSign = it}
