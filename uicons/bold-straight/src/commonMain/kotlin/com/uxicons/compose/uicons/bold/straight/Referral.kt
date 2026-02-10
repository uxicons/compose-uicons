package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referral: ImageVector? = null

val Icons.Bs.Referral: ImageVector
    get() = _Referral ?: UXIcon(name = "Referral") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.5f, 3f)
                curveTo(1.5f, 1.34f, 2.84f, 0f, 4.5f, 0f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(19.5f, 6f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
                moveTo(3f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20.13f, 14.81f)
                curveToRelative(-0.35f, -0.35f, -0.91f, -0.35f, -1.26f, 0f)
                lineToRelative(-3.37f, 3.29f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.94f)
                lineTo(6f, 21.05f)
                verticalLineToRelative(-6.05f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.41f, 1.14f, 2.55f, 2.55f, 2.55f)
                horizontalLineToRelative(12.9f)
                curveToRelative(1.41f, 0f, 2.55f, -1.14f, 2.55f, -2.55f)
                verticalLineToRelative(-3.4f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.37f, -3.29f)
                close()
                moveTo(21.5f, 8f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _Referral = it}
