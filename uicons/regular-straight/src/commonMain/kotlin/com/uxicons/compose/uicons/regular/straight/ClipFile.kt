package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipFile: ImageVector? = null

val Icons.Rs.ClipFile: ImageVector
    get() = _ClipFile ?: UXIcon(name = "ClipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 17f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                lineTo(7f, 19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-0.54f)
                curveToRelative(0.61f, 0.68f, 1.06f, 1.49f, 1.31f, 2.4f)
                curveToRelative(0.13f, 0.17f, 0.22f, 0.37f, 0.22f, 0.6f)
                verticalLineToRelative(19f)
                lineTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.26f, -0.75f, 0.67f, -1.42f, 1.19f, -2f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11.28f, 13f)
                horizontalLineToRelative(-4.28f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.71f)
                curveToRelative(-0.65f, -0.52f, -1.15f, -1.2f, -1.43f, -2f)
                close()
            }
        }.also { _ClipFile = it}
