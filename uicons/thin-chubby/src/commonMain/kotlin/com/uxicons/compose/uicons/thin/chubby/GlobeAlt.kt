package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Tc.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.76f, 15.67f)
                curveToRelative(3.44f, 0f, 7.39f, -0.83f, 7.39f, -7.33f)
                reflectiveCurveTo(16.19f, 1f, 12.76f, 1f)
                reflectiveCurveToRelative(-7.39f, 0.83f, -7.39f, 7.33f)
                reflectiveCurveToRelative(3.95f, 7.33f, 7.39f, 7.33f)
                close()
                moveTo(12.76f, 2f)
                curveToRelative(3.83f, 0f, 6.39f, 1.08f, 6.39f, 6.33f)
                curveToRelative(0f, 4.5f, -1.85f, 6.33f, -6.39f, 6.33f)
                curveToRelative(-3.83f, 0f, -6.39f, -1.08f, -6.39f, -6.33f)
                curveToRelative(0f, -4.5f, 1.85f, -6.33f, 6.39f, -6.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.04f, 14.1f)
                curveToRelative(-0.23f, -0.14f, -0.54f, -0.07f, -0.69f, 0.17f)
                curveToRelative(-1.6f, 2.67f, -4.49f, 4.02f, -8.6f, 4.02f)
                curveToRelative(-8.3f, 0f, -10.04f, -5.42f, -10.04f, -9.96f)
                curveToRelative(0f, -1.62f, 0.25f, -3.98f, 1.45f, -5.96f)
                curveToRelative(0.14f, -0.24f, 0.07f, -0.54f, -0.17f, -0.69f)
                curveToRelative(-0.24f, -0.14f, -0.55f, -0.07f, -0.69f, 0.17f)
                curveToRelative(-1.32f, 2.18f, -1.59f, 4.73f, -1.59f, 6.48f)
                curveToRelative(0f, 4.02f, 1.38f, 10.72f, 10.54f, 10.95f)
                verticalLineToRelative(2.72f)
                horizontalLineTo(7.34f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(10.83f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.92f)
                verticalLineToRelative(-2.72f)
                curveToRelative(4.22f, -0.11f, 7.23f, -1.62f, 8.96f, -4.5f)
                curveToRelative(0.14f, -0.24f, 0.07f, -0.54f, -0.17f, -0.69f)
                close()
            }
        }.also { _GlobeAlt = it}
