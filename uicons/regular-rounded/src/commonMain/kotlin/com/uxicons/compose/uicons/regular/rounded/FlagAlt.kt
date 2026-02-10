package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlagAlt: ImageVector? = null

val Icons.Rr.FlagAlt: ImageVector
    get() = _FlagAlt ?: UXIcon(name = "FlagAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.36f, 7.5f)
                lineToRelative(3.24f, -4.3f)
                curveToRelative(0.46f, -0.61f, 0.53f, -1.41f, 0.19f, -2.1f)
                reflectiveCurveToRelative(-1.03f, -1.11f, -1.79f, -1.11f)
                horizontalLineTo(4f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(15f)
                horizontalLineTo(22.0f)
                curveToRelative(0.76f, 0f, 1.45f, -0.42f, 1.79f, -1.11f)
                reflectiveCurveToRelative(0.27f, -1.49f, -0.19f, -2.1f)
                lineToRelative(-3.24f, -4.3f)
                close()
                moveTo(2f, 13f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineTo(22.0f)
                lineToRelative(-3.69f, 4.9f)
                curveToRelative(-0.27f, 0.36f, -0.27f, 0.85f, 0f, 1.2f)
                lineToRelative(3.69f, 4.9f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _FlagAlt = it}
