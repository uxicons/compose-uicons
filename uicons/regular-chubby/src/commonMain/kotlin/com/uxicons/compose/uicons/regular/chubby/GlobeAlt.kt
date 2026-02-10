package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Rc.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.74f, 15.2f)
                curveToRelative(3.07f, 0f, 7.14f, -0.74f, 7.14f, -7.1f)
                reflectiveCurveTo(15.81f, 1.0f, 12.74f, 1.0f)
                reflectiveCurveToRelative(-7.14f, 0.74f, -7.14f, 7.1f)
                reflectiveCurveToRelative(4.08f, 7.1f, 7.14f, 7.1f)
                close()
                moveTo(12.74f, 3.0f)
                curveToRelative(3.17f, 0f, 5.14f, 0.85f, 5.14f, 5.1f)
                reflectiveCurveToRelative(-1.97f, 5.1f, -5.14f, 5.1f)
                reflectiveCurveToRelative(-5.14f, -0.85f, -5.14f, -5.1f)
                reflectiveCurveToRelative(1.97f, -5.1f, 5.14f, -5.1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 13.33f)
                curveToRelative(-0.47f, -0.28f, -1.09f, -0.13f, -1.37f, 0.34f)
                curveToRelative(-1.47f, 2.45f, -4.16f, 3.69f, -7.99f, 3.69f)
                curveToRelative(-7.71f, 0f, -9.33f, -5.04f, -9.33f, -9.26f)
                curveToRelative(0f, -1.53f, 0.23f, -3.74f, 1.35f, -5.58f)
                curveToRelative(0.29f, -0.47f, 0.13f, -1.09f, -0.34f, -1.37f)
                curveToRelative(-0.47f, -0.28f, -1.09f, -0.13f, -1.37f, 0.34f)
                curveToRelative(-1.35f, 2.24f, -1.64f, 4.83f, -1.64f, 6.62f)
                curveToRelative(0f, 3.27f, 1.03f, 10.73f, 10.33f, 11.23f)
                verticalLineToRelative(1.67f)
                horizontalLineTo(7.43f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10.62f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.31f)
                verticalLineToRelative(-1.67f)
                curveToRelative(4.06f, -0.22f, 6.99f, -1.77f, 8.7f, -4.64f)
                curveToRelative(0.28f, -0.47f, 0.13f, -1.09f, -0.34f, -1.37f)
                close()
            }
        }.also { _GlobeAlt = it}
