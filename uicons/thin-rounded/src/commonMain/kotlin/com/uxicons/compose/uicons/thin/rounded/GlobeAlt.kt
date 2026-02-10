package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Tr.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 16f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveTo(16.91f, 0f, 12.5f, 0f)
                reflectiveCurveTo(4.5f, 3.59f, 4.5f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                close()
                moveTo(12.5f, 1f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveTo(8.64f, 1f, 12.5f, 1f)
                close()
                moveTo(22.04f, 15.31f)
                curveToRelative(-2.3f, 2.98f, -5.78f, 4.69f, -9.54f, 4.69f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.05f)
                curveTo(5.35f, 19.44f, 0.5f, 14.28f, 0.5f, 8f)
                curveTo(0.5f, 5.13f, 1.52f, 2.35f, 3.39f, 0.17f)
                curveToRelative(0.18f, -0.21f, 0.49f, -0.23f, 0.7f, -0.06f)
                curveToRelative(0.21f, 0.18f, 0.23f, 0.49f, 0.06f, 0.7f)
                curveToRelative(-1.71f, 2.0f, -2.65f, 4.54f, -2.65f, 7.18f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                curveToRelative(3.45f, 0f, 6.64f, -1.57f, 8.75f, -4.31f)
                curveToRelative(0.17f, -0.22f, 0.48f, -0.26f, 0.7f, -0.09f)
                curveToRelative(0.22f, 0.17f, 0.26f, 0.48f, 0.09f, 0.7f)
                close()
            }
        }.also { _GlobeAlt = it}
