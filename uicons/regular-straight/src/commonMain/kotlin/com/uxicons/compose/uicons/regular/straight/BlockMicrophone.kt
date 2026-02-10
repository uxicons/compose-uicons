package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockMicrophone: ImageVector? = null

val Icons.Rs.BlockMicrophone: ImageVector
    get() = _BlockMicrophone ?: UXIcon(name = "BlockMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 12f)
                verticalLineToRelative(-4f)
                curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.91f)
                curveToRelative(-0.48f, -2.83f, -2.94f, -5f, -5.91f, -5f)
                reflectiveCurveToRelative(-5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(2f)
                lineTo(6f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(0.23f, 1.38f, 0.93f, 2.59f, 1.93f, 3.48f)
                curveToRelative(-0.01f, 0.17f, -0.03f, 0.34f, -0.03f, 0.52f)
                curveToRelative(0f, 0.71f, 0.09f, 1.4f, 0.25f, 2.06f)
                curveToRelative(-2.52f, -1.35f, -4.25f, -4.0f, -4.25f, -7.06f)
                close()
                moveTo(9.43f, 21.85f)
                curveToRelative(-4.21f, -0.75f, -7.43f, -4.43f, -7.43f, -8.85f)
                lineTo(0f, 13f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(0.35f)
                curveToRelative(-0.75f, -0.61f, -1.4f, -1.33f, -1.92f, -2.15f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(17f, 12f)
                curveToRelative(-1.02f, 0f, -1.96f, 0.31f, -2.75f, 0.83f)
                lineToRelative(6.92f, 6.92f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17f, 22f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(-6.92f, -6.92f)
                curveToRelative(-0.52f, 0.79f, -0.83f, 1.74f, -0.83f, 2.75f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
            }
        }.also { _BlockMicrophone = it}
