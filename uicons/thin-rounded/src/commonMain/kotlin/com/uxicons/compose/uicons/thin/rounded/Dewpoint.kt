package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Tr.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                curveToRelative(-2.67f, 0f, -5.18f, -1.04f, -7.07f, -2.93f)
                reflectiveCurveTo(0f, 16.67f, 0f, 14f)
                curveTo(0f, 8.58f, 6.71f, 1.65f, 7.0f, 1.36f)
                curveToRelative(0.74f, -0.86f, 1.84f, -1.36f, 3.0f, -1.36f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.16f, 0f, 2.27f, 0.51f, 3.03f, 1.39f)
                curveToRelative(0.26f, 0.27f, 6.96f, 7.19f, 6.96f, 12.61f)
                curveToRelative(0f, 2.67f, -1.04f, 5.18f, -2.93f, 7.07f)
                curveToRelative(-1.89f, 1.89f, -4.4f, 2.93f, -7.07f, 2.93f)
                close()
                moveTo(10.01f, 1f)
                curveToRelative(-0.87f, 0f, -1.7f, 0.38f, -2.27f, 1.04f)
                curveToRelative(-0.09f, 0.09f, -6.74f, 6.95f, -6.74f, 11.96f)
                curveToRelative(0f, 2.4f, 0.94f, 4.66f, 2.64f, 6.36f)
                curveToRelative(1.7f, 1.7f, 3.96f, 2.64f, 6.36f, 2.64f)
                reflectiveCurveToRelative(4.66f, -0.94f, 6.36f, -2.64f)
                reflectiveCurveToRelative(2.64f, -3.96f, 2.64f, -6.37f)
                curveToRelative(0f, -5.01f, -6.63f, -11.87f, -6.7f, -11.94f)
                curveToRelative(-0.59f, -0.68f, -1.42f, -1.06f, -2.29f, -1.06f)
                horizontalLineToRelative(0f)
                close()
                moveTo(21.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(21.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Dewpoint = it}
