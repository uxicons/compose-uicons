package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Venus: ImageVector? = null

val Icons.Sc.Venus: ImageVector
    get() = _Venus ?: UXIcon(name = "Venus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.4f, 8.4f)
                curveToRelative(-0.03f, -4.75f, -2.58f, -7.31f, -7.42f, -7.4f)
                curveToRelative(-4.73f, 0.08f, -7.35f, 2.71f, -7.38f, 7.41f)
                curveToRelative(0.03f, 4.18f, 2.11f, 6.72f, 5.92f, 7.28f)
                lineToRelative(-0.0f, 2.01f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.11f)
                lineToRelative(-0.0f, 0.79f)
                curveToRelative(-0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineToRelative(0.0f, -0.8f)
                horizontalLineToRelative(1.11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.1f)
                lineToRelative(0.0f, -2.01f)
                curveToRelative(3.84f, -0.56f, 5.87f, -3.05f, 5.89f, -7.29f)
                close()
            }
        }.also { _Venus = it}
