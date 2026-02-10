package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Underline: ImageVector? = null

val Icons.Tc.Underline: ImageVector
    get() = _Underline ?: UXIcon(name = "Underline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.36f, 22f)
                horizontalLineTo(2.64f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(21.36f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.85f)
                curveToRelative(6.15f, 0f, 8.13f, -3.38f, 8.13f, -13.91f)
                curveToRelative(0f, -1.66f, -0.07f, -3.17f, -0.22f, -4.49f)
                curveToRelative(-0.03f, -0.28f, -0.29f, -0.47f, -0.55f, -0.44f)
                curveToRelative(-0.28f, 0.03f, -0.47f, 0.28f, -0.44f, 0.55f)
                curveToRelative(0.14f, 1.29f, 0.21f, 2.77f, 0.21f, 4.39f)
                curveToRelative(0f, 10.98f, -2.3f, 12.91f, -7.13f, 12.91f)
                reflectiveCurveToRelative(-7.13f, -1.93f, -7.13f, -12.91f)
                curveToRelative(0f, -1.61f, 0.07f, -3.09f, 0.21f, -4.39f)
                curveToRelative(0.03f, -0.27f, -0.17f, -0.52f, -0.44f, -0.55f)
                curveToRelative(-0.28f, -0.03f, -0.52f, 0.17f, -0.55f, 0.44f)
                curveToRelative(-0.15f, 1.33f, -0.22f, 2.84f, -0.22f, 4.5f)
                curveToRelative(0f, 10.4f, 2.05f, 13.91f, 8.13f, 13.91f)
                close()
            }
        }.also { _Underline = it}
