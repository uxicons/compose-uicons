package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Rs.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.78f, 14f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-3.78f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(1.78f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(6.14f, 4.72f)
                curveTo(6.72f, 2.03f, 9.13f, 0f, 12f, 0f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.87f, -2.03f, 5.28f, -4.72f, 5.86f)
                lineToRelative(2.14f, 2.14f)
                horizontalLineToRelative(0.59f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(0.59f)
                lineToRelative(2.96f, 2.96f)
                close()
                moveTo(8.05f, 6.64f)
                lineToRelative(3.31f, 3.31f)
                curveToRelative(0.21f, 0.03f, 0.42f, 0.05f, 0.64f, 0.05f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.21f, 0.02f, 0.43f, 0.05f, 0.64f)
                close()
            }
        }.also { _UserSlash = it}
