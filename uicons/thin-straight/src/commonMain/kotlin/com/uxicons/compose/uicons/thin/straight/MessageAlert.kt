package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageAlert: ImageVector? = null

val Icons.Ts.MessageAlert: ImageVector
    get() = _MessageAlert ?: UXIcon(name = "MessageAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 13f)
                lineTo(14.11f, 13f)
                lineToRelative(-0.58f, 1f)
                lineTo(6f, 14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(5.77f)
                lineToRelative(0.58f, -1f)
                lineTo(6f, 16f)
                verticalLineToRelative(1f)
                close()
                moveTo(10.0f, 24f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.75f)
                lineToRelative(5.25f, -9.01f)
                lineToRelative(5.25f, 9.01f)
                horizontalLineToRelative(-2.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                lineToRelative(-7.0f, -11.99f)
                lineToRelative(-7.0f, 11.99f)
                close()
                moveTo(17.5f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                verticalLineToRelative(12f)
                lineTo(7.69f, 24f)
                reflectiveCurveToRelative(0.58f, -1f, 0.58f, -1f)
                lineTo(1f, 23f)
                reflectiveCurveToRelative(0f, -11f, 0f, -11f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0f, 1.64f, -0.37f, 3.19f, -1.01f, 4.58f)
                lineToRelative(0.61f, 1.04f)
                curveToRelative(0.9f, -1.68f, 1.41f, -3.59f, 1.41f, -5.63f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
                moveTo(6f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                lineTo(6f, 7f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                lineTo(6f, 10f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _MessageAlert = it}
