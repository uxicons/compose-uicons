package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromDottedLine: ImageVector? = null

val Icons.Rc.ArrowUpFromDottedLine: ImageVector
    get() = _ArrowUpFromDottedLine ?: UXIcon(name = "ArrowUpFromDottedLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(6f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(2f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(13f, 3.97f)
                curveToRelative(1.59f, 1.27f, 2.99f, 2.79f, 4.16f, 4.58f)
                curveToRelative(0.3f, 0.47f, 0.93f, 0.59f, 1.38f, 0.29f)
                curveToRelative(0.46f, -0.3f, 0.59f, -0.92f, 0.29f, -1.39f)
                curveToRelative(-1.69f, -2.59f, -3.81f, -4.7f, -6.3f, -6.29f)
                curveToRelative(-0.33f, -0.21f, -0.75f, -0.21f, -1.08f, 0f)
                curveToRelative(-2.49f, 1.59f, -4.61f, 3.71f, -6.3f, 6.29f)
                curveToRelative(-0.3f, 0.46f, -0.17f, 1.08f, 0.29f, 1.39f)
                curveToRelative(0.46f, 0.3f, 1.08f, 0.17f, 1.38f, -0.29f)
                curveToRelative(1.17f, -1.79f, 2.57f, -3.31f, 4.16f, -4.58f)
                verticalLineToRelative(14.03f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-14.03f)
                close()
            }
        }.also { _ArrowUpFromDottedLine = it}
