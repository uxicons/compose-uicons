package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GovernmentFlag: ImageVector? = null

val Icons.Ss.GovernmentFlag: ImageVector
    get() = _GovernmentFlag ?: UXIcon(name = "GovernmentFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 14f)
                verticalLineToRelative(-1.53f)
                curveToRelative(0f, -1.03f, -0.56f, -1.98f, -1.47f, -2.47f)
                lineToRelative(-8.18f, -4.46f)
                curveToRelative(-0.11f, -0.06f, -0.23f, -0.12f, -0.35f, -0.16f)
                verticalLineToRelative(-1.35f)
                lineToRelative(3f, -1.94f)
                lineTo(11f, 0f)
                verticalLineToRelative(5.38f)
                curveToRelative(-0.12f, 0.04f, -0.24f, 0.1f, -0.35f, 0.16f)
                lineTo(2.47f, 10f)
                curveToRelative(-0.91f, 0.49f, -1.47f, 1.44f, -1.47f, 2.47f)
                verticalLineToRelative(1.53f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                lineTo(1f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _GovernmentFlag = it}
