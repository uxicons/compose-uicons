package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonCheck: ImageVector? = null

val Icons.Rs.HexagonCheck: ImageVector
    get() = _HexagonCheck ?: UXIcon(name = "HexagonCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.3f, 8.29f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-5.79f, 5.71f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.58f)
                lineToRelative(-2.78f, -2.7f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.79f, 2.71f)
                lineToRelative(5.81f, -5.7f)
                close()
                moveTo(23.64f, 13.45f)
                lineToRelative(-4.25f, 7.96f)
                curveToRelative(-0.52f, 0.98f, -1.54f, 1.59f, -2.65f, 1.59f)
                lineTo(7.28f, 23f)
                curveToRelative(-1.11f, 0f, -2.12f, -0.61f, -2.64f, -1.58f)
                lineTo(0.37f, 13.46f)
                curveToRelative(-0.49f, -0.91f, -0.49f, -2f, 0f, -2.91f)
                lineTo(4.64f, 2.58f)
                curveToRelative(0.52f, -0.98f, 1.54f, -1.58f, 2.64f, -1.58f)
                horizontalLineToRelative(9.46f)
                curveToRelative(1.11f, 0f, 2.12f, 0.61f, 2.65f, 1.59f)
                lineToRelative(4.25f, 7.96f)
                curveToRelative(0.48f, 0.91f, 0.48f, 1.99f, 0f, 2.9f)
                close()
                moveTo(21.87f, 11.49f)
                lineToRelative(-4.25f, -7.96f)
                curveToRelative(-0.17f, -0.33f, -0.51f, -0.53f, -0.88f, -0.53f)
                lineTo(7.28f, 3.0f)
                curveToRelative(-0.37f, 0f, -0.71f, 0.2f, -0.88f, 0.53f)
                lineToRelative(-4.27f, 7.97f)
                curveToRelative(-0.17f, 0.32f, -0.17f, 0.7f, 0f, 1.02f)
                lineToRelative(4.27f, 7.96f)
                curveToRelative(0.17f, 0.33f, 0.51f, 0.53f, 0.88f, 0.53f)
                horizontalLineToRelative(9.46f)
                curveToRelative(0.37f, 0f, 0.71f, -0.2f, 0.88f, -0.53f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(4.25f, -7.96f, 4.25f, -7.96f)
                curveToRelative(0.17f, -0.32f, 0.17f, -0.7f, 0f, -1.01f)
                close()
            }
        }.also { _HexagonCheck = it}
