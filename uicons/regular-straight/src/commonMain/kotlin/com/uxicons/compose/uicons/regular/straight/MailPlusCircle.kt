package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailPlusCircle: ImageVector? = null

val Icons.Rs.MailPlusCircle: ImageVector
    get() = _MailPlusCircle ?: UXIcon(name = "MailPlusCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(18f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(17f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 12.92f)
                curveToRelative(0.75f, -0.44f, 1.43f, -0.99f, 2f, -1.64f)
                verticalLineToRelative(12.72f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.59f)
                curveToRelative(-0.26f, 0.63f, -0.43f, 1.3f, -0.52f, 2f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(0.76f, -0.76f)
                curveToRelative(0.7f, 0.3f, 1.46f, 0.5f, 2.25f, 0.58f)
                lineToRelative(-1.59f, 1.59f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineTo(2f, 9.07f)
                verticalLineToRelative(12.93f)
                lineTo(22f, 22f)
                lineTo(22f, 12.92f)
                close()
            }
        }.also { _MailPlusCircle = it}
