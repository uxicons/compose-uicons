package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonCheck: ImageVector? = null

val Icons.Ts.HexagonCheck: ImageVector
    get() = _HexagonCheck ?: UXIcon(name = "HexagonCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.61f, 8.14f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-5.79f, 5.71f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.78f, -0.16f, -1.06f, -0.44f)
                lineToRelative(-2.79f, -2.7f)
                lineToRelative(0.7f, -0.72f)
                lineToRelative(2.79f, 2.71f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.01f)
                lineToRelative(5.8f, -5.71f)
                close()
                moveTo(23.68f, 13.26f)
                lineToRelative(-4.45f, 8.36f)
                curveToRelative(-0.45f, 0.85f, -1.33f, 1.38f, -2.29f, 1.38f)
                lineTo(7.07f, 23f)
                curveToRelative(-0.96f, 0f, -1.83f, -0.53f, -2.28f, -1.37f)
                lineTo(0.32f, 13.27f)
                curveToRelative(-0.42f, -0.79f, -0.42f, -1.74f, 0f, -2.54f)
                lineTo(4.78f, 2.37f)
                curveToRelative(0.45f, -0.85f, 1.33f, -1.37f, 2.28f, -1.37f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.96f, 0f, 1.83f, 0.53f, 2.29f, 1.38f)
                lineToRelative(4.45f, 8.36f)
                curveToRelative(0.42f, 0.79f, 0.42f, 1.73f, 0f, 2.52f)
                close()
                moveTo(22.8f, 11.21f)
                lineToRelative(-4.45f, -8.36f)
                curveToRelative(-0.28f, -0.52f, -0.81f, -0.85f, -1.4f, -0.85f)
                lineTo(7.07f, 2f)
                curveToRelative(-0.59f, 0f, -1.12f, 0.32f, -1.4f, 0.84f)
                lineTo(1.2f, 11.21f)
                curveToRelative(-0.27f, 0.5f, -0.27f, 1.09f, 0f, 1.59f)
                lineToRelative(4.47f, 8.36f)
                curveToRelative(0.28f, 0.52f, 0.81f, 0.84f, 1.4f, 0.84f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.59f, 0f, 1.12f, -0.32f, 1.4f, -0.85f)
                lineToRelative(4.45f, -8.36f)
                curveToRelative(0.26f, -0.5f, 0.26f, -1.09f, 0f, -1.59f)
                close()
            }
        }.also { _HexagonCheck = it}
