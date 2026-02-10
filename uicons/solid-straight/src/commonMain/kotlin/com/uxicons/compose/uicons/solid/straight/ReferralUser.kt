package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferralUser: ImageVector? = null

val Icons.Ss.ReferralUser: ImageVector
    get() = _ReferralUser ?: UXIcon(name = "ReferralUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 15.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(11.44f, 17.64f)
                curveToRelative(0.36f, 0.36f, 0.56f, 0.85f, 0.56f, 1.37f)
                curveToRelative(0f, 0.52f, -0.2f, 1.01f, -0.57f, 1.37f)
                lineToRelative(-3.48f, 3.56f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(2.48f, -2.54f)
                lineTo(3f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(3f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.05f)
                lineToRelative(-2.53f, -2.54f)
                lineToRelative(1.43f, -1.4f)
                lineToRelative(3.49f, 3.57f)
                close()
            }
        }.also { _ReferralUser = it}
