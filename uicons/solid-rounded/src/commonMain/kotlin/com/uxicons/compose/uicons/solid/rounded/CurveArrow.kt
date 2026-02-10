package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveArrow: ImageVector? = null

val Icons.Sr.CurveArrow: ImageVector
    get() = _CurveArrow ?: UXIcon(name = "CurveArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.69f, 19.26f)
                lineToRelative(-2.4f, -2.4f)
                curveToRelative(-0.48f, -0.48f, -1.3f, -0.14f, -1.3f, 0.54f)
                verticalLineToRelative(1.42f)
                curveToRelative(-0.8f, -0.48f, -1.59f, -1.96f, -2.26f, -3.21f)
                curveToRelative(-0.99f, -1.86f, -1.68f, -3.62f, -3.24f, -3.62f)
                reflectiveCurveToRelative(-2.25f, 1.76f, -3.24f, 3.62f)
                curveToRelative(-0.8f, 1.51f, -1.8f, 3.38f, -2.76f, 3.38f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(0.82f, -0.85f, 1.59f, -2f)
                curveToRelative(0.28f, -0.38f, 1.07f, -1.7f, 1.4f, -2.32f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(1.11f, -2.08f, 2.24f, -4.68f, 5.01f, -4.68f)
                curveToRelative(0.48f, 0f, 1.16f, 0.08f, 1.56f, 0.22f)
                curveToRelative(-1.18f, -3.9f, -2.22f, -6.22f, -4.06f, -6.22f)
                curveToRelative(-2.21f, 0f, -3.26f, 3.32f, -4.79f, 8.74f)
                curveToRelative(-0.42f, 1.49f, -1.41f, 3.46f, -2.21f, 4.8f)
                verticalLineTo(4f)
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
            }
        }.also { _CurveArrow = it}
