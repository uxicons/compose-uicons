package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerClick: ImageVector? = null

val Icons.Sr.MousePointerClick: ImageVector
    get() = _MousePointerClick ?: UXIcon(name = "MousePointerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(8.43f, 6.54f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                close()
                moveTo(16.95f, 6.46f)
                lineTo(19.07f, 4.34f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                close()
                moveTo(21.59f, 15.31f)
                lineTo(13.63f, 7.53f)
                curveToRelative(-1.42f, -1.21f, -3.63f, -0.21f, -3.63f, 1.63f)
                verticalLineToRelative(11.24f)
                curveToRelative(0f, 1.18f, 1.41f, 1.8f, 2.31f, 1.03f)
                lineToRelative(2.01f, -1.8f)
                lineToRelative(1.61f, 3.26f)
                curveToRelative(0.59f, 1.14f, 2.07f, 1.46f, 3.09f, 0.71f)
                curveToRelative(0.82f, -0.6f, 1.02f, -1.76f, 0.56f, -2.67f)
                lineToRelative(-1.42f, -2.91f)
                lineToRelative(2.64f, -0.37f)
                curveToRelative(1.14f, -0.16f, 1.61f, -1.53f, 0.79f, -2.33f)
                close()
            }
        }.also { _MousePointerClick = it}
