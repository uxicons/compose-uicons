package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromDottedLine: ImageVector? = null

val Icons.Rc.ArrowDownFromDottedLine: ImageVector
    get() = _ArrowDownFromDottedLine ?: UXIcon(name = "ArrowDownFromDottedLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(14f, 3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(18f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(6f, 3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(2f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.55f, 15.16f)
                curveToRelative(-0.46f, -0.3f, -1.08f, -0.17f, -1.39f, 0.29f)
                curveToRelative(-1.17f, 1.79f, -2.57f, 3.31f, -4.16f, 4.58f)
                verticalLineToRelative(-14.03f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14.03f)
                curveToRelative(-1.59f, -1.27f, -2.99f, -2.79f, -4.16f, -4.58f)
                curveToRelative(-0.3f, -0.46f, -0.92f, -0.59f, -1.38f, -0.29f)
                curveToRelative(-0.46f, 0.3f, -0.59f, 0.92f, -0.29f, 1.39f)
                curveToRelative(1.69f, 2.59f, 3.81f, 4.7f, 6.3f, 6.29f)
                curveToRelative(0.33f, 0.21f, 0.75f, 0.21f, 1.08f, 0f)
                curveToRelative(2.49f, -1.59f, 4.61f, -3.71f, 6.3f, -6.29f)
                curveToRelative(0.3f, -0.46f, 0.17f, -1.08f, -0.29f, -1.39f)
                close()
            }
        }.also { _ArrowDownFromDottedLine = it}
