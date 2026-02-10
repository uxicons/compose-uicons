package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImproveUser: ImageVector? = null

val Icons.Ss.ImproveUser: ImageVector
    get() = _ImproveUser ?: UXIcon(name = "ImproveUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.33f, 14.55f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.57f, -1.57f)
                verticalLineToRelative(6.95f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.95f)
                lineToRelative(-1.57f, 1.57f)
                lineTo(0.02f, 17.21f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.71f, -0.71f, 1.94f, -0.71f, 2.65f, 0f)
                close()
                moveTo(19.49f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(9.68f, 9.55f)
                lineToRelative(-2.66f, 2.66f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.57f, -1.57f)
                verticalLineToRelative(11.95f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.95f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.71f, -0.71f, -1.94f, -0.71f, -2.65f, 0f)
                close()
                moveTo(21f, 6f)
                horizontalLineToRelative(-4.56f)
                lineTo(11.24f, 0.32f)
                lineToRelative(-1.48f, 1.35f)
                lineToRelative(6.24f, 6.71f)
                verticalLineToRelative(15.61f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ImproveUser = it}
