package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailPlusCircle: ImageVector? = null

val Icons.Sr.MailPlusCircle: ImageVector
    get() = _MailPlusCircle ?: UXIcon(name = "MailPlusCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(17f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(9.88f, 14.55f)
                lineTo(0.74f, 5.41f)
                curveToRelative(0.88f, -1.44f, 2.45f, -2.41f, 4.26f, -2.41f)
                horizontalLineToRelative(7.29f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 3.16f, 2.09f, 5.83f, 4.97f, 6.7f)
                lineToRelative(-2.85f, 2.85f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                curveToRelative(-0.77f, 0f, -1.54f, -0.29f, -2.12f, -0.88f)
                close()
                moveTo(23.98f, 9.91f)
                lineToRelative(0.02f, 9.09f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 8f)
                curveToRelative(0f, -0.16f, 0.03f, -0.3f, 0.05f, -0.46f)
                lineTo(8.46f, 15.96f)
                curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.56f, -0.49f, 3.54f, -1.46f)
                lineToRelative(3.99f, -3.99f)
                curveToRelative(1.74f, -0.13f, 3.31f, -0.89f, 4.46f, -2.06f)
                close()
            }
        }.also { _MailPlusCircle = it}
