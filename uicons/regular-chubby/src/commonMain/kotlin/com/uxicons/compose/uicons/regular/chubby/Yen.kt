package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yen: ImageVector? = null

val Icons.Rc.Yen: ImageVector
    get() = _Yen ?: UXIcon(name = "Yen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.08f, 2.13f)
                curveToRelative(0.07f, -0.55f, -0.31f, -1.05f, -0.86f, -1.12f)
                curveToRelative(-0.55f, -0.08f, -1.05f, 0.31f, -1.13f, 0.86f)
                curveToRelative(-0.01f, 0.09f, -1.25f, 8.74f, -7.09f, 10.12f)
                curveTo(6.18f, 10.61f, 4.92f, 1.95f, 4.91f, 1.86f)
                curveToRelative(-0.08f, -0.55f, -0.58f, -0.93f, -1.13f, -0.85f)
                curveToRelative(-0.55f, 0.07f, -0.93f, 0.58f, -0.85f, 1.12f)
                curveToRelative(0.05f, 0.34f, 0.96f, 6.66f, 5.03f, 10.01f)
                horizontalLineToRelative(-1.53f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.57f)
                verticalLineToRelative(1.77f)
                horizontalLineTo(6.43f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.57f)
                verticalLineToRelative(4.08f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.08f)
                horizontalLineToRelative(4.57f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.57f)
                verticalLineToRelative(-1.77f)
                horizontalLineToRelative(4.57f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.53f)
                curveToRelative(4.07f, -3.35f, 4.98f, -9.68f, 5.03f, -10.01f)
                close()
            }
        }.also { _Yen = it}
