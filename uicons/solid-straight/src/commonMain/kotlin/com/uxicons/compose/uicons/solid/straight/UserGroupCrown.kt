package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserGroupCrown: ImageVector? = null

val Icons.Ss.UserGroupCrown: ImageVector
    get() = _UserGroupCrown ?: UXIcon(name = "UserGroupCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-5f)
                lineToRelative(2.25f, 2.51f)
                lineToRelative(2.25f, -2.51f)
                lineToRelative(2.25f, 2.51f)
                lineToRelative(2.25f, -2.51f)
                close()
                moveTo(15.03f, 19.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineToRelative(-6.03f, -0.02f)
                curveToRelative(-1.21f, 0f, -2.34f, 0.47f, -3.19f, 1.33f)
                curveToRelative(-0.85f, 0.86f, -1.31f, 1.99f, -1.31f, 3.19f)
                verticalLineToRelative(4.48f)
                lineToRelative(14.99f, 0.03f)
                lineToRelative(0.03f, -4.5f)
                close()
                moveTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(3.05f, 9f)
                curveToRelative(0.25f, 2.24f, 2.14f, 4f, 4.45f, 4f)
                reflectiveCurveToRelative(4.2f, -1.76f, 4.45f, -4f)
                close()
                moveTo(19.5f, 11.0f)
                lineTo(13.49f, 10.98f)
                curveToRelative(-0.34f, 0.84f, -0.86f, 1.58f, -1.49f, 2.19f)
                curveToRelative(2.88f, 0.67f, 5.03f, 3.25f, 5.03f, 6.33f)
                lineToRelative(-0.0f, 0.49f)
                lineToRelative(6.95f, 0.01f)
                lineToRelative(0.03f, -4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _UserGroupCrown = it}
