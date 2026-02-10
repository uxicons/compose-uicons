package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeWindow: ImageVector? = null

val Icons.Rs.CodeWindow: ImageVector
    get() = _CodeWindow ?: UXIcon(name = "CodeWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(11f)
                close()
                moveTo(10.71f, 12.7f)
                lineTo(9.29f, 11.3f)
                lineTo(6.58f, 14.05f)
                curveToRelative(-0.77f, 0.77f, -0.78f, 2.04f, -0.02f, 2.79f)
                lineToRelative(2.71f, 2.85f)
                lineToRelative(1.45f, -1.38f)
                lineToRelative(-2.72f, -2.85f)
                lineToRelative(2.71f, -2.75f)
                close()
                moveTo(14.7f, 11.29f)
                lineTo(13.3f, 12.71f)
                lineTo(16.09f, 15.45f)
                lineTo(13.29f, 18.3f)
                lineTo(14.71f, 19.7f)
                lineTo(17.51f, 16.86f)
                curveToRelative(0.38f, -0.38f, 0.58f, -0.88f, 0.58f, -1.41f)
                reflectiveCurveToRelative(-0.21f, -1.03f, -0.59f, -1.41f)
                close()
            }
        }.also { _CodeWindow = it}
