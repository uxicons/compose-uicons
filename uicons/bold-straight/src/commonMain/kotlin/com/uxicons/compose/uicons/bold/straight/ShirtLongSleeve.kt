package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtLongSleeve: ImageVector? = null

val Icons.Bs.ShirtLongSleeve: ImageVector
    get() = _ShirtLongSleeve ?: UXIcon(name = "ShirtLongSleeve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.24f, 2.23f)
                curveToRelative(-1.31f, -1.02f, -3.46f, -2.23f, -6.24f, -2.23f)
                horizontalLineToRelative(-8f)
                curveTo(5.22f, 0f, 3.07f, 1.21f, 1.76f, 2.23f)
                curveToRelative(-1.12f, 0.86f, -1.76f, 2.17f, -1.76f, 3.57f)
                verticalLineToRelative(15.2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                lineTo(24f, 5.8f)
                curveToRelative(0f, -1.4f, -0.64f, -2.7f, -1.76f, -3.57f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(3f, 5.8f)
                curveToRelative(0f, -0.47f, 0.22f, -0.91f, 0.59f, -1.2f)
                curveToRelative(0.94f, -0.73f, 2.74f, -1.6f, 4.67f, -1.6f)
                curveToRelative(0.81f, 1.21f, 2.17f, 2f, 3.73f, 2f)
                reflectiveCurveToRelative(2.93f, -0.8f, 3.73f, -2f)
                curveToRelative(1.93f, 0f, 3.73f, 0.87f, 4.67f, 1.6f)
                curveToRelative(0.38f, 0.29f, 0.59f, 0.73f, 0.59f, 1.2f)
                verticalLineToRelative(12.2f)
                close()
            }
        }.also { _ShirtLongSleeve = it}
