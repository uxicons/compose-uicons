package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPenHead: ImageVector? = null

val Icons.Bs.UserPenHead: ImageVector
    get() = _UserPenHead ?: UXIcon(name = "UserPenHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13f, 14.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(21f, 10.13f)
                verticalLineToRelative(-3.13f)
                horizontalLineToRelative(-2.77f)
                lineToRelative(-1.88f, 3f)
                horizontalLineToRelative(1.64f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.54f, 0.02f, 0.97f, 0.46f, 0.97f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(-0.26f, 1.19f)
                curveToRelative(-0.64f, 2.97f, -3.5f, 4.81f, -5.78f, 4.81f)
                reflectiveCurveToRelative(-5.15f, -1.84f, -5.79f, -4.81f)
                lineToRelative(-0.26f, -1.19f)
                horizontalLineToRelative(-1.96f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.54f, 0.42f, -0.98f, 0.91f, -1f)
                horizontalLineToRelative(2.09f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.64f)
                lineToRelative(-1.88f, -3f)
                lineTo(3f, 7f)
                verticalLineToRelative(3.12f)
                curveToRelative(-1.74f, 0.44f, -3f, 2.01f, -3f, 3.88f)
                curveToRelative(0f, 2.08f, 1.59f, 3.79f, 3.62f, 3.98f)
                curveToRelative(1.28f, 3.46f, 4.75f, 6.02f, 8.38f, 6.02f)
                reflectiveCurveToRelative(7.09f, -2.56f, 8.38f, -6.02f)
                curveToRelative(2.03f, -0.19f, 3.62f, -1.9f, 3.62f, -3.98f)
                curveToRelative(0f, -1.86f, -1.25f, -3.41f, -3f, -3.87f)
                close()
                moveTo(14f, 10f)
                lineToRelative(2.5f, -4f)
                lineTo(13f, 0.0f)
                lineTo(13f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                reflectiveCurveToRelative(-3.5f, 6f, -3.5f, 6f)
                lineToRelative(2.5f, 4f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _UserPenHead = it}
