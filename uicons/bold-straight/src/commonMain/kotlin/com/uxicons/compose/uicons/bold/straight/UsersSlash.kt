package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersSlash: ImageVector? = null

val Icons.Bs.UsersSlash: ImageVector
    get() = _UsersSlash ?: UXIcon(name = "UsersSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.41f, 13.29f)
                lineToRelative(8.55f, 8.55f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(1.18f, 1.18f)
                curveToRelative(0.64f, -0.75f, 1.59f, -1.22f, 2.66f, -1.22f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.06f, -0.47f, 2.02f, -1.22f, 2.66f)
                lineToRelative(2.93f, 2.93f)
                curveToRelative(1.14f, -0.26f, 2.38f, 0.05f, 3.26f, 0.94f)
                reflectiveCurveToRelative(1.2f, 2.13f, 0.94f, 3.26f)
                close()
                moveTo(18f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(20.5f, 8f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.1f, 0f, -0.2f, 0.02f, -0.3f, 0.03f)
                curveToRelative(1.0f, 0.72f, 1.75f, 1.76f, 2.09f, 2.97f)
                horizontalLineToRelative(3.21f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.05f)
                lineToRelative(-5.95f, -5.95f)
                horizontalLineToRelative(-2.55f)
                close()
                moveTo(3.09f, 8.04f)
                curveToRelative(-1.74f, 0.2f, -3.09f, 1.67f, -3.09f, 3.46f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.55f)
                lineToRelative(-2.96f, -2.96f)
                close()
            }
        }.also { _UsersSlash = it}
