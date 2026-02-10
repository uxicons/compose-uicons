package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Ts.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 20f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -2.21f, 1.27f, -4.17f, 3.24f, -5.01f)
                curveToRelative(3.07f, -1.31f, 4.77f, -4.54f, 4.12f, -7.85f)
                curveToRelative(-0.53f, -2.73f, -2.72f, -4.92f, -5.45f, -5.45f)
                curveToRelative(-2.1f, -0.41f, -4.24f, 0.12f, -5.86f, 1.46f)
                curveToRelative(-1.62f, 1.34f, -2.55f, 3.31f, -2.55f, 5.4f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -2.4f, 1.06f, -4.65f, 2.91f, -6.18f)
                curveTo(8.77f, 0.3f, 11.2f, -0.31f, 13.6f, 0.16f)
                curveToRelative(3.13f, 0.61f, 5.64f, 3.12f, 6.25f, 6.24f)
                curveToRelative(0.74f, 3.78f, -1.2f, 7.47f, -4.71f, 8.96f)
                curveToRelative(-1.6f, 0.68f, -2.63f, 2.29f, -2.63f, 4.09f)
                verticalLineToRelative(0.55f)
                close()
                moveTo(10.96f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _Question = it}
