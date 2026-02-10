package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailPlusCircle: ImageVector? = null

val Icons.Bs.MailPlusCircle: ImageVector
    get() = _MailPlusCircle ?: UXIcon(name = "MailPlusCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(3f)
                lineTo(17f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 11.28f)
                verticalLineToRelative(12.72f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.09f)
                curveToRelative(-0.38f, 0.93f, -0.59f, 1.94f, -0.59f, 3f)
                lineTo(3.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.46f)
                lineToRelative(7.36f, 7.36f)
                curveToRelative(0.88f, 0.88f, 2.4f, 0.88f, 3.28f, 0f)
                lineToRelative(1.05f, -1.05f)
                curveToRelative(1.01f, 0.46f, 2.13f, 0.72f, 3.31f, 0.72f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.01f)
                lineToRelative(-2.45f, 2.45f)
                curveToRelative(-1.0f, 1.0f, -2.34f, 1.56f, -3.76f, 1.56f)
                reflectiveCurveToRelative(-2.76f, -0.55f, -3.76f, -1.56f)
                lineTo(3f, 11.2f)
                verticalLineToRelative(9.8f)
                lineTo(21f, 21f)
                verticalLineToRelative(-7.59f)
                curveToRelative(1.16f, -0.47f, 2.19f, -1.21f, 3f, -2.13f)
                close()
            }
        }.also { _MailPlusCircle = it}
