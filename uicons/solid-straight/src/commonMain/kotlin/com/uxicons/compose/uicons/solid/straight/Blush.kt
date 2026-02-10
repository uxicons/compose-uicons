package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blush: ImageVector? = null

val Icons.Ss.Blush: ImageVector
    get() = _Blush ?: UXIcon(name = "Blush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.03f, 2.01f)
                lineToRelative(1f, -2.0f)
                lineToRelative(1f, 2.0f)
                lineToRelative(2f, 1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2.0f)
                lineToRelative(-1f, -2.0f)
                lineToRelative(-2f, -1f)
                close()
                moveTo(14.11f, 21.91f)
                curveToRelative(-1.49f, 1.3f, -3.44f, 2.09f, -5.58f, 2.09f)
                curveToRelative(-4.69f, 0f, -8.5f, -3.8f, -8.5f, -8.5f)
                reflectiveCurveToRelative(3.81f, -8.5f, 8.5f, -8.5f)
                curveToRelative(1.64f, 0f, 3.17f, 0.47f, 4.47f, 1.28f)
                lineToRelative(1.11f, 13.62f)
                close()
                moveTo(12.03f, 14.5f)
                lineTo(10.37f, 13.67f)
                lineTo(9.53f, 12.01f)
                lineTo(8.7f, 13.67f)
                lineTo(7.03f, 14.5f)
                lineTo(8.7f, 15.34f)
                lineTo(9.53f, 17.0f)
                lineTo(10.37f, 15.34f)
                close()
                moveTo(21.9f, 10.01f)
                horizontalLineToRelative(-6.75f)
                lineToRelative(0.16f, 2.0f)
                horizontalLineToRelative(6.43f)
                close()
                moveTo(22.1f, 8.01f)
                lineTo(23.97f, 3.01f)
                curveToRelative(-1.13f, -1.58f, -3.32f, -3.12f, -5.43f, -3.0f)
                curveToRelative(-2.11f, -0.11f, -4.3f, 1.42f, -5.43f, 3.01f)
                lineToRelative(1.87f, 4.99f)
                close()
                moveTo(15.47f, 14.0f)
                lineTo(16.29f, 24f)
                horizontalLineToRelative(4.49f)
                lineToRelative(0.8f, -10.0f)
                close()
            }
        }.also { _Blush = it}
