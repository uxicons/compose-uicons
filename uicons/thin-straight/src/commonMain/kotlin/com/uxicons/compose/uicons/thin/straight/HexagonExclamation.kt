package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonExclamation: ImageVector? = null

val Icons.Ts.HexagonExclamation: ImageVector
    get() = _HexagonExclamation ?: UXIcon(name = "HexagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.68f, 10.74f)
                lineToRelative(-4.45f, -8.36f)
                curveToRelative(-0.45f, -0.85f, -1.33f, -1.38f, -2.29f, -1.38f)
                lineTo(7.07f, 1f)
                curveToRelative(-0.96f, 0f, -1.83f, 0.53f, -2.28f, 1.37f)
                lineTo(0.32f, 10.74f)
                curveToRelative(-0.42f, 0.79f, -0.42f, 1.74f, 0f, 2.54f)
                lineToRelative(4.47f, 8.36f)
                curveToRelative(0.45f, 0.85f, 1.33f, 1.37f, 2.28f, 1.37f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.96f, 0f, 1.83f, -0.53f, 2.29f, -1.38f)
                lineToRelative(4.45f, -8.36f)
                curveToRelative(0.42f, -0.79f, 0.42f, -1.74f, 0f, -2.52f)
                close()
                moveTo(22.8f, 12.79f)
                lineToRelative(-4.45f, 8.36f)
                curveToRelative(-0.28f, 0.52f, -0.81f, 0.84f, -1.4f, 0.84f)
                lineTo(7.07f, 22f)
                curveToRelative(-0.59f, 0f, -1.12f, -0.32f, -1.4f, -0.84f)
                lineTo(1.2f, 12.8f)
                curveToRelative(-0.27f, -0.5f, -0.27f, -1.09f, 0f, -1.59f)
                lineTo(5.67f, 2.84f)
                curveToRelative(0.28f, -0.52f, 0.81f, -0.84f, 1.4f, -0.84f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.59f, 0f, 1.12f, 0.32f, 1.4f, 0.84f)
                lineToRelative(4.45f, 8.36f)
                curveToRelative(0.26f, 0.5f, 0.26f, 1.09f, 0f, 1.59f)
                close()
                moveTo(12.5f, 14f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _HexagonExclamation = it}
