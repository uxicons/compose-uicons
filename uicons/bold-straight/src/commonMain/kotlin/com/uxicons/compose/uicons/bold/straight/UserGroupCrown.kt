package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserGroupCrown: ImageVector? = null

val Icons.Bs.UserGroupCrown: ImageVector
    get() = _UserGroupCrown ?: UXIcon(name = "UserGroupCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4.98f)
                curveToRelative(-1.08f, -0.02f, -2.03f, 0.93f, -2f, 2.01f)
                lineToRelative(0.02f, 3.98f)
                lineToRelative(-3f, 0.02f)
                lineToRelative(-0.02f, -3.98f)
                curveToRelative(-0.07f, -2.7f, 2.3f, -5.09f, 5f, -5.03f)
                horizontalLineToRelative(4.98f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(18.98f, 11f)
                horizontalLineToRelative(-4.97f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.97f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(13f, 4.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                close()
                moveTo(16f, 4.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(3f, 8.5f)
                verticalLineToRelative(-6.5f)
                lineToRelative(2.25f, 2.51f)
                lineToRelative(2.25f, -2.51f)
                lineToRelative(2.25f, 2.51f)
                lineToRelative(2.25f, -2.51f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                close()
                moveTo(6f, 8f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.also { _UserGroupCrown = it}
