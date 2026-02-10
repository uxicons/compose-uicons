package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camcorder: ImageVector? = null

val Icons.Sr.Camcorder: ImageVector
    get() = _Camcorder ?: UXIcon(name = "Camcorder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.74f)
                verticalLineToRelative(8.52f)
                curveToRelative(0f, 0.76f, -0.42f, 1.45f, -1.1f, 1.79f)
                curveToRelative(-0.29f, 0.14f, -0.59f, 0.21f, -0.9f, 0.21f)
                curveToRelative(-0.42f, 0f, -0.84f, -0.14f, -1.19f, -0.4f)
                lineToRelative(-0.81f, -0.6f)
                lineTo(20f, 9.74f)
                lineToRelative(0.81f, -0.6f)
                curveToRelative(0.61f, -0.46f, 1.41f, -0.53f, 2.09f, -0.18f)
                curveToRelative(0.68f, 0.34f, 1.1f, 1.03f, 1.1f, 1.79f)
                close()
                moveTo(5f, 19f)
                lineTo(13f, 19f)
                lineTo(13f, 11f)
                lineTo(5f, 11f)
                verticalLineToRelative(8f)
                close()
                moveTo(18f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 11f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6.09f)
                lineToRelative(-2.71f, -2.71f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                lineTo(1f, 3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(0.45f, 1f, 1f, 1f)
                lineTo(7.67f, 1f)
                curveToRelative(0.8f, 0f, 1.55f, 0.31f, 2.12f, 0.88f)
                lineToRelative(4.21f, 4.23f)
                curveToRelative(2.27f, 0.47f, 3.99f, 2.49f, 3.99f, 4.89f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(4f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(14f, 21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(15f, 10f)
                close()
            }
        }.also { _Camcorder = it}
