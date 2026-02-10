package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonCheck: ImageVector? = null

val Icons.Br.HexagonCheck: ImageVector
    get() = _HexagonCheck ?: UXIcon(name = "HexagonCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.58f, 8.46f)
            curveToRelative(0.57f, 0.6f, 0.56f, 1.55f, -0.04f, 2.12f)
            lineToRelative(-4.61f, 4.42f)
            curveToRelative(-0.67f, 0.66f, -1.55f, 0.99f, -2.44f, 0.99f)
            reflectiveCurveToRelative(-1.77f, -0.33f, -2.45f, -0.99f)
            lineToRelative(-1.55f, -1.39f)
            curveToRelative(-0.62f, -0.55f, -0.67f, -1.5f, -0.11f, -2.12f)
            curveToRelative(0.55f, -0.62f, 1.5f, -0.67f, 2.12f, -0.11f)
            lineToRelative(1.59f, 1.43f)
            curveToRelative(0.24f, 0.23f, 0.56f, 0.23f, 0.75f, 0.04f)
            lineToRelative(4.62f, -4.44f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.56f, 2.12f, 0.04f)
            close()
            moveTo(23.25f, 14.78f)
            lineToRelative(-3.22f, 5.5f)
            curveToRelative(-0.98f, 1.68f, -2.8f, 2.72f, -4.75f, 2.72f)
            horizontalLineToRelative(-6.55f)
            curveToRelative(-1.94f, 0f, -3.76f, -1.04f, -4.75f, -2.72f)
            lineTo(0.76f, 14.78f)
            curveToRelative(-1.0f, -1.72f, -1.0f, -3.85f, 0f, -5.56f)
            lineTo(3.98f, 3.72f)
            curveToRelative(0.98f, -1.68f, 2.8f, -2.72f, 4.75f, -2.72f)
            horizontalLineToRelative(6.55f)
            curveToRelative(1.94f, 0f, 3.76f, 1.04f, 4.75f, 2.72f)
            lineToRelative(3.22f, 5.5f)
            curveToRelative(1.0f, 1.72f, 1.0f, 3.85f, 0f, 5.56f)
            close()
            moveTo(20.66f, 10.73f)
            lineToRelative(-3.22f, -5.5f)
            curveToRelative(-0.45f, -0.76f, -1.27f, -1.24f, -2.16f, -1.24f)
            horizontalLineToRelative(-6.55f)
            curveToRelative(-0.88f, 0f, -1.71f, 0.47f, -2.16f, 1.24f)
            lineToRelative(-3.22f, 5.5f)
            curveToRelative(-0.46f, 0.78f, -0.46f, 1.75f, 0f, 2.53f)
            lineToRelative(3.22f, 5.5f)
            curveToRelative(0.45f, 0.76f, 1.27f, 1.24f, 2.16f, 1.24f)
            horizontalLineToRelative(6.55f)
            curveToRelative(0.88f, 0f, 1.71f, -0.47f, 2.16f, -1.24f)
            lineToRelative(3.22f, -5.5f)
            curveToRelative(0.46f, -0.78f, 0.46f, -1.75f, 0f, -2.53f)
            close()
        }
    }.also { _HexagonCheck = it }
