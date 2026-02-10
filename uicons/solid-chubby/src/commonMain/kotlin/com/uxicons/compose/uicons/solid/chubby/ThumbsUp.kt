package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThumbsUp: ImageVector? = null

val Icons.Sc.ThumbsUp: ImageVector
    get() = _ThumbsUp ?: UXIcon(name = "ThumbsUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.35f, 19.55f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-1.67f, 0f, -3.11f, -1.26f, -3.34f, -2.93f)
                curveToRelative(-0.13f, -0.94f, -0.2f, -2f, -0.2f, -3.15f)
                reflectiveCurveToRelative(0.07f, -2.13f, 0.21f, -3.07f)
                curveToRelative(0.24f, -1.63f, 1.67f, -2.86f, 3.33f, -2.86f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(12.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.23f, 22.63f)
                curveToRelative(-1.78f, 0.6f, -5.4f, 0.35f, -7.97f, 0.04f)
                curveToRelative(-2.09f, -0.25f, -3.51f, -1.42f, -3.9f, -3.13f)
                verticalLineTo(5.32f)
                reflectiveCurveToRelative(0.1f, -1.03f, 0.1f, -1.03f)
                curveToRelative(0.19f, -1.87f, 1.75f, -3.29f, 3.64f, -3.29f)
                curveToRelative(1.04f, 0f, 2.03f, 0.44f, 2.72f, 1.22f)
                curveToRelative(0.69f, 0.77f, 1.02f, 1.81f, 0.91f, 2.84f)
                lineToRelative(-0.2f, 1.82f)
                curveToRelative(1.66f, -0.17f, 4.32f, -0.32f, 5.49f, 0.24f)
                curveToRelative(2.53f, 1.21f, 2.87f, 4.57f, 2.87f, 7.7f)
                curveToRelative(0f, 4.56f, -1.13f, 6.97f, -3.66f, 7.82f)
                close()
            }
        }.also { _ThumbsUp = it}
