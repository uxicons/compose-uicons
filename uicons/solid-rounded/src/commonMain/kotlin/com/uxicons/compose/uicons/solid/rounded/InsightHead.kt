package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsightHead: ImageVector? = null

val Icons.Sr.InsightHead: ImageVector
    get() = _InsightHead ?: UXIcon(name = "InsightHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 20.41f)
                verticalLineToRelative(0.59f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(-2.5f, 0f, -4.63f, -1.87f, -4.96f, -4.34f)
                lineToRelative(-0.22f, -1.66f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-1.3f, 0f, -2f, -1.03f, -2f, -2f)
                curveToRelative(0f, -1.42f, 2.93f, -7.01f, 4.2f, -8.58f)
                curveTo(6.64f, 1.16f, 10.51f, -0.45f, 14.55f, 0.11f)
                curveToRelative(5.0f, 0.69f, 8.95f, 4.84f, 9.41f, 9.88f)
                curveToRelative(0.25f, 2.77f, -0.54f, 5.5f, -2.21f, 7.69f)
                curveToRelative(-0.09f, 0.12f, -0.17f, 0.26f, -0.25f, 0.4f)
                lineToRelative(-3.6f, -3.6f)
                curveToRelative(0.7f, -0.98f, 1.11f, -2.18f, 1.11f, -3.47f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.29f, 0f, 2.49f, -0.42f, 3.47f, -1.11f)
                lineToRelative(4.53f, 4.53f)
                close()
                moveTo(13f, 7f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _InsightHead = it}
