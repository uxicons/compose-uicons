package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFingerClick: ImageVector? = null

val Icons.Bs.CursorFingerClick: ImageVector
    get() = _CursorFingerClick ?: UXIcon(name = "CursorFingerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17.25f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.48f)
                lineToRelative(-8.01f, -2.29f)
                curveToRelative(0.01f, 0.02f, -0.02f, 6.76f, 0.01f, 6.77f)
                horizontalLineToRelative(-3f)
                lineToRelative(-4.27f, -3.39f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                reflectiveCurveToRelative(2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(1.64f, 1.22f)
                verticalLineToRelative(-9.2f)
                curveToRelative(0f, -0.91f, 0.8f, -1.62f, 1.73f, -1.47f)
                curveToRelative(0.73f, 0.12f, 1.27f, 0.81f, 1.27f, 1.55f)
                verticalLineToRelative(4.53f)
                lineToRelative(11.01f, 3.15f)
                close()
                moveTo(13f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(6.82f, 8.73f)
                lineTo(1.88f, 9.52f)
                lineTo(2.36f, 12.48f)
                lineTo(7.29f, 11.69f)
                close()
                moveTo(8.92f, 5.52f)
                lineTo(5.02f, 2.39f)
                lineTo(3.15f, 4.74f)
                lineTo(7.05f, 7.86f)
                close()
                moveTo(19.81f, 4.66f)
                lineTo(17.92f, 2.34f)
                lineTo(14.04f, 5.5f)
                lineTo(15.94f, 7.82f)
                close()
                moveTo(15.82f, 11.46f)
                lineTo(20.79f, 11.99f)
                lineTo(21.11f, 9.01f)
                lineTo(16.13f, 8.48f)
                close()
            }
        }.also { _CursorFingerClick = it}
