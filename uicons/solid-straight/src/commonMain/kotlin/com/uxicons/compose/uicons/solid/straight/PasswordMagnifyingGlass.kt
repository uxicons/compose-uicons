package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PasswordMagnifyingGlass: ImageVector? = null

val Icons.Ss.PasswordMagnifyingGlass: ImageVector
    get() = _PasswordMagnifyingGlass ?: UXIcon(name = "PasswordMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.02f, 22.6f)
                lineToRelative(-2.85f, -2.85f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.85f, 2.85f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10.08f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1f)
                curveToRelative(0f, -1.04f, 0.24f, -2.01f, 0.65f, -2.9f)
                lineToRelative(-1.56f, -1.56f)
                lineToRelative(1.04f, -1.04f)
                lineToRelative(-1.04f, -1.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(1.04f, -1.04f)
                lineToRelative(1.57f, 1.57f)
                curveToRelative(0.87f, -0.39f, 1.83f, -0.62f, 2.84f, -0.62f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7.46f, 12.54f)
                lineTo(6.04f, 13.96f)
                lineTo(5f, 12.91f)
                lineTo(3.96f, 13.96f)
                lineTo(2.54f, 12.54f)
                lineTo(3.59f, 11.5f)
                lineTo(2.54f, 10.46f)
                lineTo(3.96f, 9.04f)
                lineTo(5f, 10.09f)
                lineTo(6.04f, 9.04f)
                lineTo(7.46f, 10.46f)
                lineTo(6.41f, 11.5f)
                close()
            }
        }.also { _PasswordMagnifyingGlass = it}
