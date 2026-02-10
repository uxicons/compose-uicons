package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MembershipVip: ImageVector? = null

val Icons.Ss.MembershipVip: ImageVector
    get() = _MembershipVip ?: UXIcon(name = "MembershipVip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 11.69f)
                lineToRelative(-2.48f, 1.43f)
                lineToRelative(0.99f, 3.02f)
                lineToRelative(-0.56f, 0.39f)
                lineToRelative(-2.45f, -1.89f)
                lineToRelative(-2.46f, 1.9f)
                lineToRelative(-0.54f, -0.41f)
                lineToRelative(0.98f, -3.06f)
                lineToRelative(-2.49f, -1.39f)
                verticalLineToRelative(-0.69f)
                horizontalLineToRelative(3.26f)
                lineToRelative(0.88f, -3.38f)
                horizontalLineToRelative(0.73f)
                lineToRelative(0.88f, 3.38f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(0.69f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 13f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _MembershipVip = it}
