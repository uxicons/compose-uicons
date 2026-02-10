package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeftFromBracket: ImageVector? = null

val Icons.Rs.LeftFromBracket: ImageVector
    get() = _LeftFromBracket ?: UXIcon(name = "LeftFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 0.05f)
                lineTo(0.88f, 9.87f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.13f)
                reflectiveCurveToRelative(0.31f, 1.56f, 0.89f, 2.13f)
                lineToRelative(10.12f, 9.8f)
                verticalLineToRelative(-6.93f)
                horizontalLineToRelative(8f)
                lineTo(19f, 7f)
                close()
                moveTo(17f, 15f)
                lineTo(9f, 15f)
                verticalLineToRelative(4.21f)
                lineTo(2.29f, 12.7f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.7f)
                curveToRelative(0f, -0.27f, 0.1f, -0.52f, 0.28f, -0.7f)
                lineToRelative(6.71f, -6.52f)
                verticalLineToRelative(4.22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _LeftFromBracket = it}
