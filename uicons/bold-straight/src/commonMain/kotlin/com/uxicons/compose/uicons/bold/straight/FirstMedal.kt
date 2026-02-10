package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FirstMedal: ImageVector? = null

val Icons.Bs.FirstMedal: ImageVector
    get() = _FirstMedal ?: UXIcon(name = "FirstMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.02f, 0f)
                horizontalLineToRelative(-9.28f)
                lineToRelative(-2.74f, 5.54f)
                lineTo(9.26f, 0f)
                lineTo(-0.02f, 0f)
                lineToRelative(4.77f, 9.66f)
                curveToRelative(-1.1f, 1.49f, -1.76f, 3.34f, -1.76f, 5.34f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.99f, -0.65f, -3.84f, -1.75f, -5.33f)
                lineTo(24.02f, 0f)
                close()
                moveTo(19.19f, 3f)
                lineToRelative(-2.23f, 4.5f)
                curveToRelative(-0.64f, -0.43f, -1.34f, -0.77f, -2.08f, -1.03f)
                lineToRelative(1.72f, -3.48f)
                horizontalLineToRelative(2.59f)
                close()
                moveTo(7.4f, 3f)
                lineToRelative(1.71f, 3.47f)
                curveToRelative(-0.74f, 0.25f, -1.44f, 0.6f, -2.08f, 1.02f)
                lineToRelative(-2.22f, -4.5f)
                horizontalLineToRelative(2.59f)
                close()
                moveTo(11.99f, 21f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(12.91f, 11f)
                lineToRelative(0.09f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.62f)
                lineToRelative(-0.57f, 0.59f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.5f, -2.58f)
                horizontalLineToRelative(1.42f)
                close()
            }
        }.also { _FirstMedal = it}
