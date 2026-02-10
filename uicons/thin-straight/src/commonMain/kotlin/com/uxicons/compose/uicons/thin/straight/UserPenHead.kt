package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPenHead: ImageVector? = null

val Icons.Ts.UserPenHead: ImageVector
    get() = _UserPenHead ?: UXIcon(name = "UserPenHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(14f, 15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 12.17f)
                verticalLineToRelative(-4.17f)
                horizontalLineToRelative(-2.78f)
                lineToRelative(-0.43f, 1f)
                horizontalLineToRelative(2.21f)
                verticalLineToRelative(3.96f)
                lineToRelative(0.4f, 0.08f)
                curveToRelative(0.93f, 0.19f, 1.6f, 1.01f, 1.6f, 1.96f)
                curveToRelative(0.02f, 1.3f, -1.24f, 2.21f, -2.5f, 1.96f)
                curveToRelative(-1.28f, 3.62f, -4.66f, 6.05f, -8.5f, 6.04f)
                curveToRelative(-3.85f, 0.01f, -7.22f, -2.42f, -8.5f, -6.04f)
                curveToRelative(-1.25f, 0.27f, -2.51f, -0.65f, -2.5f, -1.96f)
                curveToRelative(-0.01f, -1.13f, 0.92f, -1.95f, 2f, -2.04f)
                verticalLineToRelative(-3.96f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-0.43f, -1f)
                lineTo(2f, 8f)
                verticalLineToRelative(4.17f)
                curveToRelative(-1.18f, 0.42f, -2f, 1.55f, -2f, 2.83f)
                curveToRelative(0f, 1.6f, 1.26f, 2.91f, 2.84f, 3.0f)
                curveToRelative(1.59f, 3.66f, 5.15f, 6.0f, 9.16f, 6.0f)
                reflectiveCurveToRelative(7.57f, -2.35f, 9.16f, -6.0f)
                curveToRelative(1.58f, -0.08f, 2.84f, -1.4f, 2.84f, -3.0f)
                curveToRelative(0f, -1.28f, -0.82f, -2.41f, -2f, -2.83f)
                close()
                moveTo(8.67f, 12f)
                lineToRelative(-1.73f, -4.05f)
                lineTo(12f, 0.07f)
                lineToRelative(5.06f, 7.88f)
                lineToRelative(-1.73f, 4.05f)
                horizontalLineToRelative(-6.66f)
                close()
                moveTo(8.06f, 8.05f)
                lineToRelative(1.27f, 2.95f)
                horizontalLineToRelative(5.34f)
                lineToRelative(1.27f, -2.95f)
                lineToRelative(-3.44f, -5.34f)
                verticalLineToRelative(5.3f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2.7f)
                lineToRelative(-3.44f, 5.34f)
                close()
            }
        }.also { _UserPenHead = it}
