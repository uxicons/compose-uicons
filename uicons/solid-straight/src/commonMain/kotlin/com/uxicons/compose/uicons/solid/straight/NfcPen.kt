package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcPen: ImageVector? = null

val Icons.Ss.NfcPen: ImageVector
    get() = _NfcPen ?: UXIcon(name = "NfcPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.05f)
                curveToRelative(-0.18f, -0.02f, -0.36f, -0.05f, -0.54f, -0.05f)
                curveToRelative(-0.89f, 0f, -1.73f, 0.26f, -2.46f, 0.73f)
                lineTo(19f, 3f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                lineTo(10f, 7.41f)
                lineToRelative(2.41f, -2.41f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(7.58f)
                lineToRelative(-4.42f, 4.42f)
                lineTo(5f, 17f)
                lineTo(5f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3f, 3f)
                lineTo(3f, 19f)
                close()
                moveTo(23.26f, 12.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-7.67f, 7.67f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.8f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
            }
        }.also { _NfcPen = it}
