package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFingerClick: ImageVector? = null

val Icons.Ss.CursorFingerClick: ImageVector
    get() = _CursorFingerClick ?: UXIcon(name = "CursorFingerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.77f, 3.62f)
                lineTo(18.35f, 2.22f)
                lineTo(14.83f, 5.77f)
                lineTo(16.25f, 7.18f)
                close()
                moveTo(22.0f, 10.99f)
                lineTo(22.0f, 8.99f)
                lineTo(17.0f, 9.01f)
                lineTo(17.0f, 11.01f)
                close()
                moveTo(9.17f, 5.77f)
                lineTo(5.65f, 2.22f)
                lineTo(4.23f, 3.62f)
                lineTo(7.75f, 7.18f)
                close()
                moveTo(7.0f, 9.01f)
                lineTo(2.0f, 8.99f)
                lineTo(2.0f, 10.99f)
                lineTo(7.0f, 11.01f)
                close()
                moveTo(14f, 10.11f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(10.32f)
                curveToRelative(-1.08f, -0.89f, -2.11f, -1.67f, -2.15f, -1.7f)
                curveToRelative(-0.92f, -0.86f, -2.37f, -0.81f, -3.23f, 0.11f)
                curveToRelative(-0.86f, 0.92f, -0.82f, 2.37f, 0.1f, 3.23f)
                lineToRelative(2.34f, 2.05f)
                horizontalLineToRelative(16.94f)
                reflectiveCurveToRelative(0f, -4.54f, 0f, -4.54f)
                lineToRelative(-10f, -4f)
                close()
            }
        }.also { _CursorFingerClick = it}
