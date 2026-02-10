package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcPen: ImageVector? = null

val Icons.Rs.NfcPen: ImageVector
    get() = _NfcPen ?: UXIcon(name = "NfcPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 11.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-7.88f, 7.88f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(21.71f, 14.71f)
                lineToRelative(-7.29f, 7.29f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(-1.41f)
                lineToRelative(7.29f, -7.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
                moveTo(11.93f, 16f)
                lineToRelative(-2f, 2f)
                lineTo(4f, 18f)
                lineTo(4f, 4f)
                horizontalLineToRelative(5.23f)
                lineToRelative(-3.23f, 3.09f)
                verticalLineToRelative(8.91f)
                horizontalLineToRelative(5.93f)
                close()
                moveTo(16f, 11.93f)
                lineTo(16f, 6f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-2.41f, 2.41f)
                verticalLineToRelative(5.59f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 7.59f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(6.03f)
                curveToRelative(-0.18f, 0.14f, -0.37f, 0.27f, -0.54f, 0.44f)
                lineToRelative(-1.46f, 1.46f)
                close()
                moveTo(2f, 20f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6.11f)
                curveToRelative(-0.66f, -0.13f, -1.34f, -0.13f, -2f, 0f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 20f)
                close()
            }
        }.also { _NfcPen = it}
