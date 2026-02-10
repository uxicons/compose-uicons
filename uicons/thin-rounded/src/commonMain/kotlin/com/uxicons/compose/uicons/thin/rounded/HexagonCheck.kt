package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonCheck: ImageVector? = null

val Icons.Tr.HexagonCheck: ImageVector
    get() = _HexagonCheck ?: UXIcon(name = "HexagonCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.21f, 9.0f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.52f, -0.01f, 0.71f)
                lineToRelative(-4.74f, 4.57f)
                curveToRelative(-0.47f, 0.47f, -1.09f, 0.73f, -1.76f, 0.73f)
                reflectiveCurveToRelative(-1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-2.27f, -2.1f)
                curveToRelative(-0.2f, -0.19f, -0.21f, -0.5f, -0.03f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.03f)
                lineToRelative(2.28f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.57f, 0.58f, 2.13f, 0.01f)
                lineToRelative(4.75f, -4.57f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.19f, 0.71f, 0.01f)
                close()
                moveTo(23.43f, 14.25f)
                lineToRelative(-3.76f, 6.5f)
                curveToRelative(-0.8f, 1.39f, -2.29f, 2.25f, -3.9f, 2.25f)
                horizontalLineToRelative(-7.54f)
                curveToRelative(-1.6f, 0f, -3.09f, -0.86f, -3.9f, -2.25f)
                lineTo(0.57f, 14.25f)
                curveToRelative(-0.81f, -1.39f, -0.81f, -3.12f, 0f, -4.51f)
                lineToRelative(3.76f, -6.5f)
                curveToRelative(0.8f, -1.39f, 2.29f, -2.25f, 3.9f, -2.25f)
                horizontalLineToRelative(7.54f)
                curveToRelative(1.6f, 0f, 3.09f, 0.86f, 3.9f, 2.25f)
                lineToRelative(3.76f, 6.5f)
                curveToRelative(0.81f, 1.39f, 0.81f, 3.12f, 0f, 4.51f)
                close()
                moveTo(22.57f, 10.25f)
                lineToRelative(-3.76f, -6.5f)
                curveToRelative(-0.62f, -1.08f, -1.78f, -1.75f, -3.03f, -1.75f)
                horizontalLineToRelative(-7.54f)
                curveToRelative(-1.25f, 0f, -2.4f, 0.67f, -3.03f, 1.75f)
                lineToRelative(-3.76f, 6.5f)
                curveToRelative(-0.62f, 1.08f, -0.62f, 2.42f, 0f, 3.51f)
                lineToRelative(3.76f, 6.5f)
                curveToRelative(0.62f, 1.08f, 1.78f, 1.75f, 3.03f, 1.75f)
                horizontalLineToRelative(7.54f)
                curveToRelative(1.25f, 0f, 2.41f, -0.67f, 3.03f, -1.75f)
                lineToRelative(3.76f, -6.5f)
                curveToRelative(0.63f, -1.08f, 0.63f, -2.42f, 0f, -3.51f)
                close()
            }
        }.also { _HexagonCheck = it}
