package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mailbox: ImageVector? = null

val Icons.Rr.Mailbox: ImageVector
    get() = _Mailbox ?: UXIcon(name = "Mailbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                lineTo(6f, 3f)
                curveTo(2.69f, 3f, 0f, 5.69f, 0f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 21f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 9f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(2f, 18f)
                lineTo(2f, 9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(11.83f, 19f)
                curveToRelative(0.11f, -0.31f, 0.17f, -0.65f, 0.17f, -1f)
                lineTo(12f, 9f)
                curveToRelative(0f, -1.53f, -0.58f, -2.94f, -1.53f, -4f)
                horizontalLineToRelative(7.53f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(9f)
                close()
                moveTo(20f, 10f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Mailbox = it}
