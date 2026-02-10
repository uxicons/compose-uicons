package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuranUser: ImageVector? = null

val Icons.Bs.QuranUser: ImageVector
    get() = _QuranUser ?: UXIcon(name = "QuranUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(2.89f, 1.34f, 2.89f, 3f)
                reflectiveCurveToRelative(-1.24f, 3f, -2.89f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(17f, 11.44f)
                lineTo(16.99f, 11.45f)
                curveToRelative(0f, 0.02f, 0.01f, 0.04f, 0.01f, 0.06f)
                close()
                moveTo(7f, 11.44f)
                verticalLineToRelative(0.06f)
                curveToRelative(0f, -0.02f, 0.01f, -0.04f, 0.01f, -0.06f)
                lineToRelative(-0.01f, -0.0f)
                close()
                moveTo(10f, 11.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.48f)
                lineToRelative(2.99f, -1.54f)
                curveToRelative(-0.03f, -1.9f, -1.58f, -3.44f, -3.49f, -3.44f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.91f, 0f, -3.46f, 1.54f, -3.49f, 3.44f)
                lineToRelative(2.99f, 1.54f)
                verticalLineToRelative(-1.48f)
                close()
                moveTo(17f, 17.0f)
                lineTo(21.67f, 14.66f)
                lineTo(20.33f, 11.98f)
                lineTo(12f, 16.14f)
                lineTo(3.67f, 11.98f)
                lineTo(2.33f, 14.66f)
                lineTo(7f, 17.0f)
                lineTo(2f, 21.84f)
                verticalLineToRelative(2.15f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.75f)
                lineToRelative(2.72f, -2.52f)
                lineToRelative(2.03f, 1.02f)
                lineToRelative(2.03f, -1.02f)
                lineToRelative(2.72f, 2.52f)
                horizontalLineToRelative(-3.75f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2.23f)
                lineToRelative(-5f, -4.77f)
                close()
            }
        }.also { _QuranUser = it}
