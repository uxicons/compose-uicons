package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MembershipVip: ImageVector? = null

val Icons.Bs.MembershipVip: ImageVector
    get() = _MembershipVip ?: UXIcon(name = "MembershipVip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(15f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 6f)
                lineTo(3f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(18f)
                lineTo(21f, 6f)
                close()
                moveTo(5.2f, 15.39f)
                curveToRelative(0.28f, 0.26f, 0.6f, 0.48f, 0.94f, 0.66f)
                lineToRelative(1.82f, -1.41f)
                lineToRelative(1.81f, 1.4f)
                curveToRelative(0.35f, -0.18f, 0.67f, -0.4f, 0.95f, -0.66f)
                lineToRelative(-0.74f, -2.26f)
                lineToRelative(1.93f, -1.11f)
                curveToRelative(-0.04f, -0.35f, -0.12f, -0.69f, -0.25f, -1.01f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(-0.69f, -2.45f)
                curveToRelative(-0.2f, -0.03f, -0.35f, -0.05f, -0.57f, -0.05f)
                curveToRelative(-0.2f, 0f, -0.28f, 0.01f, -0.48f, 0.04f)
                lineToRelative(-0.76f, 2.46f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-0.13f, 0.31f, -0.2f, 0.65f, -0.25f, 1.0f)
                lineToRelative(1.94f, 1.08f)
                lineToRelative(-0.74f, 2.32f)
                close()
            }
        }.also { _MembershipVip = it}
