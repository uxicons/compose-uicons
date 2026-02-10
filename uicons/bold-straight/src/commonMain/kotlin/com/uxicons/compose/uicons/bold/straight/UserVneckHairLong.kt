package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHairLong: ImageVector? = null

val Icons.Bs.UserVneckHairLong: ImageVector
    get() = _UserVneckHairLong ?: UXIcon(name = "UserVneckHairLong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 12f)
                curveToRelative(-1.23f, 0.18f, -2.38f, 0.66f, -3.36f, 1.38f)
                curveToRelative(0.01f, -0.03f, 0.0f, -0.05f, 0.01f, -0.08f)
                lineToRelative(1.37f, -7.57f)
                curveToRelative(0.5f, -3.27f, 3.27f, -5.73f, 6.48f, -5.73f)
                reflectiveCurveToRelative(5.98f, 2.46f, 6.48f, 5.73f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineToRelative(1.37f, 7.57f)
                curveToRelative(0.01f, 0.03f, 0.01f, 0.05f, 0.01f, 0.08f)
                curveToRelative(-0.98f, -0.72f, -2.13f, -1.2f, -3.36f, -1.38f)
                lineToRelative(-0.98f, -5.79f)
                curveToRelative(-0.16f, -1.1f, -0.8f, -2.06f, -1.67f, -2.63f)
                curveToRelative(-1.35f, 1.42f, -2.35f, 2.42f, -4.85f, 2.42f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0.57f, 0f, 1.33f, -0.18f, 1.83f, -0.58f)
                lineToRelative(0.53f, 3.08f)
                curveToRelative(-0.72f, 0.31f, -1.51f, 0.49f, -2.35f, 0.49f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(16.13f, 14.06f)
                lineTo(15.37f, 13.97f)
                lineTo(12.02f, 17.61f)
                lineTo(8.65f, 13.97f)
                lineTo(7.9f, 14.05f)
                curveToRelative(-2.79f, 0.31f, -4.9f, 2.65f, -4.9f, 5.45f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.03f, 0.63f, -1.92f, 1.55f, -2.29f)
                lineToRelative(4.47f, 4.83f)
                lineToRelative(4.44f, -4.82f)
                curveToRelative(0.91f, 0.38f, 1.54f, 1.27f, 1.54f, 2.29f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.78f, -2.09f, -5.12f, -4.87f, -5.44f)
                close()
            }
        }.also { _UserVneckHairLong = it}
