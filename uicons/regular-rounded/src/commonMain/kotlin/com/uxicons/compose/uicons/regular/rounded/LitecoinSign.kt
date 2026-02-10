package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LitecoinSign: ImageVector? = null

val Icons.Rr.LitecoinSign: ImageVector
    get() = _LitecoinSign ?: UXIcon(name = "LitecoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(9f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.01f)
                lineToRelative(-2.66f, 0.95f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0f, -0.8f, -0.25f, -0.94f, -0.66f)
                curveToRelative(-0.19f, -0.52f, 0.09f, -1.09f, 0.61f, -1.28f)
                lineToRelative(3.34f, -1.19f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(10.15f)
                lineToRelative(8.66f, -3.09f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.08f, 1.28f, 0.61f)
                curveToRelative(0.19f, 0.52f, -0.09f, 1.09f, -0.61f, 1.28f)
                lineToRelative(-9.34f, 3.33f)
                verticalLineToRelative(6.72f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _LitecoinSign = it}
