package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Percentage: ImageVector? = null

val Icons.Sc.Percentage: ImageVector
    get() = _Percentage ?: UXIcon(name = "Percentage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 22.5f)
                curveToRelative(-0.38f, 0f, -0.77f, -0.15f, -1.06f, -0.44f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(18.5f, -18.5f)
                curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
                curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(-18.5f, 18.5f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                close()
                moveTo(23f, 19f)
                curveToRelative(0f, -2.62f, -1.38f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.38f, -4f, 4f)
                reflectiveCurveToRelative(1.38f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.38f, 4f, -4f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, 0.95f, -0.05f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.05f, -1f, -1f)
                reflectiveCurveToRelative(0.05f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.05f, 1f, 1f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, -2.62f, -1.38f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.38f, -4f, 4f)
                reflectiveCurveToRelative(1.38f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.38f, 4f, -4f)
                close()
                moveTo(6f, 5f)
                curveToRelative(0f, 0.95f, -0.05f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.05f, -1f, -1f)
                reflectiveCurveToRelative(0.05f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.05f, 1f, 1f)
                close()
            }
        }.also { _Percentage = it}
