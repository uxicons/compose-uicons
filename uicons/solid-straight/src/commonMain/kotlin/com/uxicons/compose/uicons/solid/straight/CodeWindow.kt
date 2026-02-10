package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeWindow: ImageVector? = null

val Icons.Ss.CodeWindow: ImageVector
    get() = _CodeWindow ?: UXIcon(name = "CodeWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.77f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                close()
                moveTo(7.5f, 2.77f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 2.77f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                close()
                moveTo(9.28f, 20.69f)
                lineTo(6.56f, 17.84f)
                curveToRelative(-0.76f, -0.76f, -0.76f, -2.02f, 0.02f, -2.79f)
                lineToRelative(2.71f, -2.75f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(-2.71f, 2.75f)
                lineToRelative(2.72f, 2.85f)
                lineToRelative(-1.45f, 1.38f)
                close()
                moveTo(17.51f, 17.86f)
                lineTo(14.71f, 20.7f)
                lineTo(13.29f, 19.3f)
                lineTo(16.09f, 16.45f)
                lineTo(13.3f, 13.71f)
                lineTo(14.7f, 12.29f)
                lineTo(17.5f, 15.04f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.03f, -0.58f, 1.41f)
                close()
            }
        }.also { _CodeWindow = it}
