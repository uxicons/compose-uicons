package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Keynote: ImageVector? = null

val Icons.Sr.Keynote: ImageVector
    get() = _Keynote ?: UXIcon(name = "Keynote") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16f)
                horizontalLineToRelative(-0.28f)
                lineToRelative(-0.86f, -2.58f)
                curveToRelative(-0.68f, -2.04f, -2.59f, -3.42f, -4.74f, -3.42f)
                horizontalLineTo(6.88f)
                curveToRelative(-0.3f, 0f, -0.59f, 0.03f, -0.88f, 0.08f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.17f)
                curveToRelative(0.41f, 1.16f, 1.52f, 2f, 2.83f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3.91f)
                curveToRelative(-0.85f, 0.6f, -1.51f, 1.47f, -1.86f, 2.5f)
                lineToRelative(-0.86f, 2.58f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.97f)
                curveToRelative(0.02f, 0f, 0.04f, 0f, 0.06f, 0f)
                horizontalLineTo(11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Keynote = it}
