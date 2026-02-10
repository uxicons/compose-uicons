package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LariSign: ImageVector? = null

val Icons.Rr.LariSign: ImageVector
    get() = _LariSign ?: UXIcon(name = "LariSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.68f)
                curveToRelative(-2.83f, -1.99f, -4.68f, -5.28f, -4.68f, -9f)
                curveTo(1f, 7.97f, 4.39f, 3.72f, 9f, 2.42f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.05f)
                curveToRelative(0.33f, -0.03f, 0.66f, -0.05f, 1f, -0.05f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1f, 0.05f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.42f)
                curveToRelative(4.61f, 1.31f, 8f, 5.56f, 8f, 10.58f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.91f, -2.51f, -7.25f, -6f, -8.49f)
                verticalLineToRelative(6.49f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(4.06f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1f, -0.06f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1f, 0.06f)
                verticalLineToRelative(6.94f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(4.51f)
                curveToRelative(-3.49f, 1.24f, -6f, 4.57f, -6f, 8.49f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _LariSign = it}
