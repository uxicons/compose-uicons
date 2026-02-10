package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleUser: ImageVector? = null

val Icons.Sc.CircleUser: ImageVector
    get() = _CircleUser ?: UXIcon(name = "CircleUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 22.49f)
                curveToRelative(-1.29f, 0.34f, -2.78f, 0.51f, -4.5f, 0.51f)
                reflectiveCurveToRelative(-3.21f, -0.17f, -4.5f, -0.51f)
                curveToRelative(0.0f, -3.35f, 1.14f, -4.49f, 4.5f, -4.49f)
                reflectiveCurveToRelative(4.5f, 1.13f, 4.5f, 4.49f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-1.59f, 0f, -2f, 0.41f, -2f, 2f)
                reflectiveCurveToRelative(0.41f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.41f, 2f, -2f)
                reflectiveCurveToRelative(-0.41f, -2f, -2f, -2f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 5.03f, -1.41f, 8.16f, -4.52f, 9.75f)
                curveToRelative(-0.22f, -3.96f, -2.24f, -5.75f, -6.48f, -5.75f)
                reflectiveCurveToRelative(-6.26f, 1.78f, -6.48f, 5.75f)
                curveToRelative(-3.11f, -1.58f, -4.52f, -4.72f, -4.52f, -9.75f)
                curveToRelative(0f, -7.71f, 3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(16f, 10f)
                curveToRelative(0f, -2.69f, -1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                close()
            }
        }.also { _CircleUser = it}
