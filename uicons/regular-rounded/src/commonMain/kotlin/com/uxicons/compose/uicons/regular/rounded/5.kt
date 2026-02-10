package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rr5: ImageVector? = null

val Icons.Rr.Rr5: ImageVector
    get() = _Rr5 ?: UXIcon(name = "Rr5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 24f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.5f, 0f, 2.9f, -0.59f, 3.95f, -1.67f)
                reflectiveCurveToRelative(1.6f, -2.5f, 1.55f, -4f)
                curveToRelative(-0.09f, -2.94f, -2.68f, -5.33f, -5.77f, -5.33f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(4f)
                curveTo(4f, 1.79f, 5.79f, 0f, 8f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6.23f)
                curveToRelative(4.16f, 0f, 7.65f, 3.26f, 7.77f, 7.27f)
                curveToRelative(0.06f, 2.05f, -0.69f, 3.98f, -2.11f, 5.45f)
                curveToRelative(-1.43f, 1.47f, -3.34f, 2.28f, -5.38f, 2.28f)
                close()
            }
        }.also { _Rr5 = it}
