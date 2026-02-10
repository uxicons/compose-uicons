package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsightHead: ImageVector? = null

val Icons.Ss.InsightHead: ImageVector
    get() = _InsightHead ?: UXIcon(name = "InsightHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 20.41f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-1.5f, 0f, -2.78f, -1.12f, -2.97f, -2.61f)
                lineToRelative(-0.45f, -3.39f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2.21f)
                lineToRelative(0.72f, -1.65f)
                curveToRelative(1.18f, -2.71f, 2.29f, -5.26f, 3.48f, -6.72f)
                curveTo(6.64f, 1.16f, 10.51f, -0.45f, 14.55f, 0.11f)
                curveToRelative(5.0f, 0.69f, 8.95f, 4.84f, 9.41f, 9.88f)
                curveToRelative(0.27f, 2.94f, -0.62f, 5.79f, -2.5f, 8.04f)
                curveToRelative(-0.0f, 0.0f, -0.0f, 0.01f, -0.01f, 0.01f)
                lineToRelative(-3.57f, -3.57f)
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
