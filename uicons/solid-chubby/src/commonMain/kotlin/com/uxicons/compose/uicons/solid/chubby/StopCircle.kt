package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StopCircle: ImageVector? = null

val Icons.Sc.StopCircle: ImageVector
    get() = _StopCircle ?: UXIcon(name = "StopCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(15.68f, 14.91f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.06f, 0.01f, -1.49f, 0.32f, -2.91f, 0.32f)
                reflectiveCurveToRelative(-2.85f, -0.31f, -2.91f, -0.32f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.01f, -0.06f, -0.32f, -1.49f, -0.32f, -2.92f)
                reflectiveCurveToRelative(0.31f, -2.85f, 0.32f, -2.92f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.06f, -0.01f, 1.49f, -0.32f, 2.91f, -0.32f)
                reflectiveCurveToRelative(2.85f, 0.31f, 2.91f, 0.32f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.01f, 0.06f, 0.32f, 1.49f, 0.32f, 2.92f)
                reflectiveCurveToRelative(-0.31f, 2.85f, -0.32f, 2.92f)
                close()
                moveTo(13.84f, 10.16f)
                curveToRelative(0.08f, 0.48f, 0.16f, 1.17f, 0.16f, 1.84f)
                reflectiveCurveToRelative(-0.08f, 1.36f, -0.16f, 1.84f)
                curveToRelative(-0.96f, 0.15f, -2.71f, 0.15f, -3.68f, 0f)
                curveToRelative(-0.08f, -0.48f, -0.16f, -1.17f, -0.16f, -1.84f)
                reflectiveCurveToRelative(0.08f, -1.36f, 0.16f, -1.84f)
                curveToRelative(0.96f, -0.15f, 2.71f, -0.15f, 3.68f, 0f)
                close()
            }
        }.also { _StopCircle = it}
