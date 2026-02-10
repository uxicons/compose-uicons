package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gavel: ImageVector? = null

val Icons.Tr.Gavel: ImageVector
    get() = _Gavel ?: UXIcon(name = "Gavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.86f, 10.65f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-0.9f, 0.9f)
                lineTo(12.46f, 1.76f)
                lineToRelative(0.9f, -0.9f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineTo(4.66f, 8.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(0.93f, -0.93f)
                lineToRelative(4.54f, 4.54f)
                lineTo(0.15f, 23.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineTo(11.54f, 13.18f)
                lineToRelative(4.54f, 4.54f)
                lineToRelative(-0.93f, 0.93f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(8f, -8f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(14.12f, 14.34f)
                lineToRelative(-2.22f, -2.22f)
                lineToRelative(-0.0f, -0.0f)
                lineToRelative(-0.0f, -0.0f)
                lineToRelative(-2.15f, -2.15f)
                lineToRelative(4.75f, -4.75f)
                lineToRelative(4.38f, 4.38f)
                curveToRelative(-0.84f, 0.84f, -3.74f, 3.74f, -4.75f, 4.75f)
                close()
                moveTo(11.75f, 2.47f)
                lineToRelative(2.03f, 2.03f)
                lineToRelative(-4.75f, 4.75f)
                lineToRelative(-2.03f, -2.03f)
                lineTo(11.75f, 2.47f)
                close()
                moveTo(14.83f, 15.05f)
                curveToRelative(1.01f, -1.01f, 3.91f, -3.91f, 4.75f, -4.75f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(-4.75f, 4.75f)
                lineToRelative(-1.96f, -1.96f)
                close()
            }
        }.also { _Gavel = it}
