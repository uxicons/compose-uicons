package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailPlusCircle: ImageVector? = null

val Icons.Ts.MailPlusCircle: ImageVector
    get() = _MailPlusCircle ?: UXIcon(name = "MailPlusCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 11f)
                curveToRelative(1.47f, 0f, 2.85f, -0.57f, 3.89f, -1.61f)
                curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
                reflectiveCurveToRelative(-0.57f, -2.85f, -1.61f, -3.89f)
                curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
                reflectiveCurveToRelative(-2.85f, 0.57f, -3.89f, 1.61f)
                curveToRelative(-1.04f, 1.04f, -1.61f, 2.42f, -1.61f, 3.89f)
                reflectiveCurveToRelative(0.57f, 2.85f, 1.61f, 3.89f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                close()
                moveTo(15.32f, 2.32f)
                curveToRelative(0.85f, -0.85f, 1.98f, -1.32f, 3.18f, -1.32f)
                reflectiveCurveToRelative(2.33f, 0.47f, 3.18f, 1.32f)
                curveToRelative(0.85f, 0.85f, 1.32f, 1.98f, 1.32f, 3.18f)
                reflectiveCurveToRelative(-0.47f, 2.33f, -1.32f, 3.18f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                curveToRelative(-0.85f, -0.85f, -1.32f, -1.98f, -1.32f, -3.18f)
                reflectiveCurveToRelative(0.47f, -2.33f, 1.32f, -3.18f)
                close()
                moveTo(23f, 11.49f)
                curveToRelative(0.36f, -0.27f, 0.69f, -0.57f, 1f, -0.9f)
                verticalLineToRelative(13.41f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(11f, 4f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.53f, 0f, -1f, 0.28f, -1.27f, 0.7f)
                lineTo(9.51f, 13.97f)
                curveToRelative(1.36f, 1.36f, 3.58f, 1.37f, 4.95f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(1.41f, -1.46f, 1.41f, -1.46f)
                curveToRelative(0.35f, 0.13f, 0.71f, 0.24f, 1.08f, 0.32f)
                lineToRelative(-1.79f, 1.84f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.88f, 0.88f, -2.03f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.31f, -0.44f, -3.18f, -1.32f)
                lineTo(1f, 6.88f)
                lineTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 11.49f)
                close()
                moveTo(18f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                lineTo(18f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _MailPlusCircle = it}
