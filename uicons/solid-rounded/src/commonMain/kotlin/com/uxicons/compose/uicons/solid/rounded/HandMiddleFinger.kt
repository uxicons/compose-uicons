package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandMiddleFinger: ImageVector? = null

val Icons.Sr.HandMiddleFinger: ImageVector
    get() = _HandMiddleFinger ?: UXIcon(name = "HandMiddleFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 9.54f)
                lineToRelative(-2.46f, -0.63f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.23f)
                curveToRelative(-1.58f, -0.26f, -3.05f, 0.95f, -3.05f, 2.59f)
                verticalLineToRelative(6.69f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.79f)
                lineToRelative(-2.79f, 2.95f)
                curveToRelative(-1.7f, 1.99f, -1.59f, 4.08f, 0.25f, 5.93f)
                lineToRelative(2.4f, 2.42f)
                curveToRelative(0.94f, 0.94f, 2.22f, 1.48f, 3.55f, 1.48f)
                horizontalLineToRelative(7.59f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5.61f)
                curveToRelative(0f, -2.22f, -1.47f, -3.23f, -3.49f, -3.86f)
                close()
            }
        }.also { _HandMiddleFinger = it}
