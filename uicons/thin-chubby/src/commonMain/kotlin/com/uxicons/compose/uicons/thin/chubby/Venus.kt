package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Venus: ImageVector? = null

val Icons.Tc.Venus: ImageVector
    get() = _Venus ?: UXIcon(name = "Venus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.45f, 8.39f)
                curveToRelative(-0.03f, -4.82f, -2.53f, -7.31f, -7.46f, -7.39f)
                curveToRelative(-4.77f, 0.08f, -7.41f, 2.71f, -7.44f, 7.4f)
                curveToRelative(0.03f, 4.59f, 2.43f, 7.14f, 6.96f, 7.38f)
                lineToRelative(-0.01f, 3.75f)
                horizontalLineToRelative(-2.34f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.34f)
                lineToRelative(-0.01f, 1.97f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineToRelative(0.01f, -1.97f)
                horizontalLineToRelative(2.33f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(0.01f, -3.75f)
                curveToRelative(4.57f, -0.25f, 6.9f, -2.73f, 6.93f, -7.38f)
                close()
                moveTo(5.55f, 8.4f)
                curveToRelative(0.03f, -4.17f, 2.2f, -6.33f, 6.44f, -6.4f)
                curveToRelative(4.38f, 0.08f, 6.43f, 2.11f, 6.46f, 6.39f)
                curveToRelative(-0.03f, 4.23f, -2.13f, 6.32f, -6.45f, 6.4f)
                curveToRelative(-4.31f, -0.08f, -6.42f, -2.17f, -6.45f, -6.39f)
                close()
            }
        }.also { _Venus = it}
