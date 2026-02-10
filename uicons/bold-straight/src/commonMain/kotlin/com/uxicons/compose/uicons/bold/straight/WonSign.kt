package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WonSign: ImageVector? = null

val Icons.Bs.WonSign: ImageVector
    get() = _WonSign ?: UXIcon(name = "WonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                horizontalLineToRelative(-3.05f)
                reflectiveCurveToRelative(-2.03f, 12f, -2.03f, 12f)
                horizontalLineToRelative(-4.32f)
                lineToRelative(-2.6f, -8f)
                lineToRelative(-2.6f, 8f)
                lineTo(5.08f, 12f)
                lineTo(3.04f, 0f)
                lineTo(0f, 0f)
                lineTo(2.04f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(3f)
                lineTo(2.55f, 15f)
                lineToRelative(1.11f, 6.54f)
                curveToRelative(0.32f, 1.47f, 1.48f, 2.46f, 2.87f, 2.46f)
                reflectiveCurveToRelative(2.44f, -0.83f, 2.87f, -2.23f)
                lineToRelative(2.27f, -6.77f)
                horizontalLineToRelative(0.67f)
                lineToRelative(2.29f, 6.84f)
                curveToRelative(0.32f, 1.29f, 1.46f, 2.16f, 2.85f, 2.16f)
                reflectiveCurveToRelative(2.54f, -0.99f, 2.87f, -2.48f)
                lineToRelative(1.11f, -6.52f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.04f)
                lineTo(24f, 0f)
                close()
                moveTo(6.56f, 20.75f)
                lineToRelative(-0.98f, -5.75f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-1.87f, 5.75f)
                close()
                moveTo(17.44f, 20.74f)
                lineToRelative(-1.87f, -5.74f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-0.97f, 5.74f)
                close()
            }
        }.also { _WonSign = it}
