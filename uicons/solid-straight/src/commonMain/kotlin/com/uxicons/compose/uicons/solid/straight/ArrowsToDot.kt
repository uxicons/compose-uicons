package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToDot: ImageVector? = null

val Icons.Ss.ArrowsToDot: ImageVector
    get() = _ArrowsToDot ?: UXIcon(name = "ArrowsToDot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(8.5f, 12.01f)
                curveToRelative(0.0f, -0.54f, -0.2f, -1.04f, -0.58f, -1.42f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.54f, 2.54f)
                horizontalLineToRelative(-5.51f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.49f)
                lineToRelative(-2.53f, 2.54f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(3.54f, -3.55f)
                curveToRelative(0.37f, -0.37f, 0.58f, -0.86f, 0.58f, -1.39f)
                close()
                moveTo(12.01f, 8.5f)
                curveToRelative(0.53f, 0f, 1.03f, -0.21f, 1.4f, -0.58f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.54f, 2.54f)
                verticalLineToRelative(-5.51f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.49f)
                lineToRelative(-2.54f, -2.53f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(3.55f, 3.53f)
                curveToRelative(0.37f, 0.37f, 0.88f, 0.58f, 1.41f, 0.58f)
                close()
                moveTo(10.6f, 16.08f)
                lineTo(7.04f, 19.62f)
                lineTo(8.45f, 21.04f)
                lineTo(10.99f, 18.5f)
                lineTo(11.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(12.99f, 18.5f)
                lineTo(15.53f, 21.03f)
                lineTo(16.94f, 19.62f)
                lineTo(13.4f, 16.08f)
                curveToRelative(-0.75f, -0.75f, -2.06f, -0.75f, -2.81f, 0f)
                close()
                moveTo(24f, 13.0f)
                lineTo(24.0f, 11.0f)
                lineTo(18.5f, 11.01f)
                lineTo(21.03f, 8.48f)
                lineTo(19.62f, 7.06f)
                lineTo(16.08f, 10.6f)
                curveToRelative(-0.38f, 0.38f, -0.58f, 0.88f, -0.58f, 1.41f)
                reflectiveCurveToRelative(0.21f, 1.03f, 0.58f, 1.4f)
                lineToRelative(3.54f, 3.55f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(5.51f, -0.01f)
                close()
            }
        }.also { _ArrowsToDot = it}
