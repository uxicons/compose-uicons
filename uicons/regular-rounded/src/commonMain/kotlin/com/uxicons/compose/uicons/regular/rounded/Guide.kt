package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Rr.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.35f)
                curveTo(11.82f, 1.67f, 9.61f, 0f, 7f, 0f)
                curveTo(3.69f, 0f, 1f, 2.69f, 1f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(7f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(7f, 2f)
                curveToRelative(1.47f, 0f, 2.75f, 0.81f, 3.44f, 2f)
                lineTo(3.56f, 4f)
                curveToRelative(0.69f, -1.19f, 1.97f, -2f, 3.44f, -2f)
                close()
                moveTo(13.6f, 18.67f)
                curveToRelative(0.27f, 0.75f, 0.4f, 1.53f, 0.4f, 2.33f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.57f, -0.1f, -1.13f, -0.28f, -1.67f)
                curveToRelative(-0.18f, -0.52f, 0.09f, -1.09f, 0.61f, -1.28f)
                curveToRelative(0.52f, -0.18f, 1.09f, 0.09f, 1.28f, 0.61f)
                close()
                moveTo(23.57f, 3.36f)
                lineToRelative(-3.56f, 1.89f)
                verticalLineToRelative(3.81f)
                curveToRelative(0f, 0.89f, -0.39f, 1.73f, -1.08f, 2.31f)
                lineToRelative(-4.72f, 3.94f)
                curveToRelative(-0.54f, 0.45f, -1.22f, 0.69f, -1.92f, 0.69f)
                horizontalLineToRelative(-5.28f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                horizontalLineToRelative(5.28f)
                curveToRelative(0.23f, 0f, 0.46f, -0.08f, 0.64f, -0.23f)
                lineToRelative(4.72f, -3.94f)
                curveToRelative(0.23f, -0.19f, 0.36f, -0.47f, 0.36f, -0.77f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.6f, 0f, 1.2f, 0.13f, 1.75f, 0.38f)
                lineToRelative(2.81f, 1.26f)
                curveToRelative(0.58f, 0.4f, 0.58f, 1.33f, 0f, 1.73f)
                close()
            }
        }.also { _Guide = it}
