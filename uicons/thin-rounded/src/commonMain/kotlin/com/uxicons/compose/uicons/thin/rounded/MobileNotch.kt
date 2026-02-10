package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Tr.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(20f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(14.81f, 1f)
                lineToRelative(-0.33f, 0.97f)
                curveToRelative(-0.2f, 0.61f, -0.78f, 1.03f, -1.42f, 1.03f)
                horizontalLineToRelative(-2.12f)
                curveToRelative(-0.65f, 0f, -1.22f, -0.41f, -1.42f, -1.03f)
                lineToRelative(-0.33f, -0.97f)
                horizontalLineToRelative(5.61f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(5f, 4.5f)
                curveToRelative(0f, -1.81f, 1.39f, -3.29f, 3.15f, -3.46f)
                lineToRelative(0.42f, 1.25f)
                curveToRelative(0.34f, 1.02f, 1.29f, 1.71f, 2.37f, 1.71f)
                horizontalLineToRelative(2.12f)
                curveToRelative(1.08f, 0f, 2.03f, -0.69f, 2.37f, -1.71f)
                lineToRelative(0.42f, -1.25f)
                curveToRelative(1.76f, 0.18f, 3.15f, 1.65f, 3.15f, 3.46f)
                verticalLineToRelative(15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 20f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _MobileNotch = it}
