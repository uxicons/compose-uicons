package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveArrow: ImageVector? = null

val Icons.Rr.CurveArrow: ImageVector
    get() = _CurveArrow ?: UXIcon(name = "CurveArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.69f, 19.26f)
                lineToRelative(-2.4f, -2.4f)
                curveToRelative(-0.48f, -0.48f, -1.3f, -0.14f, -1.3f, 0.54f)
                verticalLineToRelative(1.42f)
                curveToRelative(-0.8f, -0.48f, -1.59f, -1.96f, -2.26f, -3.21f)
                curveToRelative(-0.99f, -1.86f, -1.93f, -3.62f, -3.49f, -3.62f)
                reflectiveCurveToRelative(-2.5f, 1.76f, -3.49f, 3.62f)
                curveToRelative(-0.8f, 1.51f, -1.8f, 3.38f, -2.76f, 3.38f)
                horizontalLineToRelative(-0.76f)
                curveToRelative(0.67f, -1.39f, 1.25f, -3.44f, 1.89f, -5.72f)
                curveToRelative(0.69f, -2.45f, 1.98f, -7.01f, 2.85f, -7.29f)
                curveToRelative(0.07f, 0.02f, 0.68f, 0.28f, 1.7f, 3.32f)
                curveToRelative(0.18f, 0.52f, 0.74f, 0.8f, 1.27f, 0.63f)
                curveToRelative(0.52f, -0.18f, 0.81f, -0.74f, 0.63f, -1.27f)
                curveToRelative(-0.82f, -2.43f, -1.82f, -4.68f, -3.58f, -4.68f)
                curveToRelative(-2.21f, 0f, -3.26f, 3.32f, -4.79f, 8.74f)
                curveToRelative(-0.57f, 2.0f, -1.19f, 4.21f, -1.8f, 5.45f)
                curveToRelative(-0.25f, -0.33f, -0.4f, -0.74f, -0.4f, -1.19f)
                lineTo(5.0f, 4f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.68f, 0f, 1.02f, -0.82f, 0.54f, -1.3f)
                lineTo(4.7f, 0.31f)
                curveToRelative(-0.41f, -0.41f, -1.07f, -0.41f, -1.48f, 0f)
                lineTo(0.83f, 2.7f)
                curveToRelative(-0.48f, 0.48f, -0.14f, 1.3f, 0.54f, 1.3f)
                horizontalLineToRelative(1.64f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(1.6f)
                curveToRelative(0f, 0.68f, 0.82f, 1.02f, 1.3f, 0.54f)
                lineToRelative(2.4f, -2.4f)
                curveToRelative(0.41f, -0.41f, 0.41f, -1.07f, 0f, -1.48f)
                close()
                moveTo(12.52f, 16.56f)
                curveToRelative(0.46f, -0.86f, 1.31f, -2.47f, 1.72f, -2.56f)
                curveToRelative(0.42f, 0.09f, 1.28f, 1.69f, 1.74f, 2.56f)
                curveToRelative(0.44f, 0.83f, 0.91f, 1.69f, 1.44f, 2.44f)
                horizontalLineToRelative(-6.34f)
                curveToRelative(0.53f, -0.75f, 1.0f, -1.62f, 1.44f, -2.44f)
                close()
            }
        }.also { _CurveArrow = it}
