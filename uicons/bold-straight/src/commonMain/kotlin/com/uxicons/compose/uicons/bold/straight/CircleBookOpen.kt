package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookOpen: ImageVector? = null

val Icons.Bs.CircleBookOpen: ImageVector
    get() = _CircleBookOpen ?: UXIcon(name = "CircleBookOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 9.42f)
                verticalLineToRelative(7.58f)
                lineToRelative(-5f, -1.43f)
                verticalLineToRelative(-6.84f)
                curveToRelative(0f, -1.15f, 1.1f, -1.98f, 2.21f, -1.66f)
                lineToRelative(1.32f, 0.38f)
                curveToRelative(0.88f, 0.25f, 1.48f, 1.05f, 1.48f, 1.97f)
                close()
                moveTo(15.79f, 7.07f)
                lineToRelative(-1.32f, 0.38f)
                curveToRelative(-0.88f, 0.25f, -1.48f, 1.05f, -1.48f, 1.97f)
                verticalLineToRelative(7.58f)
                lineToRelative(5f, -1.43f)
                verticalLineToRelative(-6.84f)
                curveToRelative(0f, -1.15f, -1.1f, -1.98f, -2.21f, -1.66f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _CircleBookOpen = it}
