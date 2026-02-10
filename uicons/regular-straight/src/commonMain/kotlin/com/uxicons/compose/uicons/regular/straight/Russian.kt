package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Russian: ImageVector? = null

val Icons.Rs.Russian: ImageVector
    get() = _Russian ?: UXIcon(name = "Russian") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9.75f)
                lineTo(10f, 5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(4.75f)
                curveToRelative(0f, 0.36f, 0.29f, 0.65f, 0.65f, 0.65f)
                reflectiveCurveToRelative(0.65f, -0.29f, 0.65f, -0.65f)
                lineTo(12.9f, 5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(4.75f)
                curveToRelative(0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f)
                reflectiveCurveToRelative(-2.25f, -1.01f, -2.25f, -2.25f)
                close()
                moveTo(7.42f, 12f)
                lineToRelative(-0.91f, -2.5f)
                horizontalLineToRelative(-0.41f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.6f)
                lineTo(4.5f, 5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.24f, 0f, 2.25f, 1.01f, 2.25f, 2.25f)
                curveToRelative(0f, 0.75f, -0.37f, 1.41f, -0.94f, 1.82f)
                lineToRelative(1.06f, 2.93f)
                horizontalLineToRelative(-1.7f)
                close()
                moveTo(7.4f, 7.25f)
                curveToRelative(0f, -0.36f, -0.29f, -0.65f, -0.65f, -0.65f)
                horizontalLineToRelative(-0.65f)
                verticalLineToRelative(1.3f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.36f, 0f, 0.65f, -0.29f, 0.65f, -0.65f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(14.85f)
                curveToRelative(0.05f, 1.66f, -1.98f, 2.76f, -3.34f, 1.79f)
                lineToRelative(-3.96f, -2.64f)
                lineTo(6f, 21.0f)
                verticalLineToRelative(-3.13f)
                lineToRelative(-2.66f, 1.77f)
                curveToRelative(-1.36f, 0.96f, -3.39f, -0.12f, -3.34f, -1.79f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6.7f, 15f)
                horizontalLineToRelative(10.3f)
                lineTo(17f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14.85f)
                curveToRelative(-0.04f, 0.08f, 0.18f, 0.2f, 0.23f, 0.12f)
                lineToRelative(4.47f, -2.98f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                lineTo(8f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.3f)
                lineToRelative(4.47f, 2.98f)
                curveToRelative(0.05f, 0.08f, 0.27f, -0.04f, 0.23f, -0.12f)
                lineTo(22f, 7f)
                close()
            }
        }.also { _Russian = it}
