package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsDownCurve: ImageVector? = null

val Icons.Bs.ArrowsDownCurve: ImageVector
    get() = _ArrowsDownCurve ?: UXIcon(name = "ArrowsDownCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.04f, 20.99f)
                verticalLineToRelative(3f)
                lineTo(0.04f, 23.99f)
                verticalLineToRelative(-3f)
                lineTo(24.04f, 20.99f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(0.0f)
                curveToRelative(7.43f, -0.0f, 11.81f, -5.53f, 11.99f, -5.77f)
                lineToRelative(-2.37f, -1.84f)
                curveToRelative(-0.04f, 0.05f, -3.7f, 4.61f, -9.63f, 4.61f)
                curveToRelative(-5.93f, 0f, -9.59f, -4.57f, -9.62f, -4.61f)
                lineTo(0.01f, 13.23f)
                curveToRelative(0.18f, 0.23f, 4.56f, 5.77f, 11.99f, 5.77f)
                close()
                moveTo(8f, 10f)
                lineToRelative(3.37f, 3.29f)
                curveToRelative(0.35f, 0.35f, 0.91f, 0.35f, 1.26f, 0f)
                lineToRelative(3.37f, -3.29f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.5f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(18.5f, 9f)
                horizontalLineToRelative(3f)
                lineTo(21.5f, 4f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.37f, -3.29f)
                curveToRelative(-0.35f, -0.35f, -0.91f, -0.35f, -1.26f, 0f)
                lineToRelative(-3.37f, 3.29f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(2.5f, 9f)
                horizontalLineToRelative(3f)
                lineTo(5.5f, 4f)
                horizontalLineToRelative(2.5f)
                lineTo(4.63f, 0.7f)
                curveToRelative(-0.35f, -0.35f, -0.91f, -0.35f, -1.26f, 0f)
                lineTo(0f, 4f)
                lineTo(2.5f, 4f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _ArrowsDownCurve = it}
